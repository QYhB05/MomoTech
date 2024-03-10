package cn.qy.MomoTech.GUI.MachineGUI;

import cn.qy.MomoTech.GUI.AbstractGUI;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public abstract class EntropyStar_ extends AbstractGUI {
    protected EntropyStar_(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public int[] IN() {
        return new int[]{};
    }

    @Override
    public int[] OUT() {
        return new int[]{};
    }

    @Override
    public int[] EMPTY() {
        return new int[]{};
    }

    @Override
    public int[] getInputSlots() {
        return new int[]{};
    }

    @Override
    public int[] getOutputSlots() {
        return new int[]{};
    }

    @Override
    protected void tick(Block b) {
        Location l = b.getLocation();
        World w = b.getWorld();
        boolean[][][] check = new boolean[17][17][17];
        Block[][][] ans = new Block[17][17][17];
        for (int i = l.getBlockX() - 8; i <= l.getBlockX() + 8; ++i) {
            for (int j = l.getBlockY() - 8; j < l.getBlockX() + 8; ++j) {
                for (int k = l.getBlockZ() - 8; k < l.getBlockZ() + 8; ++k) {
                    int si = l.getBlockX() - 8, sj = l.getBlockY() - 8, sk = l.getBlockZ() - 8;
                    if (j >= 320) break;
                    if (j <= -64) break;
                    check[i - si][j - sj][k - sk] = false;
                    ans[i - si][j - sj][k - sk] = (new Location(w, i, j, k)).getBlock();
                }
            }
        }
        check[l.getBlockX()][l.getBlockY()][l.getBlockZ()] = true;
        for (int i = l.getBlockX() - 8; i <= l.getBlockX() + 8; ++i) {
            for (int j = l.getBlockY() - 8; j < l.getBlockX() + 8; ++j) {
                for (int k = l.getBlockZ() - 8; k < l.getBlockZ() + 8; ++k) {
                    int si = l.getBlockX() - 8, sj = l.getBlockY() - 8, sk = l.getBlockZ() - 8;
                    if (j >= 320) break;
                    if (j <= -64) break;
                    Random r = new Random();
                    int ansi, ansj, ansk;
                    do {
                        ansi = Math.abs(r.nextInt()) % 17;
                        ansj = Math.abs(r.nextInt()) % 17;
                        ansk = Math.abs(r.nextInt()) % 17;
                        if (ansj + sj >= 320 || ansj + sj <= 64) continue;
                    } while (!check[ansi][ansj][ansk]);
                    check[ansi][ansj][ansk] = true;
                    w.setBlockData(ansi, ansj, ansk, ans[ansi][ansj][ansk].getBlockData());
                }
            }
        }

    }

    @Override
    protected MachineRecipe findNextRecipe(BlockMenu inv) {
        return null;
    }
}
