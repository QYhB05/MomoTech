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
        ItemStack[] empty = {null, null, null, null, null, null, null, null, null};
        ItemStack[] digitalConstructor = {
                empty_shell, none_, empty_shell,
                none_, creative_item, none_,
                empty_shell, none_, empty_shell
        };
        ItemStack[] ordinaryNumberCombinator = {
                empty_shell, empty_shell, empty_shell,
                SlimefunItems.BIG_CAPACITOR, creative_item_I, SlimefunItems.BIG_CAPACITOR,
                increment, digital_constructor, increment
        };
        ItemStack[] symbolGenerator = {
                none_, empty_shell, none_,
                empty_shell, creative_item, empty_shell,
                none_, empty_shell, none_,
        };
        ItemStack[] increment = {
                digital_constructor, symbol_addition, digital_constructor,
                SlimefunItems.MAGIC_SUGAR, creative_item, SlimefunItems.MAGIC_SUGAR,
                none_, empty_shell, none_
        };
        ItemStack[] emptyShellGenerator_I = {
                empty_shell_generator, empty_shell_generator, empty_shell_generator,
                empty_shell_generator, none_, empty_shell_generator,
                none_, none_, none_
        };
        ItemStack[] noneGenerator = {
                new ItemStack(Material.DIRT), new ItemStack(Material.DIRT), new ItemStack(Material.DIRT),
                new ItemStack(Material.GLASS), null, new ItemStack(Material.GLASS),
                null, empty_shell, null

        };
        ItemStack[] creativeItemGenerator = {
                new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE), new ItemStack(Material.COBBLESTONE),
                new ItemStack(Material.GLASS), null, new ItemStack(Material.GLASS),
                null, empty_shell, null

        };
        ItemStack[] quantityConstructor = {
                creative_item, empty_shell_generator, creative_item_II,
                qy, null, ch,
                creative_item_generator, uncontrollable_empty, none_generator
        };
        ItemStack[] emptyShellGenerator = {none_, none_, none_, none_, uncontrollable_empty, none_, none_, none_, none_};
        ItemStack[] creativeGenerator = {null, null, quantity_item, null, new ItemStack(Material.COMMAND_BLOCK), null, null, null, null};
        ItemStack[] finalCopier = {final_item, final_star, final_item,
                MomotechItem.increment, random_copier, MomotechItem.increment,
                bug_crystal, quantity_item, bug_crystal
        };
        ItemStack[] uncontrollableEmptyGenerator = {none_, none_, none_,
                bug_crystal, new ItemStack(Material.COMMAND_BLOCK), bug_crystal,
                empty_shell_generator, creative_item_II, empty_shell_generator
        };
        ItemStack[] oreCollector = {
                ch, new ItemStack(Material.COMMAND_BLOCK), ch,
                ch, qy, ch,
                ch, quantity_item, ch
        };
        ItemStack[] randomCopier = {
                bug_crystal, new ItemStack(Material.COMMAND_BLOCK), bug_crystal,
                final_star, final_item, final_star,
                final_star, quantity_item, final_star
        };
        ItemStack[] stoneGenerator = {
                creative_item_I, none_, creative_item,
                empty_shell, new ItemStack(Material.STONE), empty_shell,
                creative_item, empty_shell, creative_item_I,
        };
        ItemStack[] stoneGeneratorI = {
                creative_item_I, none_, creative_item,
                empty_shell, new ItemStack(Material.COBBLESTONE), empty_shell,
                creative_item, none_, creative_item_I,
        };
        ItemStack[] fishGenerator = {
                creative_item_I, none_, creative_item,
                empty_shell, new ItemStack(Material.FISHING_ROD), empty_shell,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] sandGenerator = {
                creative_item_I, none_, creative_item,
                empty_shell, new ItemStack(Material.SAND), empty_shell,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] templateGenerator = {
                creative_item_I, none_, creative_item,
                empty_shell, new ItemStack(Material.DIAMOND), empty_shell,
                creative_item, empty_shell, creative_item_I,
        };
        ItemStack[] OREGenerator = {
                creative_item_I, none_, creative_item,
                none_, new ItemStack(Material.DIAMOND_BLOCK), none_,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] glassGenerator = {
                creative_item_I, none_, creative_item,
                empty_shell, new ItemStack(Material.GLASS), empty_shell,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] froglightGenerator = {
                creative_item_I, none_, creative_item,
                empty_shell, new ItemStack(Material.DIAMOND_SWORD), empty_shell,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] dustGenerator = {
                creative_item_I, uncontrollable_empty, creative_item,
                SlimefunItems.BIG_CAPACITOR, new ItemStack(Material.GRAVEL), SlimefunItems.BIG_CAPACITOR,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] lineGenerator = {
                creative_item_I, none_, creative_item,
                uncontrollable_empty, new ItemStack(Material.STRING), uncontrollable_empty,
                creative_item, none_, creative_item_I,
        };
        ItemStack[] stoneChunkGenerator = {
                creative_item_I, none_, creative_item,
                empty_shell, SlimefunItems.STONE_CHUNK, empty_shell,
                creative_item, uncontrollable_empty, creative_item_I,
        };
        ItemStack[] iceGenerator = {
                creative_item_I, none_, creative_item,
                uncontrollable_empty, new ItemStack(Material.WATER_BUCKET), uncontrollable_empty,
                creative_item, empty_shell, creative_item_I,
        };
        ItemStack[] CGenerator = {
                creative_item_I, none_, creative_item,
                uncontrollable_empty, SlimefunItems.CARBON, uncontrollable_empty,
                creative_item, none_, creative_item_I,
        };
        ItemStack[] commandBlockGenerator = {
                creative_item_II, none_, creative_item_II,
                empty_shell, final_star, empty_shell,
                creative_item_II, none_, creative_item_II,
        };
        ItemStack[] generator = {
                creative_item_I, qy, creative_item,
                empty_shell, empty_shell, empty_shell,
                qy, SlimefunItems.MAGIC_SUGAR, qy
        };
        ItemStack[] spiderEyeGenerator = {
                creative_item_I, none_, creative_item,
                uncontrollable_empty, new ItemStack(Material.SPIDER_EYE), uncontrollable_empty,
                creative_item, none_, creative_item_I,
        };
        ItemStack[] beeGenerator = {
                creative_item_I, none_, creative_item,
                uncontrollable_empty, SlimefunItems.MAGIC_SUGAR, uncontrollable_empty,
                creative_item, none_, creative_item_I,
        };
        ItemStack[] letterConstructor = {
                creative_item_II, creative_item_II, creative_item_II,
                new ItemStack(Material.REPEATING_COMMAND_BLOCK), quantity_item, new ItemStack(Material.CHAIN_COMMAND_BLOCK),
                uncontrollable_empty, uncontrollable_empty, uncontrollable_empty
        };
        ItemStack[] IDPutter = {
                quantity_item, quantity_item, quantity_item,
                qy, new ItemStack(Material.COMMAND_BLOCK), ch,
                creative_item, creative_item_I, creative_item_II
        };
        ItemStack[] IDChanger = {
                quantity_item, final_item, quantity_item,
                creative__, final_item, creative__,
                qy, final_item, qy
        };
        new IDPutter(Items.MOMOTECH_MACHINE, "MOMOTECH_ID_PUTTER", Items.MOMOTECH_ID_PUTTER, RecipeType.ENHANCED_CRAFTING_TABLE, IDPutter).register(MomoTech.getInstance());
        new IDChanger(Items.MOMOTECH_FINAL, "MOMOTECH_ID_CHANGER", Items.MOMOTECH_ID_CHANGER, RecipeType.ENHANCED_CRAFTING_TABLE, IDChanger).register(MomoTech.getInstance());
        new LetterConstructor(Items.MOMOTECH_MACHINE, "MOMOTECH_LETTER_CONSTRUCOTR", Items.MOMOTECH_LETTER_CONSTRUCTOR, RecipeType.ENHANCED_CRAFTING_TABLE, letterConstructor).register(MomoTech.getInstance());
        new COMMAND_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "COMMAND_BLOCK_GENERATOR", Items.COMMAND_BLOCK_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, commandBlockGenerator).register(MomoTech.getInstance());
        new C_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "C_GENERATOR", Items.C_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, CGenerator).register(MomoTech.getInstance());
        new BEE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "BEE_GENERATOR", Items.BEE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, beeGenerator).register(MomoTech.getInstance());
        new SPIDER_EYE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "SPIDER_EYE_GENERATOR", Items.SPIDER_EYE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, spiderEyeGenerator).register(MomoTech.getInstance());
        new ICE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "ICE_GENERATOR", Items.ICE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, iceGenerator).register(MomoTech.getInstance());
        new STONES_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "STONES_GENERATOR", Items.STONES_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, stoneChunkGenerator).register(MomoTech.getInstance());
        new LINE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "LINE_GENERATOR", Items.LINE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, lineGenerator).register(MomoTech.getInstance());
        new Generator(Items.MOMOTECH_MACHINE, "GENERATOR", Items.Generator, RecipeType.ENHANCED_CRAFTING_TABLE, generator).register(MomoTech.getInstance());
        new DUST_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "DUST_GENERATOR", Items.DUST_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, dustGenerator).register(MomoTech.getInstance());
        new STONE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "STONE_GENERATOR", Items.STONE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, stoneGenerator).register(MomoTech.getInstance());
        new STONE_GENERATOR_I(Items.MOMOTECH_ORDINARY_MACHINE, "STONE_GENERATOR_I", Items.STONE_GENERATOR_I, RecipeType.ENHANCED_CRAFTING_TABLE, stoneGeneratorI).register(MomoTech.getInstance());
        new FISH_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "FISH_GENERATOR", Items.FISH_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, fishGenerator).register(MomoTech.getInstance());
        new SAND_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "SAND_GENERATOR", Items.SAND_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, sandGenerator).register(MomoTech.getInstance());
        new FROG_LIGHT_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "FROG_LIGHT_GENERATOR", Items.FROG_LIGHT_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, froglightGenerator).register(MomoTech.getInstance());
        new GLASS_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "GLASS_GENERATOR", Items.GLASS_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, glassGenerator).register(MomoTech.getInstance());
        new ORE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "ORE_GENERATOR", Items.ORE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, OREGenerator).register(MomoTech.getInstance());
        new TEMPLATE_GENERATOR(Items.MOMOTECH_ORDINARY_MACHINE, "TEMPLATE_GENERATOR", Items.TEMPLATE_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, templateGenerator).register(MomoTech.getInstance());
        new CreativeGenerator(Items.MOMOTECH_MACHINE, "MOMOTECH_CREATIVE_GENERATOR", Items.CreativeGenerator, RecipeType.ENHANCED_CRAFTING_TABLE, creativeGenerator).register(MomoTech.getInstance());
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
        logger.info("Machine register successfully");
    }
}
