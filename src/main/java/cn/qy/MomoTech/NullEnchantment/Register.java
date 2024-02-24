package cn.qy.MomoTech.NullEnchantment;

import cn.qy.MomoTech.Items.Machines.IDChanger;
import cn.qy.MomoTech.Items.Machines.LetterConstructor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.lang.reflect.Field;

import static cn.qy.MomoTech.Items.Items.*;

public class Register {

    public static <T> boolean setStaticValue(Class<T> clazz, String field, Object value) {
        try {
            Field declaredField = clazz.getDeclaredField(field);
            declaredField.setAccessible(true);
            declaredField.set((Object) null, value);
            return true;
        } catch (IllegalAccessException | NoSuchFieldException var4) {
            var4.printStackTrace();
            return false;
        }
    }

    public static void add(ItemStack[] it) {
        for (ItemStack it1 : it)
            NullEnchantment.addAndHidden(it1);
    }

    public static void run() {
        setStaticValue(Enchantment.class, "acceptingNew", true);
        Enchantment.registerEnchantment(NullEnchantment.ENCHANTMENT);
        add(new ItemStack[]{QUANTITY_ITEM, FROG_LIGHT_GENERATOR, STONE_GENERATOR, ORE_GENERATOR, SAND_GENERATOR,
                STONE_GENERATOR_I, GLASS_GENERATOR, TEMPLATE_GENERATOR, FISH_GENERATOR, DUST_GENERATOR,
                STONES_GENERATOR, ICE_GENERATOR, Generator, LINE_GENERATOR, COMMAND_BLOCK_GENERATOR, CREATIVE__,
                C_GENERATOR, MOMOTECH_LETTER, MOMOTECH_ID_CARD, MOMOTECH_FINAL_STAR, MOMOTECH_UNCONTROLLABLE_EMPTY,
                MOMOTECH_RANDOM_COPIER, MOMOTECH_FINAL_COPIER, MOMOTECH_ORE_COLLECTOR, MOMOTECH_NONE, MOMOTECH_NUMBER_BUG,
                MOMOTECH_NUMBER_BUG_I, MOMOTECH_NUMBER_BUG_II, MOMOTECH_NUMBER_BUG_III, MOMOTECH_NUMBER_BUG_IV,
                MOMOTECH_NUMBER_BUG_V, MOMOTECH_ORDINARY_NUMBER_COMBINATOR, MOMOTECH_CREATIVE_ITEM_I, MOMOTECH_CREATIVE_ITEM,
                MOMOTECH_CREATIVE_ITEM_II, MOMOTECH_CREATIVE_ITEM_GENERATOR, CREATIVE__, MOMOTECH_BUG_CRYSTAL, MOMOTECH_QUANTITY_CONSTRUCTOR,
                QY, wbx, sky, plugin, BUGGGGG, FULL, DAMAGE_ITEM, PROTECT_ITEM, MOMOTECH_CREATIVE_ITEM_GENERATOR, MOMOTECH_UNCONTROLLABLE_EMPTY,
                MOMOTECH_EMPTY_SHELL_GENERATOR, MOMOTECH_EMPTY_SHELL_GENERATOR_I, MOMOTECH_FINAL_ITEM, BEE_GENERATOR, SPIDER_EYE_GENERATOR, MOMOTECH_UNCONTROLLABLE_EMPTY_GENERATOR,
                MOMOTECH_ENTROPY, MOMOTECH_ENTROPY_STAR, MOMOTECH_QUANTITY_ENTROPY, MOMOTECH_BLACK_HOLE, MOMOTECH_SINGULARITY,
                MOMOTECH_LIGHT_, MOMOTECH_SOUND_, MOMOTECH_TIME_SPACE, MOMOTECH_ID_CHANGER, MOMOTECH_ID_PUTTER, MOMOTECH_LETTER_CONSTRUCTOR,
                MOMOTECH_EMPTY_SHELL, MOMOTECH_SYMBOL_DIVISION, MOMOTECH_SYMBOL_ADDITION, MOMOTECH_SYMBOL_MULTIPLICATION, MOMOTECH_SYMBOL_SUBTRACTION,
                CreativeGenerator, MOMOTECH_ID_GETTER});
    }
}
