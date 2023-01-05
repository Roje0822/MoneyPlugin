package com.github.roje.money.event;

import com.github.nicklib.data.Config;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static com.github.roje.money.Main.plugin;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(@NotNull PlayerJoinEvent event) {

        Player player = event.getPlayer();
        Config config = new Config("data/" + player.getUniqueId(), plugin);
        if (!config.isFileExist()) config.setLong("money", 0l); config.saveConfig();
    }
}

