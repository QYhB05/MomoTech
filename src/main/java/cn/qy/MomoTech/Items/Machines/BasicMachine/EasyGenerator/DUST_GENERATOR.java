package cn.qy.MomoTech.Items.Machines.BasicMachine.EasyGenerator;

import cn.qy.MomoTech.GUI.AbstractEasyGeneratorGUI;
import cn.qy.MomoTech.utils.Maths;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class DUST_GENERATOR extends AbstractEasyGeneratorGUI {
    public DUST_GENERATOR(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public ItemStack getOut() {
        SlimefunItemStack[] list = {SlimefunItems.ALUMINUM_DUST, SlimefunItems.COPPER_DUST,
                SlimefunItems.GOLD_DUST, SlimefunItems.LEAD_DUST, SlimefunItems.IRON_DUST, SlimefunItems.SILVER_DUST,
                SlimefunItems.TIN_DUST, SlimefunItems.ZINC_DUST, SlimefunItems.MAGNESIUM_DUST};
        return new SlimefunItemStack(list[Maths.GetRandom(8)], 6);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_DUST_GENERATOR";
    }
}
