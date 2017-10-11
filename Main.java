package com.gmail.kagemaru.EnderFurnace;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public boolean onCommand(CommandSender sender, Command cmd) {
		if(cmd.getName().equalsIgnoreCase("ef")) {
			Player p = (Player) sender;
			Inventory inv = Bukkit.createInventory(null, InventoryType.FURNACE, "Ender Furnace - " + p.getName());
			p.openInventory(inv);
			p.playSound((Location) p, Sound.BLOCK_NOTE_HARP, 1, 1);
			sender.sendMessage("完了！");
			return true;
		}else {
			sender.sendMessage("失敗！");
			return false;
		}
	}
}
