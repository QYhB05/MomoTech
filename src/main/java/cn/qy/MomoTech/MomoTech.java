package cn.qy.MomoTech;

import cn.qy.MomoTech.Listeners.Listeners;
import cn.qy.MomoTech.tasks.ItemRegisterTask;
import cn.qy.MomoTech.tasks.MachineRegisterTask;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.logging.Logger;

public class MomoTech extends JavaPlugin implements SlimefunAddon {

    public static double tps;
    public static Logger logger;
    public static Server server;
    public static int playerNumber;
    public static int seed;
    private static MomoTech instance;

    public static MomoTech getInstance() {
        return instance;
    }

    public static void init(Logger l, Server s) {
        playerNumber = s.getOnlinePlayers().size();
        tps = s.getTPS()[0];
        seed = new Random().nextInt() % 1000000;
    }

    @Override
    public void onEnable() {
        getLogger().info("MomoTech has been on enable.");
        getLogger().info("---------< MomoTech >-------");
        getLogger().info("|      Authors:QYhB05      |");
        getLogger().info("|      Plugin:MomoTech     |");
        getLogger().info("|      Version:1.1.4       |");
        getLogger().info("----------------------------");
        getLogger().info("> INFO:MomoTech(乱码科技/陌陌科技) v1.1.4");
        getLogger().info("> 依赖项:SlimeFun4");
        getLogger().info("> 感谢Chenmose, skybule提供想法");
        getLogger().info("> QQ反馈群:827684043");
        getLogger().info("> E-mail:3392295184@qq.com");
        getLogger().info("> 使用的API版本: 1.20.1-R0.1-SNAPSHOT");
        getLogger().info("> 使用的SlimeFun4版本: RC-35");
        getLogger().info("> 使用的License:MIT");
        getLogger().info("> 下载链接:https://github.com/QYhB05/MomoTech/tree/main");
        getLogger().info("> 感谢您的使用和支持, 欢迎提出更多想法以及建议");
        getLogger().info("> 欢迎您为我们制作不同语言的版本, 也欢迎您魔改本插件");
        getLogger().info("----------------------------");
        getLogger().info("=>载入附属中...");
        getLogger().info("=>开始");
        instance = this;
        getLogger().info("=>开始注册监听器");
        getServer().getPluginManager().registerEvents(new Listeners(), this);
        getLogger().info("=>监听器注册成功");
        getLogger().info("=>初始化参数");
        init(getLogger(), getServer());
        logger = getLogger();
        server = getServer();
        getLogger().info("=>开始注册物品");
        ItemRegisterTask.run(getLogger());
        getLogger().info("=>物品注册成功");
        getLogger().info("=>开始注册机器");
        MachineRegisterTask.run(getLogger());
        getLogger().info("=>机器注册成功");
        getLogger().info("=>所有物品注册完毕, 附属已成功启动, 再次感谢您的支持");
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
        getLogger().info("MomoTech has been on disable.");
        getLogger().info("=>MomoTech插件已关闭, 期待您的下次使用");
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Override
    public @NotNull JavaPlugin getJavaPlugin() {
        return this;
    }
}
