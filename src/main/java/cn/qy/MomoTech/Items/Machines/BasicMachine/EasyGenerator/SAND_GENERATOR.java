package cn.qy.MomoTech.Items.Machines.BasicMachine.EasyGenerator;

import cn.qy.MomoTech.GUI.AbstractEasyGeneratorGUI;
import cn.qy.MomoTech.utils.Maths;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class SAND_GENERATOR extends AbstractEasyGeneratorGUI {
    public SAND_GENERATOR(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public ItemStack getOut() {
        Material[] list = {Material.SAND, Material.RED_SAND, Material.GRAVEL, Material.SOUL_SAND};
        return new ItemStack(list[Maths.GetRandom(3)], 8);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_SAND_GENERATOR";
    }
}
