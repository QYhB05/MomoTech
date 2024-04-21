package cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.utils.Maths;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SaltGenerator extends AbstractGUI  implements RecipeDisplayItem {
    public SaltGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, id, it, recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[0];
    }

    @Override
    public int[] OUT() {
        return new int[]{53, 52, 51, 50, 49, 48, 47, 46, 45};
    }

    @Override
    public int[] EMPTY() {
        return new int[0];
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_SALT_GENERATOR";
    }

    @Override
    public int[] getInputSlots() {
        return new int[0];
    }

    @Override
    public int[] getOutputSlots() {
        int[] out = new int[45];
        for (int i = 0; i < 45; ++i) out[i] = i;
        return out;
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        inv.pushItem(new SlimefunItemStack(SlimefunItems.SALT, Maths.GetRandom(64)), getOutputSlots());
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(11);
        it.add(new CustomItemStack(Material.BOOK, "&f每 tick 随机产出 1~64 数量的盐"));
        it.add(SlimefunItems.SALT.clone());
        return it;
    }
}
