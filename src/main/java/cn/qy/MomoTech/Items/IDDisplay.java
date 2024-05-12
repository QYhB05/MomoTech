package cn.qy.MomoTech.Items;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class IDDisplay extends SlimefunItem implements RecipeDisplayItem {
    List<SlimefunItem> list = Slimefun.getRegistry().getEnabledSlimefunItems();
    List<ItemStack> ans = new ArrayList<>(list.size());
    public IDDisplay(ItemGroup itemGroup, ItemStack item, String id, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, id, recipeType, recipe);
        for (SlimefunItem slimefunItem : list) {
            ans.add(new CustomItemStack(slimefunItem.getItem(), slimefunItem.getItemName(), "&f&lID: " + slimefunItem.getId()));
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        return ans;
    }
}
