package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine.FasterMachine;

import cn.qy.MomoTech.GUI.AbstractFastMachine;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Compressor_ extends AbstractFastMachine implements RecipeDisplayItem {
    public Compressor_(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }


    @Override
    public @NotNull List<ItemStack> getDisplayRecipes() {
        return super.getDisplayRecipes();
    }

    @Override
    public int getEnergyConsumption() {
        return 500;
    }

    @Override
    public int getCapacity() {
        return 1000;
    }

    @Override
    protected void registerDefaultRecipes() {
        List<SlimefunItem> list = Utils.getRecipeByRecipeType(RecipeType.COMPRESSOR);
        for (SlimefunItem i : list) {
            ItemStack[] it = i.getRecipe().clone();
            ItemStack[] it1 = new ItemStack[]{i.getItem().clone()};
            this.registerRecipe(new MachineRecipe(1, it, it1));
        }
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.COMPASS);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_COMPRESSOR";
    }
}
