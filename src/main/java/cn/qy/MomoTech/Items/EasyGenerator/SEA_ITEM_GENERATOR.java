package cn.qy.MomoTech.Items.EasyGenerator;

import cn.qy.MomoTech.GUI.AbstractEasyGeneratorGUI;
import cn.qy.MomoTech.utils.Maths;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class SEA_ITEM_GENERATOR extends AbstractEasyGeneratorGUI {
    public SEA_ITEM_GENERATOR(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public ItemStack getOut() {
        Material[] it = {Material.SEA_LANTERN, Material.DARK_PRISMARINE, Material.PRISMARINE, Material.PRISMARINE_CRYSTALS, Material.PRISMARINE_SHARD};
        return new ItemStack(it[Maths.GetRandom(4)], 8);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_SEA_ITEM_GENERATOR";
    }
}
