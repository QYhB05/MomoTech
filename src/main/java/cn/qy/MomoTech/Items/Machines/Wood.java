package cn.qy.MomoTech.Items.Machines;

import cn.qy.MomoTech.GUI.AbstractGUI;
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

public class Wood extends AbstractGUI implements RecipeDisplayItem {
    private final Material[] it = {Material.OAK_SAPLING,
            Material.DARK_OAK_SAPLING,
            Material.SPRUCE_SAPLING,
            Material.CHERRY_SAPLING,
            Material.ACACIA_SAPLING,
            Material.MANGROVE_PROPAGULE,
            Material.JUNGLE_SAPLING,
            Material.BIRCH_SAPLING,
            Material.WARPED_FUNGUS,
            Material.CRIMSON_FUNGUS,
    };

    public Wood(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{1};
    }

    @Override
    public int[] OUT() {
        return new int[]{};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_WOOD";
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{0};
    }

    @Override
    public int getCapacity() {
        return 100000;
    }

    @Override
    public int getEnergyConsumption() {
        return 10000;
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{2, 3, 4, 5, 6, 7, 8};
    }

    public void pushIt(Material[] it, BlockMenu b) {
        for (Material i : it) {
            b.pushItem(new ItemStack(i, 32), getOutputSlots());
        }
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        if (inv.getItemInSlot(0) == null) return;
        ItemStack it = inv.getItemInSlot(0).clone();
        it.setAmount(1);
        if (it.equals(new ItemStack(Material.OAK_SAPLING))) {
            pushIt(new Material[]{Material.OAK_LEAVES, Material.OAK_LOG, Material.OAK_SAPLING, Material.APPLE, Material.STICK}, inv);
        } else if (it.equals(new ItemStack(Material.DARK_OAK_SAPLING))) {
            pushIt(new Material[]{Material.DARK_OAK_LEAVES, Material.DARK_OAK_LOG, Material.DARK_OAK_SAPLING, Material.APPLE, Material.STICK}, inv);
        } else if (it.equals(new ItemStack(Material.SPRUCE_SAPLING))) {
            pushIt(new Material[]{Material.SPRUCE_LEAVES, Material.SPRUCE_LOG, Material.SPRUCE_SAPLING, Material.STICK}, inv);
        } else if (it.equals(new ItemStack(Material.CHERRY_SAPLING))) {
            pushIt(new Material[]{Material.CHERRY_LEAVES, Material.CHERRY_LOG, Material.CHERRY_SAPLING, Material.STICK}, inv);
        } else if (it.equals(new ItemStack(Material.ACACIA_SAPLING))) {
            pushIt(new Material[]{Material.ACACIA_LEAVES, Material.ACACIA_LOG, Material.ACACIA_SAPLING, Material.STICK}, inv);
        } else if (it.equals(new ItemStack(Material.MANGROVE_PROPAGULE))) {
            pushIt(new Material[]{Material.MANGROVE_LEAVES, Material.MANGROVE_LOG, Material.MANGROVE_PROPAGULE, Material.STICK}, inv);
        } else if (it.equals(new ItemStack(Material.JUNGLE_SAPLING))) {
            pushIt(new Material[]{Material.JUNGLE_LEAVES, Material.JUNGLE_LOG, Material.JUNGLE_SAPLING, Material.COCOA_BEANS, Material.STICK}, inv);
        } else if (it.equals(new ItemStack(Material.BIRCH_SAPLING))) {
            pushIt(new Material[]{Material.BIRCH_LEAVES, Material.BIRCH_LOG, Material.BIRCH_SAPLING, Material.APPLE, Material.STICK}, inv);
        } else if (it.equals(new ItemStack(Material.WARPED_FUNGUS))) {
            pushIt(new Material[]{Material.WARPED_STEM, Material.WARPED_WART_BLOCK, Material.WARPED_HYPHAE, Material.SHROOMLIGHT}, inv);
        } else if (it.equals(new ItemStack(Material.CRIMSON_FUNGUS))) {
            pushIt(new Material[]{Material.CRIMSON_STEM, Material.NETHER_WART_BLOCK, Material.CRIMSON_HYPHAE, Material.SHROOMLIGHT}, inv);
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(this.it.length * 2 + 1);
        for (Material t : this.it) {
            it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, "&f支持的树苗"));
            it.add(new ItemStack(t));
        }
        return it;
    }
}

