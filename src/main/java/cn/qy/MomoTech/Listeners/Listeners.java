package cn.qy.MomoTech.Listeners;

import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.utils.Maths;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.DamageableItem;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

public final class Listeners implements Listener {

    @EventHandler(priority = EventPriority.LOWEST)
    public void blockBreakEvent(BlockBreakEvent e) {
        int i = Maths.GetRandom(100);
        Player p = e.getPlayer();
        if (p.getGameMode() == GameMode.CREATIVE) return ;
        if (p.getInventory().getItemInMainHand().getType() != Material.WOODEN_PICKAXE) return ;
        if (e.getBlock().getType() == Material.TORCH) return ;
        if (i <= 3) {
            World w = e.getBlock().getWorld();
            Location l = e.getBlock().getLocation();
            w.dropItem(l, MomotechItem.empty_shell.clone());
        }
    }

    @EventHandler(priority = EventPriority.LOW)
    public void entityDamageByEntityEvent(EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Player)
            if (SlimefunUtils.isItemSimilar(((Player) e.getEntity()).getInventory().getHelmet(), new SlimefunItemStack("MOMOTECH_PROTECT_ITEM", Items.PROTECT_ITEM), true, false)) {
                e.setDamage(0);
                e.setCancelled(true);
            }
        if (e.getDamager() instanceof Player)
            if (SlimefunUtils.isItemSimilar(((Player) e.getDamager()).getInventory().getItemInMainHand(), new SlimefunItemStack("MOMOTECH_DAMAGE_ITEM", Items.DAMAGE_ITEM), true, false)) {
                if (e.getEntity() instanceof Player) {
                    ((Player) e.getEntity()).setHealth(0.0);
                    return;
                } else e.getEntity().remove();

            }
        if (e.getDamager() instanceof Player) {
            if (SlimefunUtils.isItemSimilar(((Player) e.getDamager()).getInventory().getItemInMainHand(), new SlimefunItemStack("MOMOTECH_STONE_SWORD", Items.STONE_SWORD), true, false)) {
                e.setDamage(999999999999.99);
                e.getEntity().setGlowing(true);
                e.getEntity().setFreezeTicks(1000);
                e.getEntity().setFireTicks(1000);
            }
        }
    }
}
