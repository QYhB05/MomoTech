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
    interface string {
        String str();
    }
    public static String c(String s, String... s1) {
        StringBuilder ans = new StringBuilder();
        for (int x1 = 0; x1 < s1.length; x1++) {
            if (s1[x1].length() == 1) {
                ans.append("§");
                ans.append(s1[x1]);
                ans.append(s.charAt(x1));
                continue;
            }
            ans.append("§x");
            for (char i : s1[x1].toCharArray()) {
                ans.append("§").append(i);
            }
            ans.append(s.charAt(x1));
        }
        return ans.toString();
    }
    public static String c(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '#') {
                sb.append('x');
                i++;
                if (i >= s.length()) break;
                for (int count = 0; count < 6; i++, count++) {
                    sb.append('§').append(s.charAt(i));
                }
            }
            if (i >= s.length()) break;
            sb.append(s.charAt(i));

        }
        return sb.toString();
    }
    public static final ItemStack QUANTITY_ITEM = new CustomItemStack(Material.PURPLE_DYE, c("量化插件", "748d8d", "858c9b", "978ca9", "a88bb8"), "&6一个材料而已");
    public static final ItemStack FROG_LIGHT_GENERATOR = new CustomItemStack(Material.OCHRE_FROGLIGHT, "&e蛙鸣灯生成器", "&7随机生成一种蛙鸣灯", "&7效率:4x");
    public static final ItemStack STONE_GENERATOR = new CustomItemStack(Material.STONE, "&e石质&f生成器", "&7自动化生产三废石/圆石/深板岩圆石", "&7效率:8x");
    public static final ItemStack ORE_GENERATOR = new CustomItemStack(Material.DIAMOND_ORE, "&e原矿&f生成器", "&7自动化生产各种原矿", "&7效率:1x");
    public static final ItemStack SAND_GENERATOR = new CustomItemStack(Material.SANDSTONE, "&e沙质&f生成器", "&7自动化红沙/沙子/砂砾/灵魂沙", "&7效率:8x");
    public static final ItemStack STONE_GENERATOR_I = new CustomItemStack(Material.COBBLESTONE, "&e定向圆石&f生成器", "&7自动化生产圆石", "&7效率:8x");
    public static final ItemStack GLASS_GENERATOR = new CustomItemStack(Material.GLASS, "&e定向玻璃&f生成器", "&7自动化生产玻璃", "&7效率:8x");
    public static final ItemStack TEMPLATE_GENERATOR = new CustomItemStack(Material.MELON, "&e模板&f生成器", "&7随机生成高版本的模板", "&7效率:1x");
    public static final ItemStack FISH_GENERATOR = new CustomItemStack(Material.SEA_LANTERN, "&e自动捕鱼器", "&7随机生成各种鱼", "&7效率1x");
    public static final ItemStack DUST_GENERATOR = new CustomItemStack(Material.SAND, "&e矿粉&f生成器", "&7随机生产各种矿粉", "&7效率6x");
    public static final ItemStack STONES_GENERATOR = new CustomItemStack(Material.SNOW_BLOCK, "&6石块&f生成器", "&7自动化生产石块", "&7效率8x");
    public static final ItemStack ICE_GENERATOR = new CustomItemStack(Material.BLUE_ICE, "&e冰&f生成器", "&7自动化生产冰", "&7效率:1x");
    public static final ItemStack Generator = new CustomItemStack(Material.ORANGE_CONCRETE_POWDER, c("§#b98bc6发§#cb8ad4电§#dc8ae2机"), "§8⇨ §e⚡ §76,000 J/t");
    public static final ItemStack LINE_GENERATOR = new CustomItemStack(Material.GRAY_WOOL, "&e线&f生成器", "&7自动化生产线", "&7效率:3x");
    public static final ItemStack COMMAND_BLOCK_GENERATOR = new CustomItemStack(Material.POLISHED_BLACKSTONE, "&b&l命令方块生成器", "&7&l什么?命令方块???", "&7效率:1x");
    public static final ItemStack C_GENERATOR = new CustomItemStack(Material.COAL_BLOCK, "&e碳&f生成器", "&7这下前期碳解决了！", "&7效率:1x");
    public static final ItemStack CREATIVE__ = new CustomItemStack(Material.GLASS_PANE, c("纯净的始源", "ed89f0", "e98ef6", "da94f7", "ca9bf8", "bba2fa"), "&6终极,才刚开始");
    public static final ItemStack COMMAND_BLOCK_GETTER = new CustomItemStack(Material.COMMAND_BLOCK, c("仿制品", "aca9fb", "9cb0fc", "8db6fb") + " &7- " + c("命令方块", "7fc6ee", "7ccde1", "79d5d5", "77ddc9"));
    public static final ItemStack COBBLE_STONE_GENERATOR_II = new CustomItemStack(Material.SNOW_BLOCK, "&b&l压缩圆石生成器", "&7效率:64x");
    public static final ItemStack MOMOTECH_DIGITAL = new CustomItemStack(SlimefunUtils.getCustomHead("80c4528e622bd318720d38e0e4599e69bf23308f89693920e0e4ecb55d1c0bac"), "§f数字组件", "§f0.0");
    public static final ItemStack MOMOTECH_LETTER = new CustomItemStack(Material.SUGAR, c("符号", "74e5bd", "71edb0"), "&fa", "&7凭空制造物质的基础");
    public static final ItemStack MOMOTECH_ID_CARD = new CustomItemStack(Material.PAPER, c("§#6ef5a4I§#73f5a2D§#78f6a0卡"), "&fID:", "&7在&cID集成器&7添加符号集成Slimefun ID", "&7合法ID可以在 &f制造台 &7中直接制作对应ID的粘液物品");
    public static final ItemStack MOMOTECH_ID_PUTTER = new CustomItemStack(Material.BOOKSHELF, c("§#7ef69eI§#83f79cD§#88f79a集§#8df798成§#92f896器"), "&7在此给ID卡添加字符");
    public static final ItemStack MOMOTECH_LETTER_CONSTRUCTOR = new CustomItemStack(Material.BEEHIVE, c("§#fccc98符§#f9c4a6号§#f7bcb4集§#f4b3c2成§#f2abd0器"));
    public static final ItemStack MOMOTECH_FINAL_STAR = new CustomItemStack(Material.HONEYCOMB, c("§#9df991终§#acfa8c极§#bafb86之§#c8fc81心"), "&7凝聚于此");
    public static final ItemStack MOMOTECH_ID_CHANGER = new CustomItemStack(Material.GLASS, c("§#d6fc7c制§#e4fd76造§#f3fe71台"), "&7&l插入合法ID卡,根据ID直接读取输出粘液物品", "&7可以通过这个制作&l任何&7粘液物品", "&7比如乱序技艺的伪物(FINALTECH_PHONY)");
    public static final ItemStack MOMOTECH_UNCONTROLLABLE_EMPTY_GENERATOR = new CustomItemStack(Material.DEEPSLATE_LAPIS_ORE, c("§#fcf769不§#fde05b可§#fdc94e控§#fdb241空 §#fe9b34生§#fe8326成§#ff6c19器"), "&7作为后期不可控空的量产基地..", "&7速率:48x");
    public static final ItemStack MOMOTECH_RANDOM_COPIER = new CustomItemStack(Material.DEEPSLATE_EMERALD_ORE, c("§#ff550c随§#ff6c2d机§#ff834e型§#ff9b6f复§#ffb291刻§#ffc9b2鸡"));
    public static final ItemStack MOMOTECH_FINAL_COPIER = new CustomItemStack(Material.DEEPSLATE_GOLD_ORE, c("§#ffe0d3复§#fff7f4刻§#efefef鸡§#d6d6d6 - §#bebebe终§#a5a5a5级"), "&c整合粒子!");
    public static final ItemStack MOMOTECH_EXP = new CustomItemStack(Material.EXPERIENCE_BOTTLE, c("§#8c8c8c经§#747474验 §#5b5b5b经§#4d4d4d验 §#535353很§#595959多§#5f5f5f经§#656464验"), "&7扔出后经验立马提升20级");
    public static final ItemStack MOMOTECH_FINAL_ITEM = new CustomItemStack(Material.FERN, c("§#b2d3d3乱§#acd8d1码§#a5dece核§#9fe3cc心"), "&8&l无处不在", "&8&l终极-史诗物品");
    public static final ItemStack SEA_ITEM_GENERATOR = new CustomItemStack(Material.PRISMARINE, "&b&l海晶&f生成器", "&7自动化生产海晶物品", "&7效率:8x");
    public static final ItemStack BEE_GENERATOR = new CustomItemStack(Material.BEE_NEST, "&6&l蜜蜂&f生成器", "&7自动化生产各种蜜蜂相关的物品", "&7效率:1x");
    public static final ItemStack SPIDER_EYE_GENERATOR = new CustomItemStack(Material.SPAWNER, "&7&l蜘蛛眼&f生成器", "&7自动化生产蜘蛛眼,或许在至尊中用得上", "&7效率:2x");
    public static final ItemStack MOMOTECH_ORE_COLLECTOR = new CustomItemStack(Material.DEEPSLATE_COAL_ORE, c("§#849985锵§#8baa8c锵§#91bb93~ §#98cd9b自§#9edea2动§#a5efaa化§#aff6ad压§#bbf7ae缩§#c7f9af矿§#d3fab0物!"), "&7随机生成某种叁重压缩矿物");
    public static final ItemStack MOMOTECH_EMPTY_SHELL = new CustomItemStack(Material.STRUCTURE_VOID, "§7空", "&f我真的不理解为什么这玩意是重要材料!", "§f§lNULL");
    public static final ItemStack MOMOTECH_SYMBOL_ADDITION = new CustomItemStack(Material.BLAZE_POWDER, "§a符号 +", "§f+");
    public static final ItemStack MOMOTECH_SYMBOL_SUBTRACTION = new CustomItemStack(Material.BLAZE_POWDER, "§a符号 -", "§f-");
    public static final ItemStack MOMOTECH_SYMBOL_MULTIPLICATION = new CustomItemStack(Material.BLAZE_POWDER, "§a符号 x", "§f*");
    public static final ItemStack MOMOTECH_SYMBOL_DIVISION = new CustomItemStack(Material.BLAZE_POWDER, "§a符号 ÷", "§f/");
    public static final ItemStack MOMOTECH_NONE = new CustomItemStack(new ItemStack(Material.BLACK_WOOL), c("§#dffbb1N§#ebfdb2O§#f7feb3N§#fffdb7E"), "§7一片虚无");
    public static final ItemStack MOMOTECH_NUMBER_BUG = new CustomItemStack(new ItemStack(Material.WHITE_STAINED_GLASS_PANE), "§7§lB§k1§8U§f§l§k一§7G §e- §a运算式", "&7&lBUG物质");
    public static final ItemStack MOMOTECH_NUMBER_BUG_I = new CustomItemStack(new ItemStack(Material.RED_STAINED_GLASS_PANE), "§7§lB§k1§8U§f§l§k一§7G §e- §a小数", "&7&lBUG物质");
    public static final ItemStack MOMOTECH_NUMBER_BUG_II = new CustomItemStack(new ItemStack(Material.ORANGE_STAINED_GLASS_PANE), "§7§lB§k1§8U§f§l§k一§7G §e- §a日期", "&7&lBUG物质");
    public static final ItemStack MOMOTECH_NUMBER_BUG_III = new CustomItemStack(new ItemStack(Material.YELLOW_STAINED_GLASS_PANE), "§7§lB§k1§8U§f§l§k一§7G §e- §a正过载", "&7&lBUG物质");
    public static final ItemStack MOMOTECH_NUMBER_BUG_IV = new CustomItemStack(new ItemStack(Material.GREEN_STAINED_GLASS_PANE), "§7§lB§k1§8U§f§l§k一§7G §e- §a负过载", "&7&lBUG物质");
    public static final ItemStack MOMOTECH_NUMBER_BUG_V = new CustomItemStack(new ItemStack(Material.BLUE_STAINED_GLASS_PANE), "§7§lB§k1§8U§f§l§k一§7G §e- §a系统", "&7&lBUG物质");
    public static final ItemStack MOMOTECH_DIGITAL_CONSTRUCTOR = new CustomItemStack(SlimefunUtils.getCustomHead("f26dad74b2bab105cb68c94eb3be32f5dbda42eab944b6ed9e803136f8f619bc"), "§x§a§4§b§3§b§f数字构造器", "§7将 §l空 §7转换成数字组件", "&8似乎只能生产一些基础数字...", "§8⇨ §e⚡ §72,000 J/t");
    public static final ItemStack MOMOTECH_SYMBOL_GENERATOR = new CustomItemStack(SlimefunUtils.getCustomHead("f26dad74b2bab105cb68c94eb3be32f5dbda42eab944b6ed9e803136f8f619bc"), "§x§a§4§b§3§b§f符号生成器", "§7从 §l空 §7中生成符号", "§8⇨ §e⚡ §72,000 J/t");
    public static final ItemStack MOMOTECH_INCREMENT = new CustomItemStack(new ItemStack(Material.CREEPER_HEAD), c("§#fdf7c1递§#fcf1cc增§#faebd6器"));
    public static final ItemStack MOMOTECH_ORDINARY_NUMBER_COMBINATOR = new CustomItemStack(Material.SKELETON_SKULL, c("§#f9e6e0基§#f8e0ea础§#f6daf4计§#f5d4fe算§#f6cdfe器"));
    public static final ItemStack MOMOTECH_EMPTY_SHELL_GENERATOR = new CustomItemStack(Material.BLACK_CONCRETE_POWDER, c("§#f8c7fe空§#f9c0fe生§#fab9ff成§#fcb3ff器"), "&7唔...终于做出来了...解放双手!", "&6效率:8x");
    public static final ItemStack MOMOTECH_EMPTY_SHELL_GENERATOR_I = new CustomItemStack(Material.WHITE_CONCRETE_POWDER, c("§#fdacff空§#ffa5ff生§#ff9ef1成§#ff96dd器§#ff8ec8加§#ff86b4强§#ff7ea0版"), "&7无需输入, 生产更多的空!", "&6效率:64x");
    public static final ItemStack MOMOTECH_CREATIVE_ITEM = new CustomItemStack(Material.END_CRYSTAL, c("§#ff768b原§#ff6e77始§#ff6c64物§#ff7556质§#ff7e48α"), "&7似乎有着大用处, 但好像只是个基础材料...");
    public static final ItemStack MOMOTECH_CREATIVE_ITEM_I = new CustomItemStack(Material.END_CRYSTAL, c("§#ff8739原§#ff8f2b始§#ff981d物§#ffa10e质§#ffaa00β"), "&7似乎有着大用处, 但好像只是个基础材料...");
    public static final ItemStack MOMOTECH_CREATIVE_ITEM_GENERATOR = new CustomItemStack(Material.COBBLESTONE, c("§#fff085原§#fffb9b始§#faffaa物§#f3ffb7质§#ebffc4制§#e4ffd1造§#ddffdd器"));
    public static final ItemStack MOMOTECH_UNCONTROLLABLE_EMPTY = new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, "§8§l§k123&f&l不可控空");
    public static final ItemStack CreativeGenerator = new CustomItemStack(new ItemStack(Material.BLACK_WOOL), c("§#d5ffea发§#cefff7癫§#c8fef6鸡"), "§8⇨ §e⚡ §799,999,999 J/t");
    public static final ItemStack MOMOTECH_NONE_GENERATOR = new CustomItemStack(new ItemStack(Material.DIRT), c("§#c7fadbN§#c5f6c0O§#c4f2a5N§#c2ee8bE §#c0eb70制§#bfe755造§#bde33a器"), "&7前期很好的&8&lNONE&7来源...");
    public static final ItemStack MOMOTECH_CREATIVE_ITEM_II = new CustomItemStack(Material.END_CRYSTAL, c("§#ffb616原§#ffc12c始§#ffcd42物§#ffd858质§#ffe46eγ"), "&7更进一步...");
    public static final ItemStack MOMOTECH_QUANTITY_CONSTRUCTOR = new CustomItemStack(Material.HONEY_BLOCK, c("§#addf4e量§#9ddb63化§#8ed777构§#7ed38b造§#6ecfa0器"));
    public static final ItemStack MOMOTECH_BUG_CRYSTAL = new CustomItemStack(Material.NETHER_STAR, c("§#5ecbb4B§#4ec7c8U§#45c6c1G§#40c6ad水§#3ac699晶"), "&7&l来自BUG的结晶");
    public static final ItemStack QY = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), "&6&lQYhB05", "&7BUG制造者...", "&7编写了大部分本附属的屎山代码, 是附属创始者之一", "&7业余的代码爱好者");
    public static final ItemStack wbx = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), "&e&lChenmose", "&7可爱捏~", "&7提供了一些主意, 是附属创始者之一", "&8&l我是不会告诉你他前期之后摆烂了");
    public static final ItemStack sky = new CustomItemStack(new ItemStack(Material.COMMAND_BLOCK), "&a&lskybule", "&7提供了有趣的想法并帮忙进行了测试", "&7对作者提供了很大程度的帮助和支持!");
    public static final ItemStack plugin = new CustomItemStack(new ItemStack(Material.PAPER), "&f&l本附属名为MomoTech, 也可被成为乱码科技!", "&b这是一个开源项目, 感谢您的支持, 如需魔改或发现bug请联系作者", "&6&l讨论QQ群聊:827684043");
    public static final ItemStack BUGGGGG = new CustomItemStack(new ItemStack(Material.ENDER_CHEST), "&f&lBUGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", "&8作者只是初中业余代码爱好者, 请不要喷我们, 欢迎您来QQ提出意见");
    public static final ItemStack ELSE_1 = new CustomItemStack(Material.PAPER, "&f特性:无电力", "&7所有非注明用电的机器均不消耗电力");
    public static final ItemStack ELSE_2 = new CustomItemStack(Material.PAPER, "&f特性:槽位仅空", "&7部分机器只有在输出槽有空位时才会工作");
    public static final ItemStack ELSE_3 = new CustomItemStack(Material.PAPER, "&f特性:Bug - 日期", "&7如果你的计算器计算结果等于日期并且没有输出Bug - 日期, 或许你可以试试再给那个数字组件+0");
    public static final ItemStack FULL = new CustomItemStack(new ItemStack(Material.EGG), c("§#35c684饱§#2fc670和§#29c65c护§#24c648符"), "&b总是饿?前期做不起别的?用我!", "&b右键后消耗并立马获得饱和效果");
    public static final ItemStack DAMAGE_ITEM = new CustomItemStack(new ItemStack(Material.CHAIN_COMMAND_BLOCK), c("§#29c73a奇§#44ca39怪§#5fce38的§#7ad137东§#94d436西§#afd736（§#cadb35?"), "&6&l一击必杀!直接抹除!");
    public static final ItemStack[][] Mineral = new ItemStack[9][5];
    public static final ItemStack STONE_SWORD = new CustomItemStack(Material.DIAMOND_SWORD, "&7&l勝利誓約之劍", "&8石中剑...", "&8可以造成巨量伤害", "&8伤害+999999999999.99");
    public static final ItemStack FINAL_C_ = new CustomItemStack(Material.COBBLESTONE, c("§#e5de345§#c7df3d0§#a8df47重§#8ae050压§#6be15a缩§#4de163原§#2fe26c石§#10e376生§#10db7b成§#1ecf7d器"), "&7&l正确的, 你没听错", "&f谁知道呢 或许有点用处呢", "&7效率:8x");
    public static final ItemStack PROTECT_ITEM = new CustomItemStack(new ItemStack(Material.TURTLE_HELMET), c("§#2dc380原§#3bb883谅§#49ac85帽"), "&a戴在头上免疫实体攻击!", "&8不包括燃烧摔落等", "&7别问为啥是绿的");
    public static final ItemStack STAR_OF_ALL = new CustomItemStack(Material.HEART_OF_THE_SEA, c("§#58a088一§#66948a体§#6e8989机§#678080核§#607777心"), "&6&l用于合成本附属绝大部分的一体机");
    public static final ItemStack MOMOTECH_COBBLE_STONE_STORE = new CustomItemStack(Material.GLASS, c("§#5a6e6e石§#536566质§#4c5c5d储§#465354存"), "&7提供48格的存储空间", "&7圆石也能做箱子了 好耶");
    public static final ItemStack MOMOTECH_COBBLESTONE_GENERATOR_FINAL = new CustomItemStack(Material.SLIME_BLOCK, c("§#3f4a4b逆§#485351熵§#525c58刷§#5b655e石§#656f64机"), "&71tick生产48组, 就是这么高产!");
    public static final ItemStack MOMOTECH_QUANTUM = new CustomItemStack(Material.SNOWBALL, "&e量&6子", "&f右键貌似会发生一些不好的事情");
    public static final ItemStack MOMOTECH_QUANTUM1 = new CustomItemStack(Material.MAGMA_CREAM, "&a纠&b缠&e量&6子", "&f随量子而纠缠的粒子, 右键貌似也会发生一些不好的事情", "&f用于高精密的高速通讯机器");
    public static final ItemStack MOMOTECH_BOX_OF_QUANTUM = new CustomItemStack(Material.CHEST, "&a量&e子&6盒", "&7稳定下来的量子, 在机器中利用量子储存物品", "&f右键利用量子打开末影箱");
    public static final ItemStack MOMOTECH_SILK_TOUCH_PICKAXE = new CustomItemStack(Material.NETHERITE_PICKAXE, "&b纠&6缠&e量&6子&c镐", "&f特殊的工具");
    public static final ItemStack MOMOTECH_PICKAXE = new CustomItemStack(Material.NETHERITE_PICKAXE, "&e量&6子&c镐", "&f特殊的工具", "&e逮虾户&f速度加快", "&8右键加速");
    public static final ItemStack MOMOTECH_PUMPKIN_CARVER = new CustomItemStack(Material.CARVED_PUMPKIN, c("§#a4b3bf南§#a7bac1瓜§#aac1c3光§#adc7c6速§#b0cec8雕§#b3d5ca刻§#b6dccc机"), "&f可以帮你自动雕刻南瓜", "&7效率:INFINITY");
    public static final ItemStack MOMOTECH_CLEAR = new CustomItemStack(Material.NETHERITE_INGOT, c("§#b9e3ce量§#bfe6cb子§#c6e7c5清§#cde9bf除§#d4eaba器"), "&7&l帮你清除掉你身上存在的属性类效果", "&8主要针对量子物品的效果");
    public static final ItemStack MOMOTECH_FIXER = new CustomItemStack(Material.IRON_BLOCK, c("§#dcebb4装§#e3edae备§#eaeea8修§#efeda0理§#f1e694器"), "&7帮你自动修复装备");
    public static final ItemStack MOMOTECH_TRANSPORTER = new CustomItemStack(Material.PISTON, "&a传送器");
    public static final ItemStack CHEST_GENERATOR = new CustomItemStack(Material.JUNGLE_LOG, "&6箱子&f生成器", "&7效率:1x");
    public static final ItemStack MOMOTECH_OPEN_BOX_ITEM = new CustomItemStack(Material.PURPLE_STAINED_GLASS, c("§#f6ca63开§#f7c356盒§#f8bc4a器"), "&7开盒!", "&7可以拆解量子盒, 但是只有纠缠量子可以被保留下来...");
    public static final ItemStack MOMOTECH_SHINE = new CustomItemStack(Material.GLOWSTONE_DUST, "&f光");
    public static final ItemStack MOMOTECH_DARK = new CustomItemStack(Material.GUNPOWDER, "&8暗");
    public static final ItemStack MOMOTECH_SHINE_AND_DARK_CONSTRUCTOR = new CustomItemStack(Material.GLOWSTONE, c("§#55ffff光§#6ffef6暗§#88fdee生§#a2fce5成§#bbfbdd器"), "§8⇨ §e⚡ §7500 J/t");
    public static final ItemStack MOMOTECH_SHINE_AND_DARK_GENERATOR = new CustomItemStack(Material.REDSTONE_LAMP, c("§#d5fad4光§#eefacc暗§#fef9c5发§#fbf7c2电§#f8f6bf机"), "&7从光暗中汲取能量...", "§8⇨ §e⚡ §720,000 J/t");
    public static final ItemStack MOMOTECH_SHINE1 = new CustomItemStack(Material.GLOWSTONE_DUST, "&f&l光因子");
    public static final ItemStack MOMOTECH_DARK1 = new CustomItemStack(Material.GUNPOWDER, "&8&l暗因子");
    public static final ItemStack MOMOTECH_NETHERITE_PICKAXE_CHANGER = new CustomItemStack(Material.BLACK_STAINED_GLASS, c("§#f5f5bc下§#f3f4b9界§#f0f3b6合§#edf1b3金§#ebf2b0镐§#e9f3ac转§#e7f3a9换§#e5f4a5器"), "§8⇨ §e⚡ §7100 J/t");
    public static final ItemStack DIAMOND_PICKAXE_GENERATOR = new CustomItemStack(Material.DIAMOND_BLOCK, "&b钻石镐&f生成器", "&7效率:8x");
    public static final ItemStack MOMOTECH_CONSTRUCTOR = new CustomItemStack(Material.CHISELED_POLISHED_BLACKSTONE, c("§#e3f5a2凝§#e1f69e聚§#dff79b者"), "&7凝聚精华于一体", "§8⇨ §e⚡ §7900 J/t");
    public static final ItemStack MOMOTECH_DIAMOND = new CustomItemStack(Material.DIAMOND, "&6矿物精华 &f- &b钻石");
    public static final ItemStack MOMOTECH_IRON = new CustomItemStack(Material.IRON_INGOT, "&6矿物精华 &f- &b铁");
    public static final ItemStack MOMOTECH_GOLD = new CustomItemStack(Material.GOLD_INGOT, "&6矿物精华 &f- &b金");
    public static final ItemStack MOMOTECH_QUARTZ = new CustomItemStack(Material.QUARTZ, "&6矿物精华 &f- &b石英");
    public static final ItemStack MOMOTECH_EMERALD = new CustomItemStack(Material.EMERALD, "&6矿物精华 &f- &b绿宝石");
    public static final ItemStack MOMOTECH_REDSTONE = new CustomItemStack(Material.REDSTONE, "&6矿物精华 &f- &b红石");
    public static final ItemStack MOMOTECH_LAPIS = new CustomItemStack(Material.LAPIS_LAZULI, "&6矿物精华 &f- &b青金石");
    public static final ItemStack MOMOTECH_COAL = new CustomItemStack(Material.COAL, "&6矿物精华 &f- &b煤炭");
    public static final ItemStack MOMOTECH_Cu = new CustomItemStack(Material.BRICK, "&6金属精华 &f- &b铜");
    public static final ItemStack MOMOTECH_Pb = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b铅");
    public static final ItemStack MOMOTECH_Mg = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b镁");
    public static final ItemStack MOMOTECH_Au = new CustomItemStack(Material.GOLD_INGOT, "&6金属精华 &f- &b金");
    public static final ItemStack MOMOTECH_Al = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b铝");
    public static final ItemStack MOMOTECH_Sn = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b锡");
    public static final ItemStack MOMOTECH_Zn = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b锌");
    public static final ItemStack MOMOTECH_Ag = new CustomItemStack(Material.IRON_INGOT, "&6金属精华 &f- &b银");
    public static final ItemStack MOMOTECH_DIAMOND1 = new CustomItemStack(Material.DIAMOND, "&6矿物核心 &f- &b钻石");
    public static final ItemStack MOMOTECH_IRON1 = new CustomItemStack(Material.IRON_INGOT, "&6矿物核心 &f- &b铁");
    public static final ItemStack MOMOTECH_GOLD1 = new CustomItemStack(Material.GOLD_INGOT, "&6矿物核心 &f- &b金");
    public static final ItemStack MOMOTECH_QUARTZ1 = new CustomItemStack(Material.QUARTZ, "&6矿物核心 &f- &b石英");
    public static final ItemStack MOMOTECH_EMERALD1 = new CustomItemStack(Material.EMERALD, "&6矿物核心 &f- &b绿宝石");
    public static final ItemStack MOMOTECH_REDSTONE1 = new CustomItemStack(Material.REDSTONE, "&6矿物核心 &f- &b红石");
    public static final ItemStack MOMOTECH_LAPIS1 = new CustomItemStack(Material.LAPIS_LAZULI, "&6矿物核心 &f- &b青金石");
    public static final ItemStack MOMOTECH_COAL1 = new CustomItemStack(Material.COAL, "&6矿物核心 &f- &b煤炭");
    public static final ItemStack MOMOTECH_Cu1 = new CustomItemStack(Material.BRICK, "&6金属核心 &f- &b铜");
    public static final ItemStack MOMOTECH_Pb1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b铅");
    public static final ItemStack MOMOTECH_Mg1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b镁");
    public static final ItemStack MOMOTECH_Au1 = new CustomItemStack(Material.GOLD_INGOT, "&6金属核心 &f- &b金");
    public static final ItemStack MOMOTECH_Al1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b铝");
    public static final ItemStack MOMOTECH_Sn1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b锡");
    public static final ItemStack MOMOTECH_Zn1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b锌");
    public static final ItemStack MOMOTECH_Ag1 = new CustomItemStack(Material.IRON_INGOT, "&6金属核心 &f- &b银");
    public static final ItemStack MOMOTECH_REAL_MAGNET = new CustomItemStack(Material.IRON_BLOCK, c("§#e2f096这§#e5ea92才§#e9e38d是§#ecdd89合§#efd784理§#f2d080的§#f5ca80磁§#f6c387铁§#f8bc8e!"));
    public static final ItemStack MOMOTECH_ELECTRICITY_MAGNET = new CustomItemStack(Material.GOLD_BLOCK, c("§#fab695这§#fbaf9d才§#fda8a4是§#ffa2ab合§#fa9fac理§#f39dab的§#ed9caa电§#e69aa9磁§#df98a8铁§#d897a7!"));
    public static final ItemStack MOMOTECH_IRON_STAR = new CustomItemStack(Material.GLASS_BOTTLE, "&f&l铁芯");
    public static final ItemStack MOMOTECH_COIL = new CustomItemStack(Material.STRING, c("§#d295a6线§#d59dae圈"));
    public static final ItemStack MOMOTECH_MAGNETIZE = new CustomItemStack(Material.IRON_BLOCK, c("§#d8a5b5磁§#dbadbc化§#deb5c3机"), "&7这才是更加合理的磁铁制作方式!", "§8⇨ §e⚡ §7200 J/t");
    public static final ItemStack MOMOTECH_MAGNET_GENERATOR = new CustomItemStack(Material.WHITE_STAINED_GLASS, c("§#e0bdca能§#e3c5d2源§#e4c9d8电§#e0c6de力§#ddc3e3电§#d9c0e8磁§#d6bdee铁§#d2bbf3一§#cfb8f9体§#c8b4f2机"), "§8⇨ §e⚡ §7500 J/t");
    public static final ItemStack MOMOTECH_INFINITY = new CustomItemStack(Material.NETHERITE_SCRAP, "&c规&e则&b锭");
    public static final ItemStack MOMOTECH_FAST_GEO = new CustomItemStack(Material.NETHERITE_BLOCK, c("§#c0afe6高§#b9abdb速§#b1a7d0化§#a9a2c5地§#a19eb9理§#9a9baf资§#9aa2ab源§#9aaaa8开§#9ab2a5采§#99baa1器"), "§8⇨ §e⚡ §710,000 J/t");
    public static final ItemStack MOMOTECH_ORDINARY_GENERATOR = new CustomItemStack(Material.GLASS, c("§#99c29e基§#99ca9b础§#9fce99发§#add099电§#bad19a机"), "§8⇨ §e⚡ §7500 J/t");
    public static final ItemStack MOMOTECH_MINERAL_ = new CustomItemStack(Material.NETHERITE_INGOT, "&6矿物核心");
    public static final ItemStack MOMOTECH_METAL_ = new CustomItemStack(Material.IRON_INGOT, "&e金属核心");
    public static final ItemStack FLINT_GENERATOR = new CustomItemStack(Material.DEEPSLATE_GOLD_ORE, "&6燧石&f生成器", "&7效率:4x");
    public static final ItemStack MOMOTECH_RULE_STAR = new CustomItemStack(Material.IRON_NUGGET, "&c时&6隙");
    public static final ItemStack MOMOTECH_FINAL_RULE = new CustomItemStack(Material.BONE_MEAL, "&3概&b念&a物");
    public static final ItemStack MOMOTECH_ENERGY_INGOT = new CustomItemStack(Material.NETHERITE_INGOT, c("§#c8d29a放§#d6d39a射§#e3d49b性§#f1d59b充§#e5d3a4能§#d2d1af锭"));
    public static final ItemStack MOMOTECH_RESOURCE = new CustomItemStack(Material.COMMAND_BLOCK, "&a&lResource", "&7大力支持本附属并且进行了大量宣传");
    public static final ItemStack MOMOTECH_COMMAND_BLOCK1 = new CustomItemStack(Material.COMMAND_BLOCK, "&6创世命令方块 - COMMON");
    public static final ItemStack MOMOTECH_COMMAND_BLOCK2 = new CustomItemStack(Material.REPEATING_COMMAND_BLOCK, "&6创世命令方块 - REPEATING");
    public static final ItemStack MOMOTECH_COMMAND_BLOCK3 = new CustomItemStack(Material.CHAIN_COMMAND_BLOCK, "&6创世命令方块 - CHAIN");
    public static final ItemStack MOMOTECH_RULE_ITEM = new CustomItemStack(Material.REDSTONE_TORCH, c("§#bfcebb创§#abccc6世§#98cad1齿§#85c7dd轮"));
    public static final ItemStack MOMOTECH_EFFECT_DELETER = new CustomItemStack(Material.IRON_INGOT, c("§#74c5e7状§#73c9e5态§#72cde4化§#71d0e2清§#70d4e1除§#6fd7df器"), "&7右键清除药水效果");
    public static final ItemStack MOMOTECH_THROW = new CustomItemStack(Material.GOLD_INGOT, c("§#6edbde背§#6bdddc包§#63dddb丢§#5cdeda出§#55ded9器"), "&7右键丢出所有物品", "&8包括盔甲");
    public static final ItemStack MOMOTECH_RULE_SHINE_AND_DARK_CONSTRUCTOR = new CustomItemStack(Material.GLOWSTONE, c("§#4eded8规§#47dfd6则§#3fdfd5光§#39dcbe暗§#34d8a2收§#2ed486集§#28d169器"), "&7大大提升了概率...", "§8⇨ §e⚡ §75,000 J/t");
    public static final ItemStack MOMOTECH_ENTROPY_RECONSTRUCT = new CustomItemStack(Material.BLACK_CONCRETE, c("§#23cd4d逆§#1dc930熵§#1dc71a重§#40d02c组§#62d83d器"), "&7说实话有点慢..", "§8⇨ §e⚡ §7500 J/t");
    public static final ItemStack MOMOTECH_RULE_RECONSTRUCT = new CustomItemStack(Material.BLACK_CONCRETE, c("§#85e14e规§#a8e960则§#caf271重§#edfb82组§#f9fc90器"), "&7这么快?", "§8⇨ §e⚡ §75,000 J/t");
    public static final ItemStack MOMOTECH_RULE_MACHINE_STAR = new CustomItemStack(Material.BLACK_CONCRETE, c("§#85e14e规§#8ede68则§#98dc82机§#a1d99b器§#abd7b5组§#b4d4cf件"));
    public static final ItemStack MOMOTECH_SHINE_AND_DARK_INGOT = new CustomItemStack(Material.FLINT, c("§#b9d2ce光§#c2d2ca暗§#cad1c7复§#d3d0c3合§#dbcfc0锭"));
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR1 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bAl", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR2 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bMg", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR3 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bCu", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR4 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bAu", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR5 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bAg", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR6 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bPb", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR7 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bSn", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR8 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bZn", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_DUST_GENERATOR9 = new CustomItemStack(Material.POLISHED_DEEPSLATE, "&c规则磨粉器 &f- &6定向 &f- &bFe", "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_U_GENERATOR = new CustomItemStack(Material.GREEN_CONCRETE_POWDER, c("§#be63d9规§#cb6ad8则§#d871d8铀§#e577d7提§#f27ed7纯§#ff85d6器"), "&7效率:64x", "§8⇨ §e⚡ §75,000 J/t");
    public static final ItemStack MOMOTECH_RULE_GEO = new CustomItemStack(Material.NETHERITE_BLOCK, c("§#e4cfbc终§#eacdba焉§#e7c9c0地§#e4c5c5理§#e1c1cb资§#ddbcd0源§#dab8d6开§#d7b4db采§#cfafd7器"), "&7效率:16x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_CREATIVE_GENERATOR = new CustomItemStack(Material.BOOKSHELF, c("§#c4a9cb原§#b9a3be始§#ae9cb1物§#a396a4质§#999098生§#8e8a8b成§#9b9697器§#aca5a7α§#bdb5b7β§#cec4c8型"), "&7消耗大量电力自动生成", "&7每tick随机生成一个原始物质α或β", "&7他真的我哭死...", "§8⇨ §e⚡ §7100,000 J/t");
    public static final ItemStack MOMOTECH_RULE_REACTOR = new CustomItemStack(Material.DIAMOND_ORE, c("§#dfd3d8高§#f0e3e8速§#fdeff5裂§#faf2f2变§#f7f4f0器"), "&7效率:8x", "§8⇨ §e⚡ §75,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7主世界刷怪塔模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM1 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7鱼塔模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM2 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7猪人塔模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM3 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7末影人塔模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM4 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7苦力怕农场模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM5 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7溺尸塔模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM6 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7动物农场模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM7 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7史莱姆农场模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM8 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7烈焰人农场模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MONSTER_ITEM9 = new CustomItemStack(Material.BLACK_STAINED_GLASS, "&7岩浆怪农场模拟器", "&7效率:32x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_RULE_CONSTRUCTOR = new CustomItemStack(Material.CHISELED_POLISHED_BLACKSTONE, "&6规则 " + c("§#e3f5a2凝§#e1f69e聚§#dff79b者"), "&7效率:16x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MINERAL_GENERATOR = new CustomItemStack(Material.BLUE_CONCRETE_POWDER, c("§#f3f7ee规§#f0f9ec则§#edfbe9矿§#eafee7机"), "&7效率:64x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_MINERAL_BLOCK_GENERATOR = new CustomItemStack(Material.GILDED_BLACKSTONE, c("§#eafee6规§#edfde5则§#f1fce4矿§#f4fae3块§#f8f9e2收§#fbf8e1集§#fff6e0器"), "&7效率:16x", "§8⇨ §e⚡ §715,000 J/t");
    public static final ItemStack MOMOTECH_PLANT = new CustomItemStack(Material.CHISELED_DEEPSLATE, c("§#ffefdc植§#ffe7d7物§#ffdfd2培§#ffd6cd养§#ffcec9器"), "&7插入植物种子或者是类似于睡莲, 藤蔓, 草等物品", "&7效率:32x", "§8⇨ §e⚡ §710,000 J/t");
    public static final ItemStack MOMOTECH_WOOD = new CustomItemStack(Material.CHISELED_DEEPSLATE, c("§#ffc6c4树§#fec2c1木§#f7cac4培§#f1d2c7养§#eadaca器"), "&7插入树苗或者下届菌类", "&7效率:32x", "§8⇨ §e⚡ §710,000 J/t");
    public static final ItemStack MOMOTECH_ENERGY_QUANTUM = new CustomItemStack(Material.SLIME_BALL, "&c高&e能&b量&a子", "&7危险, 高能!");
    public static final ItemStack MOMOTECH_RANDOM_QUANTUM = new CustomItemStack(Material.CLAY_BALL, "&e随&b机&a量&3子", "&7随机~", "&7右键会死掉");
    public static final ItemStack MOMOTECH_RANDOM_QUANTUM_GENERATOR = new CustomItemStack(Material.GRAY_WOOL, c("§#e4e2cd随§#ddead0机§#d7f3d3量§#d4f7d8子§#d5f8de发§#d6f9e5生§#d6fbeb器"));
    public static final ItemStack MOMOTECH_ENERGY_QUANTUM_GENERATOR = new CustomItemStack(Material.WHITE_WOOL, c("§#d7fcf2量§#d7fef8子§#d8fffe充§#ddffff能§#e3ffff器"), "§8⇨ §e⚡ &7500,000 J/t");
    public static final ItemStack MOMOTECH_FINAL_INGOT_GENERATOR = new CustomItemStack(Material.GRAY_CONCRETE, c("§#e9ffff终§#efffff焉§#f5ffff铸§#fbffff锭§#fffbfd机"), "&7效率:INFINITY");
    public static final ItemStack MOMOTECH_FINAL_GENERATOR = new CustomItemStack(Material.EMERALD_BLOCK, c("§#ffa7d8终§#ff97d0焉§#ff92bb发§#ff969c电§#ff9a7d机"), "§8⇨ §e⚡ &71,000,000,000 J/t");
    public static final ItemStack MOMOTECH_FINAL_CAPITAL = new CustomItemStack(Material.YELLOW_STAINED_GLASS, c("§#ffeaf6终§#ffd9ee焉§#ffc9e7电§#ffb8df容"), "&7不建议你在一个能源网络中同时使用两个", "&7可储存 §8⇨ §e⚡ &72,000,000,000 J");
    public static final ItemStack MOMOTECH_FINAL_ELECTRIC_EATER = new CustomItemStack(Material.BLUE_STAINED_GLASS, c("§#ff9e5e宇§#ffa23f宙§#ffa621吃§#ffaa02电§#f6b40a机"), "&7利用宇宙能量吃电...", "§8⇨ §e⚡ &72,000,000,000 J/t");
    public static final ItemStack MOMOTECH_ITEM_FIXER = new CustomItemStack(Material.ORANGE_CONCRETE_POWDER, c("§#ebbf15物§#e1ca1f品§#d7d52a重§#cddf35置§#c3ea3f器"), "&7重置粘液物品");
    public static final ItemStack MOMOTECH_RULE_BOOTS = new CustomItemStack(Material.NETHERITE_BOOTS, "&7终焉靴", "&b抗辐射", "&b免疫蜜蜂", "&b饱和", "&b抗火", "&b生命恢复", "&b水下呼吸", "&b抗性II", "&b急迫II", "&b速度I", "&b急迫II", "&b跳跃提升I", "&b灵魂绑定");
    public static final ItemStack MOMOTECH_RULE_PICKAXE = new CustomItemStack(Material.DIAMOND_PICKAXE, "&7终焉镐");
    public static final ItemStack MOMOTECH_LOOTER = new CustomItemStack(Material.GLASS_PANE, "&7&l封印 - 唤魔师", "&8右键打开");
    public static final ItemStack MOMOTECH_FOREVER = new CustomItemStack(Material.BLUE_DYE, c("§#b9f24e永§#b0f265恒§#a7f27c粒§#9ef293子"), "&7Forever...");
    public static final ItemStack MOMOTECH_FOREVER_ = new CustomItemStack(Material.DIAMOND_BLOCK, c("§#95f2aa永§#8cf2c1恒§#83f2d8奇§#81e9e2点"), "&7Forever...");
    public static final ItemStack MOMOTECH_ETERNAL_MINING_MACHINE = new CustomItemStack(Material.GRAY_CONCRETE_POWDER, c("§#83dbe4永§#86cce6恒§#88bee8矿§#8aafea机"), "&7缓慢挖掘...");
    public static final ItemStack MOMOTECH_DIGIT_GENERATOR = new CustomItemStack(Material.BLACK_STAINED_GLASS, c("§#8ca1ec数§#8e92ee字§#808dec发§#7288e9电§#6483e6式§#577ee4电§#4979e1容"), "&7可储存 §8⇨ §e⚡ &716,777,216 J");
    public static final ItemStack MOMOTECH_ID_DISPLAY = new CustomItemStack(Material.GRAY_STAINED_GLASS_PANE, "&7&l物品ID展示");
    public static final ItemStack MOMOTECH_PROTON = new CustomItemStack(Material.TURTLE_EGG, c("§#3b74df质§#376fdd子"));
    public static final ItemStack MOMOTECH_ZYGOTE = new CustomItemStack(Material.TURTLE_EGG, c("§#496bdc合§#5b68dc子"));
    public static final ItemStack MOMOTECH_PARTICLE_CONSTRUCTOR = new CustomItemStack(Material.GREEN_STAINED_GLASS, c("§#6d64dc质§#7f60db合§#915ddb子§#a359da电§#b15cda容"), "&7可储存 §8⇨ §e⚡ &75000 J");
    public static final ItemStack MOMOTECH_PROTON_INGOT = new CustomItemStack(Material.AMETHYST_SHARD, c("§#ffaa00质§#dbb538子§#b8c06f锭"));
    public static final ItemStack MOMOTECH_ZYGOTE_INGOT = new CustomItemStack(Material.AMETHYST_SHARD, c("§#94cba7合§#6ccab2子§#44cabe锭"));
    public static final ItemStack MOMOTECH_SALT_GENERATOR = new CustomItemStack(Material.WHITE_STAINED_GLASS, c("§#1cc9c9盐§#68b5c8矿§#b3a1c6井"));
    public static final ItemStack MOMOTECH_INGOT_CONSTRUCTOR = new CustomItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, c("§#ff8dc5合§#f2a0d6金§#e6b3e6生§#d9c6f7成§#b1a0d8器"), "&7效率:32x");
    public static final ItemStack MOMOTECH_METAL_STAR = new CustomItemStack(Material.GOLD_BLOCK, "&6&l金属因子", "&7在合金生成器内使用");
    public static final ItemStack MOMOTECH_SAND_CHANGER = new CustomItemStack(Material.RED_SANDSTONE, c("§#8a79ba光§#62539b速§#8a8bba打§#b3c4da磨§#dbfcf9器"), "&7效率:INFINITY");
    public static final ItemStack MOMOTECH_FINAL_ENERGY_GENERATOR = new CustomItemStack(Material.REDSTONE_LAMP, c("§#55ff55宇§#55ff6e宙§#55ff87超§#55ffa1级§#55ffba无§#55ffd3敌§#55ffec神§#5bfcf6秘§#74efd0史§#8ee3aa诗§#a7d684永§#c0c95e恒§#d9bd39无§#f2b013限§#ffa90c充§#ffa824能§#ffa73c循§#ffa654环§#ffa56c过§#ffa384载§#ffa29c能§#f7ac9f量§#ecb99b生§#e0c797成§#d5d494单§#cae190元§#bfef8cζ§#b4fc88型"), c("§#ffaa00§o无§#fca634§o穷§#f8a169§o无§#f59d9d§o尽§#f7bdac§o的§#fadcbb§o宇§#fcfcca§o宙§#d9ec92§o能§#b6db5b§o量§#93cb23§o…"), "§8⇨ §e⚡ &7999,999,999,999,999,999,999,999,999,999,999,999,999,999,999,999^0 J/t");
    public static final ItemStack MOMOTECH_SPECIAL_THINGS_CONSTRUCTOR = new CustomItemStack(Material.GLASS, "&f特制压缩机", "§8⇨ §e⚡ &7200 J/t");
    public static final ItemGroup MOMOTECH_ITEM;
    public static final ItemGroup MOMOTECH_FINAL;
    public static final ItemGroup MOMOTECH;
    public static final ItemGroup MOMOTECH_MACHINE;
    public static final ItemGroup MOMOTECH_MINERAL;
    public static final ItemGroup MOMOTECH_ORDINARY_MACHINE;
    public static final ItemGroup MOMOTECH_THANKING;
    public static final ItemGroup MOMOTECH_TOOL;
    public static final ItemGroup MOMOTECH__;
    public static final ItemGroup MOMOTECH_ELECTRICITY;
    public static final ItemGroup MOMOTECH_INF;
    public static final ItemStack[] Cobblestone = new ItemStack[100];
    public static final ItemGroup MOMOTECH_INF_MACHINE;

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
                new CustomItemStack(Material.SOUL_CAMPFIRE, c("§#efa3de&l基§#ed9beb&l础§#ec98ed&l生§#ee9fd9&l产§#f1a5c6&l型§#f4acb3&l机§#f6b2a0&l器")), new CustomItemStack(Material.IRON_INGOT, c("§#d9f995&l基§#c6efa2&l础§#b2e5af&l物§#9fdbbc&l品")),
                new CustomItemStack(Material.DIAMOND, c("§#8cd1c9&l工§#78c7d7&l具")), new CustomItemStack(Material.REPEATING_COMMAND_BLOCK, c("§#b2eeaa&l&k… §#c2e9a3&l终§#d2e49b&l级§#e3df94&l物§#f3da8d&l品 §#fed48a&l&k…")),
                new CustomItemStack(Material.BLACK_CONCRETE_POWDER, c("§#f9b98c&l基§#fbbf79&l础§#fec666&l机§#fdcc5f&l器")), new CustomItemStack(Material.GOLD_BLOCK, "§6§l压缩材料"),
                new CustomItemStack(Material.ENCHANTED_BOOK, c("§#fad365&l鸣§#f7da6c&l谢§#f3e172 &l- §#f0e878&l特§#edef7e&l殊§#eaf684&l材§#e6fc8b&l料")), new CustomItemStack(Material.CHAIN_COMMAND_BLOCK, c("§#85f8c3&l&k陌§#81fcc0&l&k陌 §#91f7b9&l科§#a2f2b1&l技") + " §7(代码编写者:QYhB05)"),
                new CustomItemStack(Material.BLAZE_POWDER, c("§#8b9fca&l无§#a298bb&l限§#b892ac&l工§#cf8b9d&l程§#e6848e &l- §#fc7e7f&l初§#ff8178&l级")), new CustomItemStack(Material.SEA_PICKLE, c("§#65bde4&l电§#52b3f1&l力§#5eace9&l拓§#75a5da&l展")), new CustomItemStack(Material.PRISMARINE_CRYSTALS, c("§#ff8773&l无§#ff8c6e&l限§#ff9168&l工§#ff9663&l程§#ff9b5e &l- §#ffa058&l终§#ffa553&l焉"))};
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
