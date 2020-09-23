package me.aderm.namecontains;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NameContains extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);

        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if(getConfig().getBoolean("ignoreCase")) {
            for(String names : getConfig().getStringList("nameContains")) {
                if(player.getName().toLowerCase().contains(names)) {
                    for(String commands : getConfig().getStringList("commands")) {
                        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), (commands).replace("{player}", player.getName()));
                    }
                }
            }
        }
        for(String names : getConfig().getStringList("nameContains")) {
            if(player.getName().contains(names)) {
                for(String commands : getConfig().getStringList("commands")) {
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), (commands).replace("{player}", player.getName()));
                }
            }
        }
    }

}
