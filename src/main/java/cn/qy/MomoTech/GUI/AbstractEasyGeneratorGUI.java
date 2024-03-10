package cn.qy.MomoTech.GUI;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.inventory.ItemStack;

public abstract class AbstractEasyGeneratorGUI extends AbstractGUI {
    public AbstractEasyGeneratorGUI(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
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
        return new int[]{8};
    }

    @Override
    public ItemStack getProgressBar() {
        return null;
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    @Override
    public int getEnergyConsumption() {
        return 1;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public int getCapacity() {
        return 1;
    }

    public abstract ItemStack getOut();

    @Override
    protected MachineRecipe findNextRecipe(BlockMenu inv) {
        inv.pushItem(getOut(), getOutputSlots());
        return null;
    }
}
