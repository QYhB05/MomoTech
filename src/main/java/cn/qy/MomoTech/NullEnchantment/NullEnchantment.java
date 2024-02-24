//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cn.qy.MomoTech.NullEnchantment;

import cn.qy.MomoTech.MomoTech;
import io.papermc.paper.enchantments.EnchantmentRarity;
import net.kyori.adventure.text.Component;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.EntityCategory;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.Set;

public class NullEnchantment extends Enchantment {
    public static final Enchantment ENCHANTMENT = new NullEnchantment(new NamespacedKey(JavaPlugin.getPlugin(MomoTech.class), "NULL_ENCHANTMENT"));

    private NullEnchantment(NamespacedKey key) {
        super(key);
    }

    public static void addItemFlag(@Nonnull ItemStack item, @Nonnull ItemFlag itemFlag) {
        if (item.hasItemMeta()) {
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.addItemFlags(itemFlag);
            item.setItemMeta(itemMeta);
        }
    }

    public static void addAndHidden(@Nonnull ItemStack item) {
        item.addUnsafeEnchantment(ENCHANTMENT, 0);
        NullEnchantment.addItemFlag(item, ItemFlag.HIDE_ENCHANTS);
    }

    @Nonnull
    public String getName() {
        return "NULL_ENCHANTMENT";
    }

    public int getMaxLevel() {
        return 1;
    }

    public int getStartLevel() {
        return 1;
    }

    @Nonnull
    public EnchantmentTarget getItemTarget() {
        return EnchantmentTarget.BREAKABLE;
    }

    public boolean isTreasure() {
        return false;
    }

    public boolean isCursed() {
        return false;
    }

    public boolean conflictsWith(@Nonnull Enchantment enchantment) {
        return false;
    }

    public boolean canEnchantItem(@Nonnull ItemStack itemStack) {
        return false;
    }

    @Override
    public @NotNull Component displayName(int i) {
        return null;
    }

    @Override
    public boolean isTradeable() {
        return false;
    }

    @Override
    public boolean isDiscoverable() {
        return false;
    }

    @Override
    public @NotNull EnchantmentRarity getRarity() {
        return null;
    }

    @Override
    public float getDamageIncrease(int i, @NotNull EntityCategory entityCategory) {
        return 0;
    }

    @Override
    public @NotNull Set<EquipmentSlot> getActiveSlots() {
        return null;
    }

    @Override
    public @NotNull String translationKey() {
        return "NULL_ENCHANTMENT";
    }
}
