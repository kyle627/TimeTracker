package me.kyleevangelisto.timetracker;

import org.bukkit.plugin.java.JavaPlugin;

public final class TimeTracker extends JavaPlugin {

    private static TimeTracker plugin;

    @Override
    public void onEnable() {
        PlayerManager.getInstance();
        plugin = this;
        getCommand("playtime").setExecutor(new PlayTimeCommand()); //when command is run it will go to that
        // instance and run the on command method
        getServer().getPluginManager().registerEvents(new Listeners(), this);
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static TimeTracker getPlugin(){
        return plugin;
    }
}
