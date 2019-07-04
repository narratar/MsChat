package io.github.narratar.mschat.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Util {

    public static void sendMessage(CommandSender sender, String string) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', string));
    }

    public static void broadcast(String string, boolean sendToConsole, int repeatNumber) {
        if (sendToConsole) {
            for (int i = 0; i < repeatNumber; i++){
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', string));
            }
        }
        else {
            for (Player player : Bukkit.getOnlinePlayers()) {
                for (int i = 0; i < repeatNumber; i++) {
                    sendMessage(player, string);
                }
            }
        }
    }
}
