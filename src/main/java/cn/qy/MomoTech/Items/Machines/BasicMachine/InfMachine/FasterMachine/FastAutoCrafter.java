package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine.FasterMachine;

import cn.qy.MomoTech.GUI.AbstractGUI;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class FastAutoCrafter extends AbstractGUI implements RecipeDisplayItem {
    protected FastAutoCrafter(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[0];
    }

    @Override
    public int[] OUT() {
        return new int[0];
    }

    @Override
    public int[] EMPTY() {
        return new int[0];
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return null;
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[0];
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {

    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        return null;
    }
}
