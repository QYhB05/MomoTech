package cn.qy.MomoTech.Items.Machines.ElectricMachine;

import cn.qy.MomoTech.GUI.AbstractElectricGUI;
import cn.qy.MomoTech.Items.MomotechItem;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DigitalGenerator extends AbstractElectricGUI implements EnergyNetComponent, RecipeDisplayItem {

    public DigitalGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{9, 17};
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
        return "MOMOTECH_DIGITAL_GENERATOR";
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{10, 11, 12, 13, 14, 15, 16};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[0];
    }

    @Override
    public void add(BlockMenuPreset b) {
        b.addItem(4, new CustomItemStack(Material.RED_STAINED_GLASS_PANE, "&f已储存 NULL J"), ChestMenuUtils.getEmptyClickHandler());
    }

    @Override
    protected boolean findNextRecipe(BlockMenu inv) {
        inv.toInventory().setItem(4, new CustomItemStack(Material.GREEN_STAINED_GLASS_PANE, "&f已储存 " + this.getCharge(inv.getLocation()) + " J"));
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) != null) {
                if (SlimefunUtils.isItemSimilar(inv.getItemInSlot(i), MomotechItem.digital(0), false, false)) {
                    String str = Objects.requireNonNull(inv.getItemInSlot(i).getLore()).get(0);
                    int j = (int) Double.parseDouble(str.substring(str.indexOf('f') + 1));
                    this.setCharge(inv.getLocation(), this.getCharge(inv.getLocation()) + j);
                    inv.consumeItem(i, 1);
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    protected void tick(Block b) {
        BlockMenu inv = BlockStorage.getInventory(b);
        if (this.findNextRecipe(inv))
            this.setCharge(b.getLocation(), this.getCharge(b.getLocation()) - this.getEnergyConsumption());
    }

    @Nonnull
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CAPACITOR;
    }

    public int getCapacity() {
        return 16777216;
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> list = new ArrayList<>(10);
        list.add(new CustomItemStack(Material.BOOK, "&f插入数字为电容增加 数字 J 电量, 电容可储存 16,777,216 J"));
        list.add(MomotechItem.digital(1.0).clone());
        return list;
    }
}
