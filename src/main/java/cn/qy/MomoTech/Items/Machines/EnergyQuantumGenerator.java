package cn.qy.MomoTech.Items.Machines;

import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.utils.MomotechItem;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class EnergyQuantumGenerator extends AContainer {
    public EnergyQuantumGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
        this.setProcessingSpeed(1);
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.SEA_LANTERN);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_ENERGY_QUANTUM_GENERATOR";
    }

    @Override
    public int getEnergyConsumption() {
        return 500000000;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public int getCapacity() {
        return 600000000;
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(this.recipes.size() * 2);
        for (MachineRecipe i : this.recipes) {
            it.add(i.getInput()[0].clone());
            it.add(i.getOutput()[0].clone());
        }
        return it;
    }

    private MachineRecipe get(Material it1, Material it2) {
        return new MachineRecipe(5, new ItemStack[]{new ItemStack(it1)}, new ItemStack[]{new ItemStack(it2)});
    }

    @Override
    protected void registerDefaultRecipes() {
        this.registerRecipe(5, MomotechItem.quantum_.clone(), new SlimefunItemStack("MOMOTECH_ENERGY_QUANTUM", Items.MOMOTECH_ENERGY_QUANTUM));
    }
}
