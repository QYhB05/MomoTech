package cn.qy.MomoTech.tasks;

import cn.qy.MomoTech.Items.EasyGenerator.*;
import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.Items.Machines.*;
import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.utils.MomotechItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

import static cn.qy.MomoTech.utils.MomotechItem.*;

public class MachineRegisterTask {
    public static void run(@NotNull Logger logger) {
        ItemStack[] digitalConstructor = {
                empty_shell, box_of_quantum, empty_shell,
                quantum_, creative_item, quantum_,
                empty_shell, quantum1_, empty_shell
        };
        ItemStack[] ordinaryNumberCombinator = {
                quantum_, box_of_quantum, quantum1_,
                SlimefunItems.BIG_CAPACITOR, creative_item_I, SlimefunItems.BIG_CAPACITOR,
                increment, digital_constructor, increment
        };
        ItemStack[] symbolGenerator = {
                none_, box_of_quantum, none_,
                quantum1_, creative_item, quantum1_,
                none_, quantum_, none_,
        };
        ItemStack[] increment = {
                none_, symbol_addition, none_,
                SlimefunItems.MAGIC_SUGAR, creative_item, SlimefunItems.MAGIC_SUGAR,
                uncontrollable_empty, uncontrollable_empty, uncontrollable_empty
        };
        ItemStack[] emptyShellGenerator_I = {
                empty_shell_generator, box_of_quantum, empty_shell_generator,
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
                creative_item, box_of_quantum, creative_item_I,
                qy, quantum1_, ch,
                creative_item_generator, uncontrollable_empty, none_generator
        };
        ItemStack[] emptyShellGenerator = {
                none_, box_of_quantum, none_,
                none_, uncontrollable_empty, none_,
                none_, none_, none_
        };
        ItemStack[] creativeGenerator = {
                box_of_quantum, cobblestone_[3], quantity_item,
                none_, new ItemStack(Material.COMMAND_BLOCK), none_,
                infinity, uncontrollable_empty, infinity
        };
        ItemStack[] finalCopier = {
                final_item, final_star, final_item,
                MomotechItem.increment, random_copier, MomotechItem.increment,
                final_item, quantity_item, final_item
        };
        ItemStack[] uncontrollableEmptyGenerator = {
                box_of_quantum, quantity_item, box_of_quantum,
                bug_crystal, final_item, bug_crystal,
                empty_shell_generator, creative_item_II, empty_shell_generator
        };
        ItemStack[] oreCollector = {
                ch, final_star, ch,
                star_, box_of_quantum, star_,
                ch, quantity_item, ch
        };
        ItemStack[] randomCopier = {
                bug_crystal, new ItemStack(Material.COMMAND_BLOCK), bug_crystal,
                final_star, quantity_item, final_star,
                final_item, final_item, final_item
        };
        ItemStack[] stoneGeneratorII = {cobblestone_generator, cobblestone_generator, cobblestone_generator, cobblestone_generator, null, cobblestone_generator, cobblestone_generator, cobblestone_generator, cobblestone_generator};
        ItemStack[] stoneGenerator = {
                creative_item_I, new ItemStack(Material.IRON_PICKAXE), creative_item,
                uncontrollable_empty, new ItemStack(Material.STONE), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] stoneGeneratorI = {
                creative_item_I, new ItemStack(Material.DIAMOND_PICKAXE), creative_item,
                uncontrollable_empty, new ItemStack(Material.COBBLESTONE), uncontrollable_empty,
                creative_item, new ItemStack(Material.IRON_PICKAXE), creative_item_I,
        };
        ItemStack[] fishGenerator = {
                creative_item_I, star_, creative_item,
                uncontrollable_empty, new ItemStack(Material.FISHING_ROD), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] sandGenerator = {
                creative_item_I, SlimefunItems.LARGE_CAPACITOR, creative_item,
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
                uncontrollable_empty, new ItemStack(Material.DIAMOND_BLOCK), uncontrollable_empty,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] glassGenerator = {
                creative_item_I, SlimefunItems.LARGE_CAPACITOR, creative_item,
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
                creative_item, uncontrollable_empty, creative_item_I,
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
                empty_shell, commandBlock, empty_shell,
                creative_item_II, star_, creative_item_II,
        };
        ItemStack[] generator = {
                creative_item_I, box_of_quantum, creative_item,
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
                infinity, infinity, infinity,
                qy, box_of_quantum, ch,
                infinity, SlimefunItems.GEO_MINER, infinity
        };
        ItemStack[] transporter = {
                uncontrollable_empty, null, uncontrollable_empty,
                null, new ItemStack(Material.PISTON), null,
                uncontrollable_empty, null, uncontrollable_empty
        };
        ItemStack[] openBoxItem = {
                box_of_quantum, empty_shell, box_of_quantum,
                empty_shell, empty_shell, empty_shell,
                none_, none_, none_
        };
        ItemStack[] constructor = {
                uncontrollable_empty, real_magnet, uncontrollable_empty,
                qy, box_of_quantum, ch,
                electricity_magnet, electricity_magnet, electricity_magnet
        };
        ItemStack[] magnetize = {
                SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRO_MAGNET, SlimefunItems.ELECTRIC_MOTOR,
                electricity_magnet, electricity_magnet, electricity_magnet,
                none_, uncontrollable_empty, none_
        };
        ItemStack[] magnetGenerator = {
                uncontrollable_empty, box_of_quantum, uncontrollable_empty,
                uncontrollable_empty, quantity_item, uncontrollable_empty,
                uncontrollable_empty, box_of_quantum, uncontrollable_empty
        };
        ItemStack[] shineAndDarkGenerator = {
                shine1, shine1, shine1,
                dark1, dark1, dark1,
                uncontrollable_empty, uncontrollable_empty, uncontrollable_empty
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
                creative_item_II, box_of_quantum, creative_item_II,
                new ItemStack(Material.REPEATING_COMMAND_BLOCK), quantity_item, new ItemStack(Material.CHAIN_COMMAND_BLOCK),
                uncontrollable_empty, box_of_quantum, uncontrollable_empty
        };
        ItemStack[] IDPutter = {
                quantity_item, quantity_item, quantity_item,
                box_of_quantum, new ItemStack(Material.COMMAND_BLOCK), box_of_quantum,
                creative_item, creative_item_I, creative_item_II
        };
        ItemStack[] IDChanger = {
                quantity_item, final_item, quantity_item,
                final_item, final_item, final_item,
                box_of_quantum, final_item, box_of_quantum
        };
        ItemStack[] store = {
                new ItemStack(Material.COBBLESTONE), empty_shell, new ItemStack(Material.COBBLESTONE),
                empty_shell, null, empty_shell,
                new ItemStack(Material.COBBLESTONE), empty_shell, new ItemStack(Material.COBBLESTONE)
        };
        ItemStack[] table = {
                quantum1_, quantity_item, quantum1_,
                creative_item_II, cobblestone_[7], creative_item_II,
                box_of_quantum, bugggg, box_of_quantum
        };
        ItemStack[] finalC = {
                box_of_quantum, box_of_quantum, box_of_quantum,
                cobblestone_[9], cobblestone_[19], cobblestone_[9],
                none_, new ItemStack(Material.COMMAND_BLOCK), none_
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
        new OrdinaryGenerator(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_ORDINARY_GENERATOR", Items.MOMOTECH_ORDINARY_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, ordinaryGenerator).register(MomoTech.getInstance());
        new ShineAndDarkGenerator(Items.MOMOTECH_ELECTRICITY, "MOMOTECH_SHINE_AND_DARK_GENERATOR", Items.MOMOTECH_SHINE_AND_DARK_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, shineAndDarkGenerator).register(MomoTech.getInstance());
        new CHEST_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "CHEST_GENERATOR", Items.CHEST_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, chestGenerator).register(MomoTech.getInstance());
        new DIAMOND_PICKAXE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "DIAMOND_PICKAXE_GENERATOR", Items.DIAMOND_PICKAXE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, diamondPickaxeGenerator).register(MomoTech.getInstance());
        new ShineAndDarkConstructor(Items.MOMOTECH_INF, "MOMOTECH_SHINE_AND_DARK_CONSTRUCTOR", Items.MOMOTECH_SHINE_AND_DARK_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, shineAndDarkConstructor).register(MomoTech.getInstance());
        new Transporter(Items.MOMOTECH_MACHINE, "MOMOTECH_TRANSPORTER", Items.MOMOTECH_TRANSPORTER, RecipeType.ENHANCED_CRAFTING_TABLE, transporter).register(MomoTech.getInstance());
        new OpenBoxItem(Items.MOMOTECH_MACHINE, "MOMOTECH_OPEN_BOX_ITEM", Items.MOMOTECH_OPEN_BOX_ITEM, RecipeType.ENHANCED_CRAFTING_TABLE, openBoxItem).register(MomoTech.getInstance());
        new FastGeo(Items.MOMOTECH_INF, "MOMOTECH_FAST_GEO", Items.MOMOTECH_FAST_GEO, RecipeType.ENHANCED_CRAFTING_TABLE, fastGEO).register(MomoTech.getInstance());
        new Magnetize(Items.MOMOTECH_INF, "MOMOTECH_MAGNETIZE", Items.MOMOTECH_MAGNETIZE, RecipeType.ENHANCED_CRAFTING_TABLE, magnetize).register(MomoTech.getInstance());
        new NetheritePickaxeChanger(Items.MOMOTECH_INF, "MOMOTECH_NETHERITE_PICKAXE_CHANGER", Items.MOMOTECH_NETHERITE_PICKAXE_CHANGER, RecipeType.ENHANCED_CRAFTING_TABLE, netheritePickaxeChanger).register(MomoTech.getInstance());
        new Constructor(Items.MOMOTECH_INF, "MOMOTECH_CONSTRUCTOR", Items.MOMOTECH_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, constructor).register(MomoTech.getInstance());
        new MagnetGenerator(Items.MOMOTECH_INF, "MOMOTECH_MAGNET_GENERATOR", Items.MOMOTECH_MAGNET_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, magnetGenerator).register(MomoTech.getInstance());
        new Fixer(Items.MOMOTECH_INF, "MOMOTECH_FIXER", Items.MOMOTECH_FIXER, RecipeType.ANCIENT_ALTAR, fixer).register(MomoTech.getInstance());
        new PumpkinCarver(Items.MOMOTECH_INF, "MOMOTECH_PUMPKIN_CARVER", Items.MOMOTECH_PUMPKIN_CARVER, RecipeType.ENHANCED_CRAFTING_TABLE, pumpkinCarver).register(MomoTech.getInstance());
        new STONE_GENERATOR_II(Items.MOMOTECH_ORDINARY_MACHINE, "STONE_GENERATOR_II", Items.COBBLE_STONE_GENERATOR_II, RecipeType.ENHANCED_CRAFTING_TABLE, stoneGeneratorII).register(MomoTech.getInstance());
        new FINAL_COBBLESTONE_GENERATOR(Items.MOMOTECH_FINAL, "FINAL_C_", Items.FINAL_C_, RecipeType.ENHANCED_CRAFTING_TABLE, finalC).register(MomoTech.getInstance());
        new CobblestoneGeneratorFinal(Items.MOMOTECH_MACHINE, "MOMOTECH_COBBLESTONE_GENERATOR_FINAL", Items.MOMOTECH_COBBLESTONE_GENERATOR_FINAL, RecipeType.ENHANCED_CRAFTING_TABLE, table).register(MomoTech.getInstance());
        new CobbleStoneStore(Items.MOMOTECH_MACHINE, "MOMOTECH_COBBLESTONE_STORE", Items.MOMOTECH_COBBLE_STONE_STORE, RecipeType.ENHANCED_CRAFTING_TABLE, store).register(MomoTech.getInstance());
        new IDPutter(Items.MOMOTECH_MACHINE, "MOMOTECH_ID_PUTTER", Items.MOMOTECH_ID_PUTTER, RecipeType.ENHANCED_CRAFTING_TABLE, IDPutter).register(MomoTech.getInstance());
        new IDChanger(Items.MOMOTECH_FINAL, "MOMOTECH_ID_CHANGER", Items.MOMOTECH_ID_CHANGER, RecipeType.ENHANCED_CRAFTING_TABLE, IDChanger).register(MomoTech.getInstance());
        new LetterConstructor(Items.MOMOTECH_MACHINE, "MOMOTECH_LETTER_CONSTRUCTOR", Items.MOMOTECH_LETTER_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, letterConstructor).register(MomoTech.getInstance());
        new COMMAND_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "COMMAND_BLOCK_GENERATOR", Items.COMMAND_BLOCK_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, commandBlockGenerator).register(MomoTech.getInstance());
        new C_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "C_GENERATOR", Items.C_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, CGenerator).register(MomoTech.getInstance());
        new BEE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "BEE_GENERATOR", Items.BEE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, beeGenerator).register(MomoTech.getInstance());
        new SPIDER_EYE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "SPIDER_EYE_GENERATOR", Items.SPIDER_EYE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, spiderEyeGenerator).register(MomoTech.getInstance());
        new ICE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "ICE_GENERATOR", Items.ICE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, iceGenerator).register(MomoTech.getInstance());
        new STONES_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "STONES_GENERATOR", Items.STONES_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, stoneChunkGenerator).register(MomoTech.getInstance());
        new LINE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "LINE_GENERATOR", Items.LINE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, lineGenerator).register(MomoTech.getInstance());
        new Generator(Items.MOMOTECH_ELECTRICITY, "GENERATOR", Items.Generator, RecipeType.ENHANCED_CRAFTING_TABLE, generator).register(MomoTech.getInstance());
        new DUST_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "DUST_GENERATOR", Items.DUST_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, dustGenerator).register(MomoTech.getInstance());
        new STONE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "STONE_GENERATOR", Items.STONE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, stoneGenerator).register(MomoTech.getInstance());
        new STONE_GENERATOR_I(Items.MOMOTECH_ORDINARY_MACHINE, "STONE_GENERATOR_I", Items.STONE_GENERATOR_I, RecipeType.ENHANCED_CRAFTING_TABLE, stoneGeneratorI).register(MomoTech.getInstance());
        new FISH_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "FISH_GENERATOR", Items.FISH_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, fishGenerator).register(MomoTech.getInstance());
        new SAND_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "SAND_GENERATOR", Items.SAND_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, sandGenerator).register(MomoTech.getInstance());
        new FROG_LIGHT_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "FROG_LIGHT_GENERATOR", Items.FROG_LIGHT_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, froglightGenerator).register(MomoTech.getInstance());
        new GLASS_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "GLASS_GENERATOR", Items.GLASS_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, glassGenerator).register(MomoTech.getInstance());
        new ORE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "ORE_GENERATOR", Items.ORE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, OREGenerator).register(MomoTech.getInstance());
        new TEMPLATE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "TEMPLATE_GENERATOR", Items.TEMPLATE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, templateGenerator).register(MomoTech.getInstance());
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
        new SEA_ITEM_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "SEA_ITEM_GENERATOR", Items.SEA_ITEM_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, seaItemGenerator).register(MomoTech.getInstance());
        logger.info("Machine register successfully");
    }
}
