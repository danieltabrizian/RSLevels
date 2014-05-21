package com.mythbusterma.rslevels;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MessageHandler {
	//we will add a config in the future but for now:
	private static String prefix= ChatColor.GOLD +"["+ChatColor.RED +"RSLevels"+ ChatColor.GOLD+"] ";
	
	
	public static enum Mtype {
		Good, Bad, Neutral, Error
		}
	
	/**
	 * Sends a formatted message to a player
	 */
	
	@SuppressWarnings("rawtypes")
	public static void send(Player p,  Enum type, String message) {
		if(type == Mtype.Good){
			p.sendMessage(prefix +ChatColor.GREEN + message);
		}else if(type == Mtype.Neutral){
			p.sendMessage(prefix +ChatColor.YELLOW + message);
		}else if(type == Mtype.Bad){
			p.sendMessage(prefix +ChatColor.RED + message);
		}else if(type == Mtype.Error){
			p.sendMessage(prefix +ChatColor.DARK_RED+"-[ERROR]:" +ChatColor.RED+ message);
		}
    }
}
