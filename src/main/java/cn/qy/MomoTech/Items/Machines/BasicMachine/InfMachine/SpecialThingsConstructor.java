package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine;

import cn.qy.MomoTech.Items.Items;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SpecialThingsConstructor  extends AContainer implements RecipeDisplayItem {
    public SpecialThingsConstructor(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
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
        return "MOMOTECH_SPECIAL_THINGS_CONSTRUCTOR";
    }

    @Override
    public int getEnergyConsumption() {
        return 200;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public int getCapacity() {
        return 1000000;
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

    private MachineRecipe get(SlimefunItemStack it1, SlimefunItemStack it2) {
        return new MachineRecipe(5, new ItemStack[]{it1}, new ItemStack[]{it2});
    }

    @Override
    protected void registerDefaultRecipes() {
        this.registerRecipe(get(new SlimefunItemStack(new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER), 12), new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_)));

        this.registerRecipe(get(new SlimefunItemStack(new SlimefunItemStack("MOMOTECH_PROTON", Items.MOMOTECH_PROTON), 16), new SlimefunItemStack("MOMOTECH_PROTON_INGOT", Items.MOMOTECH_PROTON_INGOT)));

        this.registerRecipe(get(new SlimefunItemStack(new SlimefunItemStack("MOMOTECH_ZYGOTE", Items.MOMOTECH_ZYGOTE), 32), new SlimefunItemStack("MOMOTECH_ZYGOTE_INGOT", Items.MOMOTECH_ZYGOTE_INGOT)));

    }
}
