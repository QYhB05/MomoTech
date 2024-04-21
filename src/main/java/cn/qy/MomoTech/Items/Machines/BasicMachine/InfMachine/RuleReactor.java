package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine;

import cn.qy.MomoTech.GUI.AbstractElectricGUI;
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

public class RuleReactor extends AbstractElectricGUI implements RecipeDisplayItem {
    public RuleReactor(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{0, 2};
    }

    @Override
    public int[] OUT() {
        return new int[]{3, 8};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_RULE_REACTOR";
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{1};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{4, 5, 6, 7};
    }

    @Override
    protected boolean findNextRecipe(BlockMenu inv) {
        if (Utils.checkOutput(inv, getOutputSlots())) return false;
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) == null) continue;
            ItemStack it = inv.getItemInSlot(i).clone();
            it.setAmount(1);
            if (SlimefunUtils.isItemSimilar(it, SlimefunItems.URANIUM, false, false)) {
                inv.consumeItem(i, 1);
                inv.pushItem(new SlimefunItemStack(SlimefunItems.NEPTUNIUM, 8), getOutputSlots());
                this.setCharge(inv.getLocation(), this.getCharge(inv.getLocation()) - this.getEnergyConsumption());
                return false;
            }
            if (SlimefunUtils.isItemSimilar(it, SlimefunItems.NEPTUNIUM, false, false)) {
                inv.consumeItem(i, 1);
                inv.pushItem(new SlimefunItemStack(SlimefunItems.PLUTONIUM, 8), getOutputSlots());
                return true;
            }
        }
        return false;
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(18);
        it.add(new SlimefunItemStack(SlimefunItems.URANIUM, 1));
        it.add(new SlimefunItemStack(SlimefunItems.NEPTUNIUM, 8));
        it.add(new SlimefunItemStack(SlimefunItems.NEPTUNIUM, 8));
        it.add(new SlimefunItemStack(SlimefunItems.PLUTONIUM, 8));
        return it;
    }

    @Override
    public int getCapacity() {
        return 100000;
    }

    @Override
    public int getEnergyConsumption() {
        return 5000;
    }
}
