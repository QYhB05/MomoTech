package cn.qy.MomoTech.Items.Machines;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

import static cn.qy.MomoTech.utils.MomotechItem.electricity_magnet;
import static cn.qy.MomoTech.utils.MomotechItem.real_magnet;

public class MagnetGenerator extends AContainer implements RecipeDisplayItem {
    public MagnetGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
        this.setProcessingSpeed(1);
    }

    @Override
    public @NotNull String getMachineIdentifier() {
        return "MOMOTECH_MAGNET_GENERATOR";
    }

    @Override
    public int getEnergyConsumption() {
        return 500;
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public int getCapacity() {
        return 1000000;
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.GOLD_BLOCK, 1);
    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 4);
        displayRecipes.add(electricity_magnet);
        displayRecipes.add(SlimefunItems.ELECTRO_MAGNET);
        displayRecipes.add(new SlimefunItemStack(real_magnet, 2));
        displayRecipes.add(SlimefunItems.ELECTRO_MAGNET);
        return displayRecipes;
    }

    @Override
    protected void registerDefaultRecipes() {
        this.registerRecipe(2, new SlimefunItemStack(electricity_magnet, 1), new SlimefunItemStack(SlimefunItems.ELECTRO_MAGNET, 8));
        this.registerRecipe(2, new SlimefunItemStack(real_magnet, 2), new SlimefunItemStack(SlimefunItems.ELECTRO_MAGNET, 1));

    }
}
