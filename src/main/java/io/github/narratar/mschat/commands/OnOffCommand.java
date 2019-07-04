package io.github.narratar.mschat.commands;

import io.github.narratar.mschat.managers.ConfigManager;
import io.github.narratar.mschat.utils.Util;
import org.bukkit.command.CommandSender;

public class OnOffCommand {

    private static boolean chatEnabled = true;

    public static void setChatState(CommandSender sender, boolean state) {
        if (!sender.hasPermission("mschat.admin")) {
            Util.sendMessage(sender, ConfigManager.getNoPermission());
            return;
        }

        if (chatEnabled && state) {
            Util.sendMessage(sender, ConfigManager.getChatIsEnabled());
        }
        else if (!chatEnabled && !state) {
            Util.sendMessage(sender, ConfigManager.getChatIsDisabled());
        }
        else if (chatEnabled && !state) {
            chatEnabled = false;
            Util.broadcast(ConfigManager.getSpacerUp(), true, 1);
            Util.broadcast(ConfigManager.getChatOff(), true, 1);
            Util.broadcast(ConfigManager.getSpacerDown(), true, 1);
        }
        else if (!chatEnabled && state) {
            chatEnabled = true;
            Util.broadcast(ConfigManager.getSpacerUp(), true, 1);
            Util.broadcast(ConfigManager.getChatOn(), true, 1);
            Util.broadcast(ConfigManager.getSpacerDown(), true, 1);
        }
    }

    public static boolean isChatEnabled() {
        return chatEnabled;
    }
}
