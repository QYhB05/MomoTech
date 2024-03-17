package cn.qy.MomoTech.Items.Machines;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.utils.Maths;
import cn.qy.MomoTech.utils.MomotechItem;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class LetterConstructor extends AbstractGUI implements RecipeDisplayItem {

    public LetterConstructor(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }


    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_LETTER_CONSTRUCTOR";
    }


    @Override
    public int[] IN() {
        return new int[]{0, 1, 2, 6, 7, 8, 9, 11, 15, 17};
    }

    @Override
    public int[] OUT() {
        return new int[]{18, 19, 20, 21, 22, 23, 24, 25, 26, 36, 37, 38, 39, 40, 41, 42, 43, 44};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{3, 4, 5, 12, 14};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{10, 13, 16};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{27, 28, 29, 30, 31, 32, 33, 34, 35};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) == null) return;
            ItemStack it = inv.getItemInSlot(i);
            if (!SlimefunUtils.isItemSimilar(it, MomotechItem.empty_shell, true, false) && !SlimefunUtils.isItemSimilar(it, MomotechItem.creative_item_I, true, false) && !SlimefunUtils.isItemSimilar(it, MomotechItem.creative_item, true, false))
                return;
        }
        if (!Utils.checkOutput(inv, getOutputSlots())) return;
        if (!SlimefunUtils.isItemSimilar(inv.getItemInSlot(13), MomotechItem.empty_shell, true, false)) return;
        if (!(SlimefunUtils.isItemSimilar(inv.getItemInSlot(10), MomotechItem.creative_item_I, true, false)
                && SlimefunUtils.isItemSimilar(inv.getItemInSlot(16), MomotechItem.creative_item, true, false))
                && (!(SlimefunUtils.isItemSimilar(inv.getItemInSlot(10), MomotechItem.creative_item, true, false)
                && SlimefunUtils.isItemSimilar(inv.getItemInSlot(16), MomotechItem.creative_item_I, true, false))))
            return;
        String list = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM123456789_";//62个
        char ans = list.charAt(Maths.GetRandom(61));
        ItemStack it = new CustomItemStack(Material.SUGAR, "&6符号", "&f" + ans, "&7凭空制造物质的基础");
        ItemStack sfit = new SlimefunItemStack("MOMOTECH_LETTER", it).clone();
        for (int j : getOutputSlots()) {
            if (inv.getItemInSlot(j) == null) {
                inv.consumeItem(10, 1);
                inv.consumeItem(13, 1);
                inv.consumeItem(16, 1);
                inv.toInventory().setItem(j, sfit);
                return;
            }
        }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(12);
        it.add(new CustomItemStack(Material.BOOK, "&f制作符号", "&7需要输入原始物质α和β并且在中间放入空"));
        it.add(MomotechItem.letter);
        it.add(MomotechItem.creative_item);
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.empty_shell);
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        it.add(MomotechItem.creative_item_I);
        it.add(new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, " "));
        return it;

    }
}
