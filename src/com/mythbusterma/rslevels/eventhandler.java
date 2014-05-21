package com.mythbusterma.rslevels;

import java.util.HashSet;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.Plugin;

public class eventhandler implements Listener{
	public void Enable(Plugin pl){
		Bukkit.getServer().getPluginManager().registerEvents(this, pl);
	}

	//i know its very inefficient but its easy
	Set<Block> plplacedblocks = new HashSet<Block>();
	@EventHandler
	public void blockplaceevent(BlockPlaceEvent e){
		plplacedblocks.add(e.getBlock());
	}
	@EventHandler
	public void blockbreakevent(BlockBreakEvent e){
		if(plplacedblocks.contains(e.getBlock())){
			//broken block was placed by a player
			plplacedblocks.remove(e.getBlock());
			return;
		}else{
			//broken block was natural
			return;
		}
	}
}
