package cn.qy.MomoTech.Items.Machines;

import cn.qy.MomoTech.GUI.MonsterItemGenerator;
import cn.qy.MomoTech.utils.Maths;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class MonsterItemGenerator2 extends MonsterItemGenerator implements RecipeDisplayItem {
    public MonsterItemGenerator2(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public @NotNull String getMachineIdentifier() {
        return "MOMOTECH_MONSTER_GENERATOR2";
    }
    public final Material[] it = {Material.ROTTEN_FLESH, Material.GOLD_INGOT, Material.GOLD_NUGGET};

    @Override
    public Material getItems() {
        return this.it[Maths.GetRandom(2)];
    }
    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> item = new ArrayList<>(10);
        for (Material i : this.it) {
            item.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, "&f可能的产物"));
            item.add(new ItemStack(i, 32));
        }
        return item;
    }
}
