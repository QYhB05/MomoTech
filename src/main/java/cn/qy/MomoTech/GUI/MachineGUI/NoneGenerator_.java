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

public abstract class NoneGenerator_ extends AbstractGUI {
    protected NoneGenerator_(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{};
    }

    @Override
    public int[] OUT() {
        return new int[]{12, 14};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{9, 10, 11, 15, 16, 17};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{13};
    }

    @Override
    protected MachineRecipe findNextRecipe(BlockMenu inv) {
        if (!Utils.checkOutput(inv, getOutputSlots())) return null;
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) == null)
                return null;
        }
        for (int i : getInputSlots()) {
            for (int j : getInputSlots()) {
                if (i == j) continue;
                ItemStack it = inv.getItemInSlot(i).clone(), it1 = inv.getItemInSlot(j).clone();
                it.setAmount(1);
                it1.setAmount(1);
                if (it == it1 || inv.getItemInSlot(i).getAmount() == inv.getItemInSlot(j).getAmount()) {
                    for (int k : getInputSlots()) {
                        inv.consumeItem(k, inv.getItemInSlot(k).getAmount());
                    }
                    return null;
                }
            }
        }
        for (int k : getInputSlots())
            inv.consumeItem(k, inv.getItemInSlot(k).getAmount());
        inv.pushItem(MomotechItem.none_, getOutputSlots());
        return null;
    }
}
