package cn.qy.MomoTech.Group;

import cn.qy.MomoTech.MomoTech;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.FlexItemGroup;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerProfile;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuide;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideImplementation;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideMode;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Arrays;
import java.util.Comparator;

@ParametersAreNonnullByDefault
public final class MultiGroup extends FlexItemGroup {
    private final ItemGroup[] subGroups;
    private final String name;

    public MultiGroup(String key, ItemStack item, ItemGroup... subGroups) {
        this(key, item, 3, subGroups);
    }

    public MultiGroup(String key, ItemStack item, int tier, ItemGroup... subGroups) {
        super(createKey(key), item, tier);
        Arrays.sort(subGroups, Comparator.comparingInt(ItemGroup::getTier));
        this.subGroups = subGroups;
        this.name = ItemUtils.getItemName(item);
    }

    public static NamespacedKey createKey(String str) {
        return new NamespacedKey(MomoTech.getInstance(), str);
    }

    public boolean isVisible(Player p, PlayerProfile profile, SlimefunGuideMode mode) {
        return mode == SlimefunGuideMode.SURVIVAL_MODE;
    }

    public void open(Player p, PlayerProfile profile, SlimefunGuideMode mode) {
        this.openGuide(p, profile, mode, 1);
    }

    private void openGuide(Player p, PlayerProfile profile, SlimefunGuideMode mode, int page) {
        SlimefunGuideImplementation guide = Slimefun.getRegistry().getSlimefunGuide(mode);
        profile.getGuideHistory().add(this, page);
        ChestMenu menu = new ChestMenu(this.name);
        menu.setEmptySlotsClickable(false);
        menu.addMenuOpeningHandler((pl) -> pl.playSound(pl.getLocation(), Sound.ITEM_BOOK_PAGE_TURN, 1.0F, 1.0F));

        for (int i = 0; i < 9; ++i) {
            menu.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        }

        String back = ChatColor.GRAY + Slimefun.getLocalization().getMessage(p, "guide.back.guide");
        menu.addItem(1, ChestMenuUtils.getBackButton(p, "", back));
        menu.addMenuClickHandler(1, (pl, s, is, action) -> {
            profile.getGuideHistory().goBack(guide);
            return false;
        });
        int index = 9;

        int target;
        for (target = 36 * (page - 1) - 1; target < this.subGroups.length - 1 && index < 45; ++index) {
            ++target;
            ItemGroup category = this.subGroups[target];
            menu.addItem(index, category.getItem(p));
            menu.addMenuClickHandler(index, (pl, slot, item, action) -> {
                SlimefunGuide.openItemGroup(profile, category, mode, 1);
                return false;
            });
        }

        int pages = target == this.subGroups.length - 1 ? page : (this.subGroups.length - 1) / 36 + 1;

        for (int i = 45; i < 54; ++i) {
            menu.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        }

        menu.addItem(46, ChestMenuUtils.getPreviousButton(p, page, pages));
        menu.addMenuClickHandler(46, (pl, slot, item, action) -> {
            int next = page - 1;
            if (next > 0) {
                this.openGuide(p, profile, mode, next);
            }

            return false;
        });
        menu.addItem(52, ChestMenuUtils.getNextButton(p, page, pages));
        menu.addMenuClickHandler(52, (pl, slot, item, action) -> {
            int next = page + 1;
            if (next <= pages) {
                this.openGuide(p, profile, mode, next);
            }

            return false;
        });
        menu.open(p);
    }

    public void register(SlimefunAddon addon) {
        super.register(addon);

        for (ItemGroup category : this.subGroups) {
            if (!category.isRegistered()) {
                category.register(addon);
            }
        }

    }
}
