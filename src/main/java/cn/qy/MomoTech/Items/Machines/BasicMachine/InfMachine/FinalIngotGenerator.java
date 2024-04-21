package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class FinalIngotGenerator extends AbstractGUI implements RecipeDisplayItem {
    public FinalIngotGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_FINAL_INGOT_GENERATOR";
    }


    @Override
    public int[] IN() {
        return new int[]{0, 8};
    }

    @Override
    public int[] OUT() {
        return new int[]{9, 17, 18, 26};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{1, 2, 3, 4, 5, 6, 7};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{10, 11, 12, 13, 14, 15, 16, 19, 20, 21, 22, 23, 24, 25};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        if (Utils.checkOutput(inv, getOutputSlots())) return;
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) != null) {
                ItemStack it = inv.getItemInSlot(i).clone();
                it.setAmount(1);
                if (Utils.checkOutput(inv, getOutputSlots())) return;
                if (SlimefunUtils.isItemSimilar(it, SlimefunItems.ALUMINUM_DUST, false, false)) {
                    inv.pushItem(new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, inv.getItemInSlot(i).getAmount()), getOutputSlots());
                    inv.consumeItem(i, inv.getItemInSlot(i).getAmount());
                }
                if (SlimefunUtils.isItemSimilar(it, SlimefunItems.COPPER_DUST, false, false)) {
                    inv.pushItem(new SlimefunItemStack(SlimefunItems.COPPER_INGOT, inv.getItemInSlot(i).getAmount()), getOutputSlots());
                    inv.consumeItem(i, inv.getItemInSlot(i).getAmount());
                }
                if (SlimefunUtils.isItemSimilar(it, SlimefunItems.TIN_DUST, false, false)) {
                    inv.pushItem(new SlimefunItemStack(SlimefunItems.TIN_INGOT, inv.getItemInSlot(i).getAmount()), getOutputSlots());
                    inv.consumeItem(i, inv.getItemInSlot(i).getAmount());
                }
                if (SlimefunUtils.isItemSimilar(it, SlimefunItems.LEAD_DUST, false, false)) {
                    inv.pushItem(new SlimefunItemStack(SlimefunItems.LEAD_INGOT, inv.getItemInSlot(i).getAmount()), getOutputSlots());
                    inv.consumeItem(i, inv.getItemInSlot(i).getAmount());
                }
                if (SlimefunUtils.isItemSimilar(it, SlimefunItems.GOLD_DUST, false, false)) {
                    inv.pushItem(new SlimefunItemStack(SlimefunItems.GOLD_4K, inv.getItemInSlot(i).getAmount()), getOutputSlots());
                    inv.consumeItem(i, inv.getItemInSlot(i).getAmount());
                }
                if (SlimefunUtils.isItemSimilar(it, SlimefunItems.MAGNESIUM_DUST, false, false)) {
                    inv.pushItem(new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, inv.getItemInSlot(i).getAmount()), getOutputSlots());
                    inv.consumeItem(i, inv.getItemInSlot(i).getAmount());
                }
                if (SlimefunUtils.isItemSimilar(it, SlimefunItems.SILVER_DUST, false, false)) {
                    inv.pushItem(new SlimefunItemStack(SlimefunItems.SILVER_INGOT, inv.getItemInSlot(i).getAmount()), getOutputSlots());
                    inv.consumeItem(i, inv.getItemInSlot(i).getAmount());
                }
                if (SlimefunUtils.isItemSimilar(it, SlimefunItems.IRON_DUST, false, false)) {
                    inv.pushItem(new ItemStack(Material.IRON_INGOT, inv.getItemInSlot(i).getAmount()), getOutputSlots());
                    inv.consumeItem(i, inv.getItemInSlot(i).getAmount());
                }
                if (SlimefunUtils.isItemSimilar(it, SlimefunItems.ZINC_DUST, false, false)) {
                    inv.pushItem(new SlimefunItemStack(SlimefunItems.ZINC_INGOT, inv.getItemInSlot(i).getAmount()), getOutputSlots());
                    inv.consumeItem(i, inv.getItemInSlot(i).getAmount());
                }
            }
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(12);
        it.add(new CustomItemStack(Material.BOOK, "&f自动化铸锭", "&7每 1tick 冶炼输入槽内所有的矿粉"));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        return it;
    }
}
