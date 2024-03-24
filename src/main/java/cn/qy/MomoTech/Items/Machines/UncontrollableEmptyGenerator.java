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

public class UncontrollableEmptyGenerator extends AbstractGUI implements RecipeDisplayItem {
    public UncontrollableEmptyGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_UNCONTROLLABLE_EMPTY_GENERATOR";
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
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
    protected void findNextRecipe(BlockMenu inv) {
        if (!Utils.checkOutput(inv, getOutputSlots())) return;
        for (int i : getOutputSlots()) {
            if (inv.getItemInSlot(i) == null) {
                inv.toInventory().setItem(i, new SlimefunItemStack(MomotechItem.uncontrollable_empty, 8));
                return;
            }
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(8);
        it.add(new CustomItemStack(Material.BOOK, "&f每 1tick 生成一次", "&7一次生成8个不可控空"));
        it.add(new SlimefunItemStack(MomotechItem.uncontrollable_empty, 8));
        return it;
    }
}
