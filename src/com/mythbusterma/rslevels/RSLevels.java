package com.mythbusterma.rslevels;

import java.util.logging.Level;



import org.bukkit.plugin.java.JavaPlugin;

public class RSLevels extends JavaPlugin {
	MessageHandler MH;
	@Override
	public void onEnable () {
		long startTime = System.currentTimeMillis();
		Utils.levelFromExp(9000000);
		long estimatedTime = System.currentTimeMillis() - startTime;
		
		getServer().getLogger().log(Level.INFO, String.valueOf(Utils.levelFromExp(9000000)));
		getServer().getLogger().log(Level.INFO, "Elapsed time: " + estimatedTime);
		try {
			 MH = MessageHandler.class.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	@Override
	public void onDisable () {		
		getServer().getLogger().severe("Has been disabled!");
	}

	

}
