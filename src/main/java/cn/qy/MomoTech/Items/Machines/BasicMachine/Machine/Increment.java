package cn.qy.MomoTech.Items.Machines.BasicMachine.Machine;

import cn.qy.MomoTech.Exceptions;
import cn.qy.MomoTech.GUI.AbstractGUI;
import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.utils.NumberCombinator;
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
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Increment extends AbstractGUI implements RecipeDisplayItem {

    public Increment(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
    }


    @NotNull
    @Override
    public String getMachineIdentifier() {
        return "MOMOTECH_INCREMENT";
    }

    @Override
    public int[] IN() {
        return new int[]{0, 1, 2, 3, 4, 5, 9, 11, 12, 14, 18, 19, 20, 21, 22, 23};
    }

    @Override
    public int[] OUT() {
        return new int[]{6, 7, 8, 15, 17, 24, 25, 26};
    }

    @Override
    public int[] EMPTY() {
        return new int[0];
    }

    public int[] getInputSlots() {
        return new int[]{10, 13};
    }

    public int[] getOutputSlots() {
        return new int[]{16};
    }

    private ItemStack out(String b, String a) {
        double answer;
        double A = Double.parseDouble(a);
        double B = Double.parseDouble(b);
        try {
            answer = Double.parseDouble(Objects.requireNonNull(NumberCombinator.Ordinary(A, B, "+")));
            return MomotechItem.digital(answer);
        } catch (Exceptions.NumberBugException e) {
            //输出NUMBER_BUG
            return MomotechItem.bug;
        } catch (Exceptions.NumberBugIException e) {
            //输出NUMBER_BUG_I
            return MomotechItem.bug1;
        } catch (Exceptions.NumberBugIIException e) {
            //输出NUMBER_BUG_II
            return MomotechItem.bug2;
        } catch (Exceptions.NumberBugIIIException e) {
            //输出NUMBER_BUG_III
            return MomotechItem.bug3;
        } catch (Exceptions.NumberBugIVException e) {
            //输出NUMBER_BUG_IV
            return MomotechItem.bug4;
        } catch (Exceptions.NumberBugVException e) {
            //输出NUMBER_BUG_V
            return MomotechItem.bug5;
        }

    }

    protected void findNextRecipe(BlockMenu inv) {
        if (Utils.checkOutput(inv, getOutputSlots())) return;
        if (inv.getItemInSlot(getInputSlots()[0]) == null || inv.getItemInSlot(getInputSlots()[1]) == null) return;
        for (int i : getInputSlots()) {
            if (Utils.checkCombinator(inv.getItemInSlot(i))) return;
        }
        ItemStack it1 = inv.getItemInSlot(getInputSlots()[0]).clone(),
                it2 = inv.getItemInSlot(getInputSlots()[1]).clone();
        if (SlimefunUtils.isItemSimilar(it1, Items.MOMOTECH_DIGITAL, false, false))
            if (SlimefunUtils.isItemSimilar(it2, Items.MOMOTECH_DIGITAL, false, false)) {
                for (int i : getInputSlots()) inv.consumeItem(i, 1);
                ItemMeta meta1 = it1.getItemMeta(), meta2 = it2.getItemMeta();
                List<String> lore1 = Utils.getLore(meta1);
                List<String> lore2 = Utils.getLore(meta2);
                ItemStack ans = out(lore1.get(0).substring(lore1.get(0).indexOf('f') + 1), lore2.get(0).substring(lore2.get(0).indexOf('f') + 1));
                inv.pushItem(ans.clone(), getOutputSlots());
            }
    }

    @NotNull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> it = new ArrayList<>(16);
        it.add(new CustomItemStack(Material.BOOK, "&f输入两个数字进行简单地加法运算"));
        it.add(MomotechItem.digital(0.0));
        it.add(new CustomItemStack(Material.BOOK, "&f当输入的算式不合法的时候输出BUG - 运算式"));
        it.add(MomotechItem.bug.clone());
        it.add(new CustomItemStack(Material.BOOK, "&f当计算结果小数位数超过4位的时候输出BUG - 小数"));
        it.add(MomotechItem.bug1.clone());
        it.add(new CustomItemStack(Material.BOOK, "&f当计算结果等于今日日期组成的数字的百分之一(比如202407.29)时输出BUG - 日期"));
        it.add(MomotechItem.bug2.clone());
        it.add(new CustomItemStack(Material.BOOK, "&f当计算结果超过16777216时输出BUG - 正过载"));
        it.add(MomotechItem.bug3.clone());
        it.add(new CustomItemStack(Material.BOOK, "&f当计算结果小于-16777216时输出BUG - 负过载"));
        it.add(MomotechItem.bug4.clone());
        it.add(new CustomItemStack(Material.BOOK, "&f随机出现BUG - 系统, 其概率和计算结果, 在线人数以及TPS息息相关"));
        it.add(MomotechItem.bug5.clone());
        return it;
    }
}
