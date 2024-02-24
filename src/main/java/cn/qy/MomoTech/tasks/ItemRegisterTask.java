package cn.qy.MomoTech.tasks;

import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.NullEnchantment.Register;
import cn.qy.MomoTech.utils.MomotechItem;
import cn.qy.MomoTech.utils.SfUtils;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

import static cn.qy.MomoTech.utils.MomotechItem.*;

public class ItemRegisterTask {
    public static void run(@NotNull Logger logger) {
        Register.run();
        ItemStack[] empty = {null, null, null, null, new CustomItemStack(Material.PAPER, "&6&l未完成 敬请期待"), null, null, null, null};
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
                null, null, null, null,
                new CustomItemStack(Material.BOOK, "§e§lBUG - 小数", "§7在 §f所有计算机器 §7中当小数位数超过 §f4 §7时产生"), null, null, null
        };
        ItemStack[] bug3 = {
                increment, ordinary_number_combinator, null, null,
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
                empty_shell, empty_shell, empty_shell,
                empty_shell, empty_shell, empty_shell
        };
        ItemStack[] uncontrollableEmpty = {
                empty_shell, none_, empty_shell,
                none_, none_, none_,
                creative_item, none_, creative_item_I
        };
        ItemStack[] QY_ = {
                MomotechItem.bug, MomotechItem.bug1, MomotechItem.bug2, uncontrollable_empty, none_, uncontrollable_empty, MomotechItem.bug3, MomotechItem.bug4, MomotechItem.bug5
        };
        ItemStack[][][] mineral_ = new ItemStack[9][5][16];
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 3; ++j) {
                for (int k = 0; k < 9; ++k) {
                    if (j != 0) mineral_[i][j][k] = mineral[i][j - 1];
                    else mineral_[i][j][k] = new ItemStack(Utils.it[i]);
                }
            }
        }
        ItemStack[] wbx = {
                mineral[0][2], mineral[1][2], mineral[2][2], mineral[3][2], mineral[4][2], mineral[5][2], mineral[6][2], mineral[7][2], mineral[8][2]
        };
        ItemStack[] buggggg = {
                ch, none_, qy, creative_item, empty_shell, creative_item_I, SlimefunItems.MAGIC_SUGAR, null, SlimefunItems.MAGIC_SUGAR
        };
        ItemStack[] creative = {
                null, creative_item_generator, null, null,
                new CustomItemStack(Material.BOOK, "&e&l原始物质α/β", "&7在 &b原始物质制造器 &7中制作"), null, null, null, null
        };
        ItemStack[] creative1 = {
                null, quantity_constructor, null, null,
                new CustomItemStack(Material.BOOK, "&e&l原始物质γ", "&7在 &b量化构造器 &7中使用不可控空有5%概率生成"), null, null, uncontrollable_empty, null
        };
        ItemStack[] bugCrystal = {
                null, quantity_constructor, null, null,
                new CustomItemStack(Material.BOOK, "&e&lBUG结晶", "&7在 &b量化构造器 &7中至少同时使用九种BUG物质制作"), null, null, null, null
        };
        ItemStack[] full = {
                none_, new ItemStack(Material.APPLE), none_,
                creative_item, null, creative_item_I,
                null, SlimefunItems.MAGIC_SUGAR, null
        };
        ItemStack[] damageItem = {
                creative_item_II, creative_item_II, creative_item_II,
                final_star, final_item, final_star,
                qy, ch, qy
        };
        ItemStack[] commandBlockGetter = {
                creative__, quantity_item, creative__,
                ch, ch, ch,
                qy, bug_crystal, qy
        };
        ItemStack[] quantityItem = {
                null, quantity_constructor, null, null,
                new CustomItemStack(Material.BOOK, "&e&l量化插件", "&7在 &b量化构造器 &7中使用任意物品有0.1%生成"), null, null, null, null

        };
        ItemStack[] creative___ = {
                null, quantity_constructor, null, null,
                new CustomItemStack(Material.BOOK, "&e&l纯净的始源", "&7在 &b量化构造器 &7中至少同时使用原始物质α与β制作"), null, creative_item, null, creative_item_I
        };
        ItemStack[] letter = {null, letter_constructor, null, null, null
                , new CustomItemStack(Material.BOOK, "&e&l符号", "&7在 &b符号集成器 &7中随机出现"), null, null, null, null};
        ItemStack[] IDCard = {creative_item_I, creative_item_I, creative_item_I, null, null, null, creative_item, creative_item, creative_item};
        ItemStack[] finalStar = {creative_item, bugggg, creative_item_I, bug_crystal, new ItemStack(Material.COMMAND_BLOCK), creative_item_II, empty_shell, creative__, empty_shell};
        ItemStack[] finalItem = {null, quantity_constructor, null, null
                , new CustomItemStack(Material.BOOK, "&e&l熵 - 夸克", "&7在 &b量化构造器 &7中使用终极之心制作"), null, null, final_star, null};
        ItemStack[] exp = {null, null, null, creative_item, null, creative_item_I, null, null, null};
        ItemStack[] protectItem = {final_star, final_item, final_star, final_star, uncontrollable_empty, final_star};
        SfUtils.RegisterItem("MOMOTECH_EXP", Items.MOMOTECH_EXP, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, exp, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.getPlayer().giveExpLevels(30);
        });
        SfUtils.RegisterItem("FULL", Items.FULL, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, full, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 99999999, 1, true, false));
        });
        Items.PROTECT_ITEM.getItemMeta().setUnbreakable(true);
        SfUtils.RegisterItem("COMMAND_BLOCK_GETTER", Items.COMMAND_BLOCK_GETTER, Items.MOMOTECH_TOOL, RecipeType.MAGIC_WORKBENCH, commandBlockGetter, (ItemUseHandler) playerRightClickEvent -> {
            playerRightClickEvent.getPlayer().getWorld().dropItem(playerRightClickEvent.getPlayer().getLocation(), new ItemStack(Material.COMMAND_BLOCK));
        });
        SfUtils.RegisterItem("MOMOTECH_LIGHT_", Items.MOMOTECH_LIGHT_, Items.MOMOTECH_PHISICS, RecipeType.NULL, empty);
        SfUtils.RegisterItem("MOMOTECH_SOUND_", Items.MOMOTECH_SOUND_, Items.MOMOTECH_PHISICS, RecipeType.NULL, empty);
        SfUtils.RegisterItem("PROTECT_ITEM", Items.PROTECT_ITEM, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, protectItem);
        SfUtils.RegisterItem("DAMAGE_ITEM", Items.DAMAGE_ITEM, Items.MOMOTECH_TOOL, RecipeType.ENHANCED_CRAFTING_TABLE, damageItem);
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
        SfUtils.RegisterItem("MOMOTECH_NONE", Items.MOMOTECH_NONE, Items.MOMOTECH_ITEM, RecipeType.MAGIC_WORKBENCH, none, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NUMBER_BUG", Items.MOMOTECH_NUMBER_BUG, Items.MOMOTECH_ITEM, RecipeType.NULL, bug, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NUMBER_BUG_I", Items.MOMOTECH_NUMBER_BUG_I, Items.MOMOTECH_ITEM, RecipeType.NULL, bug1, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NUMBER_BUG_II", Items.MOMOTECH_NUMBER_BUG_II, Items.MOMOTECH_ITEM, RecipeType.NULL, bug2, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NUMBER_BUG_III", Items.MOMOTECH_NUMBER_BUG_III, Items.MOMOTECH_ITEM, RecipeType.NULL, bug3, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NUMBER_BUG_IV", Items.MOMOTECH_NUMBER_BUG_IV, Items.MOMOTECH_ITEM, RecipeType.NULL, bug4, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_NUMBER_BUG_V", Items.MOMOTECH_NUMBER_BUG_V, Items.MOMOTECH_ITEM, RecipeType.NULL, bug5, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_UNCONTROLLABLE_EMPTY_", Items.MOMOTECH_UNCONTROLLABLE_EMPTY, Items.MOMOTECH_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, uncontrollableEmpty);
        SfUtils.RegisterItem("QY", Items.QY, Items.MOMOTECH_THANKING, RecipeType.MAGIC_WORKBENCH, QY_);
        SfUtils.RegisterItem("CH", Items.wbx, Items.MOMOTECH_THANKING, RecipeType.MAGIC_WORKBENCH, wbx);
        SfUtils.RegisterItem("SKYBULE", Items.sky, Items.MOMOTECH_THANKING, RecipeType.NULL, empty);
        SfUtils.RegisterItem("ELSE_THANKING_LIST", Items.ELSE, Items.MOMOTECH_THANKING, RecipeType.NULL, empty);
        SfUtils.RegisterItem("BUGGGG", Items.BUGGGGG, Items.MOMOTECH_THANKING, RecipeType.MAGIC_WORKBENCH, buggggg);
        SfUtils.RegisterItem("PLUGIN", Items.plugin, Items.MOMOTECH__, RecipeType.NULL, empty);
        SfUtils.RegisterItem("MOMOTECH_CREATIVE", Items.MOMOTECH_CREATIVE_ITEM, Items.MOMOTECH_ITEM, RecipeType.NULL, creative, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_CREATIVE_I", Items.MOMOTECH_CREATIVE_ITEM_I, Items.MOMOTECH_ITEM, RecipeType.NULL, creative, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("MOMOTECH_CREATIVE_II", Items.MOMOTECH_CREATIVE_ITEM_II, Items.MOMOTECH_ITEM, RecipeType.NULL, creative1, (ItemUseHandler) PlayerRightClickEvent::cancel);
        SfUtils.RegisterItem("CREATIVE__", Items.CREATIVE__, Items.MOMOTECH_ITEM, RecipeType.MAGIC_WORKBENCH, creative___);
        SfUtils.RegisterItem("QUANTITY_ITEM", Items.QUANTITY_ITEM, Items.MOMOTECH_ITEM, RecipeType.NULL, quantityItem);
        SfUtils.RegisterItem("MOMOTECH_BUG_CRYSTAL", Items.MOMOTECH_BUG_CRYSTAL, Items.MOMOTECH_ITEM, RecipeType.NULL, bugCrystal);
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 3; j++) {
                SfUtils.RegisterItem("MOMOTECH_MINERAL_" + Utils.mineral__[i] + "_" + Utils.id[j], Items.Mineral[i][j], Items.MOMOTECH_MINERAL, RecipeType.ENHANCED_CRAFTING_TABLE, mineral_[i][j], (ItemUseHandler) PlayerRightClickEvent::cancel);
            }
        }
        logger.info("Items register successfully.");
    }
}
