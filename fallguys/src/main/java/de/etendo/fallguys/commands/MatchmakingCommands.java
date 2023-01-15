package de.etendo.fallguys.commands;

import de.etendo.fallguys.matchmaking.GamePicker;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MatchmakingCommands implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        GamePicker gamepicker = new GamePicker();
        gamepicker.randomizer();
        sender.sendMessage(ChatColor.GREEN + "Es wurde ein zufälliges Spiel gewählt!");
        return false;

    }
}
