package cn.qy.MomoTech.GUI.MachineGUI;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.utils.MomotechItem;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public abstract class RandomCopier_ extends AbstractGUI {
    protected RandomCopier_(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
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

    private int[] getSlots() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 29, 30, 31, 32, 33, 34, 35};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{52};
    }

    @Override
    protected MachineRecipe findNextRecipe(BlockMenu inv) {
        if (!Utils.checkOutput(inv, getOutputSlots())) return null;
        for (int i = 0; i < 36; i++) {
            if (inv.getItemInSlot(i) == null)
                return null;
            for (int j = 0; j < 36; j++) {
                if (inv.getItemInSlot(j) == null)
                    return null;
                if (i == j) continue;
                ItemStack it = inv.getItemInSlot(i).clone(), it1 = inv.getItemInSlot(j).clone();
                it.setAmount(1);
                it1.setAmount(1);
                if (it == it1)
                    return null;
                if (inv.getItemInSlot(i).getAmount() == inv.getItemInSlot(j).getAmount())
                    return null;
            }
        }
        if (!SlimefunUtils.isItemSimilar(inv.getItemInSlot(46), MomotechItem.creative_item_II, true, false))
            return null;
        Random r = new Random();
        int i = r.nextInt();
        int j = Math.abs(r.nextInt() % 36);
        if (i % 10 == 0) return null;
        inv.consumeItem(46, 1);
        ItemStack it = inv.getItemInSlot(j).clone();
        it.setAmount(1);
        inv.pushItem(it, getOutputSlots());
        return null;
    }
}
