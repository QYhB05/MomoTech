package cn.qy.MomoTech.GUI;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineProcessHolder;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.core.machines.MachineProcessor;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.implementation.handlers.SimpleBlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.implementation.operations.CraftingOperation;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.interfaces.InventoryBlock;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGUI extends SlimefunItem implements InventoryBlock, EnergyNetComponent, MachineProcessHolder<CraftingOperation> {

    private final MachineProcessor<CraftingOperation> processor = new MachineProcessor<>(this);
    protected List<MachineRecipe> recipes = new ArrayList<>();

    @ParametersAreNonnullByDefault
    protected AbstractGUI(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        this.processor.setProgressBar(this.getProgressBar());
        this.createPreset(this, this.getInventoryTitle(), this::constructMenu);
        this.addItemHandler(this.onBlockBreak());
    }

    public abstract int[] IN();

    public abstract int[] OUT();

    public abstract int[] EMPTY();

    @Nonnull
    protected BlockBreakHandler onBlockBreak() {
        return new SimpleBlockBreakHandler() {
            public void onBlockBreak(@NotNull Block b) {
                BlockMenu inv = BlockStorage.getInventory(b);
                if (inv != null) {
                    inv.dropItems(b.getLocation(), AbstractGUI.this.getInputSlots());
                    inv.dropItems(b.getLocation(), AbstractGUI.this.getOutputSlots());
                }

                AbstractGUI.this.processor.endOperation(b);
            }
        };
    }

    @Nonnull
    public MachineProcessor<CraftingOperation> getMachineProcessor() {
        return this.processor;
    }

    protected void constructMenu(BlockMenuPreset preset) {
        int[] var2 = EMPTY();
        int var3 = var2.length;

        int var4;
        int i;
        for (var4 = 0; var4 < var3; ++var4) {
            i = var2[var4];
            preset.addItem(i, ChestMenuUtils.getBackground(), ChestMenuUtils.getEmptyClickHandler());
        }

        var2 = IN();
        var3 = var2.length;

        for (var4 = 0; var4 < var3; ++var4) {
            i = var2[var4];
            preset.addItem(i, ChestMenuUtils.getInputSlotTexture(), ChestMenuUtils.getEmptyClickHandler());
        }

        var2 = OUT();
        var3 = var2.length;

        for (var4 = 0; var4 < var3; ++var4) {
            i = var2[var4];
            preset.addItem(i, ChestMenuUtils.getOutputSlotTexture(), ChestMenuUtils.getEmptyClickHandler());
        }

        var2 = this.getOutputSlots();
        var3 = var2.length;

        for (var4 = 0; var4 < var3; ++var4) {
            i = var2[var4];
            preset.addMenuClickHandler(i, new ChestMenu.AdvancedMenuClickHandler() {
                public boolean onClick(Player p, int slot, ItemStack cursor, ClickAction action) {
                    return false;
                }

                public boolean onClick(InventoryClickEvent e, Player p, int slot, ItemStack cursor, ClickAction action) {
                    if (cursor == null) return true;
                    cursor.getType();
                    return cursor.getType() == Material.AIR;
                }
            });
        }

    }

    @Nonnull
    public String getInventoryTitle() {
        return this.getItemName();
    }

    public ItemStack getProgressBar() {
        return new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
    }

    public int getCapacity() {
        return 1;
    }

    public int getEnergyConsumption() {
        return 1;
    }

    public int getSpeed() {
        return 1;
    }

    public void register(@Nonnull SlimefunAddon addon) {
        this.addon = addon;
        if (this.getCapacity() <= 0) {
            this.warn("The capacity has not been configured correctly. The Item was disabled.");
            this.warn("Make sure to call '" + this.getClass().getSimpleName() + "#setEnergyCapacity(...)' before registering!");
        }

        if (this.getEnergyConsumption() <= 0) {
            this.warn("The energy consumption has not been configured correctly. The Item was disabled.");
            this.warn("Make sure to call '" + this.getClass().getSimpleName() + "#setEnergyConsumption(...)' before registering!");
        }

        if (this.getSpeed() <= 0) {
            this.warn("The processing speed has not been configured correctly. The Item was disabled.");
            this.warn("Make sure to call '" + this.getClass().getSimpleName() + "#setProcessingSpeed(...)' before registering!");
        }

        this.registerDefaultRecipes();
        if (this.getCapacity() > 0 && this.getEnergyConsumption() > 0 && this.getSpeed() > 0) {
            super.register(addon);
        }

    }

    @Nonnull
    public abstract String getMachineIdentifier();

    protected void registerDefaultRecipes() {
    }

    public abstract int[] getInputSlots();

    public abstract int[] getOutputSlots();

    @Nonnull
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }

    public void preRegister() {
        this.addItemHandler(new BlockTicker() {
            public void tick(Block b, SlimefunItem sf, Config data) {
                AbstractGUI.this.tick(b);
            }

            public boolean isSynchronized() {
                return false;
            }
        });
    }

    protected void tick(Block b) {

        BlockMenu inv = BlockStorage.getInventory(b);
        if (this.takeCharge(b.getLocation())) {
            this.findNextRecipe(inv);
        }
    }

    protected boolean takeCharge(@Nonnull Location l) {
        if (this.isChargeable()) {
            int charge = this.getCharge(l);
            if (this.getEnergyConsumption() == 1) return true;
            if (charge < this.getEnergyConsumption()) {
                return false;
            } else {
                this.setCharge(l, charge - this.getEnergyConsumption());
                return true;
            }
        } else {
            return true;
        }
    }

    protected abstract void findNextRecipe(BlockMenu inv);
}