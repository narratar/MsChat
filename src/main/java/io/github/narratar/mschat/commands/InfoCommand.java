package io.github.narratar.mschat.commands;

import io.github.narratar.mschat.managers.ConfigManager;
import io.github.narratar.mschat.utils.Util;
import org.bukkit.command.CommandSender;

public class InfoCommand {
    public static void sendInfo(CommandSender sender) {
        if (!sender.hasPermission("mschat.admin")) {
            Util.sendMessage(sender, ConfigManager.getNoPermission());
            return;
        }

        if (OnOffCommand.isChatEnabled()) {
            Util.sendMessage(sender, ConfigManager.getChatIsEnabled());
        }
        else {
            Util.sendMessage(sender, ConfigManager.getChatIsDisabled());
        }
    }
}
