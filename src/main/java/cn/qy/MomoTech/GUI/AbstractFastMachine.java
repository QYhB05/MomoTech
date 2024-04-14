package cn.qy.MomoTech.GUI;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public abstract class AbstractFastMachine extends AContainer {
    public AbstractFastMachine(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
        this.setProcessingSpeed(1);
    }

    @Override
    public void register(@Nonnull SlimefunAddon addon) {
        super.register(addon);
    }

    @Override
    protected void constructMenu(BlockMenuPreset preset) {
        int[] var2 = this.BackGroundSlots();
        int var3 = var2.length;

        int var4;
        int i;
        for (var4 = 0; var4 < var3; ++var4) {
            i = var2[var4];
            preset.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        }

        var2 = this.InputSlots();
        var3 = var2.length;

        for (var4 = 0; var4 < var3; ++var4) {
            i = var2[var4];
            preset.addItem(i, ChestMenuUtils.getInputSlotTexture(), ChestMenuUtils.getEmptyClickHandler());
        }

        var2 = this.OutputSlots();
        var3 = var2.length;

        for (var4 = 0; var4 < var3; ++var4) {
            i = var2[var4];
            preset.addItem(i, ChestMenuUtils.getOutputSlotTexture(), ChestMenuUtils.getEmptyClickHandler());
        }

        preset.addItem(22, new CustomItemStack(Material.BLACK_STAINED_GLASS_PANE, " "), ChestMenuUtils.getEmptyClickHandler());

    }

    @Override
    public abstract int getEnergyConsumption();

    @Override
    public abstract int getCapacity();

    @Override
    public int getSpeed() {
        return 1;
    }

    @Override
    protected abstract void registerDefaultRecipes();


    @Override
    public int[] getInputSlots() {
        return new int[]{10, 11, 12, 19, 20, 21, 28, 29, 30};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{14, 15, 16, 23, 24, 25, 32, 33, 34};
    }

    public int[] OutputSlots() {
        return new int[]{17, 26, 35};
    }

    public int[] InputSlots() {
        return new int[]{9, 18, 27};
    }

    public int[] BackGroundSlots() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 36, 37, 38, 39, 40, 41, 42, 43, 44, 13, 31};
    }
}
