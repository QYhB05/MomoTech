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
    public static ItemStack STONE_GENERATOR = new CustomItemStack(Material.STONE, "&e石质&f生成器", "&7自动化生产三废石/圆石/深板岩圆石", "&7效率:8x");
    public static ItemStack ORE_GENERATOR = new CustomItemStack(Material.DIAMOND_ORE, "&e原矿&f生成器", "&7自动化生产各种原矿", "&7效率:1x");
    public static ItemStack SAND_GENERATOR = new CustomItemStack(Material.SANDSTONE, "&e沙质&f生成器", "&7自动化红沙/沙子/砂砾/灵魂沙", "&7效率:8x");
    public static ItemStack STONE_GENERATOR_I = new CustomItemStack(Material.COBBLESTONE, "&e定向圆石&f生成器", "&7自动化生产圆石", "&7效率:8x");
    public static ItemStack GLASS_GENERATOR = new CustomItemStack(Material.GLASS, "&e定向玻璃&f生成器", "&7自动化生产玻璃", "&7效率:8x");
    public static ItemStack TEMPLATE_GENERATOR = new CustomItemStack(Material.MELON, "&e模板&f生成器", "&7随机生成高版本的模板", "&7效率:1x");
    public static ItemStack FISH_GENERATOR = new CustomItemStack(Material.SEA_LANTERN, "&e自动捕鱼器", "&7随机生成各种鱼", "&7效率1x");
    public static ItemStack DUST_GENERATOR = new CustomItemStack(Material.SAND, "&e矿粉&f生成器", "&7随机生产各种矿粉", "&7效率6x");
    public static ItemStack STONES_GENERATOR = new CustomItemStack(Material.SNOW_BLOCK, "&6石块&f生成器", "&7自动化生产石块", "&7效率8x");
    public static ItemStack ICE_GENERATOR = new CustomItemStack(Material.BLUE_ICE, "&e冰&f生成器", "&7自动化生产冰", "&7效率:1x");
    public static ItemStack Generator = new CustomItemStack(Material.ORANGE_CONCRETE_POWDER, "&e发电机", "§8⇨ §e⚡ §76,000 J/t");
    public static ItemStack LINE_GENERATOR = new CustomItemStack(Material.GRAY_WOOL, "&e线&f生成器", "&7自动化生产线", "&7效率:3x");
    public static ItemStack COMMAND_BLOCK_GENERATOR = new CustomItemStack(Material.POLISHED_BLACKSTONE, "&b&l命令方块生成器", "&7&l什么?命令方块???", "&7效率:1x");
    public static ItemStack C_GENERATOR = new CustomItemStack(Material.COAL_BLOCK, "&e碳&f生成器", "&7这下前期碳解决了！", "&7效率:1x");
    public static ItemStack CREATIVE__ = new CustomItemStack(Material.GLASS_PANE, "&6纯净的始源", "&6终极,才刚开始");
    public static ItemStack COMMAND_BLOCK_GETTER = new CustomItemStack(Material.COMMAND_BLOCK, "&6&l仿制品 &7- &6&l命&c&l令&a&l方&e&l块");
    public static ItemStack COBBLE_STONE_GENERATOR_II = new CustomItemStack(Material.SNOW_BLOCK, "&b&l压缩圆石生成器", "&7效率:64x");
    public static ItemStack MOMOTECH_DIGITAL = new CustomItemStack(SlimefunUtils.getCustomHead("80c4528e622bd318720d38e0e4599e69bf23308f89693920e0e4ecb55d1c0bac"), "§f数字组件", "§f0.0");
    public static ItemStack MOMOTECH_LETTER = new CustomItemStack(Material.SUGAR, "&6符号", "&fa", "&7凭空制造物质的基础");
    public static ItemStack MOMOTECH_ID_CARD = new CustomItemStack(Material.PAPER, "&eID卡", "&fID:", "&7在&cID集成器&7添加符号集成Slimefun ID", "&7合法ID可以在 &f制造台 &7中直接制作对应ID的粘液物品");
    public static ItemStack MOMOTECH_ID_PUTTER = new CustomItemStack(Material.BOOKSHELF, "&cID集成器", "&7在此给ID卡添加字符");
    public static ItemStack MOMOTECH_LETTER_CONSTRUCTOR = new CustomItemStack(Material.BEEHIVE, "&c符号集成器");
    public static ItemStack MOMOTECH_FINAL_STAR = new CustomItemStack(Material.HONEYCOMB, "&c&l终&e&l极&b&l之&b&l心", "&7凝聚于此");
    public static ItemStack MOMOTECH_ID_CHANGER = new CustomItemStack(Material.GLASS, "&f&l制造台", "&7&l插入合法ID卡,根据ID直接读取输出粘液物品");
    public static ItemStack MOMOTECH_UNCONTROLLABLE_EMPTY_GENERATOR = new CustomItemStack(Material.DEEPSLATE_LAPIS_ORE, "&f不可控空 生成器", "&7作为后期不可控空的量产基地..", "&7速率:8x");
    public static ItemStack MOMOTECH_RANDOM_COPIER = new CustomItemStack(Material.DEEPSLATE_EMERALD_ORE, "&6&l随机型复刻鸡");
    public static ItemStack MOMOTECH_FINAL_COPIER = new CustomItemStack(Material.DEEPSLATE_GOLD_ORE, "&6&l复刻鸡 - 终极", "&c整合粒子!");
    public static ItemStack MOMOTECH_EXP = new CustomItemStack(Material.EXPERIENCE_BOTTLE, "&6经验 经验 更多经验", "&7扔出后经验立马提升30级");
    public static ItemStack MOMOTECH_FINAL_ITEM = new CustomItemStack(Material.GRASS, "&7&l乱码核心", "&8&l无处不在", "&8&l终极-史诗物品");
    public static ItemStack SEA_ITEM_GENERATOR = new CustomItemStack(Material.PRISMARINE, "&b&l海晶&f生成器", "&7自动化生产海晶物品", "&7效率:8x");
    public static ItemStack BEE_GENERATOR = new CustomItemStack(Material.BEE_NEST, "&6&l蜜蜂&f生成器", "&7自动化生产各种蜜蜂相关的物品", "&7效率:1x");
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
    public static ItemStack MOMOTECH_INCREMENT = new CustomItemStack(new ItemStack(Material.CREEPER_HEAD), "§f递增器");
    public static ItemStack MOMOTECH_ORDINARY_NUMBER_COMBINATOR = new CustomItemStack(Material.SKELETON_SKULL, "§f基础计算器");
    public static ItemStack MOMOTECH_EMPTY_SHELL_GENERATOR = new CustomItemStack(Material.BLACK_CONCRETE_POWDER, "§7空&f生成器", "&7唔...终于做出来了...解放双手!", "&6效率:8x");
    public static ItemStack MOMOTECH_EMPTY_SHELL_GENERATOR_I = new CustomItemStack(Material.WHITE_CONCRETE_POWDER, "&7&l空生成器加强版", "&7无需输入, 生产更多的空!", "&6效率:64x");
    public static ItemStack MOMOTECH_CREATIVE_ITEM = new CustomItemStack(Material.END_CRYSTAL, "&b&l原始物质α", "&7似乎有着大用处, 但好像只是个基础材料...");
    public static ItemStack MOMOTECH_CREATIVE_ITEM_I = new CustomItemStack(Material.END_CRYSTAL, "&e&l原始物质β", "&7似乎有着大用处, 但好像只是个基础材料...");
    public static ItemStack MOMOTECH_CREATIVE_ITEM_GENERATOR = new CustomItemStack(Material.COBBLESTONE, "&f&l原始物质制造器");
    public static ItemStack MOMOTECH_UNCONTROLLABLE_EMPTY = new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, "§8§l§k123&f&l不可控空");
    public static ItemStack CreativeGenerator = new CustomItemStack(new ItemStack(Material.BLACK_WOOL), "§e发癫鸡", "§8⇨ §e⚡ §799,999,999 J/t");
    public static ItemStack MOMOTECH_NONE_GENERATOR = new CustomItemStack(new ItemStack(Material.DIRT), "&8&lNONE &f制造器", "&7前期很好的&8&lNONE&7来源...");
    public static ItemStack MOMOTECH_CREATIVE_ITEM_II = new CustomItemStack(Material.END_CRYSTAL, "&6&l原始物质γ", "&7更进一步...");
    public static ItemStack MOMOTECH_QUANTITY_CONSTRUCTOR = new CustomItemStack(Material.HONEY_BLOCK, "&f&l量化构造器");
    public static ItemStack MOMOTECH_BUG_CRYSTAL = new CustomItemStack(Material.NETHER_STAR, "&c&lBUG水晶", "&e&l来自BUG的结晶");
    public static ItemStack QY = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), "&6&lQYhB05", "&7BUG制造者...", "&7编写了大部分本附属的屎山代码, 是附属创始者之一", "&7业余的代码爱好者");
    public static ItemStack wbx = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), "&e&lChenmose", "&7可爱捏~", "&7提供了一些主意, 是附属创始者之一", "&8&l我是不会告诉你他前期之后摆烂了");
    public static ItemStack sky = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), "&a&lskybule", "&7提供了有趣的想法并帮忙进行了测试", "&7对作者提供了很大程度的帮助和支持!");
    public static ItemStack plugin = new CustomItemStack(new ItemStack(Material.PAPER), "&f&l本附属名为MomoTech, 也可被成为乱码科技!", "&b这是一个开源项目, 感谢您的支持, 如需魔改或发现bug请联系作者", "&6&l讨论QQ群聊:827684043");
    public static ItemStack BUGGGGG = new CustomItemStack(new ItemStack(Material.ENDER_CHEST), "&f&lBUGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", "&8作者只是初中业余代码爱好者, 请不要喷我们, 欢迎您来QQ提出意见");
    public static ItemStack ELSE_ = new CustomItemStack(Material.PAPER, "&f特性:电力反制", "&7电力机器在无输入的时候会判定成failed并且持续消耗电力");
    public static ItemStack ELSE_1 = new CustomItemStack(Material.PAPER, "&f特性:无电力", "&7所有非注明用电的机器均不消耗电力(但机器本身都会存储1J)");
    public static ItemStack ELSE_2 = new CustomItemStack(Material.PAPER, "&f特性:槽位反制", "&7所有机器只有在输出槽有空位时才会工作");
    public static ItemStack FULL = new CustomItemStack(new ItemStack(Material.EGG), "&6&l饱和护符", "&b总是饿?前期做不起别的?用我!", "&b右键后消耗并立马获得饱和效果");
    public static ItemStack DAMAGE_ITEM = new CustomItemStack(new ItemStack(Material.CHAIN_COMMAND_BLOCK), "&6&l奇怪的东西(?", "&e&l一击必杀!直接抹除!");
    public static ItemStack[][] Mineral = new ItemStack[9][5];
    public static ItemStack STONE_SWORD = new CustomItemStack(Material.DIAMOND_SWORD, "&7&l勝利誓約之劍", "&8石中剑...", "&8可以造成巨量伤害(伤害+999999999999.99)");
    public static ItemStack FINAL_C_ = new CustomItemStack(Material.COBBLESTONE, "&6&l50重压缩圆石生成器", "&7&l正确的, 你没听错", "&f谁知道呢 或许有点用处呢", "&7效率:8x");
    public static ItemStack PROTECT_ITEM = new CustomItemStack(new ItemStack(Material.TURTLE_HELMET), "&e&l原谅帽", "&a戴在头上免疫实体攻击!(不包括燃烧摔落等)", "&7别问为啥是绿的");
    public static ItemStack STAR_OF_ALL = new CustomItemStack(Material.HEART_OF_THE_SEA, "&e&l一体机核心", "&6&l用于合成本附属绝大部分的一体机");
    public static ItemStack MOMOTECH_COBBLE_STONE_STORE = new CustomItemStack(Material.GLASS, "&6石质储存", "&7提供48格的存储空间", "&7圆石也能做箱子了 好耶");
    public static ItemStack MOMOTECH_COBBLESTONE_GENERATOR_FINAL = new CustomItemStack(Material.SLIME_BLOCK, "&f&l逆熵刷石机", "&71tick生产48组, 就是这么高产!");
    public static ItemStack MOMOTECH_QUANTUM = new CustomItemStack(Material.SNOWBALL, "&e量&6子", "&f在高处右键貌似会发生一些不好的事情");
    public static ItemStack MOMOTECH_QUANTUM1 = new CustomItemStack(Material.MAGMA_CREAM, "&a纠&b缠&e量&6子", "&f随量子而纠缠的粒子, 右键貌似也会发生一些不好的事情", "&f用于高精密的高速通讯机器");
    public static ItemStack MOMOTECH_BOX_OF_QUANTUM = new CustomItemStack(Material.CHEST, "&a量&e子&6盒", "&7稳定下来的量子, 在机器中利用量子储存物品", "&f右键利用量子打开末影箱");
    public static ItemStack MOMOTECH_SILK_TOUCH_PICKAXE = new CustomItemStack(Material.NETHERITE_PICKAXE, "&b纠&6缠&e量&6子&c镐", "&f特殊的工具");
    public static ItemStack MOMOTECH_PICKAXE = new CustomItemStack(Material.NETHERITE_PICKAXE, "&e量&6子&c镐", "&f特殊的工具", "&e逮虾户&f速度加快(右键加速)");
    public static ItemStack MOMOTECH_PUMPKIN_CARVER = new CustomItemStack(Material.CARVED_PUMPKIN, "&e南瓜光速雕刻机", "&f可以帮你自动雕刻南瓜", "&7效率:INFINITY");
    public static ItemStack MOMOTECH_CLEAR = new CustomItemStack(Material.NETHERITE_INGOT, "&6&l量子清除器", "&7&l帮你清除掉你身上存在的属性类效果(主要针对量子物品的效果)");
    public static ItemStack MOMOTECH_FIXER = new CustomItemStack(Material.IRON_BLOCK, "&f装备修理器", "&7帮你自动修复装备");
    public static ItemStack MOMOTECH_TRANSPORTER = new CustomItemStack(Material.PISTON, "&a传送器");
    public static ItemStack CHEST_GENERATOR = new CustomItemStack(Material.JUNGLE_LOG, "&6箱子&f生成器", "&7效率:1x");
    public static ItemStack MOMOTECH_OPEN_BOX_ITEM = new CustomItemStack(Material.PURPLE_STAINED_GLASS, "&e开盒器", "&7开盒!", "&7可以拆解量子盒, 但是只有纠缠量子可以被保留下来...");
    public static ItemStack MOMOTECH_SHINE = new CustomItemStack(Material.GLOWSTONE_DUST, "&f光");
    public static ItemStack MOMOTECH_DARK = new CustomItemStack(Material.GUNPOWDER, "&8暗");
    public static ItemStack MOMOTECH_SHINE_AND_DARK_CONSTRUCTOR = new CustomItemStack(Material.GLOWSTONE, "&f&l光暗收集器", "§8⇨ §e⚡ §7500 J/t");
    public static ItemStack MOMOTECH_SHINE_AND_DARK_GENERATOR = new CustomItemStack(Material.REDSTONE_LAMP, "&c光暗发电机", "&7从光暗中汲取能量...", "§8⇨ §e⚡ §720,000 J/t");
    public static ItemStack MOMOTECH_SHINE1 = new CustomItemStack(Material.GLOWSTONE_DUST, "&f&l光因子");
    public static ItemStack MOMOTECH_DARK1 = new CustomItemStack(Material.GUNPOWDER, "&8&l暗因子");
    public static ItemStack MOMOTECH_NETHERITE_PICKAXE_CHANGER = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7&l下届合金镐转换器", "§8⇨ §e⚡ §7100 J/t");
    public static ItemStack DIAMOND_PICKAXE_GENERATOR = new CustomItemStack(Material.DIAMOND_BLOCK, "&b钻石镐&f生成器", "&7效率:8x");
    public static ItemStack MOMOTECH_CONSTRUCTOR = new CustomItemStack(Material.CHISELED_POLISHED_BLACKSTONE, "&f凝聚者", "&7凝聚精华于一体", "§8⇨ §e⚡ §7900 J/t");
    public static ItemStack MOMOTECH_DIAMOND = new CustomItemStack(Material.DIAMOND, "&6矿物精华 &f- &b钻石");
    public static ItemStack MOMOTECH_IRON = new CustomItemStack(Material.IRON_INGOT, "&6矿物精华 &f- &b铁");
    public static ItemStack MOMOTECH_GOLD = new CustomItemStack(Material.GOLD_INGOT, "&6矿物精华 &f- &b金");
    public static ItemStack MOMOTECH_QUARTZ = new CustomItemStack(Material.QUARTZ, "&6矿物精华 &f- &b石英");
    public static ItemStack MOMOTECH_EMERALD = new CustomItemStack(Material.EMERALD, "&6矿物精华 &f- &b绿宝石");
    public static ItemStack MOMOTECH_REDSTONE = new CustomItemStack(Material.REDSTONE, "&6矿物精华 &f- &b红石");
    public static ItemStack MOMOTECH_LAPIS = new CustomItemStack(Material.LAPIS_LAZULI, "&6矿物精华 &f- &b青金石");
    public static ItemStack MOMOTECH_COAL = new CustomItemStack(Material.COAL, "&6矿物精华 &f- &b煤炭");
    public static ItemStack MOMOTECH_Cu = new CustomItemStack(Material.BRICK, "&6金属精华 &f- &b铜");
    public static ItemStack MOMOTECH_Pb = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b铅");
    public static ItemStack MOMOTECH_Mg = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b镁");
    public static ItemStack MOMOTECH_Au = new CustomItemStack(Material.GOLD_INGOT, "&6金属精华 &f- &b金");
    public static ItemStack MOMOTECH_Al = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b铝");
    public static ItemStack MOMOTECH_Sn = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b锡");
    public static ItemStack MOMOTECH_Zn = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b锌");
    public static ItemStack MOMOTECH_Ag = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b银");
    public static ItemStack MOMOTECH_DIAMOND1 = new CustomItemStack(Material.DIAMOND, "&6矿物核心 &f- &b钻石");
    public static ItemStack MOMOTECH_IRON1 = new CustomItemStack(Material.IRON_INGOT, "&6矿物核心 &f- &b铁");
    public static ItemStack MOMOTECH_GOLD1 = new CustomItemStack(Material.GOLD_INGOT, "&6矿物核心 &f- &b金");
    public static ItemStack MOMOTECH_QUARTZ1 = new CustomItemStack(Material.QUARTZ, "&6矿物核心 &f- &b石英");
    public static ItemStack MOMOTECH_EMERALD1 = new CustomItemStack(Material.EMERALD, "&6矿物核心 &f- &b绿宝石");
    public static ItemStack MOMOTECH_REDSTONE1 = new CustomItemStack(Material.REDSTONE, "&6矿物核心 &f- &b红石");
    public static ItemStack MOMOTECH_LAPIS1 = new CustomItemStack(Material.LAPIS_LAZULI, "&6矿物核心 &f- &b青金石");
    public static ItemStack MOMOTECH_COAL1 = new CustomItemStack(Material.COAL, "&6矿物核心 &f- &b煤炭");
    public static ItemStack MOMOTECH_Cu1 = new CustomItemStack(Material.BRICK, "&6金属核心 &f- &b铜");
    public static ItemStack MOMOTECH_Pb1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b铅");
    public static ItemStack MOMOTECH_Mg1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b镁");
    public static ItemStack MOMOTECH_Au1 = new CustomItemStack(Material.GOLD_INGOT, "&6金属核心 &f- &b金");
    public static ItemStack MOMOTECH_Al1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b铝");
    public static ItemStack MOMOTECH_Sn1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b锡");
    public static ItemStack MOMOTECH_Zn1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b锌");
    public static ItemStack MOMOTECH_Ag1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b银");
    public static ItemStack MOMOTECH_REAL_MAGNET = new CustomItemStack(Material.IRON_BLOCK, "&e这才是合理的磁铁!");
    public static ItemStack MOMOTECH_ELECTRICITY_MAGNET = new CustomItemStack(Material.GOLD_BLOCK, "&e这才是合理的电磁铁!");
    public static ItemStack MOMOTECH_IRON_STAR = new CustomItemStack(Material.GLASS_BOTTLE, "&f&l铁芯");
    public static ItemStack MOMOTECH_COIL = new CustomItemStack(Material.STRING, "&e线圈");
    public static ItemStack MOMOTECH_MAGNETIZE = new CustomItemStack(Material.IRON_BLOCK, "&b磁化机", "&7这才是更加合理的磁铁制作方式!", "§8⇨ §e⚡ §7200 J/t");
    public static ItemStack MOMOTECH_MAGNET_GENERATOR = new CustomItemStack(Material.WHITE_STAINED_GLASS, "&6能源电力电磁铁一体机", "§8⇨ §e⚡ §7500 J/t");
    public static ItemStack MOMOTECH_INFINITY = new CustomItemStack(Material.NETHERITE_SCRAP, "&c规&e则&b锭");
    public static ItemStack MOMOTECH_FAST_GEO = new CustomItemStack(Material.NETHERITE_BLOCK, "&6高速化地理资源开采器", "§8⇨ §e⚡ §710,000 J/t");
    public static ItemStack MOMOTECH_ORDINARY_GENERATOR = new CustomItemStack(Material.GLASS, "&8&l基础发电机", "§8⇨ §e⚡ §7500 J/t");
    public static ItemStack MOMOTECH_MINERAL_ = new CustomItemStack(Material.NETHERITE_INGOT, "&6矿物核心");
    public static ItemStack MOMOTECH_METAL_ = new CustomItemStack(Material.IRON_INGOT, "&e金属核心");
    public static ItemStack FLINT_GENERATOR = new CustomItemStack(Material.DEEPSLATE_GOLD_ORE, "&6燧石&f生成器", "&7效率:4x");
    public static ItemStack MOMOTECH_RULE_STAR = new CustomItemStack(Material.IRON_NUGGET, "&c时&6隙");
    public static ItemStack MOMOTECH_RULE_SHINE_AND_DARK_CONSTRUCTOR = new CustomItemStack(Material.GLOWSTONE, "&f&l规则化光暗收集器", "&7大大提升了概率...", "§8⇨ §e⚡ §75,000 J/t");
    public static ItemStack MOMOTECH_ENTROPY_RECONSTRUCT = new CustomItemStack(Material.BLACK_CONCRETE, "&e逆熵重组器", "&7说实话有点慢..", "§8⇨ §e⚡ §7500 J/t");
    public static ItemStack MOMOTECH_RULE_RECONSTRUCT = new CustomItemStack(Material.BLACK_CONCRETE, "&e规则重组器", "&7这么快?", "§8⇨ §e⚡ §75,000 J/t");
    public static ItemStack MOMOTECH_RULE_MACHINE_STAR = new CustomItemStack(Material.BLACK_CONCRETE, "&7规则机器组件");
    public static ItemStack MOMOTECH_SHINE_AND_DARK_INGOT = new CustomItemStack(Material.FLINT, "&8&l光暗复合锭");
    public static ItemStack MOMOTECH_RULE_DUST_GENERATOR = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则化磨粉器", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_RULE_DUST_GENERATOR1 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则化磨粉器 &f- &6定向 &f- &bAl", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_RULE_DUST_GENERATOR2 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则化磨粉器 &f- &6定向 &f- &bMg", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_RULE_DUST_GENERATOR3 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则化磨粉器 &f- &6定向 &f- &bCu", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_RULE_DUST_GENERATOR4 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则化磨粉器 &f- &6定向 &f- &bAu", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_RULE_DUST_GENERATOR5 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则化磨粉器 &f- &6定向 &f- &bAg", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_RULE_DUST_GENERATOR6 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则化磨粉器 &f- &6定向 &f- &bPb", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_RULE_DUST_GENERATOR7 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则化磨粉器 &f- &6定向 &f- &bSn", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_RULE_DUST_GENERATOR8 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则化磨粉器 &f- &6定向 &f- &bZn", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_RULE_DUST_GENERATOR9 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则化磨粉器 &f- &6定向 &f- &bFe", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_RULE_U_GENERATOR = new CustomItemStack(Material.GREEN_CONCRETE_POWDER, "&e规则化铀提取器", "&7效率:64x", "§8⇨ §e⚡ §75,000 J/t");
    public static ItemStack MOMOTECH_RULE_GEO = new CustomItemStack(Material.NETHERITE_BLOCK, "&f规则超高速地理资源开采器", "&7效率:16x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_RULE_CREATIVE_GENERATOR = new CustomItemStack(Material.BOOKSHELF, "&3原始物质生成器αβ型", "&7消耗大量电力自动生成", "&7每tick随机生成一个原始物质α或β","&7他真的我哭死...", "§8⇨ §e⚡ §7100,000 J/t");
    public static ItemStack MOMOTECH_RULE_REACTOR = new CustomItemStack(Material.DIAMOND_ORE, "&e高速裂变器", "&7效率:8x", "§8⇨ §e⚡ §75,000 J/t");
    public static ItemStack MOMOTECH_MONSTER_ITEM = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7主世界刷怪塔模拟器" , "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_MONSTER_ITEM1 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7鱼塔模拟器" , "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_MONSTER_ITEM2 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7猪人塔模拟器" , "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_MONSTER_ITEM3 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7末影人塔模拟器" , "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_MONSTER_ITEM4 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7苦力怕农场模拟器" , "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_MONSTER_ITEM5 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7溺尸塔模拟器" , "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_MONSTER_ITEM6 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7动物农场模拟器" , "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_RULE_CONSTRUCTOR = new CustomItemStack(Material.CHISELED_POLISHED_BLACKSTONE, "&6规则&f凝聚者", "&7效率:16x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_QUICK_CRAFTER = new CustomItemStack(Material.WITHER_SKELETON_SKULL, "&a规则自动合成台", "&7效率:64x");
    public static ItemStack MOMOTECH_QUICK_CRAFTER1 = new CustomItemStack(Material.WITHER_SKELETON_SKULL, "&a高级规则自动合成台", "&7效率:INFINITY");
    public static ItemStack MOMOTECH_MINERAL_GENERATOR = new CustomItemStack(Material.BLUE_CONCRETE_POWDER, "&e规则矿机", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_MINERAL_BLOCK_GENERATOR = new CustomItemStack(Material.GILDED_BLACKSTONE, "&6规则矿块收集器", "&7效率:16x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_PLANT = new CustomItemStack(Material.CHISELED_DEEPSLATE, "&f植物培养器", "&7插入植物种子或者是类似于睡莲, 藤蔓, 草等物品", "&7效率:20x", "§8⇨ §e⚡ §710,000 J/t");
    public static ItemStack MOMOTECH_WOOD = new CustomItemStack(Material.OAK_LOG, "&f树木培养器", "&7插入树苗或者下届菌类", "&7效率:20x", "§8⇨ §e⚡ §710,000 J/t");
    public static ItemStack MOMOTECH_INGOT_GENERATOR = new CustomItemStack(Material.BLUE_CONCRETE_POWDER, "&e规则铸锭器", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_INGOT = new CustomItemStack(Material.BLUE_CONCRETE_POWDER, "&e基础铸锭鸡", "&7效率:8x", "§8⇨ §e⚡ §7900 J/t");
    public static ItemStack MOMOTECH_CAST_INGOT = new CustomItemStack(Material.BLUE_CONCRETE_POWDER, "&e规则冶炼炉", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static ItemStack MOMOTECH_CAST = new CustomItemStack(Material.BLUE_CONCRETE_POWDER, "&e基础冶炼炉", "&7效率:8x", "§8⇨ §e⚡ §7900 J/t");
    public static ItemStack MOMOTECH_BATTERY1 = new CustomItemStack(Material.YELLOW_CONCRETE_POWDER, "&6&l元电池 - I", "§8⇨ §e⚡ §71 J/t");
    public static ItemStack MOMOTECH_BATTERY2 = new CustomItemStack(Material.YELLOW_CONCRETE_POWDER, "&6&l元电池 - II", "§8⇨ §e⚡ §78 J/t");
    public static ItemStack MOMOTECH_BATTERY3 = new CustomItemStack(Material.YELLOW_CONCRETE_POWDER, "&6&l元电池 - III", "§8⇨ §e⚡ §764 J/t");
    public static ItemStack MOMOTECH_BATTERY4 = new CustomItemStack(Material.YELLOW_CONCRETE_POWDER, "&6&l元电池 - IV", "§8⇨ §e⚡ §7512 J/t");
    public static ItemStack MOMOTECH_BATTERY5 = new CustomItemStack(Material.YELLOW_CONCRETE_POWDER, "&6&l元电池 - V", "§8⇨ §e⚡ §74,096 J/t");
    public static ItemStack MOMOTECH_BATTERY6 = new CustomItemStack(Material.YELLOW_CONCRETE_POWDER, "&6&l元电池 - VI", "§8⇨ §e⚡ §732,768 J/t");
    public static ItemStack MOMOTECH_BATTERY7 = new CustomItemStack(Material.YELLOW_CONCRETE_POWDER, "&6&l元电池 - VII", "§8⇨ §e⚡ §7262,144 J/t");
    public static ItemStack MOMOTECH_BATTERY8 = new CustomItemStack(Material.YELLOW_CONCRETE_POWDER, "&6&l元电池 - VIII", "§8⇨ §e⚡ §72,097,152 J/t");
    public static ItemStack MOMOTECH_BATTERY9 = new CustomItemStack(Material.YELLOW_CONCRETE_POWDER, "&6&l元电池 - IX", "§8⇨ §e⚡ §716,777,216 J/t");
    public static ItemStack MOMOTECH_LINE = new CustomItemStack(Material.YELLOW_CONCRETE_POWDER, "&e&l线性发电机", "&7发电可拓展");
    public static ItemGroup MOMOTECH_ITEM;
    public static ItemGroup MOMOTECH_FINAL;
    public static ItemGroup MOMOTECH;
    public static ItemGroup MOMOTECH_MACHINE;
    public static ItemGroup MOMOTECH_MINERAL;
    public static ItemGroup MOMOTECH_ORDINARY_MACHINE;
    public static ItemGroup MOMOTECH_THANKING;
    public static ItemGroup MOMOTECH_TOOL;
    public static ItemGroup MOMOTECH__;
    public static ItemGroup MOMOTECH_ELECTRICITY;
    public static ItemGroup MOMOTECH_INF;
    public static ItemStack[] Cobblestone = new ItemStack[100];
    public static ItemGroup MOMOTECH_INF_MACHINE;

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
        for (int i = 0; i < 50; i++) {
            Cobblestone[i] = new CustomItemStack(Material.COBBLESTONE, "&c> &f" + (i + 1) + "重压缩圆石", "&7不用怀疑, 材料而已", "&7实际上并不是所有的都用的上, 主要用于娱乐");
        }
        ItemStack[] GROUP = {new CustomItemStack(Material.PAPER, "&c&l注意", "&b&l附属机器非注明不需要电力", "&b&l所有机器只有在输出槽有空位的时候才会工作"),
                new CustomItemStack(Material.SOUL_CAMPFIRE, "&l基础生产型机器"), new CustomItemStack(Material.IRON_INGOT, "§l基础物品"),
                new CustomItemStack(Material.DIAMOND, "§l工具"), new CustomItemStack(Material.REPEATING_COMMAND_BLOCK, "§b§l§k; §3§l终§1§l极§9§l物§d§l品 §5§l§k;"),
                new CustomItemStack(Material.BLACK_CONCRETE_POWDER, "§8§l基础机器"), new CustomItemStack(Material.GOLD_BLOCK, "§6§l压缩材料"),
                new CustomItemStack(Material.ENCHANTED_BOOK, "&e&l鸣谢 &8- &a&l特殊材料"), new CustomItemStack(Material.CHAIN_COMMAND_BLOCK, "§e§l§k陌陌 §a§l科技 §7(代码编写者:QYhB05)"),
                new CustomItemStack(Material.BLAZE_POWDER, "&a&l拓展 - 无限工程(待完善)"), new CustomItemStack(Material.SEA_PICKLE, "&b&l电力拓展"), new CustomItemStack(Material.PRISMARINE_CRYSTALS, "&8&l无限机器(待完善)")};
        Register.add(GROUP);
        MOMOTECH__ = new SubGroup("MOMOTECH__", GROUP[0]);
        MOMOTECH_ORDINARY_MACHINE = new SubGroup("MOMOTECH_ORDINARY_MACHINE", GROUP[1]);
        MOMOTECH_ITEM = new SubGroup("MOMOTECH_ITEM", GROUP[2]);
        MOMOTECH_TOOL = new SubGroup("MOMOTECH_TOOL", GROUP[3]);
        MOMOTECH_FINAL = new SubGroup("MOMOTECH_FINAL", GROUP[4]);
        MOMOTECH_MACHINE = new SubGroup("MOMOTECH_MACHINE", GROUP[5]);
        MOMOTECH_MINERAL = new SubGroup("MOMOTECH_MINERAL", GROUP[6]);
        MOMOTECH_THANKING = new SubGroup("MOMOTECH_THANKING", GROUP[7]);
        MOMOTECH_INF = new SubGroup("MOMOTECH_INF", GROUP[9]);
        MOMOTECH_ELECTRICITY = new SubGroup("MOMOTECH_ELECTRICITY", GROUP[10]);
        MOMOTECH_INF_MACHINE = new SubGroup("MOMOTECH_INF_MACHINE", GROUP[11]);
        MOMOTECH = new MultiGroup("MOMOTECH", GROUP[8], MOMOTECH__, MOMOTECH_THANKING, MOMOTECH_ITEM, MOMOTECH_MINERAL, MOMOTECH_TOOL, MOMOTECH_ORDINARY_MACHINE, MOMOTECH_MACHINE, MOMOTECH_FINAL, MOMOTECH_ELECTRICITY, MOMOTECH_INF, MOMOTECH_INF_MACHINE);
        MOMOTECH.register(MomoTech.getInstance());
    }
}
