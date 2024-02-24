package cn.qy.MomoTech;

import cn.qy.MomoTech.Listeners.Listeners;
import cn.qy.MomoTech.tasks.ItemRegisterTask;
import cn.qy.MomoTech.tasks.MachineRegisterTask;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

public class MomoTech extends JavaPlugin implements SlimefunAddon {

    public static double tps;
    public static Logger logger;
    public static Server server;
    public static int playerNumber;
    private static MomoTech instance;

    public static MomoTech getInstance() {
        return instance;
    }

    public static void init(Logger l, Server s) {
        playerNumber = s.getOnlinePlayers().size();
        tps = s.getTPS()[0];
    }

    @Override
    public void onEnable() {
        getLogger().info("MomoTech has been on enable.");
        instance = this;
        getServer().getPluginManager().registerEvents(new Listeners(), this);
        init(getLogger(), getServer());
        logger = getLogger();
        server = getServer();
        ItemRegisterTask.run(getLogger());
        MachineRegisterTask.run(getLogger());
    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
        getLogger().info("MomoTech has been on disable.");
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
