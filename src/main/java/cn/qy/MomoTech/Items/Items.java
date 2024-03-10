package cn.qy.MomoTech.Items;

import cn.qy.MomoTech.Group.MultiGroup;
import cn.qy.MomoTech.Group.SubGroup;
import cn.qy.MomoTech.MomoTech;
import cn.qy.MomoTech.NullEnchantment.Register;
import cn.qy.MomoTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Items {
    public static ItemStack QUANTITY_ITEM = new CustomItemStack(Material.PURPLE_DYE, "&c&l量化插件", "&6一个材料而已");
    public static ItemStack FROG_LIGHT_GENERATOR = new CustomItemStack(Material.OCHRE_FROGLIGHT, "&e蛙鸣灯生成器", "&7随机生成一种蛙鸣灯", "&7效率:4x");
    public static ItemStack STONE_GENERATOR = new CustomItemStack(Material.STONE, "&e石质生成器", "&7自动化生产三废石/圆石/深板岩圆石", "&7效率:8x");
    public static ItemStack ORE_GENERATOR = new CustomItemStack(Material.DIAMOND_ORE, "&e原矿生成器", "&7自动化生产各种原矿", "&7效率:1x");
    public static ItemStack SAND_GENERATOR = new CustomItemStack(Material.SANDSTONE, "&e沙质生成器", "&7自动化红沙/沙子/砂砾/灵魂沙", "&7效率:8x");
    public static ItemStack STONE_GENERATOR_I = new CustomItemStack(Material.COBBLESTONE, "&e定向圆石生成器", "&7自动化生产圆石", "&7效率:8x");
    public static ItemStack GLASS_GENERATOR = new CustomItemStack(Material.GLASS, "&e定向玻璃生成器", "&7自动化生产玻璃", "&7效率:8x");
    public static ItemStack TEMPLATE_GENERATOR = new CustomItemStack(Material.MELON, "&e模板生成器", "&7随机生成高版本的模板", "&7效率:1x");
    public static ItemStack FISH_GENERATOR = new CustomItemStack(Material.SEA_LANTERN, "&e自动捕鱼器", "&7随机生成各种鱼", "&7效率1x");
    public static ItemStack DUST_GENERATOR = new CustomItemStack(Material.SAND, "&e矿粉生成器", "&7随机生产各种矿粉", "&7效率2x");
    public static ItemStack STONES_GENERATOR = new CustomItemStack(Material.SNOW_BLOCK, "&6石块&e生成器", "&7自动化生产石块", "&7效率8x");
    public static ItemStack ICE_GENERATOR = new CustomItemStack(Material.BLUE_ICE, "&e冰生成器", "&7自动化生产冰", "&7效率:1x");
    public static ItemStack Generator = new CustomItemStack(Material.ORANGE_CONCRETE_POWDER, "&e发电机", "§8⇨ §e⚡ §76,000 J/s");
    public static ItemStack LINE_GENERATOR = new CustomItemStack(Material.GRAY_WOOL, "&e线生成器", "&7自动化生产线", "&7效率:3x");
    public static ItemStack COMMAND_BLOCK_GENERATOR = new CustomItemStack(Material.POLISHED_BLACKSTONE, "&b&l命令方块生成器", "&7&l什么?命令方块???", "&7效率:1x");
    public static ItemStack C_GENERATOR = new CustomItemStack(Material.COAL_BLOCK, "&e碳生成器", "&7这下前期碳解决了！", "&7效率:1x");
    public static ItemStack CREATIVE__ = new CustomItemStack(Material.GLASS_PANE, "&6纯净的始源", "&6终极,才刚开始");
    public static ItemStack COMMAND_BLOCK_GETTER = new CustomItemStack(Material.BARRIER, "&6&l仿制品 &7- &6&l命&c&l令&a&l方&e&l块");
    public static ItemStack MOMOTECH_DIGITAL = new CustomItemStack(SlimefunUtils.getCustomHead("80c4528e622bd318720d38e0e4599e69bf23308f89693920e0e4ecb55d1c0bac"), "§f数字组件", "§f0.0");
    public static ItemStack MOMOTECH_LETTER = new CustomItemStack(Material.SUGAR, "&6符号", "&fa", "&7凭空制造物质的基础");
    public static ItemStack MOMOTECH_ID_CARD = new CustomItemStack(Material.PAPER, "&eID卡", "&fID:", "&7在&cID集成器&7添加符号集成Slimefun ID", "&7合法ID可以在 &f制造台 &7中直接制作对应ID的粘液物品");
    public static ItemStack MOMOTECH_ID_PUTTER = new CustomItemStack(Material.BOOKSHELF, "&cID集成器", "&7在此给ID卡添加字符", "&7左边插入ID卡, 右边插入符号", "&7&l请确保ID卡堆叠数量为1");
    public static ItemStack MOMOTECH_LETTER_CONSTRUCTOR = new CustomItemStack(Material.BEEHIVE, "&c符号集成器", "&7输入&b&l原始物质α&7,&6&l原始物质β&7,中间插入&l空&7以随机合成一个符号", "&7符号包含下划线/字母/数字");
    public static ItemStack MOMOTECH_FINAL_STAR = new CustomItemStack(Material.HONEYCOMB, "&c&l终&e&l极&b&l之&b&l心", "&7凝聚于此");
    public static ItemStack MOMOTECH_ID_CHANGER = new CustomItemStack(Material.GLASS, "&f&l制造台", "&7&l插入合法ID卡,根据ID直接读取输出粘液物品");
    public static ItemStack MOMOTECH_UNCONTROLLABLE_EMPTY_GENERATOR = new CustomItemStack(Material.DEEPSLATE_LAPIS_ORE, "&f不可控空 生成器", "&7作为后期不可控空的量产基地..", "&7速率:64x");
    public static ItemStack MOMOTECH_RANDOM_COPIER = new CustomItemStack(Material.DEEPSLATE_EMERALD_ORE, "&6&l随机型复刻鸡", "&7在交互槽位上方填满物品,左下角输入槽中插入&6&l原始物质γ&7", "&7消耗&6&l原始物质γ&7并随机复制交互槽上方的一种物品", "&7使用限制:交互槽上方槽位中没有物品的堆叠数量相同,并且不存在相同物品", "&b成功率:5%");
    public static ItemStack MOMOTECH_FINAL_COPIER = new CustomItemStack(Material.DEEPSLATE_GOLD_ORE, "&6&l复刻鸡 - 终极", "&c整合粒子!", "&7中间放入目标物品,左边放入&a量&e子&6盒&7立马复制出一个目标物品");
    public static ItemStack MOMOTECH_EXP = new CustomItemStack(Material.EXPERIENCE_BOTTLE, "&6经验 经验 更多经验", "&7扔出后经验立马提升30级");
    public static ItemStack MOMOTECH_FINAL_ITEM = new CustomItemStack(Material.GRASS, "&7&l熵 &f- &6&l夸克", "&7虚无中汲取的复杂描述量-熵", "&7来自各种物质震碎而成的粒子-夸克", "&8&l无处不在", "&8&l终极-史诗物品");
    public static ItemStack BEE_GENERATOR = new CustomItemStack(Material.BEE_NEST, "&6&l蜜蜂生成器!", "&7自动化生产各种蜜蜂相关的物品", "&7效率:1x");
    public static ItemStack SPIDER_EYE_GENERATOR = new CustomItemStack(Material.SPAWNER, "&7&l蜘蛛眼&f生成器", "&7自动化生产蜘蛛眼,或许在至尊中用得上", "&7效率:2x");
    public static ItemStack MOMOTECH_ORE_COLLECTOR = new CustomItemStack(Material.DEEPSLATE_COAL_ORE, "&e锵锵~ 自动化压缩矿物!", "&7随机生成某种叁重压缩矿物");
    public static ItemStack MOMOTECH_EMPTY_SHELL = new CustomItemStack(Material.STRUCTURE_VOID, "§7空", "&f我真的不理解为什么这玩意是重要材料!", "§f§lNULL");
    public static ItemStack MOMOTECH_SYMBOL_ADDITION = new CustomItemStack(Material.BLAZE_POWDER, "§a符号 +", "§f+");
    public static ItemStack MOMOTECH_SYMBOL_SUBTRACTION = new CustomItemStack(Material.BLAZE_POWDER, "§a符号 -", "§f-");
    public static ItemStack MOMOTECH_SYMBOL_MULTIPLICATION = new CustomItemStack(Material.BLAZE_POWDER, "§a符号 x", "§f*");
    public static ItemStack MOMOTECH_SYMBOL_DIVISION = new CustomItemStack(Material.BLAZE_POWDER, "§a符号 ÷", "§f/");
    public static ItemStack MOMOTECH_NONE = new CustomItemStack(new ItemStack(Material.BLACK_WOOL), "§8§lNONE", "§0一片虚无");
    public static ItemStack MOMOTECH_NUMBER_BUG = new CustomItemStack(new ItemStack(Material.WHITE_STAINED_GLASS_PANE), "§7§lB§k1§8U§f§l§k一§7G §e- §a运算式", "&7&lBUG物质");
    public static ItemStack MOMOTECH_NUMBER_BUG_I = new CustomItemStack(new ItemStack(Material.RED_STAINED_GLASS_PANE), "§7§lB§k1§8U§f§l§k一§7G §e- §a小数", "&7&lBUG物质");
    public static ItemStack MOMOTECH_NUMBER_BUG_II = new CustomItemStack(new ItemStack(Material.ORANGE_STAINED_GLASS_PANE), "§7§lB§k1§8U§f§l§k一§7G §e- §a日期", "&7&lBUG物质");
    public static ItemStack MOMOTECH_NUMBER_BUG_III = new CustomItemStack(new ItemStack(Material.YELLOW_STAINED_GLASS_PANE), "§7§lB§k1§8U§f§l§k一§7G §e- §a正过载", "&7&lBUG物质");
    public static ItemStack MOMOTECH_NUMBER_BUG_IV = new CustomItemStack(new ItemStack(Material.GREEN_STAINED_GLASS_PANE), "§7§lB§k1§8U§f§l§k一§7G §e- §a负过载", "&7&lBUG物质");
    public static ItemStack MOMOTECH_NUMBER_BUG_V = new CustomItemStack(new ItemStack(Material.BLUE_STAINED_GLASS_PANE), "§7§lB§k1§8U§f§l§k一§7G §e- §a系统", "&7&lBUG物质");
    public static ItemStack MOMOTECH_DIGITAL_CONSTRUCTOR = new CustomItemStack(SlimefunUtils.getCustomHead("f26dad74b2bab105cb68c94eb3be32f5dbda42eab944b6ed9e803136f8f619bc"), "§f数字构造器", "§7将 §l空 §7转换成数字组件", "&8似乎只能生产一些基础数字...", "§8⇨ §e⚡ §7100,000 J/t");
    public static ItemStack MOMOTECH_SYMBOL_GENERATOR = new CustomItemStack(SlimefunUtils.getCustomHead("f26dad74b2bab105cb68c94eb3be32f5dbda42eab944b6ed9e803136f8f619bc"), "§f符号生成器", "§7从 §l空 §7中生成符号", "§8⇨ §e⚡ §7100,000 J/t");
    public static ItemStack MOMOTECH_INCREMENT = new CustomItemStack(new ItemStack(Material.CREEPER_HEAD), "§f递增器", "§7输入两个 §l数字组件 §7进行加法运算");
    public static ItemStack MOMOTECH_ORDINARY_NUMBER_COMBINATOR = new CustomItemStack(new ItemStack(Material.SOUL_LANTERN), "§f基础计算器", "§7输入 §l数字组件 §7和 §l运算符(仅限四则运算) §7进行运算");
    public static ItemStack MOMOTECH_EMPTY_SHELL_GENERATOR = new CustomItemStack(Material.BLACK_CONCRETE_POWDER, "§7空生成器", "§7在左边放入任意物品后转换成空", "&7唔...终于做出来了...解放双手!", "&6效率:8x");
    public static ItemStack MOMOTECH_EMPTY_SHELL_GENERATOR_I = new CustomItemStack(Material.WHITE_CONCRETE_POWDER, "&7&l空生成器加强版", "&7无需输入, 生产更多的空!", "&6效率:64x");
    public static ItemStack MOMOTECH_CREATIVE_ITEM = new CustomItemStack(Material.END_CRYSTAL, "&b&l原始物质α", "&7似乎有着大用处, 但好像只是个基础材料...");
    public static ItemStack MOMOTECH_CREATIVE_ITEM_I = new CustomItemStack(Material.END_CRYSTAL, "&e&l原始物质β", "&7似乎有着大用处, 但好像只是个基础材料...");
    public static ItemStack MOMOTECH_CREATIVE_ITEM_GENERATOR = new CustomItemStack(Material.COBBLESTONE, "&f&l原始物质制造器", "&7当容器输入槽每一行的物品数量上 &f单调递增 &7输出一个原始物质β", "&7当容器内每一行的物品数量上 &f单调递减 &7输出一个原始物质α", "&8怎么有点乱序的影子...");
    public static ItemStack MOMOTECH_UNCONTROLLABLE_EMPTY = new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, "§8§l§k123&f&l不可控空");
    public static ItemStack CreativeGenerator = new CustomItemStack(new ItemStack(Material.BLACK_WOOL), "§e发癫鸡", "§8⇨ §e⚡ §799,999,999 J/s");
    public static ItemStack MOMOTECH_NONE_GENERATOR = new CustomItemStack(new ItemStack(Material.DIRT), "&8&lNONE &f制造器", "&7当容器输入槽物品种类与堆叠数量均完全不同时生成一个&8&lNONE", "&7前期很好的&8&lNONE&7来源...");
    public static ItemStack MOMOTECH_CREATIVE_ITEM_II = new CustomItemStack(Material.END_CRYSTAL, "&6&l原始物质γ", "&7更进一步...");
    public static ItemStack MOMOTECH_QUANTITY_CONSTRUCTOR = new CustomItemStack(Material.HONEY_BLOCK, "&f&l量化构造器", "&b填满特定物品进行量化获取材料!", "&c&l所有填满指的是每一个格子上都填这64堆叠的物品");
    public static ItemStack MOMOTECH_BUG_CRYSTAL = new CustomItemStack(Material.NETHER_STAR, "&e&l来自BUG的结晶");
    public static ItemStack QY = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), "&6&lQYhB05", "&7BUG制造者...", "&7编写了大部分本附属的屎山代码, 是附属创始者之一", "&7业余的代码爱好者");
    public static ItemStack wbx = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), "&e&lChenmose", "&7可爱捏~", "&7提供了一些主意, 是附属创始者之一", "&8&l我是不会告诉你他前期之后摆烂了");
    public static ItemStack sky = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), "&a&lskybule", "&7提供了有趣的想法并帮忙进行了测试", "&7对作者提供了很大程度的帮助和支持!");
    public static ItemStack plugin = new CustomItemStack(new ItemStack(Material.PAPER), "&f&l本附属名为MomoTech, 也可被成为乱码科技!", "&b这是一个开源项目, 感谢您的支持, 如需魔改或发现bug请联系作者", "&b本附属所有机器非注明用电的机器均不消耗电力(但是未注明的机器本身都会存储1J)", "&c&l所有机器只有在输出槽有空位时才会工作", "&6&l讨论QQ群聊:827684043");
    public static ItemStack BUGGGGG = new CustomItemStack(new ItemStack(Material.ENDER_CHEST), "&f&lBUGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", "&8作者只是初中业余代码爱好者, 请不要喷我们, 欢迎您来QQ提出意见");
    public static ItemStack FULL = new CustomItemStack(new ItemStack(Material.EGG), "&6&l饱和护符", "&b总是饿?前期做不起别的?用我!", "&b右键后消耗并立马获得饱和效果");
    public static ItemStack DAMAGE_ITEM = new CustomItemStack(new ItemStack(Material.CHAIN_COMMAND_BLOCK), "&6&l奇怪的东西(?", "&e&l一击必杀!直接抹除!");
    public static ItemStack[][] Mineral = new ItemStack[9][5];
    public static ItemStack STONE_SWORD = new CustomItemStack(Material.DIAMOND_SWORD, "&7&l勝利誓約之劍", "&8石中剑...", "&8可以造成巨量伤害");
    public static ItemStack FINAL_C_ = new CustomItemStack(Material.COBBLESTONE, "&6&l100重压缩圆石生成器", "&7&l正确的, 你没听错", "&f谁知道呢 或许有点用处呢");
    public static ItemStack MOMOTECH_ENTROPY = new CustomItemStack(Material.CHARCOAL, "&7&l熵化构件", "在熵化核心周围16格内挖掘任意方块有一定概率掉落");
    public static ItemStack MOMOTECH_ENTROPY_STAR = new CustomItemStack(Material.COAL_BLOCK, "&7&l熵化核心", "&7熵增定律", "&7不可控的结果...", "&7范围8格内方块每tick将被随机打乱");
    public static ItemStack MOMOTECH_BLACK_HOLE = new CustomItemStack(Material.BLACK_WOOL, "&7&l黑洞", "&7视界范围内生物(除携带原谅帽的玩家)将会受到伤害, 方块将被吞噬", "&7视界范围:16格");
    public static ItemStack MOMOTECH_QUANTITY_ENTROPY = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7&l量化的熵", "&7稳定, 非常稳定");
    public static ItemStack MOMOTECH_SINGULARITY = new CustomItemStack(Material.HEART_OF_THE_SEA, "&7&l黑洞核心", "&7&l再次量化, 稳定且微小");
    public static ItemStack MOMOTECH_SOUND_ = new CustomItemStack(Material.SLIME_BALL, "&7&l声学武器(这个物品还没完成!)", "&7&l右键使用", "&7给予周围8格内玩家反胃与失明效果");
    public static ItemStack MOMOTECH_LIGHT_ = new CustomItemStack(Material.STICK, "&7&l光学武器", "&7对攻击玩家造成总血量的75%的伤害, 并给予失明效果(无视护甲)(无法击破原谅帽)", "&7对于普通实体则直接抹除");
    public static ItemStack MOMOTECH_TIME_SPACE = new CustomItemStack(Material.GLASS, "&f&l时空碎片", "&7物理学结晶", "&7材料");
    public static ItemStack PROTECT_ITEM = new CustomItemStack(new ItemStack(Material.TURTLE_HELMET), "&e&l原谅帽", "&a戴在头上免疫实体攻击!(不包括燃烧摔落等)", "&7别问为啥是绿的");
    public static ItemStack STAR_OF_ALL = new CustomItemStack(Material.HEART_OF_THE_SEA, "&e&l一体机核心", "&6&l用于合成本附属绝大部分的一体机");
    public static ItemStack MOMOTECH_COBBLE_STONE_STORE = new CustomItemStack(Material.GLASS, "&6石质储存", "&7提供48格的存储空间", "&7圆石也能做箱子了 好耶");
    public static ItemStack MOMOTECH_COBBLESTONE_GENERATOR_FINAL = new CustomItemStack(Material.SLIME_BLOCK, "&f&l逆熵刷石机", "&71tick生产48组, 就是这么高产!");
    public static ItemStack MOMOTECH_QUANTUM = new CustomItemStack(Material.SNOWBALL, "&e量&6子");
    public static ItemStack MOMOTECH_QUANTUM1 = new CustomItemStack(Material.MAGMA_CREAM, "&a纠&b缠&e量&6子", "&f随量子而纠缠的粒子, 右键貌似也会发生一些不好的事情", "&f用于高精密的高速通讯机器");
    public static ItemStack MOMOTECH_BOX_OF_QUANTUM = new CustomItemStack(Material.CHEST, "&a量&e子&6盒", "&7稳定下来的量子, 在机器中利用量子储存物品", "&f右键利用量子打开末影箱");
    public static ItemStack MOMOTECH_SILK_TOUCH_PICKAXE = new CustomItemStack(Material.NETHERITE_PICKAXE, "&b纠&6缠&e量&6子&c镐", "&f特殊的工具");
    public static ItemStack MOMOTECH_PICKAXE = new CustomItemStack(Material.NETHERITE_PICKAXE, "&e量&6子&c镐", "&f特殊的工具", "&e逮虾户&f速度加快(右键加速)");
    public static ItemStack MOMOTECH_CLEAR = new CustomItemStack(Material.NETHERITE_INGOT, "&6&l量子清除器", "&7&l帮你清除掉你身上存在的属性类效果(主要针对量子物品的效果)");
    public static ItemGroup MOMOTECH_ITEM;
    public static ItemGroup MOMOTECH_FINAL;
    public static ItemGroup MOMOTECH;
    public static ItemGroup MOMOTECH_MACHINE;
    public static ItemGroup MOMOTECH_MINERAL;
    public static ItemGroup MOMOTECH_ORDINARY_MACHINE;
    public static ItemGroup MOMOTECH_THANKING;
    public static ItemGroup MOMOTECH_TOOL;
    public static ItemGroup MOMOTECH__;

    public static ItemGroup MOMOTECH_PHYSICS;
    public static ItemStack[] Cobblestone = new ItemStack[100];

    static {

        String[][] name = {{"壹重压缩钻石", "贰重压缩钻石", "叁重压缩钻石", "肆重压缩钻石", "伍重压缩钻石"},
                {"壹重压缩下届合金", "贰重压缩下届合金", "叁重压缩下届合金", "肆重压缩下届合金", "伍重压缩下届合金"},
                {"壹重压缩煤炭", "贰重压缩煤炭", "叁重压缩煤炭", "肆重压缩煤炭", "伍重压缩煤炭"},
                {"壹重压缩绿宝石", "贰重压缩绿宝石", "叁重压缩绿宝石", "肆重压缩绿宝石", "伍重压缩绿宝石"},
                {"壹重压缩钻石", "贰重压缩石英", "叁重压缩石英", "肆重压缩石英", "伍重压缩石英"},
                {"壹重压缩钻石", "贰重压缩红石", "叁重压缩红石", "肆重压缩红石", "伍重压缩红石"},
                {"壹重压缩铁", "贰重压缩铁", "叁重压缩铁", "肆重压缩铁", "伍重压缩铁"},
                {"壹重压缩金", "贰重压缩金", "叁重压缩金", "肆重压缩金", "伍重压缩金"},
                {"壹重压缩青金石", "贰重压缩青金石", "叁重压缩青金石", "肆重压缩青金石", "伍重压缩青金石"}};
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 3; ++j) {
                Mineral[i][j] = new CustomItemStack(Utils.it[i], "&f" + name[i][j], "§7挤压矿物产生的精华...");
            }
        }
        for (int i = 0; i < 100; i++) {
            Cobblestone[i] = new CustomItemStack(Material.COBBLESTONE, "&c> &f" + (i + 1) + "重压缩圆石", "&7不用怀疑, 材料而已", "&7实际上并不是所有的都用的上, 主要用于娱乐");
        }
        ItemStack[] GROUP = {new CustomItemStack(Material.PAPER, "&c&l注意", "&b&l附属机器非注明不需要电力", "&b&l所有机器只有在输出槽有空位的时候才会工作"),
                new CustomItemStack(Material.SOUL_CAMPFIRE, "&l基础生产型机器"), new CustomItemStack(Material.IRON_INGOT, "§l基础物品"),
                new CustomItemStack(Material.DIAMOND, "§l工具"), new CustomItemStack(Material.REPEATING_COMMAND_BLOCK, "§b§l§k; §3§l终§1§l极§9§l物§d§l品 §5§l§k;"),
                new CustomItemStack(Material.BLACK_CONCRETE_POWDER, "§8§l基础机器"), new CustomItemStack(Material.GOLD_BLOCK, "§6§l压缩材料"),
                new CustomItemStack(Material.ENCHANTED_BOOK, "&e&l鸣谢 &8- &a&l特殊材料"), new CustomItemStack(Material.CHAIN_COMMAND_BLOCK, "§e§l§k陌陌 §a§l科技 §7(代码编写者:QYhB05)"),
                new CustomItemStack(Material.BLAZE_POWDER, "&a&l拓展 - 物理工程(待完善)")};
        Register.add(GROUP);
        MOMOTECH__ = new SubGroup("MOMOTECH__", GROUP[0]);
        MOMOTECH_ORDINARY_MACHINE = new SubGroup("MOMOTECH_ORDINARY_MACHINE", GROUP[1]);
        MOMOTECH_ITEM = new SubGroup("MOMOTECH_ITEM", GROUP[2]);
        MOMOTECH_TOOL = new SubGroup("MOMOTECH_TOOL", GROUP[3]);
        MOMOTECH_FINAL = new SubGroup("MOMOTECH_FINAL", GROUP[4]);
        MOMOTECH_MACHINE = new SubGroup("MOMOTECH_MACHINE", GROUP[5]);
        MOMOTECH_MINERAL = new SubGroup("MOMOTECH_MINERAL", GROUP[6]);
        MOMOTECH_THANKING = new SubGroup("MOMOTECH_THANKING", GROUP[7]);
        MOMOTECH_PHYSICS = new SubGroup("MOMOTECH_PHYSICS", GROUP[9]);
        MOMOTECH = new MultiGroup("MOMOTECH", GROUP[8], MOMOTECH__, MOMOTECH_THANKING, MOMOTECH_ITEM, MOMOTECH_MINERAL, MOMOTECH_TOOL, MOMOTECH_ORDINARY_MACHINE, MOMOTECH_MACHINE, MOMOTECH_FINAL, MOMOTECH_PHYSICS);
        MOMOTECH.register(MomoTech.getInstance());
    }
}
