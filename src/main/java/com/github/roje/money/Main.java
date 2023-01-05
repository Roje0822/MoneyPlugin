package com.github.roje.money;

import com.github.roje.money.command.MoneyCmd;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main plugin;

    public void onEnable() {

        plugin = this;

        init();

    }

    public void init() {

        Bukkit.getPluginCommand("돈").setExecutor(new MoneyCmd());

    }
}
