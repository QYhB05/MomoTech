package cn.qy.MomoTech.Items.Machines;

import cn.qy.MomoTech.GUI.MachineGUI.NoneGenerator_;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class NoneGenerator extends NoneGenerator_ {
    public NoneGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @Override
    public int getEnergyConsumption() {
        return 1;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_NONE_GENERATOR";
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
    }

    @Override
    public int getCapacity() {
        return 1;
    }
}
