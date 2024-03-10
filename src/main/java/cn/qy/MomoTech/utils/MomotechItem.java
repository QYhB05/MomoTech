package cn.qy.MomoTech.utils;

import cn.qy.MomoTech.Items.Items;
import cn.qy.MomoTech.MomoTech;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public class MomotechItem {
    /*public static SlimefunItemStack entropy = new SlimefunItemStack("MOMOTECH_ENTROPY", Items.MOMOTECH_ENTROPY);
    public static SlimefunItemStack entropy_star = new SlimefunItemStack("MOMOTECH_ENTROPY_STAR", Items.MOMOTECH_ENTROPY_STAR);
    public static SlimefunItemStack black_hole = new SlimefunItemStack("MOMOTECH_BLACK_HOLE", Items.MOMOTECH_BLACK_HOLE);
    public static SlimefunItemStack quantity_entropy = new SlimefunItemStack("MOMOTECH_QUANTITY_ENTROPY", Items.MOMOTECH_QUANTITY_ENTROPY);
    public static SlimefunItemStack singularity = new SlimefunItemStack("MOMOTECH_SINGULARITY", Items.MOMOTECH_SINGULARITY);
    public static SlimefunItemStack sound_ = new SlimefunItemStack("MOMOTECH_SOUND_", Items.MOMOTECH_SOUND_);
    public static SlimefunItemStack light_ = new SlimefunItemStack("MOMOTECH_LIGHT_", Items.MOMOTECH_LIGHT_);
    public static SlimefunItemStack space_time = new SlimefunItemStack("MOMOTECH_TIME_SPACE", Items.MOMOTECH_TIME_SPACE);
    */
    public static final SlimefunItemStack[] cobblestone_ = new SlimefunItemStack[100];
    public static final SlimefunItemStack star_ = new SlimefunItemStack("MOMOTECH_STAR_OF_ALL", Items.STAR_OF_ALL);
    public static final SlimefunItemStack quantum_ = new SlimefunItemStack("MOMOTECH_QUANTUM", Items.MOMOTECH_QUANTUM);
    public static final SlimefunItemStack quantum1_ = new SlimefunItemStack("MOMOTECH_QUANTUM1", Items.MOMOTECH_QUANTUM1);
    public static SlimefunItemStack creative__ = new SlimefunItemStack("CREATIVE__", Items.CREATIVE__);
    public static SlimefunItemStack quantity_item = new SlimefunItemStack("QUANTITY_ITEM", Items.QUANTITY_ITEM);
    public static SlimefunItemStack[][] mineral = new SlimefunItemStack[9][5];
    public static SlimefunItemStack none_ = new SlimefunItemStack("MOMOTECH_NONE", Items.MOMOTECH_NONE);
    public static SlimefunItemStack empty_shell = new SlimefunItemStack("MOMOTECH_EMPTY_SHELL", Items.MOMOTECH_EMPTY_SHELL);
    public static SlimefunItemStack digital_constructor = new SlimefunItemStack("MOMOTECH_DIGITAL_CONSTRUCTOR", Items.MOMOTECH_DIGITAL_CONSTRUCTOR);
    public static SlimefunItemStack symbol_addition = new SlimefunItemStack("MOMOTECH_SYMBOL_ADDITION", Items.MOMOTECH_SYMBOL_ADDITION);
    public static SlimefunItemStack symbol_division = new SlimefunItemStack("MOMOTECH_SYMBOL_DIVISION", Items.MOMOTECH_SYMBOL_DIVISION);
    public static SlimefunItemStack symbol_subtraction = new SlimefunItemStack("MOMOTECH_SYMBOL_SUBTRACTION", Items.MOMOTECH_SYMBOL_SUBTRACTION);
    public static SlimefunItemStack symbol_multiplication = new SlimefunItemStack("MOMOTECH_SYMBOL_ADDITION", Items.MOMOTECH_SYMBOL_MULTIPLICATION);
    public static SlimefunItemStack bug1 = new SlimefunItemStack("MOMOTECH_NUMBER_BUG_I", Items.MOMOTECH_NUMBER_BUG_I);
    public static SlimefunItemStack bug2 = new SlimefunItemStack("MOMOTECH_NUMBER_BUG_II", Items.MOMOTECH_NUMBER_BUG_II);
    public static SlimefunItemStack bug3 = new SlimefunItemStack("MOMOTECH_NUMBER_BUG_III", Items.MOMOTECH_NUMBER_BUG_III);
    public static SlimefunItemStack bug4 = new SlimefunItemStack("MOMOTECH_NUMBER_BUG_IV", Items.MOMOTECH_NUMBER_BUG_IV);
    public static SlimefunItemStack bug5 = new SlimefunItemStack("MOMOTECH_NUMBER_BUG_V", Items.MOMOTECH_NUMBER_BUG_V);
    public static SlimefunItemStack bug = new SlimefunItemStack("MOMOTECH_NUMBER_BUG", Items.MOMOTECH_NUMBER_BUG);
    public static SlimefunItemStack increment = new SlimefunItemStack("MOMOTECH_INCREMENT", Items.MOMOTECH_INCREMENT);
    public static SlimefunItemStack symbol_generator = new SlimefunItemStack("MOMOTECH_SYMBOL_GENERATOR", Items.MOMOTECH_SYMBOL_GENERATOR);
    public static SlimefunItemStack empty_shell_generator = new SlimefunItemStack("MOMOTECH_EMPTY_SHELL_GENERATOR", Items.MOMOTECH_EMPTY_SHELL_GENERATOR);
    public static SlimefunItemStack ordinary_number_combinator = new SlimefunItemStack("MOMOTECH_ORDINARY_NUMBER_COMBINATOR", Items.MOMOTECH_ORDINARY_NUMBER_COMBINATOR);
    public static SlimefunItemStack qy = new SlimefunItemStack("QY", Items.QY);
    public static SlimefunItemStack ch = new SlimefunItemStack("CH", Items.wbx);
    public static SlimefunItemStack bugggg = new SlimefunItemStack("BUGGGG", Items.BUGGGGG);
    public static SlimefunItemStack creative_item_generator = new SlimefunItemStack("MOMOTECH_CREATIVE_ITEM_GENERATOR", Items.MOMOTECH_CREATIVE_ITEM_GENERATOR);
    public static SlimefunItemStack creative_item = new SlimefunItemStack("MOMOTECH_CREATIVE", Items.MOMOTECH_CREATIVE_ITEM);
    public static SlimefunItemStack creative_item_I = new SlimefunItemStack("MOMOTECH_CREATIVE_I", Items.MOMOTECH_CREATIVE_ITEM_I);
    public static SlimefunItemStack creative_item_II = new SlimefunItemStack("MOMOTECH_CREATIVE_II", Items.MOMOTECH_CREATIVE_ITEM_II);
    public static SlimefunItemStack quantity_constructor = new SlimefunItemStack("MOMOTECH_QUANTITY_CONSTRUCTOR", Items.MOMOTECH_QUANTITY_CONSTRUCTOR);
    public static SlimefunItemStack bug_crystal = new SlimefunItemStack("MOMOTECH_BUG_CRYSTAL", Items.MOMOTECH_BUG_CRYSTAL);
    public static SlimefunItemStack none_generator = new SlimefunItemStack("MOMOTECH_NONE_GENERATOR", Items.MOMOTECH_NONE_GENERATOR);
    public static SlimefunItemStack uncontrollable_empty = new SlimefunItemStack("MOMOTECH_UNCONTROLLABLE_EMPTY_", Items.MOMOTECH_UNCONTROLLABLE_EMPTY);
    public static SlimefunItemStack box_of_quantum = new SlimefunItemStack("MOMOTECH_BOX_OF_QUANTUM", Items.MOMOTECH_BOX_OF_QUANTUM);
    public static SlimefunItemStack random_copier = new SlimefunItemStack("MOMOTECH_RANDOM_COPIER", Items.MOMOTECH_RANDOM_COPIER);
    public static SlimefunItemStack letter_constructor = new SlimefunItemStack("MOMOTECH_LETTER_CONSTRUCTOR", Items.MOMOTECH_LETTER_CONSTRUCTOR);
    public static SlimefunItemStack letter = new SlimefunItemStack("MOMOTECH_LETTER", Items.MOMOTECH_LETTER);
    public static SlimefunItemStack ID_card = new SlimefunItemStack("MOMOTECH_ID_CARD", Items.MOMOTECH_ID_CARD);
    public static SlimefunItemStack final_star = new SlimefunItemStack("MOMOTECH_FINAL_STAR", Items.MOMOTECH_FINAL_STAR);
    public static SlimefunItemStack final_item = new SlimefunItemStack("MOMOTECH_FINAL_ITEM", Items.MOMOTECH_FINAL_ITEM);

    static {
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 3; ++j) {
                mineral[i][j] = new SlimefunItemStack("MOMOTECH_MINERAL_" + Utils.mineral__[i] + "_" + Utils.id[j], Items.Mineral[i][j]);
            }
        }
        for (int i = 0; i < 100; ++i) {
            cobblestone_[i] = new SlimefunItemStack("MOMOTECH_COBBLESTONE" + i, Items.Cobblestone[i]);
        }
    }

    public static SlimefunItemStack digital(double i) {
        return new SlimefunItemStack("MOMOTECH_DIGITAL", Items.MOMOTECH_DIGITAL, "§f数字组件", "§f" + i);
    }

}
