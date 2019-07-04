package io.github.narratar.mschat.managers;

import io.github.narratar.mschat.commands.*;
import io.github.narratar.mschat.utils.Util;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandManager implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!cmd.getName().equalsIgnoreCase("chat")) {
           return false;
        }

        if (args.length == 0 || args.length == 1 && args[0].equalsIgnoreCase("info")) {
            InfoCommand.sendInfo(sender);
        }
        else if (args[0].equalsIgnoreCase("help")) {
            HelpCommand.sendHelp(sender);
        }
        else if (args[0].equalsIgnoreCase("clear")) {
            ClearCommand.clearChat(sender);
        }
        else if (args[0].equalsIgnoreCase("on")) {
            OnOffCommand.setChatState(sender, true);
        }
        else if (args[0].equalsIgnoreCase("off")) {
            OnOffCommand.setChatState(sender, false);
        }
        else {
            Util.sendMessage(sender, ConfigManager.getWrongArgument());
        }
        return true;
    }
}
