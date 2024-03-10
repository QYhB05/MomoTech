package cn.qy.MomoTech.GUI.MachineGUI;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.utils.MomotechItem;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.inventory.ItemStack;

public abstract class UncontrollableEmptyGenerator_ extends AbstractGUI {
    protected UncontrollableEmptyGenerator_(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{};
    }

    @Override
    public int[] OUT() {
        return new int[]{0};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{8};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{1, 2, 3, 4, 5, 6, 7};
    }

    @Override
    protected MachineRecipe findNextRecipe(BlockMenu inv) {
        if (!Utils.checkOutput(inv, getOutputSlots())) return null;
        for (int i : getOutputSlots()) {
            if (inv.getItemInSlot(i) == null) {
                inv.toInventory().setItem(i, new SlimefunItemStack(MomotechItem.uncontrollable_empty, 64));
                return null;
            }
        }
        return null;
    }
}
