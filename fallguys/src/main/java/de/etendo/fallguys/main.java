package de.etendo.fallguys;

import de.etendo.fallguys.commands.MatchmakingCommands;
import de.etendo.fallguys.commands.TimerCommands;
import de.etendo.fallguys.listeners.JoinListener;
import de.etendo.fallguys.listeners.QuitListener;
import de.etendo.fallguys.timer.Timer;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    private static main instance;

    private Timer timer;
    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new JoinListener(),  this);
        manager.registerEvents(new QuitListener(),  this);

        getCommand("timer").setExecutor( new TimerCommands());
        getCommand("gamepicker").setExecutor( new MatchmakingCommands());
        timer = new Timer(false,0);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }

    public static main getInstance() {
        return instance;
    }

    public Timer getTimer() {
        return timer;
    }

}
