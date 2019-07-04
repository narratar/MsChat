package io.github.narratar.mschat.commands;

import io.github.narratar.mschat.managers.ConfigManager;
import io.github.narratar.mschat.utils.Util;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearCommand {

    private static int emptyMessagesOnClear = ConfigManager.getEmptyMessagesOnClear();

    public static void clearChat(CommandSender sender) {
        if (!sender.hasPermission("mschat.admin")) {
            Util.sendMessage(sender, ConfigManager.getNoPermission());
            return;
        }
        Util.broadcast(" ", false, emptyMessagesOnClear);
        Util.broadcast(ConfigManager.getSpacerUp(), true, 1);
        Util.broadcast(ConfigManager.getChatClear(), true, 1);
        Util.broadcast(ConfigManager.getSpacerDown(), true, 1);
    }
}
