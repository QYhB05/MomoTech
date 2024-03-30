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

public class Plant extends AbstractGUI implements RecipeDisplayItem {
    private final Material[] material = {Material.POTATO,
            Material.CARROT,
            Material.PUMPKIN_SEEDS,
            Material.MELON_SEEDS,
            Material.BEETROOT_SEEDS,
            Material.WHEAT_SEEDS,
            Material.BROWN_MUSHROOM,
            Material.RED_MUSHROOM,
            Material.BAMBOO,
            Material.DEAD_BUSH,
            Material.COCOA_BEANS,
            Material.SUGAR_CANE,
            Material.CACTUS,
            Material.NETHER_WART,
            Material.WITHER_ROSE,
            Material.TORCHFLOWER_SEEDS,
            Material.LILY_PAD,
            Material.VINE,
            Material.GLOW_LICHEN,
            Material.GRASS,
            Material.SWEET_BERRIES,
            Material.GLOW_BERRIES,
            Material.SEAGRASS,
            Material.KELP,
            Material.SEA_PICKLE
    };

    public Plant(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
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
        return "MOMOTECH_PLANT";
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
        if (it.equals(new ItemStack(Material.POTATO))) {
            pushIt(new Material[]{Material.POTATO, Material.POISONOUS_POTATO}, inv);
        }
        if (it.equals(new ItemStack(Material.CARROT))) {
            pushIt(new Material[]{Material.CARROT}, inv);
        }
        if (it.equals(new ItemStack(Material.PUMPKIN_SEEDS))) {
            pushIt(new Material[]{Material.PUMPKIN, Material.PUMPKIN_SEEDS}, inv);
        }
        if (it.equals(new ItemStack(Material.MELON_SEEDS))) {
            pushIt(new Material[]{Material.MELON, Material.MELON_SEEDS, Material.MELON_SLICE}, inv);
        }
        if (it.equals(new ItemStack(Material.BEETROOT_SEEDS))) {
            pushIt(new Material[]{Material.BEETROOT, Material.BEETROOT_SEEDS}, inv);
        }
        if (it.equals(new ItemStack(Material.WHEAT_SEEDS))) {
            pushIt(new Material[]{Material.WHEAT, Material.WHEAT_SEEDS}, inv);
        }
        if (it.equals(new ItemStack(Material.BROWN_MUSHROOM))) {
            pushIt(new Material[]{Material.BROWN_MUSHROOM, Material.BROWN_MUSHROOM_BLOCK, Material.MUSHROOM_STEM}, inv);
        }
        if (it.equals(new ItemStack(Material.RED_MUSHROOM))) {
            pushIt(new Material[]{Material.RED_MUSHROOM_BLOCK, Material.RED_MUSHROOM, Material.MUSHROOM_STEM}, inv);
        }
        if (it.equals(new ItemStack(Material.BAMBOO))) {
            pushIt(new Material[]{Material.BAMBOO}, inv);
        }
        if (it.equals(new ItemStack(Material.DEAD_BUSH))) {
            pushIt(new Material[]{Material.DEAD_BUSH, Material.STICK}, inv);
        }
        if (it.equals(new ItemStack(Material.COCOA_BEANS))) {
            pushIt(new Material[]{Material.COCOA_BEANS}, inv);
        }
        if (it.equals(new ItemStack(Material.SUGAR_CANE))) {
            pushIt(new Material[]{Material.SUGAR_CANE}, inv);
        }
        if (it.equals(new ItemStack(Material.CACTUS))) {
            pushIt(new Material[]{Material.CACTUS}, inv);
        }
        if (it.equals(new ItemStack(Material.NETHER_WART))) {
            pushIt(new Material[]{Material.NETHER_WART}, inv);
        }
        if (it.equals(new ItemStack(Material.WITHER_ROSE))) {
            pushIt(new Material[]{Material.WITHER_ROSE}, inv);
        }
        if (it.equals(new ItemStack(Material.TORCHFLOWER_SEEDS))) {
            pushIt(new Material[]{Material.TORCHFLOWER, Material.TORCHFLOWER_SEEDS}, inv);
        }
        if (it.equals(new ItemStack(Material.LILY_PAD))) {
            pushIt(new Material[]{Material.LILY_PAD}, inv);
        }
        if (it.equals(new ItemStack(Material.VINE))) {
            pushIt(new Material[]{Material.VINE}, inv);
        }
        if (it.equals(new ItemStack(Material.GLOW_LICHEN))) {
            pushIt(new Material[]{Material.GLOW_LICHEN}, inv);
        }
        if (it.equals(new ItemStack(Material.GRASS))) {
            pushIt(new Material[]{Material.GRASS}, inv);
        }
        if (it.equals(new ItemStack(Material.SWEET_BERRIES))) {
            pushIt(new Material[]{Material.SWEET_BERRIES}, inv);
        }
        if (it.equals(new ItemStack(Material.GLOW_BERRIES))) {
            pushIt(new Material[]{Material.GLOW_BERRIES}, inv);
        }
        if (it.equals(new ItemStack(Material.SEAGRASS))) {
            pushIt(new Material[]{Material.SEAGRASS}, inv);
        }
        if (it.equals(new ItemStack(Material.KELP))) {
            pushIt(new Material[]{Material.KELP}, inv);
        }
        if (it.equals(new ItemStack(Material.SEA_PICKLE))) {
            pushIt(new Material[]{Material.SEA_PICKLE}, inv);
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(this.material.length * 2 + 1);
        for (Material t : this.material) {
            it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, "&f支持的树苗"));
            it.add(new ItemStack(t));
        }
        return it;
    }
}

