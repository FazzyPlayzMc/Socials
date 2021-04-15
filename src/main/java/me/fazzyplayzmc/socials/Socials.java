package me.fazzyplayzmc.socials;

import me.fazzyplayzmc.socials.commands.DiscordCmd;
import me.fazzyplayzmc.socials.commands.WebCmd;
import org.bukkit.plugin.java.JavaPlugin;

public final class Socials extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getConfig().options().copyDefaults();

        // Register commands
        getCommand("discord").setExecutor(new DiscordCmd(this));
        getCommand("website").setExecutor(new WebCmd(this));
        test
    }
}
