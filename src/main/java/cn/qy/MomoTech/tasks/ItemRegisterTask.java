package cn.qy.MomoTech.tasks;

import cn.qy.MomoTech.Items.Armor.ProtectArmor;
import cn.qy.MomoTech.Items.IDDisplay;
import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.NullEnchantment.Register;
import cn.qy.MomoTech.utils.SfUtils;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

import static cn.qy.MomoTech.Items.MomotechItem.*;

public class ItemRegisterTask {
    public static void run(@NotNull Logger logger) {
        Register.run();
        RecipeType rc = new RecipeType(new NamespacedKey(MomoTech.getInstance(), "MOMOTECH_RT_"), new SlimefunItemStack("MOMOTECH_CONSTRUCTOR", Items.MOMOTECH_CONSTRUCTOR));
        RecipeType rc1 = new RecipeType(new NamespacedKey(MomoTech.getInstance(), "MOMOTECH_RT__"), new SlimefunItemStack("MOMOTECH_MAGNETIZE", Items.MOMOTECH_MAGNETIZE));
        RecipeType rc2 = new RecipeType(new NamespacedKey(MomoTech.getInstance(), "MOMOTECH_RT___"), new SlimefunItemStack("MOMOTECH_ENERGY_QUANTUM_GENERATOR", Items.MOMOTECH_ENERGY_QUANTUM_GENERATOR));
        ItemStack[] empty = {null, null, null, null, null, null, null, null, null};
        ItemStack[] energyQuantum = {quantum_, null, null, null, null, null, null, null, null};
        ItemStack[] digital__ = {
                digital_constructor, increment, ordinary_number_combinator, null,
                new CustomItemStack(Material.BOOK, "§e§l数字组件", "§f可以在 §b数字构造器 §f中获取", "§f可以在 §b基础数字运算机 §f中获取", "§f可以在 §b递增器 §f中获取"), null, null, null, null
        };
        ItemStack[] symbol = {
                null, symbol_generator, null, null,
                new CustomItemStack(Material.BOOK, "§e§l符号", "§f可以在 §b符号生成器 §f中获取"), null, null, null, null
        };
        ItemStack[] emptyShell = {
                null, null, null, null,
                new CustomItemStack(Material.BOOK, "§e§l空", "§f在方块被挖取的时候随机掉落"), null, null, null, null
        };
        ItemStack[] bug = {
                increment, null, ordinary_number_combinator, null,
                new CustomItemStack(Material.BOOK, "§e§lBUG - 运算式", "§7在 §f所有计算机器 §7中利用不合法运算式获取"), null, null, null
        };
        ItemStack[] bug1 = {
                increment, null, ordinary_number_combinator, null,
                new CustomItemStack(Material.BOOK, "§e§lBUG - 小数", "§7在 §f所有计算机器 §7中当小数位数超过 §f4 §7时产生"), null, null, null
        };
        ItemStack[] bug3 = {
                increment, null, ordinary_number_combinator, null,
                new CustomItemStack(Material.BOOK, "§e§lBUG - 正过载", "§7在 §f所有计算机器 §7中计算数值大于等于 §f16777216 §7时产生"), null, null, null
        };
        ItemStack[] bug4 = {
                increment, null, ordinary_number_combinator, null,
                new CustomItemStack(Material.BOOK, "§e§lBUG - 负过载", "§7在 §f所有计算机器 §7中计算数值小于等于 §f-16777216 §7时产生"), null, null, null
        };
        ItemStack[] bug2 = {
                increment, null, ordinary_number_combinator, null,
                new CustomItemStack(Material.BOOK, "§e§lBUG - 日期", "§7在 §f所有计算机器 §7中计算结果等于 §f当前日期的百分之一(如202307.29) §时产生"), null, null, null
        };
        ItemStack[] bug5 = {
                increment, null, ordinary_number_combinator, null,
                new CustomItemStack(Material.BOOK, "§e§lBUG - 系统", "§7在 §f所有计算机器 §7中随机出现", "§7§l其概率与当前在线人数和tps息息相关"), null, null, null
        };
        ItemStack[] none = {
                empty_shell, empty_shell, empty_shell,
                empty_shell, cobblestone_[2], empty_shell,
                empty_shell, empty_shell, empty_shell
        };
        ItemStack[] uncontrollableEmpty = {
                empty_shell, none_, empty_shell,
                none_, none_, none_,
                creative_item, none_, creative_item_I
        };
        ItemStack[] QY_ = {
                MomotechItem.bug, MomotechItem.bug1, MomotechItem.bug2,
                uncontrollable_empty, none_, uncontrollable_empty,
                MomotechItem.bug3, MomotechItem.bug4, MomotechItem.bug5
        };
        ItemStack[] wbx = {
                mineral[0][2], mineral[1][2], mineral[2][2], mineral[3][2], mineral[4][2], mineral[5][2], mineral[6][2], mineral[7][2], mineral[8][2]
        };
        ItemStack[] buggggg = {
                ch, none_, qy, creative_item, empty_shell, creative_item_I, SlimefunItems.MAGIC_SUGAR, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.MAGIC_SUGAR
        };
        ItemStack[] creative = {
                null, creative_item_generator, null, null,
                new CustomItemStack(Material.BOOK, "&e&l原始物质α/β", "&7在 &b原始物质制造器 &7中制作"), null, null, null, null
        };
        ItemStack[] creative1 = {
                null, quantity_constructor, null, null,
                new CustomItemStack(Material.BOOK, "&e&l原始物质γ", "&7在 &b量化构造器 &7中输入槽填满45x64个不可控空后有50%概率生成"), null, null, uncontrollable_empty, null
        };
        ItemStack[] bugCrystal = {
                MomotechItem.bug, quantity_constructor, MomotechItem.bug1,
                MomotechItem.bug2, new CustomItemStack(Material.BOOK, "&e&lBUG结晶", "&7在 &b量化构造器 &7中输入槽中同时存在且仅存在6种bug物质, 并且物品总数达到45x64后生成"), MomotechItem.bug3,
                MomotechItem.bug4, null, MomotechItem.bug5
        };
        ItemStack[] full = {
                none_, new ItemStack(Material.APPLE), none_,
                creative_item, new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER), creative_item_I,
                null, SlimefunItems.MAGIC_SUGAR, null
        };
        ItemStack[] damageItem = {
                creative_item_II, creative_item_II, creative_item_II,
                final_star, final_item, final_star,
                qy, ch, qy
        };
        ItemStack[] commandBlockGetter = {
                new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), quantity_item, new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_),
                ch, quantum1_, ch,
                qy, bug_crystal, qy
        };
        ItemStack[] quantityItem = {
                null, quantity_constructor, null, null,
                new CustomItemStack(Material.BOOK, "&e&l量化插件", "&7在 &b量化构造器 &7中输入槽存在45x64个任意物品后有0.05%概率生成"), null, null, null, null

        };
        ItemStack[] creative___ = {
                null, quantity_constructor, null, null,
                new CustomItemStack(Material.BOOK, "&e&l纯净的始源", "&7在 &b量化构造器 &7中输入槽中同时存在且仅存在原始物质α和β, 并且物品总数达到45x64后生成"), null, creative_item, null, creative_item_I
        };
        ItemStack[] stoneSword = {
                null, cobblestone_[49], null,
                null, cobblestone_[49], null,
                null, box_of_quantum, null
        };
        ItemStack[] letter = {
                null, letter_constructor, null,
                null, new CustomItemStack(Material.BOOK, "&e&l符号", "&7在 &b符号集成器 &7中随机出现"), null,
                null, null, null
        };
        ItemStack[] IDCard = {
                creative_item_I, creative_item_I, creative_item_I,
                new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), null, new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_),
                creative_item, creative_item, creative_item
        };
        ItemStack[] finalStar = {
                dark1, creative_item_II, shine1,
                bug_crystal, quantity_item, bugggg,
                new SlimefunItemStack("MOMOTECH_RULE_ITEM", Items.MOMOTECH_RULE_ITEM), rule_star, shine_and_dark_ingot
        };
        ItemStack[] finalItem = {
                null, quantity_constructor, null,
                null, new CustomItemStack(Material.BOOK, "&e&l乱码核心", "&7在 &b量化构造器 &7中输入槽存在45x64个终极之心后生成"), null,
                null, final_star, null};
        ItemStack[] exp = {
                null, null, null,
                creative_item, new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM), creative_item_I,
                null, null, null
        };
        ItemStack[] protectItem = {
                final_star, final_item, final_star,
                final_star, uncontrollable_empty, final_star,
                null, null, null
        };
        ItemStack[] star = {
                uncontrollable_empty, uncontrollable_empty, uncontrollable_empty,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.BASIC_CIRCUIT_BOARD
        };
        ItemStack[] boxOfQuantum = {
                quantum1_, quantum_, quantum1_,
                quantum_, new ItemStack(Material.ENDER_CHEST), quantum_,
                quantum1_, quantum_, quantum1_
        };
        ItemStack[] silkTouchQuantumPickaxe = {
                quantum1_, quantum1_, quantum1_,
                null, empty_shell, null,
                null, empty_shell, null
        };
        ItemStack[] QuantumPickaxe = {
                quantum_, quantum_, quantum_,
                null, empty_shell, null,
                null, empty_shell, null
        };
        ItemStack[] clear = {
                empty_shell, empty_shell, empty_shell,
                empty_shell, new ItemStack(Material.MILK_BUCKET), empty_shell,
                none_, none_, none_
        };
        ItemStack[] quantum = {
                empty_shell, empty_shell, empty_shell,
                creative_item, new ItemStack(Material.GOLD_INGOT), creative_item_I,
                empty_shell, empty_shell, empty_shell
        };
        ItemStack[] quantum1 = {
                null, quantum_, null,
                null, new CustomItemStack(Material.BOOK, "&e&l纠缠量子", "&7当你在y ≥ 520的坐标时使用 &b量子 &7会在对应坐标附近(半径16格)的y = -64的位置生成一个掉落物形式的 &b纠缠量子"), null,
                null, null, null
        };
        ItemStack[] shine = {
                null, shine_and_dark_constructor, null,
                null, new CustomItemStack(Material.BOOK, "&e&l光", "&7在 &b光暗收集器 &7中制作"), null,
                null, null, null
        };
        ItemStack[] dark = {
                null, shine_and_dark_constructor, null,
                null, new CustomItemStack(Material.BOOK, "&e&l暗", "&7在 &b光暗收集器 &7中制作"), null,
                null, null, null
        };
        ItemStack[] shine1 = {
                new SlimefunItemStack(MomotechItem.shine, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] dark1 = {
                new SlimefunItemStack(MomotechItem.dark, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] diamond = {
                new ItemStack(Material.DIAMOND, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] iron = {
                new ItemStack(Material.IRON_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] quartz = {
                new ItemStack(Material.QUARTZ, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] emerald = {
                new ItemStack(Material.EMERALD, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] redstone = {
                new ItemStack(Material.REDSTONE, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] coal = {
                new ItemStack(Material.COAL, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] gold = {
                new ItemStack(Material.GOLD_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] lapis = {
                new ItemStack(Material.LAPIS_LAZULI, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] diamond1 = {
                new SlimefunItemStack(MomotechItem.diamond, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] iron1 = {
                new SlimefunItemStack(MomotechItem.iron, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] quartz1 = {
                new SlimefunItemStack(MomotechItem.quartz, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] emerald1 = {
                new SlimefunItemStack(MomotechItem.emerald, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] redstone1 = {
                new SlimefunItemStack(MomotechItem.redstone, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] coal1 = {
                new SlimefunItemStack(MomotechItem.coal, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] gold1 = {
                new SlimefunItemStack(MomotechItem.gold, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] lapis1 = {
                new SlimefunItemStack(MomotechItem.lapis, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Cu1 = {
                new SlimefunItemStack(cu, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Au1 = {
                new SlimefunItemStack(au, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Al1 = {
                new SlimefunItemStack(al, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Pb1 = {
                new SlimefunItemStack(pb, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Sn1 = {
                new SlimefunItemStack(sn, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Zn1 = {
                new SlimefunItemStack(zn, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Mg1 = {
                new SlimefunItemStack(mg, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Ag1 = {
                new SlimefunItemStack(ag, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Cu = {
                new SlimefunItemStack(SlimefunItems.COPPER_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Au = {
                new SlimefunItemStack(SlimefunItems.GOLD_4K, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Al = {
                new SlimefunItemStack(SlimefunItems.ALUMINUM_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Pb = {
                new SlimefunItemStack(SlimefunItems.LEAD_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Sn = {
                new SlimefunItemStack(SlimefunItems.TIN_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Zn = {
                new SlimefunItemStack(SlimefunItems.ZINC_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Mg = {
                new SlimefunItemStack(SlimefunItems.MAGNESIUM_INGOT, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] Ag = {
                new SlimefunItemStack(ag, 64), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] electricityMagnet = {
                coil, coil, coil,
                coil, iron_star, coil,
                coil, coil, coil
        };
        ItemStack[] ironStar = {
                new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK),
                new ItemStack(Material.IRON_BLOCK), SlimefunItems.STEEL_INGOT, new ItemStack(Material.IRON_BLOCK),
                new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.IRON_BLOCK)
        };
        ItemStack[] realMagnet = {
                new ItemStack(Material.IRON_BLOCK), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] mineral__ = {
                MomotechItem.diamond1, MomotechItem.iron1, MomotechItem.gold1,
                MomotechItem.coal1, empty_shell, MomotechItem.lapis1,
                MomotechItem.redstone1, MomotechItem.quartz1, MomotechItem.emerald1
        };
        ItemStack[] metal__ = {
                mg1, cu1, al1,
                ag1, empty_shell, pb1,
                sn1, zn1, au1
        };
        ItemStack[] infinity = {
                MomotechItem.mineral__, shine_and_dark_ingot, MomotechItem.metal__,
                creative__, new SlimefunItemStack("MOMOTECH_ZYGOTE_INGOT", Items.MOMOTECH_ZYGOTE_INGOT), new SlimefunItemStack("MOMOTECH_PROTON_INGOT", Items.MOMOTECH_PROTON_INGOT),
                null, null, null
        };
        ItemStack[] coil_ = {
                SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT,
                SlimefunItems.COPPER_INGOT, empty_shell, SlimefunItems.COPPER_INGOT,
                SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT, SlimefunItems.COPPER_INGOT,
        };
        ItemStack[] ruleStar = {
                new SlimefunItemStack(MomotechItem.infinity, 32), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] shineAndDarkIngot = {
                MomotechItem.shine1, MomotechItem.shine1, MomotechItem.shine1,
                MomotechItem.shine1, new SlimefunItemStack("MOMOTECH_ENERGY_INGOT", Items.MOMOTECH_ENERGY_INGOT), MomotechItem.dark1,
                MomotechItem.dark1, MomotechItem.dark1, MomotechItem.dark1
        };
        ItemStack[] ruleMachineStar = {
                shine_and_dark_ingot, rule_star, shine_and_dark_ingot,
                star_, new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), star_,
                shine_and_dark_ingot, SlimefunItems.REINFORCED_PLATE, shine_and_dark_ingot
        };
        ItemStack[] randomQuantum = {
                null, new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM_GENERATOR", Items.MOMOTECH_RANDOM_QUANTUM_GENERATOR), null,
                null, new CustomItemStack(Material.BOOK, "&e&l随机量子", "&f在 &b随机量子发生器 &f中制作"), null,
                null, null, null
        };
        ItemStack[] effectDeleter = {
                quantum1_, MomotechItem.shine, quantum1_,
                MomotechItem.dark, uncontrollable_empty, MomotechItem.dark,
                quantum1_, MomotechItem.shine, quantum1_
        };
        ItemStack[] repeatingCommand = {
                null, quantity_constructor, null,
                null, new CustomItemStack(Material.BOOK, "&e&l创世命令方块 - REPEATING", "&f在 &b量化构造器 &f中使用45x64个循环命令方块制作"), null,
                null, new ItemStack(Material.REPEATING_COMMAND_BLOCK), null
        };
        ItemStack[] chainCommand = {
                null, quantity_constructor, null,
                null, new CustomItemStack(Material.BOOK, "&e&l创世命令方块 - CHAIN", "&f在 &b量化构造器 &f中使用45x64个脉冲命令方块制作"), null,
                null, new ItemStack(Material.CHAIN_COMMAND_BLOCK), null
        };
        ItemStack[] commonCommand = {
                null, quantity_constructor, null,
                null, new CustomItemStack(Material.BOOK, "&e&l创世命令方块 - COMMON", "&f在 &b量化构造器 &f中使用45x64个命令方块制作"), null,
                null, new ItemStack(Material.COMMAND_BLOCK), null
        };
        ItemStack[] ruleItem = {
                new SlimefunItemStack("MOMOTECH_COMMAND_BLOCK1", Items.MOMOTECH_COMMAND_BLOCK1), new SlimefunItemStack("MOMOTECH_COMMAND_BLOCK1", Items.MOMOTECH_COMMAND_BLOCK1), new SlimefunItemStack("MOMOTECH_COMMAND_BLOCK1", Items.MOMOTECH_COMMAND_BLOCK1),
                new SlimefunItemStack("MOMOTECH_COMMAND_BLOCK2", Items.MOMOTECH_COMMAND_BLOCK2), new SlimefunItemStack("MOMOTECH_COMMAND_BLOCK2", Items.MOMOTECH_COMMAND_BLOCK2), new SlimefunItemStack("MOMOTECH_COMMAND_BLOCK2", Items.MOMOTECH_COMMAND_BLOCK2),
                new SlimefunItemStack("MOMOTECH_COMMAND_BLOCK3", Items.MOMOTECH_COMMAND_BLOCK3), new SlimefunItemStack("MOMOTECH_COMMAND_BLOCK3", Items.MOMOTECH_COMMAND_BLOCK3), new SlimefunItemStack("MOMOTECH_COMMAND_BLOCK3", Items.MOMOTECH_COMMAND_BLOCK3),

        };
        ItemStack[] energyIngot = {
                SlimefunItems.PLUTONIUM, new SlimefunItemStack("MOMOTECH_ENERGY_QUANTUM", Items.MOMOTECH_ENERGY_QUANTUM), SlimefunItems.PLUTONIUM,
                SlimefunItems.REINFORCED_PLATE, SlimefunItems.PLUTONIUM, SlimefunItems.REINFORCED_PLATE,
                SlimefunItems.PLUTONIUM, new SlimefunItemStack("MOMOTECH_ENERGY_QUANTUM", Items.MOMOTECH_ENERGY_QUANTUM), SlimefunItems.PLUTONIUM
        };
        ItemStack[] Resource = {
                new SlimefunItemStack("MOMOTECH_ENERGY_INGOT", Items.MOMOTECH_ENERGY_INGOT), rule_star, new SlimefunItemStack("MOMOTECH_ENERGY_INGOT", Items.MOMOTECH_ENERGY_INGOT),
                rule_star, new SlimefunItemStack("MOMOTECH_RULE_ITEM", Items.MOMOTECH_RULE_ITEM), rule_star,
                SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.BASIC_CIRCUIT_BOARD, SlimefunItems.BASIC_CIRCUIT_BOARD
        };
        ItemStack[] finalRule = {
                null, quantity_constructor, null,
                null, new CustomItemStack(Material.BOOK, "&e&l概念物", "&f在 &b量化构造器 &f中使用45x64个Resource制作"), null,
                null, new SlimefunItemStack("MOMOTECH_RESOURCE", Items.MOMOTECH_RESOURCE), null
        };
        ItemStack[] throw_ = {
                uncontrollable_empty, null, uncontrollable_empty,
                null, null, null,
                empty_shell, null, empty_shell
        };
        ItemStack[] boots = {
                MomotechItem.infinity, null, MomotechItem.infinity,
                new SlimefunItemStack("MOMOTECH_RULE_ITEM", Items.MOMOTECH_RULE_ITEM), null, bug_crystal,
                null, null, null
        };
        ItemStack[] pickaxe = {
                MomotechItem.infinity, MomotechItem.infinity, MomotechItem.infinity,
                null, new SlimefunItemStack("MOMOTECH_RULE_ITEM", Items.MOMOTECH_RULE_ITEM), null,
                null, new SlimefunItemStack("MOMOTECH_RULE_ITEM", Items.MOMOTECH_RULE_ITEM), null
        };
        ItemStack[] looter = {
                new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.EMERALD_BLOCK),
                new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.EGG), new ItemStack(Material.EMERALD_BLOCK),
                new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.EMERALD_BLOCK), new ItemStack(Material.EMERALD_BLOCK),
        };
        ItemStack[] forever = {
                null, new SlimefunItemStack("MOMOTECH_ETERNAL_MINING_MACHINE", Items.MOMOTECH_ETERNAL_MINING_MACHINE), null,
                null, new CustomItemStack(Material.BOOK, "&e&l永恒粒子", "&f在 &b永恒矿机 &f中制作"), null,
                null, null, null
        };
        ItemStack[] forever_ = {
                new SlimefunItemStack(new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER), 12), null,
                null, null, null, null, null, null, null
        };
        ItemStack[] ZYGOTE = {
                null, new SlimefunItemStack("MOMOTECH_PARTICLE_CONSTRUCTOR", Items.MOMOTECH_PARTICLE_CONSTRUCTOR), null,
                null, new CustomItemStack(Material.BOOK, "&e&l合子", "&f在 &b质合子电容 &f中当电力为合数的时候生成"), null,
                null, null, null
        };
        ItemStack[] PROTON = {
                null, new SlimefunItemStack("MOMOTECH_PARTICLE_CONSTRUCTOR", Items.MOMOTECH_PARTICLE_CONSTRUCTOR), null,
                null, new CustomItemStack(Material.BOOK, "&e&l质子", "&f在 &b质合子电容 &f中当电力为合数的时候生成"), null,
                null, null, null
        };
        ItemStack[] PROTON_INGOT = {
                new SlimefunItemStack(new SlimefunItemStack("MOMOTECH_PROTON", Items.MOMOTECH_PROTON), 16), null, null, null,
                null, null, null,
                null, null
        };
        ItemStack[] ZYGOTE_INGOT = {
                new SlimefunItemStack(new SlimefunItemStack("MOMOTECH_ZYGOTE", Items.MOMOTECH_ZYGOTE), 32), null, null,
                null, null, null,
                null, null, null
        };
        ItemStack[] metalStar = {
                mg, cu, ag,
                zn, null, pb,
                au, al, sn
        };
        ItemStack[][][] mineral_ = new ItemStack[9][5][16];
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 3; ++j) {
                for (int k = 0; k < 9; ++k) {
                    if (j != 0) mineral_[i][j][k] = mineral[i][j - 1];
                    else {
                        mineral_[i][j] = new ItemStack[]{new ItemStack(Utils.it[i]), new ItemStack(Utils.it[i]), new ItemStack(Utils.it[i]), new ItemStack(Utils.it[i]), empty_shell, new ItemStack(Utils.it[i]), new ItemStack(Utils.it[i]), new ItemStack(Utils.it[i]), new ItemStack(Utils.it[i])};
                        break;
                    }
                }
            }
        }
        Items.STONE_SWORD.getItemMeta().setUnbreakable(true);
        Items.STONE_SWORD.addEnchantment(Enchantment.FIRE_ASPECT, 2);
        Items.STONE_SWORD.getItemMeta().setUnbreakable(true);
        Items.PROTECT_ITEM.getItemMeta().setUnbreakable(true);
        Items.MOMOTECH_PICKAXE.addEnchantment(Enchantment.DIG_SPEED, 5);
        Items.MOMOTECH_PICKAXE.addEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 3);
        Items.MOMOTECH_SILK_TOUCH_PICKAXE.addEnchantment(Enchantment.DIG_SPEED, 5);
        Items.MOMOTECH_SILK_TOUCH_PICKAXE.addEnchantment(Enchantment.SILK_TOUCH, 1);
        Items.PROTECT_ITEM.getItemMeta().setUnbreakable(true);
        Items.MOMOTECH_RULE_BOOTS.getItemMeta().setUnbreakable(true);
        Items.MOMOTECH_RULE_BOOTS.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
        Items.MOMOTECH_RULE_BOOTS.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 10);
        Items.MOMOTECH_RULE_BOOTS.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 10);
        Items.MOMOTECH_RULE_BOOTS.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 20);
        Items.MOMOTECH_RULE_BOOTS.addUnsafeEnchantment(Enchantment.SOUL_SPEED, 3);
        Items.MOMOTECH_RULE_BOOTS.addUnsafeEnchantment(Enchantment.DEPTH_STRIDER, 5);
        Items.MOMOTECH_RULE_BOOTS.addUnsafeEnchantment(Enchantment.DURABILITY, 255);
        Items.MOMOTECH_RULE_BOOTS.getItemMeta().setUnbreakable(true);
        Items.MOMOTECH_RULE_PICKAXE.getItemMeta().setUnbreakable(true);
        Items.MOMOTECH_RULE_PICKAXE.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 35);
        Items.MOMOTECH_RULE_PICKAXE.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
        Items.MOMOTECH_RULE_PICKAXE.getItemMeta().setUnbreakable(true);
        new IDDisplay(Items.MOMOTECH_FINAL, Items.MOMOTECH_ID_DISPLAY, "MOMOTECH_ID_DISPLAY", RecipeType.NULL, new ItemStack[]{null, null, null, null, null, null, null, null, null}).register(MomoTech.getInstance());
        new ProtectArmor(new SlimefunItemStack("MOMOTECH_ARMOR", Items.MOMOTECH_RULE_BOOTS), new PotionEffect[]{new PotionEffect(PotionEffectType.FAST_DIGGING, 600, 1, false, false, false), new PotionEffect(PotionEffectType.REGENERATION, 600, 0, false, false, false), new PotionEffect(PotionEffectType.SATURATION, 600, 0, false, false, false), new PotionEffect(PotionEffectType.SPEED, 600, 0, false, false, false), new PotionEffect(PotionEffectType.WATER_BREATHING, 600, 0, false, false, false), new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 0, false, false, false), new PotionEffect(PotionEffectType.JUMP, 600, 0, false, false, false)}, boots).register(MomoTech.getInstance());
        SfUtils.RegisterItem("MOMOTECH_PROTON", Items.MOMOTECH_PROTON, Items.MOMOTECH_ITEM, RecipeType.NULL, PROTON);
        SfUtils.RegisterItem("MOMOTECH_ZYGOTE", Items.MOMOTECH_ZYGOTE, Items.MOMOTECH_ITEM, RecipeType.NULL, ZYGOTE);
        SfUtils.RegisterItem("MOMOTECH_PROTON_INGOT", Items.MOMOTECH_PROTON_INGOT, Items.MOMOTECH_ITEM, RecipeType.COMPRESSOR, PROTON_INGOT);
        SfUtils.RegisterItem("MOMOTECH_ZYGOTE_INGOT", Items.MOMOTECH_ZYGOTE_INGOT, Items.MOMOTECH_ITEM, RecipeType.COMPRESSOR, ZYGOTE_INGOT);
        SfUtils.RegisterItem("MOMOTECH_METAL_STAR", Items.MOMOTECH_METAL_STAR, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, metalStar);
        SfUtils.RegisterItem("MOMOTECH_LOOTER", Items.MOMOTECH_LOOTER, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, looter, (ItemUseHandler) playerRightClickEvent -> {
            Location l = playerRightClickEvent.getPlayer().getEyeLocation();
            World w = l.getWorld();
            w.dropItem(l, new ItemStack(Material.EVOKER_SPAWN_EGG));
            playerRightClickEvent.cancel();
            if (SlimefunUtils.isItemSimilar(playerRightClickEvent.getPlayer().getInventory().getItemInMainHand(), new SlimefunItemStack("MOMOTECH_LOOTER", Items.MOMOTECH_LOOTER), false, false)) {
                ItemStack it = playerRightClickEvent.getPlayer().getInventory().getItemInMainHand().clone();
                it.setAmount(playerRightClickEvent.getPlayer().getInventory().getItemInMainHand().getAmount() - 1);
                playerRightClickEvent.getPlayer().getInventory().setItemInMainHand(it);
            } else if (SlimefunUtils.isItemSimilar(playerRightClickEvent.getPlayer().getInventory().getItemInOffHand(), new SlimefunItemStack("MOMOTECH_LOOTER", Items.MOMOTECH_LOOTER), false, false)) {
                ItemStack it = playerRightClickEvent.getPlayer().getInventory().getItemInOffHand().clone();
                it.setAmount(playerRightClickEvent.getPlayer().getInventory().getItemInOffHand().getAmount() - 1);
                playerRightClickEvent.getPlayer().getInventory().setItemInOffHand(it);
            }
        });
        SfUtils.RegisterItem("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER, Items.MOMOTECH_ITEM, RecipeType.NULL, forever);
        SfUtils.RegisterItem("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_, Items.MOMOTECH_ITEM, RecipeType.COMPRESSOR, forever_);
        SfUtils.RegisterItem("MOMOTECH_RULE_PICKAXE", Items.MOMOTECH_RULE_PICKAXE, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, pickaxe);
        SfUtils.RegisterItem("MOMOTECH_RULE_MACHINE_STAR", Items.MOMOTECH_RULE_MACHINE_STAR, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, ruleMachineStar);
        SfUtils.RegisterItem("MOMOTECH_SHINE_AND_DARK_INGOT", Items.MOMOTECH_SHINE_AND_DARK_INGOT, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, shineAndDarkIngot);
        SfUtils.RegisterItem("MOMOTECH_RULE_STAR", Items.MOMOTECH_RULE_STAR, Items.MOMOTECH_ITEM, rc, ruleStar);
        SfUtils.RegisterItem("MOMOTECH_BOX_OF_QUANTUM", Items.MOMOTECH_BOX_OF_QUANTUM, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, boxOfQuantum, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.getPlayer().setFreezeTicks(10);
            playerRightClickEvent.getPlayer().openInventory(playerRightClickEvent.getPlayer().getEnderChest());
            playerRightClickEvent.cancel();
        });
        SfUtils.RegisterItem("MOMOTECH_PICKAXE", Items.MOMOTECH_PICKAXE, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, QuantumPickaxe, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.getPlayer().setWalkSpeed(1.0F);
            playerRightClickEvent.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 99999999, 3, true, false));
        });
        SfUtils.RegisterItem("MOMOTECH_SILK_TOUCH_PICKAXE", Items.MOMOTECH_SILK_TOUCH_PICKAXE, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, silkTouchQuantumPickaxe);
        SfUtils.RegisterItem("MOMOTECH_STONE_SWORD", Items.STONE_SWORD, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, stoneSword);
        SfUtils.RegisterItem("MOMOTECH_QUANTUM", Items.MOMOTECH_QUANTUM, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, quantum, (ItemUseHandler) playerRightClickEvent -> {
            Player p = playerRightClickEvent.getPlayer();
            Location l = p.getLocation();
            World w = p.getWorld();
            if (l.getBlockY() >= 520) {
                Random r = new Random();
                p.setLevel(0);
                w.dropItem(new Location(w, l.getX() + (r.nextInt() % 16), -64, l.getZ() + (r.nextInt() % 16)), quantum1_);
                p.sendRawMessage("你触发了某些东西, 总之是些不太好的东西...");
            }
            p.setHealth(0.0);
            p.setHealthScale(0.001);
            p.setFreezeTicks(100);
            p.setWalkSpeed(0.0F);
            p.setMaxHealth(1.0);
            p.addPotionEffect(new PotionEffect(PotionEffectType.DARKNESS, 10, 1, true, false));
            w.spawnParticle(Particle.FALLING_LAVA, l, 10, 3, 3, 3);
            w.createExplosion(l, 1.0F);
        });
        SfUtils.RegisterItem("MOMOTECH_ENERGY_QUANTUM", Items.MOMOTECH_ENERGY_QUANTUM, Items.MOMOTECH_ITEM, rc2, energyQuantum);
        SfUtils.RegisterItem("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM, Items.MOMOTECH_ITEM, RecipeType.NULL, randomQuantum, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.getPlayer().sendRawMessage("寄");
            playerRightClickEvent.getPlayer().setHealth(0.0);
        });
        SfUtils.RegisterItem("MOMOTECH_CLEAR", Items.MOMOTECH_CLEAR, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, clear, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.getPlayer().setMaxHealth(20);
            playerRightClickEvent.getPlayer().setWalkSpeed(0.2F);
            playerRightClickEvent.getPlayer().setHealthScale(20.0);
            playerRightClickEvent.getPlayer().getWorld().spawnParticle(Particle.FALLING_WATER, playerRightClickEvent.getPlayer().getLocation(), 30, 2, 2, 2);
        });
        SfUtils.RegisterItem("MOMOTECH_THROW", Items.MOMOTECH_THROW, Items.MOMOTECH_TOOL, RecipeType.ANCIENT_ALTAR, throw_, (ItemUseHandler) playerRightClickEvent -> {
            ArrayList<ItemStack> it = new ArrayList<>(49);
            for (int i = 0; i <= 41; ++i) {
                if (playerRightClickEvent.getPlayer().getInventory().getItem(i) != null) {
                    it.add(playerRightClickEvent.getPlayer().getInventory().getItem(i));
                }
            }
            playerRightClickEvent.getPlayer().getInventory().clear();
            World w = playerRightClickEvent.getPlayer().getWorld();
            Location loc = playerRightClickEvent.getPlayer().getLocation();
            for (ItemStack i : it) {
                w.dropItem(loc, i);
            }
            playerRightClickEvent.getPlayer().sendRawMessage("biu~");
        });
        SfUtils.RegisterItem("MOMOTECH_EFFECT_DELETER", Items.MOMOTECH_EFFECT_DELETER, Items.MOMOTECH_TOOL, RecipeType.ANCIENT_ALTAR, effectDeleter, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.getPlayer().clearActivePotionEffects();
            playerRightClickEvent.getPlayer().sendRawMessage("耶!");
        });
        SfUtils.RegisterItem("MOMOTECH_QUANTUM1", Items.MOMOTECH_QUANTUM1, Items.MOMOTECH_ITEM, RecipeType.NULL, quantum1, (ItemUseHandler) playerRightClickEvent -> {
            Player p = playerRightClickEvent.getPlayer();
            Location l = p.getLocation();
            World w = p.getWorld();
            p.setMaxHealth(5.0);
            p.setLevel(0);
            p.setFreezeTicks(100);
            p.setWalkSpeed(1.0F);
            w.spawnParticle(Particle.FALLING_HONEY, l, 30, 3, 3, 3);
            w.createExplosion(l, 1.0F);
            p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 60, 1, true, false));
            p.sendRawMessage("你触发了某些东西...");
        });
        SfUtils.RegisterItem("MOMOTECH_FINAL_RULE", Items.MOMOTECH_FINAL_RULE, Items.MOMOTECH_ITEM, RecipeType.NULL, finalRule);
        SfUtils.RegisterItem("MOMOTECH_ENERGY_INGOT", Items.MOMOTECH_ENERGY_INGOT, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, energyIngot);
        SfUtils.RegisterItem("MOMOTECH_RESOURCE", Items.MOMOTECH_RESOURCE, Items.MOMOTECH_THANKING, RecipeType.ENHANCED_CRAFTING_TABLE, Resource);
        SfUtils.RegisterItem("MOMOTECH_RULE_ITEM", Items.MOMOTECH_RULE_ITEM, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, ruleItem);
        SfUtils.RegisterItem("MOMOTECH_COMMAND_BLOCK1", Items.MOMOTECH_COMMAND_BLOCK1, Items.MOMOTECH_ITEM, RecipeType.NULL, commonCommand);
        SfUtils.RegisterItem("MOMOTECH_COMMAND_BLOCK2", Items.MOMOTECH_COMMAND_BLOCK2, Items.MOMOTECH_ITEM, RecipeType.NULL, repeatingCommand);
        SfUtils.RegisterItem("MOMOTECH_COMMAND_BLOCK3", Items.MOMOTECH_COMMAND_BLOCK3, Items.MOMOTECH_ITEM, RecipeType.NULL, chainCommand);
        SfUtils.RegisterItem("MOMOTECH_SHINE", Items.MOMOTECH_SHINE, Items.MOMOTECH_ITEM, RecipeType.NULL, shine);
        SfUtils.RegisterItem("MOMOTECH_DARK", Items.MOMOTECH_DARK, Items.MOMOTECH_ITEM, RecipeType.NULL, dark);
        SfUtils.RegisterItem("MOMOTECH_SHINE1", Items.MOMOTECH_SHINE1, Items.MOMOTECH_ITEM, rc, shine1);
        SfUtils.RegisterItem("MOMOTECH_DARK1", Items.MOMOTECH_DARK1, Items.MOMOTECH_ITEM, rc, dark1);
        SfUtils.RegisterItem("MOMOTECH_INFINITY", Items.MOMOTECH_INFINITY, Items.MOMOTECH_ITEM, RecipeType.SMELTERY, infinity);
        SfUtils.RegisterItem("MOMOTECH_EXP", Items.MOMOTECH_EXP, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, exp, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.cancel();
            if (SlimefunUtils.isItemSimilar(playerRightClickEvent.getPlayer().getInventory().getItemInMainHand(), new SlimefunItemStack("MOMOTECH_EXP", Items.MOMOTECH_EXP), false, false)) {
                ItemStack it = playerRightClickEvent.getPlayer().getInventory().getItemInMainHand().clone();
                it.setAmount(playerRightClickEvent.getPlayer().getInventory().getItemInMainHand().getAmount() - 1);
                playerRightClickEvent.getPlayer().getInventory().setItemInMainHand(it);
            } else if (SlimefunUtils.isItemSimilar(playerRightClickEvent.getPlayer().getInventory().getItemInOffHand(), new SlimefunItemStack("MOMOTECH_EXP", Items.MOMOTECH_EXP), false, false)) {
                ItemStack it = playerRightClickEvent.getPlayer().getInventory().getItemInOffHand().clone();
                it.setAmount(playerRightClickEvent.getPlayer().getInventory().getItemInOffHand().getAmount() - 1);
                playerRightClickEvent.getPlayer().getInventory().setItemInOffHand(it);
            }
            playerRightClickEvent.getPlayer().giveExpLevels(20);
        });
        SfUtils.RegisterItem("MOMOTECH_FULL", Items.FULL, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, full, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.cancel();
            if (SlimefunUtils.isItemSimilar(playerRightClickEvent.getPlayer().getInventory().getItemInMainHand(), new SlimefunItemStack("MOMOTECH_FULL", Items.FULL), false, false)) {
                ItemStack it = playerRightClickEvent.getPlayer().getInventory().getItemInMainHand().clone();
                it.setAmount(playerRightClickEvent.getPlayer().getInventory().getItemInMainHand().getAmount() - 1);
                playerRightClickEvent.getPlayer().getInventory().setItemInMainHand(it);
            } else if (SlimefunUtils.isItemSimilar(playerRightClickEvent.getPlayer().getInventory().getItemInOffHand(), new SlimefunItemStack("MOMOTECH_FULL", Items.FULL), false, false)) {
                ItemStack it = playerRightClickEvent.getPlayer().getInventory().getItemInOffHand().clone();
                it.setAmount(playerRightClickEvent.getPlayer().getInventory().getItemInOffHand().getAmount() - 1);
                playerRightClickEvent.getPlayer().getInventory().setItemInOffHand(it);
            }
            playerRightClickEvent.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 99999999, 1, true, false));
        });
        SfUtils.RegisterItem("MOMOTECH_STAR_OF_ALL", Items.STAR_OF_ALL, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, star);
        SfUtils.RegisterItem("MOMOTECH_COMMAND_BLOCK_GETTER", Items.COMMAND_BLOCK_GETTER, Items.MOMOTECH_ITEM, RecipeType.ANCIENT_ALTAR, commandBlockGetter, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_PROTECT_ITEM", Items.PROTECT_ITEM, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, protectItem);
        SfUtils.RegisterItem("MOMOTECH_DAMAGE_ITEM", Items.DAMAGE_ITEM, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, damageItem);
        SfUtils.RegisterItem("MOMOTECH_LETTER", Items.MOMOTECH_LETTER, Items.MOMOTECH_ITEM, RecipeType.NULL, letter);
        SfUtils.RegisterItem("MOMOTECH_ID_CARD", Items.MOMOTECH_ID_CARD, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, IDCard);
        SfUtils.RegisterItem("MOMOTECH_FINAL_STAR", Items.MOMOTECH_FINAL_STAR, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, finalStar);
        SfUtils.RegisterItem("MOMOTECH_FINAL_ITEM", Items.MOMOTECH_FINAL_ITEM, Items.MOMOTECH_ITEM, RecipeType.NULL, finalItem);
        SfUtils.RegisterItem("MOMOTECH_DIGITAL", Items.MOMOTECH_DIGITAL, Items.MOMOTECH_ITEM, RecipeType.NULL, digital__, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_SYMBOL_ADDITION", Items.MOMOTECH_SYMBOL_ADDITION, Items.MOMOTECH_ITEM, RecipeType.NULL, symbol, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_SYMBOL_SUBTRACTION", Items.MOMOTECH_SYMBOL_SUBTRACTION, Items.MOMOTECH_ITEM, RecipeType.NULL, symbol, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_SYMBOL_MULTIPLICATION", Items.MOMOTECH_SYMBOL_MULTIPLICATION, Items.MOMOTECH_ITEM, RecipeType.NULL, symbol, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_SYMBOL_DIVISION", Items.MOMOTECH_SYMBOL_DIVISION, Items.MOMOTECH_ITEM, RecipeType.NULL, symbol, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_EMPTY_SHELL", Items.MOMOTECH_EMPTY_SHELL, Items.MOMOTECH_ITEM, RecipeType.NULL, emptyShell, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NONE", Items.MOMOTECH_NONE, Items.MOMOTECH_ITEM, RecipeType.ANCIENT_ALTAR, none, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NUMBER_BUG", Items.MOMOTECH_NUMBER_BUG, Items.MOMOTECH_ITEM, RecipeType.NULL, bug, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NUMBER_BUG_I", Items.MOMOTECH_NUMBER_BUG_I, Items.MOMOTECH_ITEM, RecipeType.NULL, bug1, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NUMBER_BUG_II", Items.MOMOTECH_NUMBER_BUG_II, Items.MOMOTECH_ITEM, RecipeType.NULL, bug2, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NUMBER_BUG_III", Items.MOMOTECH_NUMBER_BUG_III, Items.MOMOTECH_ITEM, RecipeType.NULL, bug3, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NUMBER_BUG_IV", Items.MOMOTECH_NUMBER_BUG_IV, Items.MOMOTECH_ITEM, RecipeType.NULL, bug4, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NUMBER_BUG_V", Items.MOMOTECH_NUMBER_BUG_V, Items.MOMOTECH_ITEM, RecipeType.NULL, bug5, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_UNCONTROLLABLE_EMPTY_", Items.MOMOTECH_UNCONTROLLABLE_EMPTY, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, uncontrollableEmpty);
        SfUtils.RegisterItem("MOMOTECH_QY", Items.QY, Items.MOMOTECH_THANKING, RecipeType.MAGIC_WORKBENCH, QY_);
        SfUtils.RegisterItem("MOMOTECH_CH", Items.wbx, Items.MOMOTECH_THANKING, RecipeType.MAGIC_WORKBENCH, wbx);
        SfUtils.RegisterItem("MOMOTECH_SKYBULE", Items.sky, Items.MOMOTECH_THANKING, RecipeType.NULL, empty);
        SfUtils.RegisterItem("MOMOTECH_BUGGGG", Items.BUGGGGG, Items.MOMOTECH_THANKING, RecipeType.MAGIC_WORKBENCH, buggggg);
        SfUtils.RegisterItem("MOMOTECH_PLUGIN", Items.plugin, Items.MOMOTECH__, RecipeType.NULL, empty);
        SfUtils.RegisterItem("MOMOTECH_ELSE_1", Items.ELSE_1, Items.MOMOTECH__, RecipeType.NULL, empty);
        SfUtils.RegisterItem("MOMOTECH_ELSE_2", Items.ELSE_2, Items.MOMOTECH__, RecipeType.NULL, empty);
        SfUtils.RegisterItem("MOMOTECH_ELSE_3", Items.ELSE_3, Items.MOMOTECH__, RecipeType.NULL, empty);
        SfUtils.RegisterItem("MOMOTECH_CREATIVE", Items.MOMOTECH_CREATIVE_ITEM, Items.MOMOTECH_ITEM, RecipeType.NULL, creative, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_CREATIVE_I", Items.MOMOTECH_CREATIVE_ITEM_I, Items.MOMOTECH_ITEM, RecipeType.NULL, creative, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_CREATIVE_II", Items.MOMOTECH_CREATIVE_ITEM_II, Items.MOMOTECH_ITEM, RecipeType.NULL, creative1, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_CREATIVE__", Items.CREATIVE__, Items.MOMOTECH_ITEM, RecipeType.NULL, creative___);
        SfUtils.RegisterItem("MOMOTECH_QUANTITY_ITEM", Items.QUANTITY_ITEM, Items.MOMOTECH_ITEM, RecipeType.NULL, quantityItem);
        SfUtils.RegisterItem("MOMOTECH_BUG_CRYSTAL", Items.MOMOTECH_BUG_CRYSTAL, Items.MOMOTECH_ITEM, RecipeType.NULL, bugCrystal);
        SfUtils.RegisterItem("MOMOTECH_DIAMOND", Items.MOMOTECH_DIAMOND, Items.MOMOTECH_ITEM, rc, diamond);
        SfUtils.RegisterItem("MOMOTECH_IRON", Items.MOMOTECH_IRON, Items.MOMOTECH_ITEM, rc, iron);
        SfUtils.RegisterItem("MOMOTECH_GOLD", Items.MOMOTECH_GOLD, Items.MOMOTECH_ITEM, rc, gold);
        SfUtils.RegisterItem("MOMOTECH_LAPIS", Items.MOMOTECH_LAPIS, Items.MOMOTECH_ITEM, rc, lapis);
        SfUtils.RegisterItem("MOMOTECH_REDSTONE", Items.MOMOTECH_REDSTONE, Items.MOMOTECH_ITEM, rc, redstone);
        SfUtils.RegisterItem("MOMOTECH_QUARTZ", Items.MOMOTECH_QUARTZ, Items.MOMOTECH_ITEM, rc, quartz);
        SfUtils.RegisterItem("MOMOTECH_EMERALD", Items.MOMOTECH_EMERALD, Items.MOMOTECH_ITEM, rc, emerald);
        SfUtils.RegisterItem("MOMOTECH_COAL", Items.MOMOTECH_COAL, Items.MOMOTECH_ITEM, rc, coal);
        SfUtils.RegisterItem("MOMOTECH_DIAMOND1", Items.MOMOTECH_DIAMOND1, Items.MOMOTECH_ITEM, rc, diamond1);
        SfUtils.RegisterItem("MOMOTECH_IRON1", Items.MOMOTECH_IRON1, Items.MOMOTECH_ITEM, rc, iron1);
        SfUtils.RegisterItem("MOMOTECH_GOLD1", Items.MOMOTECH_GOLD1, Items.MOMOTECH_ITEM, rc, gold1);
        SfUtils.RegisterItem("MOMOTECH_LAPIS1", Items.MOMOTECH_LAPIS1, Items.MOMOTECH_ITEM, rc, lapis1);
        SfUtils.RegisterItem("MOMOTECH_REDSTONE1", Items.MOMOTECH_REDSTONE1, Items.MOMOTECH_ITEM, rc, redstone1);
        SfUtils.RegisterItem("MOMOTECH_QUARTZ1", Items.MOMOTECH_QUARTZ1, Items.MOMOTECH_ITEM, rc, quartz1);
        SfUtils.RegisterItem("MOMOTECH_EMERALD1", Items.MOMOTECH_EMERALD1, Items.MOMOTECH_ITEM, rc, emerald1);
        SfUtils.RegisterItem("MOMOTECH_COAL1", Items.MOMOTECH_COAL1, Items.MOMOTECH_ITEM, rc, coal1);
        SfUtils.RegisterItem("MOMOTECH_CU", Items.MOMOTECH_Cu, Items.MOMOTECH_ITEM, rc, Cu);
        SfUtils.RegisterItem("MOMOTECH_AU", Items.MOMOTECH_Au, Items.MOMOTECH_ITEM, rc, Au);
        SfUtils.RegisterItem("MOMOTECH_AL", Items.MOMOTECH_Al, Items.MOMOTECH_ITEM, rc, Al);
        SfUtils.RegisterItem("MOMOTECH_PB", Items.MOMOTECH_Pb, Items.MOMOTECH_ITEM, rc, Pb);
        SfUtils.RegisterItem("MOMOTECH_SN", Items.MOMOTECH_Sn, Items.MOMOTECH_ITEM, rc, Sn);
        SfUtils.RegisterItem("MOMOTECH_ZN", Items.MOMOTECH_Zn, Items.MOMOTECH_ITEM, rc, Zn);
        SfUtils.RegisterItem("MOMOTECH_MG", Items.MOMOTECH_Mg, Items.MOMOTECH_ITEM, rc, Mg);
        SfUtils.RegisterItem("MOMOTECH_AG", Items.MOMOTECH_Ag, Items.MOMOTECH_ITEM, rc, Ag);
        SfUtils.RegisterItem("MOMOTECH_CU1", Items.MOMOTECH_Cu1, Items.MOMOTECH_ITEM, rc, Cu1);
        SfUtils.RegisterItem("MOMOTECH_AU1", Items.MOMOTECH_Au1, Items.MOMOTECH_ITEM, rc, Au1);
        SfUtils.RegisterItem("MOMOTECH_AL1", Items.MOMOTECH_Al1, Items.MOMOTECH_ITEM, rc, Al1);
        SfUtils.RegisterItem("MOMOTECH_PB1", Items.MOMOTECH_Pb1, Items.MOMOTECH_ITEM, rc, Pb1);
        SfUtils.RegisterItem("MOMOTECH_SN1", Items.MOMOTECH_Sn1, Items.MOMOTECH_ITEM, rc, Sn1);
        SfUtils.RegisterItem("MOMOTECH_ZN1", Items.MOMOTECH_Zn1, Items.MOMOTECH_ITEM, rc, Zn1);
        SfUtils.RegisterItem("MOMOTECH_MG1", Items.MOMOTECH_Mg1, Items.MOMOTECH_ITEM, rc, Mg1);
        SfUtils.RegisterItem("MOMOTECH_AG1", Items.MOMOTECH_Ag1, Items.MOMOTECH_ITEM, rc, Ag1);
        SfUtils.RegisterItem("MOMOTECH_REAL_MAGNET", Items.MOMOTECH_REAL_MAGNET, Items.MOMOTECH_ITEM, rc1, realMagnet);
        SfUtils.RegisterItem("MOMOTECH_COIL", Items.MOMOTECH_COIL, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, coil_);
        SfUtils.RegisterItem("MOMOTECH_MINERAL_", Items.MOMOTECH_MINERAL_, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, mineral__);
        SfUtils.RegisterItem("MOMOTECH_METAL_", Items.MOMOTECH_METAL_, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, metal__);
        SfUtils.RegisterItem("MOMOTECH_ELECTRICITY_MAGNET", Items.MOMOTECH_ELECTRICITY_MAGNET, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, electricityMagnet);
        SfUtils.RegisterItem("MOMOTECH_IRON_STAR", Items.MOMOTECH_IRON_STAR, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, ironStar);

        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 3; j++) {
                SfUtils.RegisterItem("MOMOTECH_MINERAL_" + Utils.mineral__[i] + "_" + Utils.id[j], Items.Mineral[i][j], Items.MOMOTECH_MINERAL, RecipeType.ENHANCED_CRAFTING_TABLE, mineral_[i][j], (ItemUseHandler) PlayerRightClickEvent::cancel);
            }
        }
        ItemStack stone_ = new ItemStack(Material.COBBLESTONE);
        SfUtils.RegisterItem("MOMOTECH_COBBLESTONE0", Items.Cobblestone[0], Items.MOMOTECH_MINERAL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{stone_, stone_, stone_, stone_, empty_shell, stone_, stone_, stone_, stone_});
        for (int i = 1; i < 50; ++i) {
            SfUtils.RegisterItem("MOMOTECH_COBBLESTONE" + i, Items.Cobblestone[i], Items.MOMOTECH_MINERAL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{cobblestone_[i - 1], cobblestone_[i - 1], cobblestone_[i - 1], cobblestone_[i - 1], cobblestone_[i - 1], cobblestone_[i - 1], cobblestone_[i - 1], cobblestone_[i - 1], cobblestone_[i - 1]});
        }
        logger.info("Items register successfully.");
    }
}
