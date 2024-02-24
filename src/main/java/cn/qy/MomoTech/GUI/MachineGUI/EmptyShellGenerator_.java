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

public abstract class EmptyShellGenerator_ extends AbstractGUI {
    protected EmptyShellGenerator_(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{};
    }

    @Override
    public int[] OUT() {
        return new int[]{};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{1};
    }

    public int[] getInputSlots() {
        return new int[]{0};
    }

    public int[] getOutputSlots() {
        return new int[]{2, 3, 4, 5, 6, 7, 8};
    }

    @Override
    protected MachineRecipe findNextRecipe(BlockMenu inv) {
        if (inv.getItemInSlot(0) == null) return null;
        if (!Utils.checkOutput(inv, getOutputSlots())) return null;
        inv.consumeItem(0, 1);
        inv.pushItem(new SlimefunItemStack(MomotechItem.empty_shell, 8), getOutputSlots());
        return null;
    }
}
