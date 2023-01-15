package de.etendo.fallguys.scoreboard;

import de.etendo.fallguys.main;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Scoreboard extends ScoreboardBuilder {


    public Scoreboard(Player player) {
        super(player, ChatColor.AQUA.toString() + ChatColor.BOLD + "Fall" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "Guys");

        run();
    }

    @Override
    public void createScoreboard() {
        setScore(ChatColor.DARK_GREEN.toString(), 11);
        setScore(ChatColor.DARK_GRAY.toString() + "•Geld: ", 10);
        setScore(ChatColor.GOLD.toString() + " Geld", 9);
        setScore(ChatColor.DARK_GRAY.toString() + "•Kronen: ", 8);
        setScore(ChatColor.YELLOW.toString() + " Kronen", 7);
        setScore(ChatColor.DARK_GRAY.toString() + "•Level: ", 6);
        setScore(ChatColor.DARK_AQUA.toString() + " Level", 5);
        setScore(ChatColor.DARK_GRAY.toString() + "•Erfahrung: ", 4);
        setScore(ChatColor.BLUE.toString() + " Erfahrung", 3);
        setScore(ChatColor.DARK_GRAY.toString() + "•Kronenlevel: ", 2);
        setScore(ChatColor.DARK_PURPLE.toString() + " Kronenlevel", 1);
        setScore(ChatColor.DARK_GRAY.toString(), 0);
    }

    @Override
    public void update() {

    }

    private void run() {
        new BukkitRunnable() {
            @Override
            public void run() {
                setScore(ChatColor.GOLD.toString() + " Geld", 9);
                setScore(ChatColor.YELLOW.toString() + " Kronen", 7);
                setScore(ChatColor.DARK_AQUA.toString() + " Level", 5);
                setScore(ChatColor.BLUE.toString() + " Erfahrung", 3);
                setScore(ChatColor.DARK_PURPLE.toString() + " Kronenlevel", 1);
            }
        }.runTaskTimer(main.getInstance(),20 , 40);
    }
}
