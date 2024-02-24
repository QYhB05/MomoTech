package cn.qy.MomoTech.GUI.MachineGUI;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.utils.Maths;
import cn.qy.MomoTech.utils.MomotechItem;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.inventory.ItemStack;

import static cn.qy.MomoTech.utils.MomotechItem.*;

public abstract class QuantityConstructor_ extends AbstractGUI {
    protected QuantityConstructor_(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{};
    }

    @Override
    public int[] OUT() {
        return new int[]{50, 48};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{53, 52, 51, 47, 46, 45};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8
                , 9, 10, 11, 12, 13, 14, 15, 16, 17
                , 18, 19, 20, 21, 22, 23, 24, 25, 26
                , 27, 28, 29, 30, 31, 32, 33, 34, 35
                , 36, 37, 38, 39, 40, 41, 42, 43, 44};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{49};
    }

    private boolean BUGChecker(BlockMenu inv) {
        boolean[] checker1 = {false, false, false, false, false, false};
        for (int i : getInputSlots()) {
            ItemStack checker = inv.getItemInSlot(i);
            if (!SlimefunUtils.isItemSimilar(checker, bug, true, false) && !SlimefunUtils.isItemSimilar(checker, bug1, true, false) && !SlimefunUtils.isItemSimilar(checker, bug2, true, false) && !SlimefunUtils.isItemSimilar(checker, bug3, true, false) && !SlimefunUtils.isItemSimilar(checker, bug4, true, false) && !SlimefunUtils.isItemSimilar(checker, bug5, true, false))
                return false;
            if (inv.getItemInSlot(i).getAmount() != 64) return false;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), bug, true, false))
                checker1[0] = true;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), bug1, true, false))
                checker1[1] = true;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), bug2, true, false))
                checker1[2] = true;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), bug3, true, false))
                checker1[3] = true;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), bug4, true, false))
                checker1[4] = true;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), bug5, true, false))
                checker1[5] = true;
        }
        return checker1[0] && checker1[1] && checker1[2] && checker1[3] && checker1[4] && checker1[5];
    }

    private boolean UncontrollableEmptyChecker(BlockMenu inv) {
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i).getAmount() != 64) return false;
            if (!SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), MomotechItem.uncontrollable_empty, true, false))
                return false;
        }
        return true;
    }

    private boolean FinalStarChecker(BlockMenu inv) {
        for (int i : getInputSlots()) {
            if (!SlimefunUtils.isItemSimilar(MomotechItem.final_star, inv.getItemInSlot(i), true, false))
                return false;
            if (inv.getItemInSlot(i).getAmount() != 64) return false;
        }
        return true;
    }

    private void ConsumeItems(BlockMenu inv) {
        for (int i : getInputSlots()) {
            inv.consumeItem(i, inv.getItemInSlot(i).getAmount());
        }
    }

    private boolean CreativeItemChecker(BlockMenu inv) {
        boolean[] checker = {false, false};
        for (int i : getInputSlots()) {
            if (!SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), creative_item_I, true, false) && !SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), creative_item, true, false))
                return false;
            if (inv.getItemInSlot(i).getAmount() != 64) return false;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), creative_item_I, true, false))
                checker[0] = true;
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), creative_item, true, false))
                checker[1] = true;
        }
        return checker[0] && checker[1];
    }

    @Override
    protected MachineRecipe findNextRecipe(BlockMenu inv) {
        if (!Utils.checkOutput(inv, getOutputSlots())) return null;
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) == null) {
                return null;
            }
        }
        if (!Utils.checkOutput(inv, getOutputSlots())) return null;
        if (BUGChecker(inv)) {
            ConsumeItems(inv);
            inv.pushItem(new SlimefunItemStack(MomotechItem.bug_crystal, 1), getOutputSlots());
            return null;
        }
        if (CreativeItemChecker(inv)) {
            ConsumeItems(inv);
            inv.pushItem(new SlimefunItemStack(creative__, 1), getOutputSlots());
            return null;
        }
        if (UncontrollableEmptyChecker(inv)) {
            ConsumeItems(inv);
            if (Maths.GetRandom(20) == 1)
                inv.pushItem(new SlimefunItemStack(creative_item_II, 1), getOutputSlots());
            return null;
        }
        if (FinalStarChecker(inv)) {
            ConsumeItems(inv);
            inv.pushItem(new SlimefunItemStack(MomotechItem.final_item, 1), getOutputSlots());
            return null;
        }
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) == null) return null;
            if (inv.getItemInSlot(i).getAmount() == 64) {
                ConsumeItems(inv);
                if (Maths.GetRandom(1000) == 0)
                    inv.pushItem(new SlimefunItemStack(quantity_item, 1), getOutputSlots());
                return null;
            }
        }
        return null;
    }
}
