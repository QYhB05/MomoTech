package cn.qy.MomoTech.Items.EasyGenerator;

import cn.qy.MomoTech.GUI.AbstractEasyGeneratorGUI;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class STONE_GENERATOR_I extends AbstractEasyGeneratorGUI {
    public STONE_GENERATOR_I(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public ItemStack getOut() {
        return new ItemStack(Material.COBBLESTONE, 8);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "STONE_GENERATOR_I";
    }
}
