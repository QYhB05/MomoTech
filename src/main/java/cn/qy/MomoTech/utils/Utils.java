//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.qy.MomoTech.utils;

import cn.qy.MomoTech.Items.Items;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static String[] mineral__ = {"DIAMOND_BLOCK", "NETHERITE_BLOCK", "COAL_BLOCK", "EMERALD_BLOCK",
            "QUARTZ_BLOCK", "REDSTONE_BLOCK", "IRON_BLOCK", "GOLD_BLOCK", "LAPIS_BLOCK"};
    public static Material[] it = {Material.DIAMOND, Material.NETHERITE_INGOT, Material.COAL,
            Material.EMERALD, Material.QUARTZ, Material.REDSTONE,
            Material.IRON_INGOT, Material.GOLD_INGOT, Material.LAPIS_LAZULI};
    public static String[] id = {"I", "II", "III"};

    public static boolean checkOutput(BlockMenu inv, int[] output) {
        for (int i : output) {
            if (inv.getItemInSlot(i) == null) return true;
        }
        return false;
    }

    public static List getLore(ItemMeta meta) {
        List<String> lore = meta.getLore();
        return (lore == null ? new ArrayList() : lore);
    }

    public static boolean checkCombinator(ItemStack it) {
        if (SlimefunUtils.isItemSimilar(it, Items.MOMOTECH_SYMBOL_ADDITION, false, false)) return true;
        if (SlimefunUtils.isItemSimilar(it, Items.MOMOTECH_SYMBOL_DIVISION, false, false)) return true;
        if (SlimefunUtils.isItemSimilar(it, Items.MOMOTECH_SYMBOL_MULTIPLICATION, false, false)) return true;
        if (SlimefunUtils.isItemSimilar(it, Items.MOMOTECH_SYMBOL_SUBTRACTION, false, false)) return true;
        return SlimefunUtils.isItemSimilar(it, Items.MOMOTECH_DIGITAL, false, false);
    }

}
