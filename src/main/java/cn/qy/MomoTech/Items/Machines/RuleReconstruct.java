package cn.qy.MomoTech.Items.Machines;

import cn.qy.MomoTech.GUI.AbstractGUI;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class RuleReconstruct extends AContainer implements RecipeDisplayItem {
    public RuleReconstruct(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
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
        return "MOMOTECH_ENTROPY_RECONSTRUCT";
    }
    @Override
    public int getEnergyConsumption() {
        return 5000;
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
    private MachineRecipe get(Material it1, Material it2) {
        return new MachineRecipe(3, new ItemStack[]{new ItemStack(it1)}, new ItemStack[]{new ItemStack(it2)});
    }
    @Override
    protected void registerDefaultRecipes() {
        this.registerRecipe(get(Material.NETHERITE_INGOT, Material.AMETHYST_SHARD));
        this.registerRecipe(get(Material.NETHERITE_BLOCK, Material.NETHER_STAR));
        this.registerRecipe(get(Material.DIAMOND_BLOCK, Material.NETHERITE_SCRAP));
        this.registerRecipe(get(Material.WATER_BUCKET, Material.ICE));
        this.registerRecipe(get(Material.ICE, Material.PACKED_ICE));
        this.registerRecipe(get(Material.PACKED_ICE, Material.BLUE_ICE));
        this.registerRecipe(get(Material.LAVA_BUCKET, Material.MAGMA_CREAM));
        this.registerRecipe(get(Material.MAGMA_CREAM, Material.SLIME_BALL));
        this.registerRecipe(get(Material.SLIME_BALL, Material.TURTLE_EGG));
        this.registerRecipe(get(Material.TURTLE_EGG, Material.SCUTE));
        this.registerRecipe(get(Material.COMMAND_BLOCK, Material.CHAIN_COMMAND_BLOCK));
        this.registerRecipe(get(Material.CHAIN_COMMAND_BLOCK, Material.REPEATING_COMMAND_BLOCK));
        this.registerRecipe(get(Material.REPEATING_COMMAND_BLOCK, Material.COMMAND_BLOCK));
        this.registerRecipe(get(Material.OAK_SAPLING, Material.SPRUCE_SAPLING));
        this.registerRecipe(get(Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING));
        this.registerRecipe(get(Material.BIRCH_SAPLING, Material.JUNGLE_SAPLING));
        this.registerRecipe(get(Material.JUNGLE_SAPLING, Material.ACACIA_SAPLING));
        this.registerRecipe(get(Material.ACACIA_SAPLING, Material.DARK_OAK_SAPLING));
        this.registerRecipe(get(Material.DARK_OAK_SAPLING, Material.MANGROVE_PROPAGULE));
        this.registerRecipe(get(Material.MANGROVE_PROPAGULE, Material.CHERRY_SAPLING));
        this.registerRecipe(get(Material.COBBLESTONE, Material.COBBLED_DEEPSLATE));
        this.registerRecipe(get(Material.COBBLED_DEEPSLATE, Material.BLACKSTONE));
        this.registerRecipe(get(Material.BLACKSTONE, Material.BASALT));
        this.registerRecipe(get(Material.BASALT, Material.CALCITE));
        this.registerRecipe(get(Material.CALCITE, Material.AMETHYST_CLUSTER));
        this.registerRecipe(get(Material.AMETHYST_CLUSTER, Material.TUFF));
        this.registerRecipe(get(Material.TUFF, Material.SCULK_CATALYST));
        this.registerRecipe(get(Material.GRASS, Material.ORANGE_TULIP));
        this.registerRecipe(get(Material.ORANGE_TULIP, Material.PINK_TULIP));
        this.registerRecipe(get(Material.PINK_TULIP, Material.RED_TULIP));
        this.registerRecipe(get(Material.RED_TULIP, Material.WHITE_TULIP));
        this.registerRecipe(get(Material.WHITE_TULIP, Material.DANDELION));
        this.registerRecipe(get(Material.DANDELION, Material.BLUE_ORCHID));
        this.registerRecipe(get(Material.BLUE_ORCHID, Material.CORNFLOWER));
        this.registerRecipe(get(Material.CORNFLOWER, Material.LILY_OF_THE_VALLEY));
        this.registerRecipe(get(Material.LILY_OF_THE_VALLEY, Material.ROSE_BUSH));
        this.registerRecipe(get(Material.ROSE_BUSH, Material.WITHER_ROSE));
        this.registerRecipe(get(Material.WITHER_ROSE, Material.PEONY));
        this.registerRecipe(get(Material.PEONY, Material.LILAC));
        this.registerRecipe(get(Material.LILAC, Material.AZURE_BLUET));
        this.registerRecipe(get(Material.AZURE_BLUET, Material.OXEYE_DAISY));
        this.registerRecipe(get(Material.OXEYE_DAISY, Material.SUNFLOWER));
        this.registerRecipe(get(Material.SEA_LANTERN, Material.NAUTILUS_SHELL));
        this.registerRecipe(get(Material.NAUTILUS_SHELL, Material.HEART_OF_THE_SEA));
        this.registerRecipe(new MachineRecipe(60, new ItemStack[]{new ItemStack(Material.IRON_BLOCK)}, new SlimefunItemStack[]{new SlimefunItemStack(SlimefunItems.BASIC_CIRCUIT_BOARD, 1)}));
    }
}
