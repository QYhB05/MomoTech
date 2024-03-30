package cn.qy.MomoTech.Items.Machines;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.utils.Maths;
import cn.qy.MomoTech.utils.MomotechItem;
import cn.qy.MomoTech.utils.Utils;
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

public class DigitalConstructor extends AbstractGUI implements RecipeDisplayItem {
    public DigitalConstructor(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @Override
    public int getEnergyConsumption() {
        return 100000;
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_DIGITAL_CONSTRUCTOR";
    }


    @Override
    public int getCapacity() {
        return 100000;
    }

    @Override
    public int[] IN() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
    }

    @Override
    public int[] OUT() {
        return new int[]{45, 46, 47, 48, 49, 50, 51, 52, 53};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};
    }

    public int[] getInputSlots() {
        return new int[]{9, 10, 11, 12, 13, 14, 15, 16, 17};
    }

    public int[] getOutputSlots() {
        return new int[]{36, 37, 38, 39, 40, 41, 42, 43, 44};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        ItemStack it = MomotechItem.digital(Maths.GetRandom(10));
        if (!Utils.checkOutput(inv, getOutputSlots())) return;
        for (int i : this.getInputSlots())
            if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), Items.MOMOTECH_EMPTY_SHELL, true, false)) {
                for (int j : getOutputSlots()) {
                    if (inv.getItemInSlot(j) == null) {
                        inv.consumeItem(i, 1);
                        inv.toInventory().setItem(j, it.clone());
                        return;
                    }
                }
            }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(12);
        it.add(new CustomItemStack(Material.BOOK, "&f制作数字组件", "&7输入空后等概率的输入0 ~ 10的整数数字组件"));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.empty_shell.clone());
        it.add(MomotechItem.digital(10));
        return it;
    }
}
