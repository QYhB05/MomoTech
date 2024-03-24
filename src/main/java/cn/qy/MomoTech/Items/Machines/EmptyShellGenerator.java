package cn.qy.MomoTech.Items.Machines;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.utils.MomotechItem;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class EmptyShellGenerator extends AbstractGUI implements RecipeDisplayItem {
    public EmptyShellGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_EMPTY_SHELL_GENERATOR";
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
    protected void findNextRecipe(BlockMenu inv) {
        if (inv.getItemInSlot(0) == null) return;
        if (!Utils.checkOutput(inv, getOutputSlots())) return;
        inv.consumeItem(0, 1);
        inv.pushItem(new SlimefunItemStack(MomotechItem.empty_shell, 8), getOutputSlots());
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(4);
        it.add(new CustomItemStack(Material.BOOK, "&f输入任意物品以制作空"));
        it.add(new SlimefunItemStack(MomotechItem.empty_shell, 8));
        return it;
    }
}
