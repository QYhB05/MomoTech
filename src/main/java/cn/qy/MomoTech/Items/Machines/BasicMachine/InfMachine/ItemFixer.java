package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class ItemFixer extends AbstractGUI {
    public ItemFixer(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
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
        return new int[]{4, 13, 22};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_ITEM_FIXER";
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{0, 1, 2, 3, 9, 10, 11, 12, 18, 19, 20, 21};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{5, 6, 7, 8, 14, 15, 16, 17, 23, 24, 25, 26};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        for (int i : getInputSlots()) {
            if (Utils.checkOutput(inv, getOutputSlots())) return;
            if (inv.getItemInSlot(i) == null) continue;
            try {
                SlimefunItem it1 = SlimefunItem.getByItem(inv.getItemInSlot(i));
                if (it1 != null) {
                    ItemStack it = new ItemStack(Objects.requireNonNull(SlimefunItem.getByItem(inv.getItemInSlot(i))).getItem());
                    it.setAmount(inv.getItemInSlot(i).getAmount());
                    inv.pushItem(it, getOutputSlots());
                    inv.consumeItem(i, inv.getItemInSlot(i).getAmount());
                } else {
                    inv.pushItem(inv.getItemInSlot(i).clone(), getOutputSlots());
                    inv.consumeItem(i, inv.getItemInSlot(i).getAmount());
                }
            } catch (Exception ignored) {
            }
        }
    }
}
