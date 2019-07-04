package io.github.narratar.mschat.commands;

import io.github.narratar.mschat.MsChat;
import io.github.narratar.mschat.managers.ConfigManager;
import io.github.narratar.mschat.utils.Util;
import org.bukkit.command.CommandSender;

public class HelpCommand {
    public static void sendHelp(CommandSender sender) {
        if (!sender.hasPermission("mschat.admin")) {
            Util.sendMessage(sender, ConfigManager.getNoPermission());
            return;
        }
        Util.sendMessage(sender, ConfigManager.getHelpPlugin().replace("{VERSION}", MsChat.getInstance().getDescription().getVersion()));
        Util.sendMessage(sender, ConfigManager.getHelpOn());
        Util.sendMessage(sender, ConfigManager.getHelpOff());
        Util.sendMessage(sender, ConfigManager.getHelpClear());
        Util.sendMessage(sender, ConfigManager.getHelpInfo());
        Util.sendMessage(sender, ConfigManager.getHelpHelp());
        Util.sendMessage(sender, ConfigManager.getHelpAlias());
    }
}
