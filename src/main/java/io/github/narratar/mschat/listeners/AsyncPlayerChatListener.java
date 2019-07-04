package io.github.narratar.mschat.listeners;

import io.github.narratar.mschat.commands.OnOffCommand;
import io.github.narratar.mschat.managers.ConfigManager;
import io.github.narratar.mschat.utils.Util;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AsyncPlayerChatListener implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if (!OnOffCommand.isChatEnabled()) {
            if (!(player.hasPermission("mschat.bypass"))) {
                event.setCancelled(true);
                Util.sendMessage(player, ConfigManager.getChatIsDisabled());
            }
        }
    }
}
