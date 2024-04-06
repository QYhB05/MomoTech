package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class NetheritePickaxeChanger extends AContainer implements RecipeDisplayItem {
    public NetheritePickaxeChanger(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
        this.setProcessingSpeed(1);
    }

    @Override
    public @NotNull String getMachineIdentifier() {
        return "MOMOTECH_NETHERITE_PICKAXE_CHANGER";
    }

    @Override
    public int getEnergyConsumption() {
        return 100;
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE, 1);
    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 4);
        displayRecipes.add(new ItemStack(Material.DIAMOND_PICKAXE, 8));
        displayRecipes.add(new ItemStack(Material.NETHERITE_PICKAXE, 8));
        displayRecipes.add(new ItemStack(Material.DIAMOND_PICKAXE));
        displayRecipes.add(new ItemStack(Material.NETHERITE_PICKAXE));
        return displayRecipes;
    }

    @Override
    protected void registerDefaultRecipes() {
        this.registerRecipe(3, new ItemStack(Material.DIAMOND_PICKAXE, 8), new ItemStack(Material.NETHERITE_PICKAXE, 8));
        this.registerRecipe(3, new ItemStack(Material.DIAMOND_PICKAXE, 1), new ItemStack(Material.NETHERITE_PICKAXE));
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    public int getCapacity() {
        return 1000000;
    }
}
