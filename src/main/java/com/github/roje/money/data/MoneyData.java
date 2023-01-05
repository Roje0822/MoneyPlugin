package com.github.roje.money.data;

import org.bukkit.entity.Player;

import static com.github.roje.money.Main.plugin;

public class MoneyData {

    private Player player;

    public MoneyData(Player player) {
        this.player = player;
    }

    public void addMoney(Player target, Long amount) {
        Config config = new Config("data/" + target.getUniqueId(), plugin);
        config.setLong("money", getTargetMoney(target) + amount);
    }


    public void subtractMoney(Player target, Long amount) {
        Config config = new Config("data/" + target.getUniqueId(), plugin);
        config.setLong("money", getTargetMoney(target) - amount);
    }


    public void setTargetMoney(Player target, Long amount) {
        Config config = new Config("data/" + target.getUniqueId(), plugin);
        config.setLong("money", amount);
    }




    public Long getTargetMoney(Player target) {
        Config config = new Config("data/" + target.getUniqueId(), plugin);
        return config.getLong("money");
    }


    public Long getMoney() {
        Config config = new Config("data/" + player.getUniqueId(), plugin);
        return config.getLong("money");
    }
}
