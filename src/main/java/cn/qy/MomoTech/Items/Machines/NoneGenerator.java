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

public class NoneGenerator extends AbstractGUI implements RecipeDisplayItem {
    public NoneGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_NONE_GENERATOR";
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
    protected void findNextRecipe(BlockMenu inv) {
        if (!Utils.checkOutput(inv, getOutputSlots())) return;
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) == null)
                return;
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
                    return;
                }
            }
        }
        for (int k : getInputSlots())
            inv.consumeItem(k, inv.getItemInSlot(k).getAmount());
        inv.pushItem(MomotechItem.none_.clone(), getOutputSlots());
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(8);
        it.add(new CustomItemStack(Material.BOOK, "&f制作NONE", "&7要求:输入槽位上所有物品种类和堆叠数量都不同"));
        it.add(MomotechItem.none_.clone());
        return it;
    }
}
