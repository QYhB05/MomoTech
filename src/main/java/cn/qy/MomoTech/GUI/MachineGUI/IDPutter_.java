package cn.qy.MomoTech.GUI.MachineGUI;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.utils.MomotechItem;
import cn.qy.MomoTech.utils.SfUtils;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public abstract class IDPutter_ extends AbstractGUI {
    protected IDPutter_(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{0, 2, 6, 8};
    }

    @Override
    public int[] OUT() {
        return new int[]{};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{3, 4, 5};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{1, 7};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{};
    }

    @Override
    protected MachineRecipe findNextRecipe(BlockMenu inv) {
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) == null)
                return null;
        }
        if (inv.getItemInSlot(1).getAmount() != 1) return null;
        if (!SlimefunUtils.isItemSimilar(inv.getItemInSlot(1), MomotechItem.ID_card, false, false) || !SlimefunUtils.isItemSimilar(inv.getItemInSlot(7), MomotechItem.letter, false, false))
            return null;
        String lore = Utils.getLore(inv.getItemInSlot(1).getItemMeta()).get(0).toString();
        lore = lore + (Utils.getLore(inv.getItemInSlot(7).getItemMeta()).get(0).toString().charAt(2));
        SlimefunItemStack it = new SlimefunItemStack("MOMOTECH_ID_CARD", new CustomItemStack(Material.PAPER, "&eID卡", lore.toString(), "&7在&cID集成器&7添加符号集成Slimefun ID", "&7合法ID可以在 &f制造台 &7中直接制作对应ID的粘液物品"));
        inv.consumeItem(7, 1);
        inv.toInventory().setItem(1, it);
        return null;
    }
}
