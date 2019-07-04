package io.github.narratar.mschat;

import io.github.narratar.mschat.listeners.AsyncPlayerChatListener;
import io.github.narratar.mschat.managers.CommandManager;
import io.github.narratar.mschat.managers.ConfigManager;
import io.github.narratar.mschat.managers.TabCompletionManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MsChat extends JavaPlugin {

    private static MsChat instance;

    @Override
    public void onEnable() {
        instance = this;
        ConfigManager.load();
        getCommand("chat").setExecutor(new CommandManager());
        getCommand("chat").setTabCompleter(new TabCompletionManager());
        getServer().getPluginManager().registerEvents(new AsyncPlayerChatListener(), this);
    }

    @Override
    public void onDisable() {

    }

    public static MsChat getInstance() {
        return instance;
    }
}
