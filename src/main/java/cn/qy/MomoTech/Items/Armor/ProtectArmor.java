package cn.qy.MomoTech.Items.Armor;

import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.MomoTech;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectionType;
import io.github.thebusybiscuit.slimefun4.core.attributes.ProtectiveArmor;
import io.github.thebusybiscuit.slimefun4.core.attributes.Soulbound;
import io.github.thebusybiscuit.slimefun4.implementation.items.armor.SlimefunArmorPiece;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

import javax.annotation.Nonnull;

public class ProtectArmor extends SlimefunArmorPiece implements ProtectiveArmor, Soulbound, NotPlaceable {

    public ProtectArmor(SlimefunItemStack item, PotionEffect[] effects, ItemStack[] recipe) {
        super(Items.MOMOTECH_TOOL, item, RecipeType.ANCIENT_ALTAR, recipe, effects);
    }

    @Nonnull
    public ProtectionType[] getProtectionTypes() {
        return new ProtectionType[]{ProtectionType.BEES, ProtectionType.RADIATION, ProtectionType.FLYING_INTO_WALL};
    }

    public boolean isFullSetRequired() {
        return false;
    }

    @Nonnull
    public NamespacedKey getArmorSetId() {
        return new NamespacedKey(MomoTech.getInstance(), "MOMOTECH_ARMOR");
    }
}
