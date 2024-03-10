package cn.qy.MomoTech.utils;

import cn.qy.MomoTech.MomoTech;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemHandler;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.inventory.ItemStack;

public class SfUtils {
    public static void RegisterItem(String id, ItemStack item, ItemGroup ig, RecipeType rc, ItemStack[] recipe) {
        SlimefunItemStack itemStack = new SlimefunItemStack(id, item);
        SlimefunItem it = new SlimefunItem(ig, itemStack, rc, recipe);
        it.register(MomoTech.getInstance());
    }

    public static void RegisterItem(String id, ItemStack item, ItemGroup ig, RecipeType rc, ItemStack[] recipe, ItemHandler... ith) {
        SlimefunItemStack itemStack = new SlimefunItemStack(id, item);
        SlimefunItem it = new SlimefunItem(ig, itemStack, rc, recipe);
        for (ItemHandler ih : ith) {
            it.addItemHandler(ih);
        }
        it.register(MomoTech.getInstance());
    }
}
