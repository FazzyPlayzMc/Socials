package me.fazzyplayzmc.socials.commands;

import me.fazzyplayzmc.socials.Socials;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WebCmd implements CommandExecutor {
    private Socials plugin;

    public WebCmd(Socials plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("must-be-player")));
            return true;
        }
        Player p = (Player) sender;
        if (p.hasPermission("socials.website")){
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("web-msg")));
        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("no-permission")));
        }
        return true;
    }
}
