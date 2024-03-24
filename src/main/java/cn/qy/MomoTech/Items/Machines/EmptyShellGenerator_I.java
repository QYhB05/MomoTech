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

public class EmptyShellGenerator_I extends AbstractGUI implements RecipeDisplayItem {
    public EmptyShellGenerator_I(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_EMPTY_SHELL_GENERATOR_I";
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
    public int[] getInputSlots() {
        return new int[]{};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        if (!Utils.checkOutput(inv, getOutputSlots())) return;
        for (int i : getOutputSlots()) {
            if (inv.getItemInSlot(i) == null) {
                inv.toInventory().setItem(i, new SlimefunItemStack(MomotechItem.empty_shell, 64));
                return;
            }
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(4);
        it.add(new CustomItemStack(Material.BOOK, "&f每 1tick 生成一次", "&7每次64个空"));
        it.add(new SlimefunItemStack(MomotechItem.empty_shell, 64));
        return it;
    }
}
