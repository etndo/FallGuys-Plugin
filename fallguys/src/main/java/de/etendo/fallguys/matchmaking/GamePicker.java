package de.etendo.fallguys.matchmaking;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.Random;


public class GamePicker {
    String[] games =
            { "Bergspitze", "Türenlauf", "Röhrenraserei", "Arena Kampf", "Nasse Spritztour", "Fußball", "Eiergerangel", "Bootrennen",
                    "End Rennen", "Dreizack-Spießrutenlauf", "Atlantis", "Tropical Poolparty", "Dichter Wasser-Tempel", "Wüstenrennen",
                    "Lavakraxler", "Schaltkreislauf", "Bow-Spleef" , "Holzweg", "Blackstone-Parkour", "Sumo (klein)", "Sumo (groß)",
                    "Bogenschießen", "Netherrack Tower", "Wasserfall-Gerangel", "Schleimige Wasserfälle", "Waben-Viertel", "Festival-Straße",
                    "Loren-Rundfahrt", "Waterslide", "Spin Traps", "Festival-Turm","Wasserhöhlen-Rennen", "Eselsprünge" };
    Random random = new Random();
    public void randomizer() {
        String currentgame = games[random.nextInt(games.length)];
        sendTitle(currentgame);
        teleport(currentgame);
    }

    private void sendTitle(String game) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendTitle
                    (ChatColor.DARK_GREEN.toString() + ChatColor.BOLD + game, "");
        }
    }

    private void teleport(String game) {
        switch (game) {
            case("Bergspitze"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -28, 74, 59, 180, 0);
                    player.teleport(loc);
                }
                break;
            case("Türenlauf"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 20, 76, 91, 90, 0);
                    player.teleport(loc);
                }
                break;
            case("Röhrenraserei"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -60, 80, 139, 0, 0);
                    player.teleport(loc);
                }
                break;
            case("Arena Kampf"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 6, 63, 152, 0, 0);
                    player.teleport(loc);
                }
                break;
            case("Nasse Spritztour"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 47, 63, -13, 0, 0);
                    player.teleport(loc);
                }
                break;
            case("Fußball"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 12, 96, 312, 0, 0);
                    player.teleport(loc);
                }
                break;
            case("Eiergerangel"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -76, 97, 251, 45, 0);
                    player.teleport(loc);
                }
                break;
            case("Bootrennen"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -180, 65, 166, 90, 0);
                    player.teleport(loc);
                }
                break;
            case("End Rennen"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -188, 95, 85, 90, 0);
                    player.teleport(loc);
                }
                break;
            case("Dreizack-Spießrutenlauf"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 101, 63, 44, -90, 0);
                    player.teleport(loc);
                }
                break;
            case("Atlantis"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 170, 64, 110, -90, 0);
                    player.teleport(loc);
                }
                break;
            case("Tropical Poolparty"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -230, 71, 131, 90, 0);
                    player.teleport(loc);
                }
                break;
            case("Dichter Wasser-Tempel"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 129, 78, 183, -90, 0);
                    player.teleport(loc);
                }
                break;
            case("Wüstenrennen"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -138, 78, 112, -90, 0);
                    player.teleport(loc);
                }
                break;
            case("Lavakraxler"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 67, 96, 196, 180, 0);
                    player.teleport(loc);
                }
                break;
            case("Schaltkreislauf"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -131, 86, 182, 0, 0);
                    player.teleport(loc);
                }
                break;
            case("Bow-Spleef"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 58, 96, 271, 45, 0);
                    player.teleport(loc);
                }
                break;
            case("Holzweg"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -37, 95, 320, 0, 0);
                    player.teleport(loc);
                }
                break;
            case("Blackstone-Parkour"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -105, 71, -53, 90, 0);
                    player.teleport(loc);
                }
                break;
            case("Sumo (klein)"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -79, 78, 18, 0, 0);
                    player.teleport(loc);
                }
                break;
            case("Sumo (groß)"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -79, 84, -16, 0, 0);
                    player.teleport(loc);
                }
                break;
            case("Bogenschießen"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -109, 73, 101, 90, 0);
                    player.teleport(loc);
                }
                break;
            case("Netherrack Tower"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -34, 72, -54, 0, 0);
                    player.teleport(loc);
                }
                break;
            case("Schleimige Wasserfälle"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 159, 86, -92, -90, 0);
                    player.teleport(loc);
                }
                break;
            case("Waben-Viertel"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 8, 116, -145, 180, 0);
                    player.teleport(loc);
                }
                break;
            case("Festival-Straße"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 34, 116, -146, 180, 0);
                    player.teleport(loc);
                }
                break;
            case("Loren-Rundfahrt"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 85, 117, -140, 180, 0);
                    player.teleport(loc);
                }
                break;
            case("Wasserfall-Gerangel"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 152, 80, -182, 0, 0);
                    player.teleport(loc);
                }
                break;
            case("Party Turm"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 109, 116, -156, -90, 0);
                    player.teleport(loc);
                }
                break;
            case("Waterslide"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 358.5, 141, -41, 90, 0);
                    player.teleport(loc);
                }
                break;
            case("Spin Traps"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 159, 120, -199, -90, 0);
                    player.teleport(loc);
                }
                break;
            case("Festival-Turm"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 122, 116, -155, 90, 0);
                    player.teleport(loc);
                }
                break;
            case("Wasserhöhlen-Rennen"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), -73, 9, 54, 0, 0);
                    player.teleport(loc);
                }
                break;
            case("Eselsprünge"):
                for (Player player : Bukkit.getOnlinePlayers()) {
                    Location loc = new Location(Bukkit.getWorld("world"), 121, 119, -194, -180, 0);
                    player.teleport(loc);
                }
                break;

            default:
                break;
        }

    }
}
