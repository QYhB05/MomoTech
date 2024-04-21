package cn.qy.MomoTech.Items.Machines.BasicMachine.Machine;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.Items.MomotechItem;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class OpenBoxItem extends AbstractGUI implements RecipeDisplayItem {
    public OpenBoxItem(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{0, 2};
    }

    @Override
    public int[] OUT() {
        return new int[]{6, 8};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{3, 4, 5};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_OPEN_BOX_ITEM";
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
    protected void findNextRecipe(BlockMenu inv) {
        if (inv.getItemInSlot(1) == null) return;
        if (inv.getItemInSlot(7) != null) return;
        if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(1), MomotechItem.box_of_quantum, true, false)) {
            inv.consumeItem(1, 1);
            inv.pushItem(new SlimefunItemStack(MomotechItem.quantum1_, 4), getOutputSlots());
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(4);
        it.add(MomotechItem.box_of_quantum.clone());
        it.add(new SlimefunItemStack(MomotechItem.quantum1_, 4));
        return it;
    }
}
