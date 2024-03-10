package cn.qy.MomoTech.Items.EasyGenerator;

import cn.qy.MomoTech.GUI.AbstractEasyGeneratorGUI;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class STONES_GENERATOR extends AbstractEasyGeneratorGUI {
    public STONES_GENERATOR(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public ItemStack getOut() {
        return new SlimefunItemStack(SlimefunItems.STONE_CHUNK, 8);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "STONES_GENERATOR";
    }
}
