package de.etendo.fallguys.listeners;

//import de.etendo.fallguys.scoreboard.Scoreboard;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.net.http.WebSocket;

public class JoinListener implements WebSocket.Listener, Listener {
    @Override
    public void onOpen(WebSocket webSocket) { WebSocket.Listener.super.onOpen(webSocket); }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.setJoinMessage(ChatColor.GREEN + player.getName() + " hat den Server betreten!" );
        player.sendMessage( ChatColor.DARK_GREEN + "Wilkommen in Fall Guys in Minecraft " + player.getName());

        //new Scoreboard(player);
    }
}
