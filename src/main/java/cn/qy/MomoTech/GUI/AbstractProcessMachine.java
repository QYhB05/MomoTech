package cn.qy.MomoTech.GUI;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineProcessHolder;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.core.machines.MachineProcessor;
import io.github.thebusybiscuit.slimefun4.implementation.handlers.SimpleBlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.implementation.operations.CraftingOperation;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.interfaces.InventoryBlock;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class AbstractProcessMachine extends SlimefunItem implements InventoryBlock, MachineProcessHolder<CraftingOperation> {

    private final MachineProcessor<CraftingOperation> processor = new MachineProcessor<>(this);
    protected List<MachineRecipe> recipes = new ArrayList<>();

    @ParametersAreNonnullByDefault
    protected AbstractProcessMachine(ItemGroup itemGroup, String id, ItemStack it, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, new SlimefunItemStack(id, it), recipeType, recipe);
        this.processor.setProgressBar(this.getProgressBar());
        this.createPreset(this, this.getInventoryTitle(), this::constructMenu);
        this.addItemHandler(this.onBlockBreak());
    }

    protected AbstractProcessMachine(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
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
                    inv.dropItems(b.getLocation(), cn.qy.MomoTech.GUI.AbstractProcessMachine.this.getInputSlots());
                    inv.dropItems(b.getLocation(), cn.qy.MomoTech.GUI.AbstractProcessMachine.this.getOutputSlots());
                }

                cn.qy.MomoTech.GUI.AbstractProcessMachine.this.processor.endOperation(b);
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
        preset.addItem(getProcessBarSlots(), new CustomItemStack(Material.RED_STAINED_GLASS_PANE, "&a进度", "&fNULL"), ChestMenuUtils.getEmptyClickHandler());
        add(preset);
    }

    public void add(BlockMenuPreset b) {
    }

    @Nonnull
    public String getInventoryTitle() {
        return this.getItemName();
    }

    public ItemStack getProgressBar() {
        return new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
    }

    public void register(@Nonnull SlimefunAddon addon) {
        this.addon = addon;

        this.registerDefaultRecipes();
        super.register(addon);

    }

    @Nonnull
    public abstract String getMachineIdentifier();

    protected void registerDefaultRecipes() {
    }

    public abstract int[] getInputSlots();

    public abstract int getProcessBarSlots();

    public abstract int getDefaultMaxProcess();

    public boolean checkProcessStart(BlockMenu blockMenu) {
        ItemStack it = blockMenu.getItemInSlot(getProcessBarSlots());
        if (it == null) {
            initProcess(blockMenu);
            return false;
        }
        if (it.getType() != Material.GREEN_STAINED_GLASS_PANE) {
            initProcess(blockMenu);
            return false;
        }
        return true;
    }

    public void addProcess(BlockMenu blockMenu) {
        addProcess(blockMenu, 1);
    }

    public void addProcess(BlockMenu blockMenu, int k) {
        ItemStack it = blockMenu.getItemInSlot(getProcessBarSlots());
        String str = Objects.requireNonNull(it.getLore()).get(0);
        int now = Integer.parseInt(str.substring(str.indexOf('f') + 1, str.indexOf('/'))) + k;
        blockMenu.toInventory().setItem(getProcessBarSlots(), new CustomItemStack(Material.GREEN_STAINED_GLASS_PANE, "§a进度", "&f" + now + "/" + getMaxProcess(blockMenu)));
    }

    public boolean checkProcessEnd(BlockMenu blockMenu) {
        ItemStack it = blockMenu.getItemInSlot(getProcessBarSlots());
        String str = Objects.requireNonNull(it.getLore()).get(0);
        int now = Integer.parseInt(str.substring(str.indexOf('f') + 1, str.indexOf('/')));
        return now >= getMaxProcess(blockMenu);
    }

    public int getMaxProcess(BlockMenu blockMenu) {
        ItemStack it = blockMenu.getItemInSlot(getProcessBarSlots());
        String str = Objects.requireNonNull(it.getLore()).get(0);
        return Integer.parseInt(str.substring(str.indexOf('/') + 1));
    }

    public void initProcess(BlockMenu blockMenu) {
        ItemStack it = new CustomItemStack(Material.GREEN_STAINED_GLASS_PANE, "§a进度", "&f0/" + getDefaultMaxProcess());
        blockMenu.toInventory().setItem(getProcessBarSlots(), it);
    }

    public void setMaxProcess(int max, BlockMenu blockMenu) {
        ItemStack it = new CustomItemStack(Material.GREEN_STAINED_GLASS_PANE, "§a进度", "&f0/" + max);
        blockMenu.toInventory().setItem(getProcessBarSlots(), it);
    }

    public abstract int[] getOutputSlots();

    public void preRegister() {
        this.addItemHandler(new BlockTicker() {
            public void tick(Block b, SlimefunItem sf, Config data) {
                cn.qy.MomoTech.GUI.AbstractProcessMachine.this.tick(b);
            }

            public boolean isSynchronized() {
                return false;
            }
        });
    }

    protected void tick(Block b) {
        BlockMenu inv = BlockStorage.getInventory(b);
        this.findNextRecipe(inv);
    }

    protected abstract void findNextRecipe(BlockMenu inv);
}
