package cn.qy.MomoTech.tasks;

import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.Items.Machines.BasicMachine.EasyGenerator.*;
import cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine.*;
import cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine.DustGenerator.*;
import cn.qy.MomoTech.Items.Machines.BasicMachine.InfMachine.MonsterItemGenerator.*;
import cn.qy.MomoTech.Items.Machines.BasicMachine.Machine.*;
import cn.qy.MomoTech.Items.Machines.ElectricMachine.*;
import cn.qy.MomoTech.Items.Machines.Else.CobbleStoneStore;
import cn.qy.MomoTech.Items.Machines.Else.Transporter;
import cn.qy.MomoTech.Items.Machines.FinalMachine.FinalCopier;
import cn.qy.MomoTech.Items.Machines.FinalMachine.IDChanger;
import cn.qy.MomoTech.Items.Machines.FinalMachine.RandomCopier;
import cn.qy.MomoTech.Items.Machines.FinalMachine.UncontrollableEmptyGenerator;
import cn.qy.MomoTech.Items.MomotechItem;
import cn.qy.MomoTech.MomoTech;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

import static cn.qy.MomoTech.Items.MomotechItem.*;

public class MachineRegisterTask {
    public static void run(@NotNull Logger logger) {
        ItemStack[] digitalConstructor = {
                empty_shell, uncontrollable_empty, empty_shell,
                quantum_, creative_item, quantum_,
                empty_shell, new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER), empty_shell
        };
        ItemStack[] ordinaryNumberCombinator = {
                quantum_,  new SlimefunItemStack("MOMOTECH_PROTON_INGOT", Items.MOMOTECH_PROTON_INGOT), quantum1_,
                SlimefunItems.BIG_CAPACITOR, new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), SlimefunItems.BIG_CAPACITOR,
                increment, digital_constructor, increment
        };
        ItemStack[] symbolGenerator = {
                none_, uncontrollable_empty, none_,
                new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), creative_item, new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_),
                none_, quantum_, none_,
        };
        ItemStack[] increment = {
                none_, symbol_addition, none_,
                SlimefunItems.MAGIC_SUGAR, creative_item, SlimefunItems.MAGIC_SUGAR,
                uncontrollable_empty, uncontrollable_empty, uncontrollable_empty
        };
        ItemStack[] emptyShellGenerator_I = {
                empty_shell_generator, new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER), empty_shell_generator,
                empty_shell_generator, none_, empty_shell_generator,
                none_, none_, none_
        };
        ItemStack[] noneGenerator = {
                new ItemStack(Material.DIRT), new ItemStack(Material.DIRT), new ItemStack(Material.DIRT),
                new ItemStack(Material.GLASS), none_, new ItemStack(Material.GLASS),
                empty_shell, empty_shell, empty_shell

        };
        ItemStack[] creativeItemGenerator = {
                new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE),
                new ItemStack(Material.GLASS), none_, new ItemStack(Material.GLASS),
                empty_shell, empty_shell, empty_shell

        };
        ItemStack[] quantityConstructor = {
                creative_item, quantum1_, creative_item_I,
                qy, new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), ch,
                creative_item_generator, uncontrollable_empty, none_generator
        };
        ItemStack[] emptyShellGenerator = {
                none_, uncontrollable_empty, none_,
                none_, uncontrollable_empty, none_,
                none_, none_, none_
        };
        ItemStack[] creativeGenerator = {
                box_of_quantum, cobblestone_[3], quantity_item,
                none_, new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM), none_,
                rule_star, rule_machine_star, rule_star
        };
        ItemStack[] finalCopier = {
                final_item, final_star, final_item,
                new SlimefunItemStack("MOMOTECH_FINAL_RULE", Items.MOMOTECH_FINAL_RULE), random_copier, new SlimefunItemStack("MOMOTECH_FINAL_RULE", Items.MOMOTECH_FINAL_RULE),
                final_item, quantity_item, final_item
        };
        ItemStack[] uncontrollableEmptyGenerator = {
                box_of_quantum, quantity_item, box_of_quantum,
                bug_crystal, new SlimefunItemStack("MOMOTECH_FINAL_RULE", Items.MOMOTECH_FINAL_RULE), bug_crystal,
                empty_shell_generator, creative_item_II, empty_shell_generator
        };
        ItemStack[] oreCollector = {
                ch, final_star, ch,
                star_, box_of_quantum, star_,
                ch, quantity_item, ch
        };
        ItemStack[] randomCopier = {
                bug_crystal, new SlimefunItemStack("MOMOTECH_FINAL_RULE", Items.MOMOTECH_FINAL_RULE), bug_crystal,
                final_star, quantity_item, final_star,
                final_item, final_item, final_item
        };
        ItemStack[] stoneGeneratorII = {cobblestone_generator, cobblestone_generator, cobblestone_generator, cobblestone_generator, null, cobblestone_generator, cobblestone_generator, cobblestone_generator, cobblestone_generator};
        ItemStack[] stoneGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, new ItemStack(Material.STONE), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] stoneGeneratorI = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, new ItemStack(Material.COBBLESTONE), uncontrollable_empty,
                creative_item, new ItemStack(Material.IRON_PICKAXE), creative_item_I,
        };
        ItemStack[] fishGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, new ItemStack(Material.FISHING_ROD), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] sandGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, new ItemStack(Material.SAND), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] templateGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, new ItemStack(Material.DIAMOND), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] OREGenerator = {
                creative_item_I, star_, creative_item,
                shine_and_dark_ingot, new ItemStack(Material.DIAMOND_BLOCK), shine_and_dark_ingot,
                creative_item, star_, creative_item_I,
        };
        ItemStack[] glassGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, new ItemStack(Material.GLASS), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] froglightGenerator = {
                creative_item_I, none_, creative_item,
                uncontrollable_empty, new ItemStack(Material.DIAMOND_SWORD), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] dustGenerator = {
                creative_item_I, star_, creative_item,
                SlimefunItems.CARBONADO_EDGED_CAPACITOR, new ItemStack(Material.GRAVEL), SlimefunItems.CARBONADO_EDGED_CAPACITOR,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] lineGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, new ItemStack(Material.STRING), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] stoneChunkGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, SlimefunItems.STONE_CHUNK, uncontrollable_empty,
                creative_item, star_, creative_item_I,
        };
        ItemStack[] iceGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, new ItemStack(Material.WATER_BUCKET), uncontrollable_empty,
                creative_item, empty_shell, creative_item_I,
        };
        ItemStack[] CGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, SlimefunItems.CARBON, uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] commandBlockGenerator = {
                creative_item_II, box_of_quantum, creative_item_II,
                rule_machine_star, commandBlock, rule_machine_star,
                creative_item_II, star_, creative_item_II,
        };
        ItemStack[] generator = {
                creative_item_I, new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER), creative_item,
                quantum1_, empty_shell, quantum1_,
                qy, SlimefunItems.MAGIC_SUGAR, qy
        };
        ItemStack[] spiderEyeGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, new ItemStack(Material.SPIDER_EYE), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] beeGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, SlimefunItems.MAGIC_SUGAR, uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] seaItemGenerator = {
                creative_item_I, SlimefunItems.LARGE_CAPACITOR, creative_item,
                uncontrollable_empty, new ItemStack(Material.DIAMOND_SHOVEL), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] chestGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, new ItemStack(Material.ENDER_CHEST), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] diamondPickaxeGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, new ItemStack(Material.NETHERITE_PICKAXE), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] shineAndDarkConstructor = {
                creative__, star_, creative__,
                real_magnet, real_magnet, real_magnet,
                empty_shell, new ItemStack(Material.NETHERITE_PICKAXE), empty_shell
        };
        ItemStack[] fastGEO = {
                infinity, rule_machine_star, infinity,
                qy, quantum1_, ch,
                infinity, SlimefunItems.GEO_MINER, infinity
        };
        ItemStack[] transporter = {
                uncontrollable_empty, null, uncontrollable_empty,
                null, new ItemStack(Material.PISTON), null,
                uncontrollable_empty, null, uncontrollable_empty
        };
        ItemStack[] openBoxItem = {
                quantum1_, empty_shell, quantum1_,
                empty_shell, empty_shell, empty_shell,
                none_, none_, none_
        };
        ItemStack[] constructor = {
                uncontrollable_empty, real_magnet, uncontrollable_empty,
                qy,  new SlimefunItemStack("MOMOTECH_PROTON_INGOT", Items.MOMOTECH_PROTON_INGOT), ch,
                electricity_magnet, electricity_magnet, electricity_magnet
        };
        ItemStack[] magnetize = {
                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.ELECTRIC_MOTOR,
                electricity_magnet, electricity_magnet, electricity_magnet,
                none_, uncontrollable_empty, none_
        };
        ItemStack[] magnetGenerator = {
                shine1,  new SlimefunItemStack("MOMOTECH_PROTON_INGOT", Items.MOMOTECH_PROTON_INGOT), dark1,
                new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), box_of_quantum, new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_),
                uncontrollable_empty, shine_and_dark_ingot, uncontrollable_empty
        };
        ItemStack[] shineAndDarkGenerator = {
                shine_and_dark_ingot, infinity, shine_and_dark_ingot,
                shine_and_dark_ingot, SlimefunItems.SOLAR_GENERATOR_4, shine_and_dark_ingot,
                qy, quantity_item, ch
        };
        ItemStack[] ordinaryGenerator = {
                uncontrollable_empty, qy, uncontrollable_empty,
                uncontrollable_empty, real_magnet, uncontrollable_empty,
                none_, none_, none_
        };
        ItemStack[] netheritePickaxeChanger = {
                new ItemStack(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE), real_magnet, new ItemStack(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                electricity_magnet, null, electricity_magnet,
                uncontrollable_empty, uncontrollable_empty, uncontrollable_empty
        };
        ItemStack[] letterConstructor = {
                creative_item_II, quantum1_, creative_item_II,
                new ItemStack(Material.REPEATING_COMMAND_BLOCK), quantity_item, new ItemStack(Material.CHAIN_COMMAND_BLOCK),
                uncontrollable_empty, new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), uncontrollable_empty
        };
        ItemStack[] IDPutter = {
                quantity_item, new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), quantity_item,
                quantum1_, new ItemStack(Material.COMMAND_BLOCK), quantum1_,
                creative_item, creative_item_I, creative_item_II
        };
        ItemStack[] IDChanger = {
                new SlimefunItemStack("MOMOTECH_FINAL_RULE", Items.MOMOTECH_FINAL_RULE), final_item, new SlimefunItemStack("MOMOTECH_FINAL_RULE", Items.MOMOTECH_FINAL_RULE),
                final_item, final_item, final_item,
                new SlimefunItemStack("MOMOTECH_FINAL_RULE", Items.MOMOTECH_FINAL_RULE), final_item, new SlimefunItemStack("MOMOTECH_FINAL_RULE", Items.MOMOTECH_FINAL_RULE)
        };
        ItemStack[] store = {
                new ItemStack(Material.COBBLESTONE), empty_shell, new ItemStack(Material.COBBLESTONE),
                empty_shell, null, empty_shell,
                new ItemStack(Material.COBBLESTONE), empty_shell, new ItemStack(Material.COBBLESTONE)
        };
        ItemStack[] table = {
                infinity, new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), infinity,
                ch, cobblestone_[4], ch,
                new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER), bugggg, new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER)
        };
        ItemStack[] finalC = {
                box_of_quantum, box_of_quantum, box_of_quantum,
                cobblestone_[9], cobblestone_[19], cobblestone_[9],
                none_, new SlimefunItemStack("MOMOTECH_RESOURCE", Items.MOMOTECH_RESOURCE), none_
        };
        ItemStack[] pumpkinCarver = {
                uncontrollable_empty, uncontrollable_empty, uncontrollable_empty,
                SlimefunItems.ELECTRIC_MOTOR, null, SlimefunItems.ELECTRIC_MOTOR,
                empty_shell, none_, empty_shell
        };
        ItemStack[] fixer = {
                quantum_, star_, quantum_,
                uncontrollable_empty, new ItemStack(Material.IRON_BLOCK), uncontrollable_empty,
                bugggg, quantity_item, bugggg
        };
        ItemStack[] flintGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, new ItemStack(Material.FLINT_AND_STEEL), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] ruleShineAndDarkConstructor = {
                shine_and_dark_constructor, rule_machine_star, shine_and_dark_constructor,
                qy, quantity_item, ch,
                new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), bugggg, new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER),
        };
        ItemStack[] entropyReconstruct = {
                uncontrollable_empty, uncontrollable_empty, uncontrollable_empty,
                quantum1_, bugggg, quantum1_,
                shine1, star_, dark1
        };
        ItemStack[] ruleReconstruct = {
                shine_and_dark_ingot, rule_machine_star, shine_and_dark_ingot,
                bugggg, new SlimefunItemStack("MOMOTECH_ENTROPY_RECONSTRUCT", Items.MOMOTECH_ENTROPY_RECONSTRUCT), bugggg,
                creative_item_II, quantity_item, new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER)
        };
        ItemStack[] ruleDustGenerator = {
                new SlimefunItemStack("MOMOTECH_DUST_GENERATOR0", Items.DUST_GENERATOR), new SlimefunItemStack("MOMOTECH_DUST_GENERATOR", Items.DUST_GENERATOR), new SlimefunItemStack("MOMOTECH_DUST_GENERATOR", Items.DUST_GENERATOR),
                infinity, uncontrollable_empty, infinity,
                shine_and_dark_ingot, rule_machine_star, shine_and_dark_ingot
        };
        ItemStack[] ruleDustGenerator1 = {
                SlimefunItems.ALUMINUM_DUST, infinity, SlimefunItems.ALUMINUM_DUST,
                empty_shell, new SlimefunItemStack("MOMOTECH_RULE_DUST_GENERATOR0", Items.MOMOTECH_RULE_DUST_GENERATOR), empty_shell,
                none_, none_, none_
        };
        ItemStack[] ruleDustGenerator2 = {
                SlimefunItems.MAGNESIUM_DUST, infinity, SlimefunItems.MAGNESIUM_DUST,
                empty_shell, new SlimefunItemStack("MOMOTECH_RULE_DUST_GENERATOR0", Items.MOMOTECH_RULE_DUST_GENERATOR), empty_shell,
                none_, none_, none_
        };
        ItemStack[] ruleDustGenerator3 = {
                SlimefunItems.COPPER_DUST, infinity, SlimefunItems.COPPER_DUST,
                empty_shell, new SlimefunItemStack("MOMOTECH_RULE_DUST_GENERATOR0", Items.MOMOTECH_RULE_DUST_GENERATOR), empty_shell,
                none_, none_, none_
        };
        ItemStack[] ruleDustGenerator4 = {
                SlimefunItems.GOLD_DUST, infinity, SlimefunItems.GOLD_DUST,
                empty_shell, new SlimefunItemStack("MOMOTECH_RULE_DUST_GENERATOR0", Items.MOMOTECH_RULE_DUST_GENERATOR), empty_shell,
                none_, none_, none_
        };
        ItemStack[] ruleDustGenerator5 = {
                SlimefunItems.SILVER_DUST, infinity, SlimefunItems.SILVER_DUST,
                empty_shell, new SlimefunItemStack("MOMOTECH_RULE_DUST_GENERATOR0", Items.MOMOTECH_RULE_DUST_GENERATOR), empty_shell,
                none_, none_, none_
        };
        ItemStack[] ruleDustGenerator6 = {
                SlimefunItems.LEAD_DUST, infinity, SlimefunItems.LEAD_DUST,
                empty_shell, new SlimefunItemStack("MOMOTECH_RULE_DUST_GENERATOR0", Items.MOMOTECH_RULE_DUST_GENERATOR), empty_shell,
                none_, none_, none_
        };
        ItemStack[] ruleDustGenerator7 = {
                SlimefunItems.TIN_DUST, infinity, SlimefunItems.TIN_DUST,
                empty_shell, new SlimefunItemStack("MOMOTECH_RULE_DUST_GENERATOR0", Items.MOMOTECH_RULE_DUST_GENERATOR), empty_shell,
                none_, none_, none_
        };
        ItemStack[] ruleDustGenerator8 = {
                SlimefunItems.ZINC_DUST, infinity, SlimefunItems.ZINC_DUST,
                empty_shell, new SlimefunItemStack("MOMOTECH_RULE_DUST_GENERATOR0", Items.MOMOTECH_RULE_DUST_GENERATOR), empty_shell,
                none_, none_, none_
        };
        ItemStack[] ruleDustGenerator9 = {
                SlimefunItems.IRON_DUST, infinity, SlimefunItems.IRON_DUST,
                empty_shell, new SlimefunItemStack("MOMOTECH_RULE_DUST_GENERATOR0", Items.MOMOTECH_RULE_DUST_GENERATOR), empty_shell,
                none_, none_, none_
        };
        ItemStack[] uGenerator = {
                shine_and_dark_ingot, rule_machine_star, shine_and_dark_ingot,
                creative__, quantity_item, creative__,
                SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.ELECTRIC_ORE_GRINDER_3, SlimefunItems.ELECTRIC_ORE_GRINDER_3
        };
        ItemStack[] ruleCreativeGenerator = {
                quantum1_, quantity_item, quantum1_,
                mineral__, shine_and_dark_ingot, metal__,
                new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER), cobblestone_[2], new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER)
        };
        ItemStack[] ruleReactor = {
                SlimefunItems.NETHER_STAR_REACTOR, SlimefunItems.NUCLEAR_REACTOR, SlimefunItems.NETHER_STAR_REACTOR,
                shine_and_dark_ingot, rule_machine_star, shine_and_dark_ingot,
                creative__, quantity_item, creative__
        };
        ItemStack[] monsterItemGenerator0 = {
                rule_star, rule_machine_star, rule_star,
                shine_and_dark_ingot, infinity, shine_and_dark_ingot,
                cobblestone_[3], new ItemStack(Material.ROTTEN_FLESH), cobblestone_[3]
        };
        ItemStack[] monsterItemGenerator1 = {
                rule_star, rule_machine_star, rule_star,
                shine_and_dark_ingot, infinity, shine_and_dark_ingot,
                cobblestone_[3], new ItemStack(Material.FISHING_ROD), cobblestone_[3]
        };
        ItemStack[] monsterItemGenerator2 = {
                rule_star, rule_machine_star, rule_star,
                shine_and_dark_ingot, infinity, shine_and_dark_ingot,
                cobblestone_[3], new ItemStack(Material.GOLD_BLOCK), cobblestone_[3]
        };
        ItemStack[] monsterItemGenerator3 = {
                rule_star, rule_machine_star, rule_star,
                shine_and_dark_ingot, infinity, shine_and_dark_ingot,
                cobblestone_[3], new ItemStack(Material.ENDER_CHEST), cobblestone_[3]
        };
        ItemStack[] monsterItemGenerator4 = {
                rule_star, rule_machine_star, rule_star,
                shine_and_dark_ingot, infinity, shine_and_dark_ingot,
                cobblestone_[3], new ItemStack(Material.GUNPOWDER), cobblestone_[3]
        };
        ItemStack[] monsterItemGenerator5 = {
                rule_star, rule_machine_star, rule_star,
                shine_and_dark_ingot, infinity, shine_and_dark_ingot,
                cobblestone_[3], new ItemStack(Material.COPPER_BLOCK), cobblestone_[3]
        };
        ItemStack[] monsterItemGenerator6 = {
                rule_star, rule_machine_star, rule_star,
                shine_and_dark_ingot, infinity, shine_and_dark_ingot,
                cobblestone_[3], new ItemStack(Material.EGG), cobblestone_[3]
        };
        ItemStack[] monsterItemGenerator7 = {
                rule_star, rule_machine_star, rule_star,
                shine_and_dark_ingot, infinity, shine_and_dark_ingot,
                cobblestone_[3], new ItemStack(Material.SLIME_BLOCK), cobblestone_[3]
        };
        ItemStack[] monsterItemGenerator8 = {
                rule_star, rule_machine_star, rule_star,
                shine_and_dark_ingot, infinity, shine_and_dark_ingot,
                cobblestone_[3], new ItemStack(Material.BLAZE_ROD), cobblestone_[3]
        };
        ItemStack[] monsterItemGenerator9 = {
                rule_star, rule_machine_star, rule_star,
                shine_and_dark_ingot, infinity, shine_and_dark_ingot,
                cobblestone_[3], new ItemStack(Material.MAGMA_CREAM), cobblestone_[3]
        };
        ItemStack[] ruleConstructor = {
                infinity, MomotechItem.constructor, infinity,
                uncontrollable_empty, rule_machine_star, uncontrollable_empty,
                ch, rule_star, qy
        };
        ItemStack[] ruleMineralGenerator = {
                infinity, infinity, infinity,
                rule_star, mineral__, rule_star,
                shine_and_dark_ingot, shine_and_dark_ingot, shine_and_dark_ingot
        };
        ItemStack[] ruleMineralBlockGenerator = {
                infinity, infinity, infinity,
                rule_star, new SlimefunItemStack("MOMOTECH_RULE_MINERAL_GENERATOR", Items.MOMOTECH_MINERAL_GENERATOR), rule_star,
                shine_and_dark_ingot, shine_and_dark_ingot, shine_and_dark_ingot
        };
        ItemStack[] ruleGeo = {
                rule_machine_star, infinity, rule_machine_star,
                new SlimefunItemStack("MOMOTECH_FAST_GEO", Items.MOMOTECH_FAST_GEO), new SlimefunItemStack("MOMOTECH_FAST_GEO", Items.MOMOTECH_FAST_GEO), new SlimefunItemStack("MOMOTECH_FAST_GEO", Items.MOMOTECH_FAST_GEO),
                shine_and_dark_ingot, shine_and_dark_ingot, shine_and_dark_ingot
        };
        ItemStack[] wood = {
                infinity, SlimefunItems.TREE_GROWTH_ACCELERATOR, infinity,
                rule_star, shine_and_dark_ingot, rule_star,
                uncontrollable_empty, uncontrollable_empty, uncontrollable_empty
        };
        ItemStack[] plant = {
                infinity, SlimefunItems.CROP_GROWTH_ACCELERATOR, infinity,
                rule_star, shine_and_dark_ingot, rule_star,
                uncontrollable_empty, uncontrollable_empty, uncontrollable_empty
        };
        ItemStack[] randomQuantumGenerator = {
                uncontrollable_empty, uncontrollable_empty, uncontrollable_empty,
                SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.REINFORCED_PLATE, SlimefunItems.ADVANCED_CIRCUIT_BOARD,
                quantum_, quantum_, quantum_
        };
        ItemStack[] energyQuantumGenerator = {
                quantum1_, new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), quantum1_,
                uncontrollable_empty, quantity_item, uncontrollable_empty,
                SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.ENERGIZED_CAPACITOR, SlimefunItems.ENERGIZED_CAPACITOR
        };
        ItemStack[] finalGenerator = {
                rule_machine_star, new SlimefunItemStack("MOMOTECH_RESOURCE", Items.MOMOTECH_RESOURCE), rule_machine_star,
                quantity_item, creative_item_II, quantity_item,
                new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM), new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM), new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM)
        };
        ItemStack[] finalIngotGenerator = {
                infinity, infinity, infinity,
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
                infinity, rule_machine_star, infinity
        };
        ItemStack[] finalCapital = {
                infinity, infinity, infinity,
                infinity, qy, infinity,
                infinity, infinity, infinity
        };
        ItemStack[] electricEater = {
                null, empty_shell, null,
                empty_shell, new ItemStack(Material.COBBLESTONE, 64), empty_shell,
                null, empty_shell, null
        };
        ItemStack[] itemFixer = {
                empty_shell, empty_shell, empty_shell,
                null, null, null,
                null, null, null
        };
        ItemStack[] eternalMiningMachine = {
                quantum1_, quantum1_, quantum1_,
                quantum1_, SlimefunItems.GPS_TRANSMITTER_3, new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM),
                new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM), new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM), new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM)
        };
        ItemStack[] particleConstructor = {
                star_, quantum1_, star_,
                quantum_, uncontrollable_empty, quantum_,
                star_, quantum_, star_
        };
        ItemStack[] digitalGenerator = {
                new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER), new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_),
                new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), bug_crystal, new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_),
                new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), new SlimefunItemStack("MOMOTECH_FOREVER", Items.MOMOTECH_FOREVER), new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_)
        };
        ItemStack[] compressor = {
                new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_), quantum1_, new SlimefunItemStack("MOMOTECH_FOREVER_", Items.MOMOTECH_FOREVER_),
                uncontrollable_empty, SlimefunItems.CARBON_PRESS_3, uncontrollable_empty,
                new SlimefunItemStack("MOMOTECH_RANDOM_QUANTUM", Items.MOMOTECH_RANDOM_QUANTUM), electricity_magnet, new SlimefunItemStack("MOMOTECH_ENERGY_QUANTUM", Items.MOMOTECH_ENERGY_QUANTUM)
        };
        ItemStack[] finalEnergyGenerator = {
                empty_shell, new ItemStack(Material.COBBLESTONE), empty_shell,
                null, null, null,
                empty_shell, empty_shell, empty_shell
        };
        ItemStack[] saltGenerator = {
                empty_shell, shine_and_dark_ingot, empty_shell,
                shine_and_dark_ingot, null, shine_and_dark_ingot,
                none_, none_, none_
        };
        ItemStack[] ingotGenerator = {
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3, SlimefunItems.ELECTRIC_SMELTERY_2, SlimefunItems.ELECTRIC_INGOT_FACTORY_3,
                SlimefunItems.ELECTRIC_SMELTERY_2, box_of_quantum, SlimefunItems.ELECTRIC_SMELTERY_2,
                star_, shine_and_dark_ingot, star_
        };
        new IngotGenerator(Items.MOMOTECH_INF, "MOMOTECH_INGOT_CONSTRUCTOR", Items.MOMOTECH_INGOT_CONSTRUCTOR, RecipeType.ANCIENT_ALTAR, ingotGenerator).register(MomoTech.getInstance());
        new FinalEnergyGenerator(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_FINAL_ENERGY_GENERATOR", Items.MOMOTECH_FINAL_ENERGY_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, finalEnergyGenerator).register(MomoTech.getInstance());
        new ParticleConstructor(Items.MOMOTECH_MACHINE, "MOMOTECH_PARTICLE_CONSTRUCTOR", Items.MOMOTECH_PARTICLE_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, particleConstructor).register(MomoTech.getInstance());
        new DigitalGenerator(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_DIGITAL_GENERATOR", Items.MOMOTECH_DIGIT_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, digitalGenerator).register(MomoTech.getInstance());
        new EternalMiningMachine(Items.MOMOTECH_MACHINE, "MOMOTECH_ETERNAL_MINING_MACHINE", Items.MOMOTECH_ETERNAL_MINING_MACHINE, RecipeType.ANCIENT_ALTAR, eternalMiningMachine).register(MomoTech.getInstance());
        new ItemFixer(Items.MOMOTECH_INF, "MOMOTECH_ITEM_FIXER", Items.MOMOTECH_ITEM_FIXER, RecipeType.ENHANCED_CRAFTING_TABLE, itemFixer).register(MomoTech.getInstance());
        new SpecialThingsConstructor(Items.MOMOTECH_INF, "MOMOTECH_SPECIAL_THINGS_CONSTRUCTOR", Items.MOMOTECH_SPECIAL_THINGS_CONSTRUCTOR, RecipeType.ANCIENT_ALTAR, compressor).register(MomoTech.getInstance());
        new ElectricEater(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_ELECTRIC_EATER", Items.MOMOTECH_FINAL_ELECTRIC_EATER, RecipeType.ENHANCED_CRAFTING_TABLE, electricEater).register(MomoTech.getInstance());
        new FinalIngotGenerator(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_FINAL_INGOT_GENERATOR", Items.MOMOTECH_FINAL_INGOT_GENERATOR, RecipeType.ANCIENT_ALTAR, finalIngotGenerator).register(MomoTech.getInstance());
        new FinalCapital(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_FINAL_CAPITAL", Items.MOMOTECH_FINAL_CAPITAL, RecipeType.ANCIENT_ALTAR, finalCapital).register(MomoTech.getInstance());
        new FinalGenerator(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_FINAL_GENERATOR", Items.MOMOTECH_FINAL_GENERATOR, RecipeType.ANCIENT_ALTAR, finalGenerator).register(MomoTech.getInstance());
        new SaltGenerator(Items.MOMOTECH_INF, "MOMOTECH_SALT_GENERATOR", Items.MOMOTECH_SALT_GENERATOR, RecipeType.ANCIENT_ALTAR, saltGenerator).register(MomoTech.getInstance());
        new RuleConstructor(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_CONSTRUCTOR", Items.MOMOTECH_RULE_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, ruleConstructor).register(MomoTech.getInstance());
        new MonsterItemGenerator0(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_MONSTER_GENERATOR0", Items.MOMOTECH_MONSTER_ITEM, RecipeType.ANCIENT_ALTAR, monsterItemGenerator0).register(MomoTech.getInstance());
        new MonsterItemGenerator1(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_MONSTER_GENERATOR1", Items.MOMOTECH_MONSTER_ITEM1, RecipeType.ANCIENT_ALTAR, monsterItemGenerator1).register(MomoTech.getInstance());
        new MonsterItemGenerator2(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_MONSTER_GENERATOR2", Items.MOMOTECH_MONSTER_ITEM2, RecipeType.ANCIENT_ALTAR, monsterItemGenerator2).register(MomoTech.getInstance());
        new MonsterItemGenerator3(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_MONSTER_GENERATOR3", Items.MOMOTECH_MONSTER_ITEM3, RecipeType.ANCIENT_ALTAR, monsterItemGenerator3).register(MomoTech.getInstance());
        new MonsterItemGenerator4(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_MONSTER_GENERATOR4", Items.MOMOTECH_MONSTER_ITEM4, RecipeType.ANCIENT_ALTAR, monsterItemGenerator4).register(MomoTech.getInstance());
        new MonsterItemGenerator5(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_MONSTER_GENERATOR5", Items.MOMOTECH_MONSTER_ITEM5, RecipeType.ANCIENT_ALTAR, monsterItemGenerator5).register(MomoTech.getInstance());
        new MonsterItemGenerator6(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_MONSTER_GENERATOR6", Items.MOMOTECH_MONSTER_ITEM6, RecipeType.ANCIENT_ALTAR, monsterItemGenerator6).register(MomoTech.getInstance());
        new MonsterItemGenerator7(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_MONSTER_GENERATOR7", Items.MOMOTECH_MONSTER_ITEM7, RecipeType.ANCIENT_ALTAR, monsterItemGenerator7).register(MomoTech.getInstance());
        new MonsterItemGenerator8(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_MONSTER_GENERATOR8", Items.MOMOTECH_MONSTER_ITEM8, RecipeType.ANCIENT_ALTAR, monsterItemGenerator8).register(MomoTech.getInstance());
        new MonsterItemGenerator9(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_MONSTER_GENERATOR9", Items.MOMOTECH_MONSTER_ITEM9, RecipeType.ANCIENT_ALTAR, monsterItemGenerator9).register(MomoTech.getInstance());
        new RuleDustGenerator0(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_DUST_GENERATOR0", Items.MOMOTECH_RULE_DUST_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, ruleDustGenerator).register(MomoTech.getInstance());
        new RuleDustGenerator1(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_DUST_GENERATOR1", Items.MOMOTECH_RULE_DUST_GENERATOR1, RecipeType.ENHANCED_CRAFTING_TABLE, ruleDustGenerator1).register(MomoTech.getInstance());
        new RuleDustGenerator2(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_DUST_GENERATOR2", Items.MOMOTECH_RULE_DUST_GENERATOR2, RecipeType.ENHANCED_CRAFTING_TABLE, ruleDustGenerator2).register(MomoTech.getInstance());
        new RuleDustGenerator3(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_DUST_GENERATOR3", Items.MOMOTECH_RULE_DUST_GENERATOR3, RecipeType.ENHANCED_CRAFTING_TABLE, ruleDustGenerator3).register(MomoTech.getInstance());
        new RuleDustGenerator4(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_DUST_GENERATOR4", Items.MOMOTECH_RULE_DUST_GENERATOR4, RecipeType.ENHANCED_CRAFTING_TABLE, ruleDustGenerator4).register(MomoTech.getInstance());
        new RuleDustGenerator5(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_DUST_GENERATOR5", Items.MOMOTECH_RULE_DUST_GENERATOR5, RecipeType.ENHANCED_CRAFTING_TABLE, ruleDustGenerator5).register(MomoTech.getInstance());
        new RuleDustGenerator6(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_DUST_GENERATOR6", Items.MOMOTECH_RULE_DUST_GENERATOR6, RecipeType.ENHANCED_CRAFTING_TABLE, ruleDustGenerator6).register(MomoTech.getInstance());
        new RuleDustGenerator7(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_DUST_GENERATOR7", Items.MOMOTECH_RULE_DUST_GENERATOR7, RecipeType.ENHANCED_CRAFTING_TABLE, ruleDustGenerator7).register(MomoTech.getInstance());
        new RuleDustGenerator8(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_DUST_GENERATOR8", Items.MOMOTECH_RULE_DUST_GENERATOR8, RecipeType.ENHANCED_CRAFTING_TABLE, ruleDustGenerator8).register(MomoTech.getInstance());
        new RuleDustGenerator9(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_DUST_GENERATOR9", Items.MOMOTECH_RULE_DUST_GENERATOR9, RecipeType.ENHANCED_CRAFTING_TABLE, ruleDustGenerator9).register(MomoTech.getInstance());
        new RuleMineralGenerator(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_MINERAL_GENERATOR", Items.MOMOTECH_MINERAL_GENERATOR, RecipeType.ANCIENT_ALTAR, ruleMineralGenerator).register(MomoTech.getInstance());
        new RuleMineralBlockGenerator(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_MINERAL_BLOCK_GENERATOR", Items.MOMOTECH_MINERAL_BLOCK_GENERATOR, RecipeType.ANCIENT_ALTAR, ruleMineralBlockGenerator).register(MomoTech.getInstance());
        new Wood(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_WOOD", Items.MOMOTECH_WOOD, RecipeType.ENHANCED_CRAFTING_TABLE, wood).register(MomoTech.getInstance());
        new Plant(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_PLANT", Items.MOMOTECH_PLANT, RecipeType.ENHANCED_CRAFTING_TABLE, plant).register(MomoTech.getInstance());
        new RuleReactor(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_REACTOR", Items.MOMOTECH_RULE_REACTOR, RecipeType.ENHANCED_CRAFTING_TABLE, ruleReactor).register(MomoTech.getInstance());
        new UGenerator(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_U_GENERATOR", Items.MOMOTECH_RULE_U_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, uGenerator).register(MomoTech.getInstance());
        new CREATIVE_GENERATOR(Items.MOMOTECH_INF, "MOMOTECH_RULE_CREATIVE_GENERATOR", Items.MOMOTECH_RULE_CREATIVE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, ruleCreativeGenerator).register(MomoTech.getInstance());
        new RuleReconstruct(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_RECONSTRUCT", Items.MOMOTECH_RULE_RECONSTRUCT, RecipeType.ENHANCED_CRAFTING_TABLE, ruleReconstruct).register(MomoTech.getInstance());
        new EntropyReconstruct(Items.MOMOTECH_INF, "MOMOTECH_ENTROPY_RECONSTRUCT", Items.MOMOTECH_ENTROPY_RECONSTRUCT, RecipeType.ENHANCED_CRAFTING_TABLE, entropyReconstruct).register(MomoTech.getInstance());
        new RuleShineAndDarkConstructor(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_SHINE_AND_DARK_CONSTRUCTOR", Items.MOMOTECH_RULE_SHINE_AND_DARK_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, ruleShineAndDarkConstructor).register(MomoTech.getInstance());
        new FLINT_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_FLINT_GENERATOR", Items.FLINT_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, flintGenerator).register(MomoTech.getInstance());
        new OrdinaryGenerator(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_ORDINARY_GENERATOR", Items.MOMOTECH_ORDINARY_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, ordinaryGenerator).register(MomoTech.getInstance());
        new ShineAndDarkGenerator(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_SHINE_AND_DARK_GENERATOR", Items.MOMOTECH_SHINE_AND_DARK_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, shineAndDarkGenerator).register(MomoTech.getInstance());
        new CHEST_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_CHEST_GENERATOR", Items.CHEST_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, chestGenerator).register(MomoTech.getInstance());
        new DIAMOND_PICKAXE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_DIAMOND_PICKAXE_GENERATOR", Items.DIAMOND_PICKAXE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, diamondPickaxeGenerator).register(MomoTech.getInstance());
        new ShineAndDarkConstructor(Items.MOMOTECH_INF, "MOMOTECH_SHINE_AND_DARK_CONSTRUCTOR", Items.MOMOTECH_SHINE_AND_DARK_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, shineAndDarkConstructor).register(MomoTech.getInstance());
        new Transporter(Items.MOMOTECH_MACHINE, "MOMOTECH_TRANSPORTER", Items.MOMOTECH_TRANSPORTER, RecipeType.ENHANCED_CRAFTING_TABLE, transporter).register(MomoTech.getInstance());
        new OpenBoxItem(Items.MOMOTECH_MACHINE, "MOMOTECH_OPEN_BOX_ITEM", Items.MOMOTECH_OPEN_BOX_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, openBoxItem).register(MomoTech.getInstance());
        new FastGeo(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_FAST_GEO", Items.MOMOTECH_FAST_GEO, RecipeType.ENHANCED_CRAFTING_TABLE, fastGEO).register(MomoTech.getInstance());
        new RuleGeo(Items.MOMOTECH_INF_MACHINE, "MOMOTECH_RULE_GEO", Items.MOMOTECH_RULE_GEO, RecipeType.ENHANCED_CRAFTING_TABLE, ruleGeo).register(MomoTech.getInstance());
        new Magnetize(Items.MOMOTECH_INF, "MOMOTECH_MAGNETIZE", Items.MOMOTECH_MAGNETIZE, RecipeType.ENHANCED_CRAFTING_TABLE, magnetize).register(MomoTech.getInstance());
        new NetheritePickaxeChanger(Items.MOMOTECH_INF, "MOMOTECH_NETHERITE_PICKAXE_CHANGER", Items.MOMOTECH_NETHERITE_PICKAXE_CHANGER, RecipeType.ENHANCED_CRAFTING_TABLE, netheritePickaxeChanger).register(MomoTech.getInstance());
        new Constructor(Items.MOMOTECH_INF, "MOMOTECH_CONSTRUCTOR", Items.MOMOTECH_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, constructor).register(MomoTech.getInstance());
        new MagnetGenerator(Items.MOMOTECH_INF, "MOMOTECH_MAGNET_GENERATOR", Items.MOMOTECH_MAGNET_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, magnetGenerator).register(MomoTech.getInstance());
        new Fixer(Items.MOMOTECH_INF, "MOMOTECH_FIXER", Items.MOMOTECH_FIXER, RecipeType.ANCIENT_ALTAR, fixer).register(MomoTech.getInstance());
        new PumpkinCarver(Items.MOMOTECH_INF, "MOMOTECH_PUMPKIN_CARVER", Items.MOMOTECH_PUMPKIN_CARVER, RecipeType.ENHANCED_CRAFTING_TABLE, pumpkinCarver).register(MomoTech.getInstance());
        new STONE_GENERATOR_II(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_STONE_GENERATOR_II", Items.COBBLE_STONE_GENERATOR_II, RecipeType.ENHANCED_CRAFTING_TABLE, stoneGeneratorII).register(MomoTech.getInstance());
        new FINAL_COBBLESTONE_GENERATOR(Items.MOMOTECH_FINAL, "MOMOTECH_FINAL_C_", Items.FINAL_C_, RecipeType.ENHANCED_CRAFTING_TABLE, finalC).register(MomoTech.getInstance());
        new RandomQuantumGenerator(Items.MOMOTECH_MACHINE, "MOMOTECH_RANDOM_QUANTUM_GENERATOR", Items.MOMOTECH_RANDOM_QUANTUM_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, randomQuantumGenerator).register(MomoTech.getInstance());
        new EnergyQuantumGenerator(Items.MOMOTECH_MACHINE, "MOMOTECH_ENERGY_QUANTUM_GENERATOR", Items.MOMOTECH_ENERGY_QUANTUM_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, energyQuantumGenerator).register(MomoTech.getInstance());
        new CobblestoneGeneratorFinal(Items.MOMOTECH_MACHINE, "MOMOTECH_COBBLESTONE_GENERATOR_FINAL", Items.MOMOTECH_COBBLESTONE_GENERATOR_FINAL, RecipeType.ENHANCED_CRAFTING_TABLE, table).register(MomoTech.getInstance());
        new CobbleStoneStore(Items.MOMOTECH_MACHINE, "MOMOTECH_COBBLESTONE_STORE", Items.MOMOTECH_COBBLE_STONE_STORE, RecipeType.ENHANCED_CRAFTING_TABLE, store).register(MomoTech.getInstance());
        new IDPutter(Items.MOMOTECH_MACHINE, "MOMOTECH_ID_PUTTER", Items.MOMOTECH_ID_PUTTER, RecipeType.ENHANCED_CRAFTING_TABLE, IDPutter).register(MomoTech.getInstance());
        new IDChanger(Items.MOMOTECH_FINAL, "MOMOTECH_ID_CHANGER", Items.MOMOTECH_ID_CHANGER, RecipeType.ENHANCED_CRAFTING_TABLE, IDChanger).register(MomoTech.getInstance());
        new LetterConstructor(Items.MOMOTECH_MACHINE, "MOMOTECH_LETTER_CONSTRUCTOR", Items.MOMOTECH_LETTER_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, letterConstructor).register(MomoTech.getInstance());
        new COMMAND_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_COMMAND_BLOCK_GENERATOR", Items.COMMAND_BLOCK_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, commandBlockGenerator).register(MomoTech.getInstance());
        new C_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_C_GENERATOR", Items.C_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, CGenerator).register(MomoTech.getInstance());
        new BEE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_BEE_GENERATOR", Items.BEE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, beeGenerator).register(MomoTech.getInstance());
        new SPIDER_EYE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_SPIDER_EYE_GENERATOR", Items.SPIDER_EYE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, spiderEyeGenerator).register(MomoTech.getInstance());
        new ICE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_ICE_GENERATOR", Items.ICE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, iceGenerator).register(MomoTech.getInstance());
        new STONES_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_STONES_GENERATOR", Items.STONES_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, stoneChunkGenerator).register(MomoTech.getInstance());
        new LINE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_LINE_GENERATOR", Items.LINE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, lineGenerator).register(MomoTech.getInstance());
        new Generator(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_GENERATOR", Items.Generator, RecipeType.ENHANCED_CRAFTING_TABLE, generator).register(MomoTech.getInstance());
        new DUST_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_DUST_GENERATOR", Items.DUST_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, dustGenerator).register(MomoTech.getInstance());
        new STONE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_STONE_GENERATOR", Items.STONE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, stoneGenerator).register(MomoTech.getInstance());
        new STONE_GENERATOR_I(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_STONE_GENERATOR_I", Items.STONE_GENERATOR_I, RecipeType.ENHANCED_CRAFTING_TABLE, stoneGeneratorI).register(MomoTech.getInstance());
        new FISH_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_FISH_GENERATOR", Items.FISH_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, fishGenerator).register(MomoTech.getInstance());
        new SAND_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_SAND_GENERATOR", Items.SAND_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, sandGenerator).register(MomoTech.getInstance());
        new FROG_LIGHT_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_FROG_LIGHT_GENERATOR", Items.FROG_LIGHT_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, froglightGenerator).register(MomoTech.getInstance());
        new GLASS_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_GLASS_GENERATOR", Items.GLASS_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, glassGenerator).register(MomoTech.getInstance());
        new ORE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_ORE_GENERATOR", Items.ORE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, OREGenerator).register(MomoTech.getInstance());
        new TEMPLATE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_TEMPLATE_GENERATOR", Items.TEMPLATE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, templateGenerator).register(MomoTech.getInstance());
        new CreativeGenerator(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_CREATIVE_GENERATOR", Items.CreativeGenerator, RecipeType.ENHANCED_CRAFTING_TABLE, creativeGenerator).register(MomoTech.getInstance());
        new DigitalConstructor(Items.MOMOTECH_MACHINE, "MOMOTECH_DIGITAL_CONSTRUCTOR", Items.MOMOTECH_DIGITAL_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, digitalConstructor).register(MomoTech.getInstance());
        new SymbolGenerator(Items.MOMOTECH_MACHINE, "MOMOTECH_SYMBOL_GENERATOR", Items.MOMOTECH_SYMBOL_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, symbolGenerator).register(MomoTech.getInstance());
        new Increment(Items.MOMOTECH_MACHINE, "MOMOTECH_INCREMENT", Items.MOMOTECH_INCREMENT, RecipeType.ANCIENT_ALTAR, increment).register(MomoTech.getInstance());
        new OrdinaryNumberCombinator(Items.MOMOTECH_MACHINE, "MOMOTECH_ORDINARY_NUMBER_COMBINATOR", Items.MOMOTECH_ORDINARY_NUMBER_COMBINATOR, RecipeType.ENHANCED_CRAFTING_TABLE, ordinaryNumberCombinator).register(MomoTech.getInstance());
        new EmptyShellGenerator(Items.MOMOTECH_MACHINE, "MOMOTECH_EMPTY_SHELL_GENERATOR", Items.MOMOTECH_EMPTY_SHELL_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, emptyShellGenerator).register(MomoTech.getInstance());
        new EmptyShellGenerator_I(Items.MOMOTECH_MACHINE, "MOMOTECH_EMPTY_SHELL_GENERATOR_I", Items.MOMOTECH_EMPTY_SHELL_GENERATOR_I, RecipeType.ENHANCED_CRAFTING_TABLE, emptyShellGenerator_I).register(MomoTech.getInstance());
        new CreativeItemGenerator(Items.MOMOTECH_MACHINE, "MOMOTECH_CREATIVE_ITEM_GENERATOR", Items.MOMOTECH_CREATIVE_ITEM_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, creativeItemGenerator).register(MomoTech.getInstance());
        new NoneGenerator(Items.MOMOTECH_MACHINE, "MOMOTECH_NONE_GENERATOR", Items.MOMOTECH_NONE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, noneGenerator).register(MomoTech.getInstance());
        new QuantityConstructor(Items.MOMOTECH_MACHINE, "MOMOTECH_QUANTITY_CONSTRUCTOR", Items.MOMOTECH_QUANTITY_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, quantityConstructor).register(MomoTech.getInstance());
        new FinalCopier(Items.MOMOTECH_FINAL, "MOMOTECH_FINAL_COPIER", Items.MOMOTECH_FINAL_COPIER, RecipeType.ENHANCED_CRAFTING_TABLE, finalCopier).register(MomoTech.getInstance());
        new UncontrollableEmptyGenerator(Items.MOMOTECH_FINAL, "MOMOTECH_UNCONTROLLABLE_GENERATOR", Items.MOMOTECH_UNCONTROLLABLE_EMPTY_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, uncontrollableEmptyGenerator).register(MomoTech.getInstance());
        new OreCollector(Items.MOMOTECH_MACHINE, "MOMOTECH_ORE_COLLECTOR", Items.MOMOTECH_ORE_COLLECTOR, RecipeType.MAGIC_WORKBENCH, oreCollector).register(MomoTech.getInstance());
        new RandomCopier(Items.MOMOTECH_FINAL, "MOMOTECH_RANDOM_COPIER", Items.MOMOTECH_RANDOM_COPIER, RecipeType.ENHANCED_CRAFTING_TABLE, randomCopier).register(MomoTech.getInstance());
        new SEA_ITEM_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "MOMOTECH_SEA_ITEM_GENERATOR", Items.SEA_ITEM_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, seaItemGenerator).register(MomoTech.getInstance());
        logger.info("Machine register successfully");
    }
}
