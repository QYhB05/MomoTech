package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine;

import cn.qy.MomoTech.GUI.AbstractElectricGUI;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.utils.Maths;
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

public class ShineAndDarkConstructor extends AbstractElectricGUI implements RecipeDisplayItem {
    public ShineAndDarkConstructor(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{0, 8};
    }

    @Override
    public int[] OUT() {
        return new int[]{18, 26};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{9, 10, 11, 12, 13, 14, 15, 16, 17};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_SHINE_AND_DARK_CONSTRUCTOR";
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{1, 2, 3, 4, 5, 6, 7};
    }

    @Override
    public int getCapacity() {
        return 100000;
    }

    @Override
    public int getEnergyConsumption() {
        return 500;
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{19, 20, 21, 22, 23, 24, 25};
    }

    @Override
    protected boolean findNextRecipe(BlockMenu inv) {
        if (Utils.checkOutput(inv, getOutputSlots())) return false;
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) == null) continue;
            ItemStack it = inv.getItemInSlot(i).clone();
            it.setAmount(1);
            if (it.equals(new ItemStack(Material.NETHERITE_PICKAXE))) {
                inv.toInventory().setItem(i, null);
                int k = inv.getLocation().getBlockY();
                if (Maths.GetRandom(100) == 0) {
                    if (k < 0) {
                        inv.pushItem(MomotechItem.dark.clone(), getOutputSlots());
                        return true;
                    } else if (k > 256) {
                        inv.pushItem(MomotechItem.shine.clone(), getOutputSlots());
                        return true;
                    }
                } else {
                    inv.pushItem(MomotechItem.empty_shell.clone(), getOutputSlots());
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(18);
        it.add(new CustomItemStack(Material.NETHERITE_PICKAXE, "&f需要输入下届合金镐", "&7机器高度<0时有1%概率出现"));
        it.add(MomotechItem.dark.clone());
        it.add(new CustomItemStack(Material.NETHERITE_PICKAXE, "&f需要输入下届合金镐", "&7机器高度>256时有1%出现"));
        it.add(MomotechItem.shine.clone());
        return it;
    }
}
