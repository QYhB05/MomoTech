package cn.qy.MomoTech.Items.Machines;

import cn.qy.MomoTech.utils.MomotechItem;
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

import static cn.qy.MomoTech.utils.MomotechItem.*;

public class Constructor extends AContainer implements RecipeDisplayItem {
    public Constructor(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
        this.setProcessingSpeed(1);
    }

    @Override
    public @NotNull String getMachineIdentifier() {
        return "MOMOTECH_CONSTRUCTOR";
    }

    @Override
    public int getEnergyConsumption() {
        return 900;
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.NETHER_STAR);
    }

    @Override
    public int getSpeed() {
        return 1;
    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> displayRecipes = new ArrayList<>(recipes.size() * 4);
        displayRecipes.add(new SlimefunItemStack(infinity, 32));
        displayRecipes.add(rule_star.clone());
        displayRecipes.add(new SlimefunItemStack(shine, 64));
        displayRecipes.add(MomotechItem.shine1.clone());
        displayRecipes.add(new SlimefunItemStack(dark, 64));
        displayRecipes.add(MomotechItem.dark1.clone());
        displayRecipes.add(new ItemStack(Material.DIAMOND, 64));
        displayRecipes.add(diamond.clone());
        displayRecipes.add(new ItemStack(Material.IRON_INGOT, 64));
        displayRecipes.add(iron.clone());
        displayRecipes.add(new ItemStack(Material.GOLD_INGOT, 64));
        displayRecipes.add(gold.clone());
        displayRecipes.add(new ItemStack(Material.REDSTONE, 64));
        displayRecipes.add(redstone.clone());
        displayRecipes.add(new ItemStack(Material.LAPIS_LAZULI, 64));
        displayRecipes.add(lapis.clone());
        displayRecipes.add(new ItemStack(Material.QUARTZ, 64));
        displayRecipes.add(quartz.clone());
        displayRecipes.add(new ItemStack(Material.COAL, 64));
        displayRecipes.add(coal.clone());
        displayRecipes.add(new ItemStack(Material.EMERALD, 64));
        displayRecipes.add(emerald.clone());
        displayRecipes.add(new SlimefunItemStack(diamond, 64));
        displayRecipes.add(diamond1.clone());
        displayRecipes.add(new SlimefunItemStack(iron, 64));
        displayRecipes.add(iron1.clone());
        displayRecipes.add(new SlimefunItemStack(gold, 64));
        displayRecipes.add(gold1.clone());
        displayRecipes.add(new SlimefunItemStack(redstone, 64));
        displayRecipes.add(redstone1.clone());
        displayRecipes.add(new SlimefunItemStack(lapis, 64));
        displayRecipes.add(lapis1.clone());
        displayRecipes.add(new SlimefunItemStack(quartz, 64));
        displayRecipes.add(quartz1.clone());
        displayRecipes.add(new SlimefunItemStack(coal, 64));
        displayRecipes.add(coal1.clone());
        displayRecipes.add(new SlimefunItemStack(emerald, 64));
        displayRecipes.add(emerald1.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 64));
        displayRecipes.add(ag.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 64));
        displayRecipes.add(cu.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.GOLD_4K, 64));
        displayRecipes.add(au.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 64));
        displayRecipes.add(pb.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.TIN_INGOT, 64));
        displayRecipes.add(sn.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 64));
        displayRecipes.add(zn.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 64));
        displayRecipes.add(mg.clone());
        displayRecipes.add(new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 64));
        displayRecipes.add(al.clone());

        return displayRecipes;
    }

    @Override
    public int getCapacity() {
        return 1000000;
    }

    @Override
    protected void registerDefaultRecipes() {
        this.registerRecipe(30, new SlimefunItemStack(infinity, 32), rule_star);
        this.registerRecipe(10, new SlimefunItemStack(shine, 64), MomotechItem.shine1);
        this.registerRecipe(10, new SlimefunItemStack(dark, 64), MomotechItem.dark1);
        this.registerRecipe(10, new ItemStack(Material.DIAMOND, 64), diamond);
        this.registerRecipe(10, new ItemStack(Material.IRON_INGOT, 64), iron);
        this.registerRecipe(10, new ItemStack(Material.GOLD_INGOT, 64), gold);
        this.registerRecipe(10, new ItemStack(Material.REDSTONE, 64), redstone);
        this.registerRecipe(10, new ItemStack(Material.LAPIS_LAZULI, 64), lapis);
        this.registerRecipe(10, new ItemStack(Material.QUARTZ, 64), quartz);
        this.registerRecipe(10, new ItemStack(Material.COAL, 64), coal);
        this.registerRecipe(10, new ItemStack(Material.EMERALD, 64), emerald);
        this.registerRecipe(10, new SlimefunItemStack(diamond, 64), diamond1);
        this.registerRecipe(10, new SlimefunItemStack(iron, 64), iron1);
        this.registerRecipe(10, new SlimefunItemStack(gold, 64), gold1);
        this.registerRecipe(10, new SlimefunItemStack(redstone, 64), redstone1);
        this.registerRecipe(10, new SlimefunItemStack(lapis, 64), lapis1);
        this.registerRecipe(10, new SlimefunItemStack(quartz, 64), quartz1);
        this.registerRecipe(10, new SlimefunItemStack(coal, 64), coal1);
        this.registerRecipe(10, new SlimefunItemStack(emerald, 64), emerald1);
        this.registerRecipe(10, new SlimefunItemStack(SlimefunItems.SILVER_INGOT, 64), ag);
        this.registerRecipe(10, new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 64), cu);
        this.registerRecipe(10, new SlimefunItemStack(SlimefunItems.GOLD_4K, 64), au);
        this.registerRecipe(10, new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 64), pb);
        this.registerRecipe(10, new SlimefunItemStack(SlimefunItems.TIN_INGOT, 64), sn);
        this.registerRecipe(10, new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 64), zn);
        this.registerRecipe(10, new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 64), mg);
        this.registerRecipe(10, new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 64), al);
        this.registerRecipe(10, new SlimefunItemStack(ag, 64), ag1);
        this.registerRecipe(10, new SlimefunItemStack(cu, 64), cu1);
        this.registerRecipe(10, new SlimefunItemStack(au, 64), au1);
        this.registerRecipe(10, new SlimefunItemStack(pb, 64), pb1);
        this.registerRecipe(10, new SlimefunItemStack(sn, 64), sn1);
        this.registerRecipe(10, new SlimefunItemStack(zn, 64), zn1);
        this.registerRecipe(10, new SlimefunItemStack(mg, 64), mg1);
        this.registerRecipe(10, new SlimefunItemStack(al, 64), al1);

    }
}
