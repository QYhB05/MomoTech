package cn.qy.MomoTech.GUI.MachineGUI;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.utils.MomotechItem;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public abstract class FinalCopier_ extends AbstractGUI {
    protected FinalCopier_(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{0, 2};
    }

    @Override
    public int[] OUT() {
        return new int[]{8, 6};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{3, 5};
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
        if (!Utils.checkOutput(inv, getOutputSlots())) return null;
        if (inv.getItemInSlot(4) == null) return null;
        if (inv.getItemInSlot(1) == null) return null;
        if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(1), MomotechItem.box_of_quantum, true)) {
            inv.consumeItem(1, 1);
            ItemStack it = inv.getItemInSlot(4).clone();
            it.setAmount(1);
            inv.pushItem(it, getOutputSlots());
        }
        return null;
    }
}
