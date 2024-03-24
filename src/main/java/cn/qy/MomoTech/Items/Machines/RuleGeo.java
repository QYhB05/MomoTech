package cn.qy.MomoTech.Items.Machines;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.utils.Maths;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.geo.GEOResource;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.Pair;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.RandomizedSet;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RuleGeo extends AbstractGUI implements RecipeDisplayItem {
    private final Map<Pair<Biome, World.Environment>, RandomizedSet<ItemStack>> recipe = new HashMap<>();

    public RuleGeo(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{0, 1, 2, 3, 5, 6, 7, 8};
    }

    @Override
    public int getCapacity() {
        return 100000;
    }

    @Override
    public int getEnergyConsumption() {
        return 1000;
    }

    @Override
    public int[] OUT() {
        return new int[]{9, 10, 11, 12, 13, 14, 15, 16, 17, 36, 37, 38, 39, 40, 41, 42, 43, 44};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_RULE_GEO";
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{4};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        if (!Utils.checkOutput(inv, getOutputSlots())) return;
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) != null) {
                ItemStack it = inv.getItemInSlot(i).clone();
                it.setAmount(1);
                if (it.equals(new ItemStack(Material.NETHERITE_PICKAXE))) {
                    ArrayList<ItemStack> item = new ArrayList<>();
                    for (GEOResource resource : Slimefun.getRegistry().getGEOResources().values()) {
                        if (resource.isObtainableFromGEOMiner()) {
                            item.add(resource.getItem().clone());
                        }
                    }

                    ItemStack output = item.get(Maths.GetRandom(item.size() - 1));
                    output.setAmount(16);
                    for (int j : getOutputSlots()) {
                        if (inv.getItemInSlot(j) == null) {
                            inv.pushItem(output.clone(), getOutputSlots());
                            inv.consumeItem(4, 1);
                            return;
                        }
                    }
                }
            }
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(4);
        it.add(new CustomItemStack(Material.NETHERITE_PICKAXE, "&f需要输入下届合金镐", "&7每 1tick 挖掘一次自然资源, 无视群系, 无视权重"));
        it.add(new CustomItemStack(Material.BOOK, "&f任意注册过的地理资源"));
        return it;
    }
}

