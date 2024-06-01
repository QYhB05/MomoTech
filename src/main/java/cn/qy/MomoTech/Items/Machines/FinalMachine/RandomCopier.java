package cn.qy.MomoTech.Items.Machines.FinalMachine;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.utils.Maths;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.implementation.handlers.SimpleBlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomCopier extends AbstractGUI implements RecipeDisplayItem {
    public RandomCopier(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @Nonnull
    @Override
    protected BlockBreakHandler onBlockBreak() {
        return new SimpleBlockBreakHandler() {
            public void onBlockBreak(@NotNull Block b) {
                BlockMenu inv = BlockStorage.getInventory(b);
                if (inv != null) {
                    for (int i = 0; i <= 53; ++i) {
                        if (i == 51 || i == 53 || i == 36 || i == 37 || i == 38 || i == 39 || i == 40 || i == 41 || i == 42 || i == 43 || i == 44 || i == 45 || i == 47 || i == 48 || i == 49 || i == 50) {
                            continue;
                        }
                        if (inv.getItemInSlot(i) != null) {
                            inv.dropItems(inv.getLocation(), i);
                        }
                    }
                }
            }
        };
    }


    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_RANDOM_COPIER";
    }


    @Override
    public int[] IN() {
        return new int[]{45, 47};
    }

    @Override
    public int[] OUT() {
        return new int[]{51, 53};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{36, 37, 38, 39, 40, 41, 42, 43, 44, 48, 49, 50};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{46};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{52};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        if (Utils.checkOutput(inv, getOutputSlots())) return;
        for (int i = 0; i < 36; i++) {
            if (inv.getItemInSlot(i) == null)
                return;
            for (int j = 0; j < 36; j++) {
                if (inv.getItemInSlot(j) == null)
                    return;
                if (i == j) continue;
                ItemStack it = inv.getItemInSlot(i).clone(), it1 = inv.getItemInSlot(j).clone();
                it.setAmount(1);
                it1.setAmount(1);
                if (it.isSimilar(it1))
                    return;
                if (inv.getItemInSlot(i).getAmount() == inv.getItemInSlot(j).getAmount())
                    return;
            }
        }
        if (!SlimefunUtils.isItemSimilar(inv.getItemInSlot(46), MomotechItem.creative_item_II, true, false))
            return;
        Random r = new Random();
        int j = Math.abs(r.nextInt() % 36);
        inv.consumeItem(46, 1);
        if (Maths.GetRandom(9) != 0) return;
        ItemStack it = inv.getItemInSlot(j).clone();
        it.setAmount(1);
        inv.pushItem(it.clone(), getOutputSlots());
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(8);
        it.add(MomotechItem.creative_item_II.clone());
        it.add(new CustomItemStack(Material.BOOK, "&f左下角输入原始物质γ有10%概率随机复制上方交互槽中的一种物品", "&7要求:交互槽种物品数量种类均不相等"));
        return it;
    }
}
