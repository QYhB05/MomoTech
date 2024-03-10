package cn.qy.MomoTech.GUI.MachineGUI;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.utils.MomotechItem;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public abstract class IDChanger_ extends AbstractGUI {
    protected IDChanger_(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{0, 2};
    }

    @Override
    public int[] OUT() {
        return new int[]{6, 8};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{3, 4, 5};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{1};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{7};
    }

    @Override
    protected MachineRecipe findNextRecipe(BlockMenu inv) {
        if (inv.getItemInSlot(1) == null) return null;
        if (inv.getItemInSlot(7) != null) return null;
        if (!SlimefunUtils.isItemSimilar(inv.getItemInSlot(1), MomotechItem.ID_card, false, false)) return null;
        String lore = Utils.getLore(inv.getItemInSlot(1).getItemMeta()).get(0).toString().substring(5);
        if (lore.equals("")) {
            inv.pushItem(new CustomItemStack(Material.PAPER, "&7不好意思你的输入不合法"), 1);
            return null;
        }
        try {
            inv.pushItem(Objects.requireNonNull(SlimefunItem.getById(lore)).getItem(), getOutputSlots());
            inv.consumeItem(1, 1);
        } catch (NullPointerException e) {
            inv.pushItem(new CustomItemStack(Material.PAPER, "&7不好意思你的输入不合法"), 1);
            return null;
        }
        return null;
    }
}
