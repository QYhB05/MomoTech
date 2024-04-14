package cn.qy.MomoTech.Items.Machines.BasicMachine.Machine;

import cn.qy.MomoTech.GUI.AbstractProcessMachine;
import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.Items.MomotechItem;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class EternalMiningMachine extends AbstractProcessMachine implements RecipeDisplayItem {
    public EternalMiningMachine(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{0, 1, 2, 9, 11, 18, 19, 20};
    }

    @Override
    public int[] OUT() {
        return new int[]{6, 7, 8, 15, 17, 24, 25, 26};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{3, 4, 5, 12, 14, 21, 22, 23};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_ETERNAL_MINING_MACHINE";
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{10};
    }

    @Override
    public int getProcessBarSlots() {
        return 13;
    }

    @Override
    public int getDefaultMaxProcess() {
        return 100;
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{16};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(10), MomotechItem.empty_shell, false, false)) {
            inv.consumeItem(10, 1);
            if (checkProcessStart(inv)) {
                addProcess(inv);
            }
            if (checkProcessEnd(inv)) {
                setMaxProcess(getMaxProcess(inv) + (int) (getMaxProcess(inv) / 10.00), inv);
                inv.pushItem(new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER), getOutputSlots());
            }
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(18);
        it.add(new CustomItemStack(Material.BOOK, "&f制作永恒粒子", "&7输入 空 使进度+1 并且进度完成后所需进度会增加"));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.empty_shell.clone());
        it.add(new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER));
        return it;
    }
}
