package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine;

import cn.qy.MomoTech.GUI.AbstractElectricGUI;
import cn.qy.MomoTech.utils.Maths;
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

public class RuleMineralBlockGenerator extends AbstractElectricGUI implements RecipeDisplayItem {
    private final Material[] m = {
            Material.LAPIS_BLOCK, Material.REDSTONE_BLOCK, Material.EMERALD_BLOCK, Material.DIAMOND_BLOCK,
            Material.QUARTZ_BLOCK, Material.GOLD_BLOCK, Material.COPPER_BLOCK, Material.IRON_BLOCK,
            Material.NETHERITE_BLOCK, Material.COAL_BLOCK, Material.COBBLESTONE
    };

    public RuleMineralBlockGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{};
    }

    @Override
    public int[] OUT() {
        return new int[]{0, 8};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_RULE_MINERAL_BLOCK_GENERATOR";
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{};
    }

    @Override
    public int getCapacity() {
        return 100000;
    }

    @Override
    public int getEnergyConsumption() {
        return 15000;
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{1, 2, 3, 4, 5, 6, 7};
    }

    @Override
    protected boolean findNextRecipe(BlockMenu inv) {
        for (int i : getOutputSlots()) {
            if (inv.getItemInSlot(i) == null) {
                inv.pushItem(new ItemStack(m[Maths.GetRandom(10)], 16), getOutputSlots());
                return true;
            }
        }
        return false;
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(30);
        for (Material i : this.m) {
            it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, "&f可能的产物"));
            it.add(new ItemStack(i, 16));
        }
        return it;
    }
}
