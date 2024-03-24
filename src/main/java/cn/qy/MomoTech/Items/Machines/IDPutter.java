package cn.qy.MomoTech.Items.Machines;

import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.Items.Items;
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

public class IDPutter extends AbstractGUI implements RecipeDisplayItem {

    public IDPutter(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }


    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_ID_PUTTER";
    }

    @Override
    public int[] IN() {
        return new int[]{0, 2, 6, 8};
    }

    @Override
    public int[] OUT() {
        return new int[]{};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{3, 4, 5};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{1, 7};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{};
    }

    @Override
    protected void findNextRecipe(BlockMenu inv) {
        for (int i : getInputSlots()) {
            if (inv.getItemInSlot(i) == null)
                return;
        }
        if (inv.getItemInSlot(1).getAmount() != 1) return;
        if (!SlimefunUtils.isItemSimilar(inv.getItemInSlot(1), MomotechItem.ID_card, false, false) || !SlimefunUtils.isItemSimilar(inv.getItemInSlot(7), MomotechItem.letter, false, false))
            return;
        String lore = Utils.getLore(inv.getItemInSlot(1).getItemMeta()).get(0).toString();
        lore = lore + (Utils.getLore(inv.getItemInSlot(7).getItemMeta()).get(0).toString().charAt(2));
        SlimefunItemStack it = new SlimefunItemStack("MOMOTECH_ID_CARD", new CustomItemStack(Material.PAPER, "&eID卡", lore, "&7在&cID集成器&7添加符号集成Slimefun ID", "&7合法ID可以在 &f制造台 &7中直接制作对应ID的粘液物品"));
        inv.consumeItem(7, 1);
        inv.toInventory().setItem(1, it.clone());
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(8);
        it.add(new CustomItemStack(Material.BOOK, "&f给ID卡添加符号", "&7请确保ID卡堆叠数量为1", "&7在左边插入ID卡, 右边插入符号"));
        it.add(new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        it.add(MomotechItem.letter.clone());
        it.add(new SlimefunItemStack("MOMOTECH_ID_CARD", Items.MOMOTECH_ID_CARD));
        return it;
    }
}
