package cn.qy.MomoTech.Items.Machines.ElectricMachine;

import cn.qy.MomoTech.GUI.AbstractElectricGUI;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ElectricEater extends AbstractElectricGUI {
    public ElectricEater(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[0];
    }

    @Override
    public int[] OUT() {
        return new int[0];
    }

    @Override
    public int[] EMPTY() {
        return new int[]{0, 1, 2, 3, 5, 6, 7, 8};
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_ELECTRIC_EATER";
    }

    @Override
    public int[] getInputSlots() {
        return new int[0];
    }

    @Override
    public int[] getOutputSlots() {
        return new int[0];
    }

    @Override
    public int getCapacity() {
        return 2147483647;
    }

    @Override
    public int getEnergyConsumption() {
        return 2000000000;
    }

    @Override
    protected boolean findNextRecipe(BlockMenu inv) {
        return true;
    }

    @Override
    public void add(BlockMenuPreset b) {
        b.addItem(4, new CustomItemStack(Material.GREEN_STAINED_GLASS_PANE, "&b正在吃电...", "&72,000,000,000 J/t"), ChestMenuUtils.getEmptyClickHandler());
    }
}
