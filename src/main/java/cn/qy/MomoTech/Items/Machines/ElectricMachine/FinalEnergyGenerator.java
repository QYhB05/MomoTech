package cn.qy.MomoTech.Items.Machines.ElectricMachine;

import cn.qy.MomoTech.GUI.AbstractGUI;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetProvider;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class FinalEnergyGenerator extends AbstractGUI implements EnergyNetProvider{
    public FinalEnergyGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public int getGeneratedOutput(@NotNull Location location, @NotNull Config config) {
        return 1;
    }

    @Override
    public int getCapacity() {
        return 10;
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
        return "MOMOTECH_FINAL_ENERGY_GENERATOR";
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
    public void add(BlockMenuPreset blockMenuPreset) {
        blockMenuPreset.addItem(4, new CustomItemStack(Material.GREEN_STAINED_GLASS_PANE, "&f正在发电", "§8⇨ §e⚡ &7999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999^0 J/t"), ChestMenuUtils.getEmptyClickHandler());
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {

    }
}
