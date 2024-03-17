package cn.qy.MomoTech.Items.Machines;

import cn.qy.MomoTech.GUI.AbstractGUI;
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

public class CreativeItemGenerator extends AbstractGUI implements RecipeDisplayItem {
    public CreativeItemGenerator(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }

    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_CREATIVE_ITEM_GENERATOR";
    }

    @Override
    public int[] IN() {
        return new int[]{};
    }

    @Override
    public int[] OUT() {
        return new int[]{30, 32};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{27, 28, 29, 33, 34, 35};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8
                , 9, 10, 11, 12, 13, 14, 15, 16, 17
                , 18, 19, 20, 21, 22, 23, 24, 25, 26};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{31};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        for (int i : getInputSlots()) if (inv.getItemInSlot(i) == null) return;
        if (!Utils.checkOutput(inv, getOutputSlots())) return;
        ItemStack check;
        if (inv.getItemInSlot(0).getAmount() > inv.getItemInSlot(1).getAmount())
            check = MomotechItem.creative_item.clone();
        else if (inv.getItemInSlot(0).getAmount() < inv.getItemInSlot(1).getAmount())
            check = MomotechItem.creative_item_I.clone();
        else {
            for (int k : getInputSlots())
                inv.consumeItem(k, inv.getItemInSlot(k).getAmount());
            return;
        }
        for (int i = 0; i <= 26; i += 9) {
            for (int j = i + 1; j <= i + 8; j++) {
                if ((inv.getItemInSlot(j).getAmount() > inv.getItemInSlot(j - 1).getAmount() && SlimefunUtils.isItemSimilar(check, MomotechItem.creative_item, true, false))
                        || (inv.getItemInSlot(j).getAmount() < inv.getItemInSlot(j - 1).getAmount() && SlimefunUtils.isItemSimilar(check, MomotechItem.creative_item_I, true, false))
                        || inv.getItemInSlot(j).getAmount() == inv.getItemInSlot(j - 1).getAmount()) {
                    for (int k : getInputSlots())
                        inv.consumeItem(k, inv.getItemInSlot(k).getAmount());
                    return;
                }
            }
        }
        for (int k : getInputSlots())
            inv.consumeItem(k, inv.getItemInSlot(k).getAmount());
        inv.pushItem(check, getOutputSlots());
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(8);
        it.add(new CustomItemStack(Material.BOOK, "&f制作原始物质α", "&7要求:输入槽位每一行上的物品堆叠数量单调递增"));
        it.add(MomotechItem.creative_item);
        it.add(new CustomItemStack(Material.BOOK, "&f制作原始物质β", "&7要求:输入槽位每一行上的物品堆叠数量单调递减"));
        it.add(MomotechItem.creative_item_I);
        return it;
    }
}
