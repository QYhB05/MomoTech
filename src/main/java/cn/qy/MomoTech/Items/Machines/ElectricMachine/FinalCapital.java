package cn.qy.MomoTech.Items.Machines.ElectricMachine;

import cn.qy.MomoTech.GUI.AbstractElectricGUI;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

public class FinalCapital extends AbstractElectricGUI implements EnergyNetComponent {

    public FinalCapital(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
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
        return new int[]{0, 1, 2, 3, 5, 6, 7, 8};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_FINAL_CAPITAL";
    }

    @Override
    public int[] getInputSlots() {
        return new int[0];
    }

    @Override
    public int[] getOutputSlots() {
        return new int[0];
    }

    @Override
    public void add(BlockMenuPreset b) {
        b.addItem(4, new CustomItemStack(Material.RED_STAINED_GLASS_PANE, "&f已储存 NULL J"), ChestMenuUtils.getEmptyClickHandler());
    }

    @Override
    protected boolean findNextRecipe(BlockMenu inv) {
        inv.toInventory().setItem(4, new CustomItemStack(Material.GREEN_STAINED_GLASS_PANE, "&f已储存 " + this.getCharge(inv.getLocation()) + " J"));
        return false;
    }

    @Nonnull
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CAPACITOR;
    }

    public int getCapacity() {
        return 2000000000;
    }
}
