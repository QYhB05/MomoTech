package cn.qy.MomoTech.Items.Machines.BasicMachine.Machine;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.utils.Maths;
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

public class RandomQuantumGenerator extends AbstractGUI implements RecipeDisplayItem {
    public RandomQuantumGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
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
        return new int[]{8, 17, 26, 35, 44, 53};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_RANDOM_QUANTUM_GENERATOR";
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        for (int i = 0; i <= 53; ++i) {
            if (i == 8 || i == 17 || i == 26 || i == 35 || i == 44 || i == 53) continue;
            if (inv.getItemInSlot(i) != null) inv.consumeItem(i, inv.getItemInSlot(i).getAmount());
        }
        while (true) {
            int i = Maths.GetRandom(53);
            if (i == 8 || i == 17 || i == 26 || i == 35 || i == 44 || i == 53) continue;
            inv.toInventory().setItem(i, new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM).clone());
            break;
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> list = new ArrayList<>(10);
        list.add(new CustomItemStack(Material.BOOK, "&f获取随机量子", "&7每tick在机器交互槽内随机出现, 并且清理交互槽内所有其他物品"));
        list.add(new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM).clone());
        return list;
    }
}
