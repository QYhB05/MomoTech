package cn.qy.MomoTech.GUI;

import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public abstract class MonsterItemGenerator extends AbstractGUI {
    protected MonsterItemGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }
    @Override
    public int getCapacity() {
        return 100000;
    }

    @Override
    public int getEnergyConsumption() {
        return 15000;
    }


    @Override
    public int[] IN() {
        return new int[]{};
    }

    @Override
    public int[] OUT() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 45, 46, 47, 48, 49, 50, 51, 52, 53};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{};
    }

    @NotNull
    public abstract String getMachineIdentifier();

    @Override
    public int[] getInputSlots() {
        return new int[]{};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 44, 43, 44};
    }
    public abstract Material getItems();

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        if (!Utils.checkOutput(inv, getOutputSlots())) return;
        inv.pushItem(new ItemStack(getItems(), 32), getOutputSlots());
    }
}
