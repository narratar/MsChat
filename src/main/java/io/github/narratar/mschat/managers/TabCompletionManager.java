package io.github.narratar.mschat.managers;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TabCompletionManager implements TabCompleter {

    String[] commands = { "clear", "help", "info", "on", "off"};

    public List<String> onTabComplete(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (cmd.getName().equalsIgnoreCase("chat"))
            if (args.length == 1) {
                List<String> tabList = new ArrayList<>();

                if (!args[0].equals("")) {
                    for (String command : commands) {
                        if (command.toLowerCase().startsWith(args[0].toLowerCase())) {
                            tabList.add(command);
                        }
                    }
                } else {
                    for (String command : commands) {
                        tabList.add(command);
                    }
                }

                Collections.sort(tabList);
                return tabList;
            }
            else if (args.length > 1) {
                return Collections.emptyList();
            }
        return null;
    }
}
