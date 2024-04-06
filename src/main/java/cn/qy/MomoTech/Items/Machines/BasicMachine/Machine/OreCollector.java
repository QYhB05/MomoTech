package cn.qy.MomoTech.Items.Machines.BasicMachine.Machine;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.utils.Utils;
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
import java.util.Random;

public class OreCollector extends AbstractGUI implements RecipeDisplayItem {
    public OreCollector(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }


    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_ORE_COLLECTOR";
    }


    @Override
    public int[] IN() {
        return new int[]{};
    }

    @Override
    public int[] OUT() {
        return new int[]{};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{27, 28, 29, 30, 31, 32, 33, 34, 35};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        if (Utils.checkOutput(inv, getOutputSlots())) return;
        Random r = new Random();
        int j = Math.abs(r.nextInt() % 9);
        inv.pushItem(new SlimefunItemStack(MomotechItem.mineral[j][2], 4), getOutputSlots());
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(12);
        it.add(new CustomItemStack(Material.BOOK, "&f自动生产叁重压缩矿物", "&7每 1tick 生成一次"));
        it.add(new SlimefunItemStack(MomotechItem.mineral[0][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.mineral[1][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.mineral[2][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.mineral[3][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.mineral[4][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.mineral[5][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.mineral[6][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.mineral[7][2], 4));
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(new SlimefunItemStack(MomotechItem.mineral[8][2], 4));
        return it;
    }
}
