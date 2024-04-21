package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.utils.Maths;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.*;
public class IngotGenerator extends AbstractGUI implements RecipeDisplayItem {
    public IngotGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }
    public static final SlimefunItemStack[] list = {BRONZE_INGOT, DURALUMIN_INGOT, BILLON_INGOT, BRASS_INGOT, STEEL_INGOT, CORINTHIAN_BRONZE_INGOT, SYNTHETIC_DIAMOND, NICKEL_INGOT, COBALT_INGOT, CARBONADO, ALUMINUM_BRASS_INGOT, SYNTHETIC_SAPPHIRE, ALUMINUM_BRONZE_INGOT, DAMASCUS_STEEL_INGOT, HARDENED_METAL_INGOT, GOLD_24K, REDSTONE_ALLOY, GILDED_IRON, SYNTHETIC_EMERALD, REINFORCED_ALLOY_INGOT};
    @Override
    public int[] IN() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
    }

    @Override
    public int[] OUT() {
        return new int[]{45, 46, 47, 48, 49, 50, 51, 52, 53};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};
    }

    public int[] getInputSlots() {
        return new int[]{9, 10, 11, 12, 13, 14, 15, 16, 17};
    }

    public int[] getOutputSlots() {
        return new int[]{36, 37, 38, 39, 40, 41, 42, 43, 44};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_INGOT_CONSTRUCTOR";
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        if (Utils.checkOutput(inv, getOutputSlots())) return;
        for (int i : getInputSlots())
            if (inv.getItemInSlot(i) != null)
                if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), new SlimefunItemStack("MOMOTECH_METAL_STAR", Items.MOMOTECH_METAL_STAR).clone(), false, false, false)) {
                    inv.consumeItem(i, 1);
                    inv.pushItem(new SlimefunItemStack(list[Maths.GetRandom(list.length - 1)], 32), getOutputSlots());
                    return ;
                }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(list.length * 2 + 5);
        for (SlimefunItemStack it1 : list) {
            it.add(new SlimefunItemStack("MOMOTECH_METAL_STAR", Items.MOMOTECH_METAL_STAR).clone());
            it.add(it1.clone());
        }
        return it;
    }
}
