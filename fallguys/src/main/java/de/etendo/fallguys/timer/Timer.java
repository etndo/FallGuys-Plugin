package de.etendo.fallguys.timer;

import de.etendo.fallguys.main;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.scheduler.BukkitRunnable;

public class Timer {

    private boolean running;
    private int time;

    public Timer(boolean running, int time) {
        this.time = time;
        this.running = running;

        Run();
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    private void sendActionbar() {

        for (Player player : Bukkit.getOnlinePlayers()) {

            if (!isRunning()) {
                player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent
                        (ChatColor.RED.toString() + ChatColor.BOLD + " Der Timer ist abgelaufen!"));
                continue;
            }

            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent
                    (ChatColor.DARK_GREEN.toString() + ChatColor.BOLD + getTime() + ChatColor.GREEN.toString() + ChatColor.BOLD + " Sekunden"));
        }
    }

    private void Run() {
        new BukkitRunnable() {
            @Override
            public void run() {
                if (!isRunning()) {
                    return;
                }
                setTime(getTime() - 1);
                if(getTime() < 1){
                setRunning(false);
                }
                sendActionbar();
            }
        }.runTaskTimer(main.getInstance(),20 , 20);
    }
}
