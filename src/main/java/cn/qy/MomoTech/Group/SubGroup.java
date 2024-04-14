package cn.qy.MomoTech.Group;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class SubGroup extends ItemGroup {
    public SubGroup(String key, ItemStack item) {
        this(key, item, 3);
    }

    public SubGroup(String key, ItemStack item, int tier) {
        super(MultiGroup.createKey(key), item, tier);
    }

    public boolean isHidden(Player p) {
        return true;
    }
}
