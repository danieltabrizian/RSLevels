package com.mythbusterma.rslevels;

public class Utils {

	public static int minExpForLevel(int level) throws IllegalArgumentException {
		if (level > 99) {
			throw new IllegalArgumentException ("Level cannot be greater than 99");
		}
		if (level < 1) {
			throw new IllegalArgumentException ("Level cannot be lower than 1");
		}
		if (level == 1) {
			return 0;
		}
		
		double points = 0;
		
		for (int lvl = 1; lvl < level; lvl ++) {
			points += Math.floor(lvl + 300 * Math.pow(2.0, (double)lvl/7.0));
		}
		
		return (int) Math.floor(points/4);
	}
	
	/**
	 * Gets the level a player is at, given their exp
	 * 
	 * THIS METHOD IS TEMPORARY, IT IS EXTREMEMLY SLOW
	 * 
	 * @param exp
	 * @return The level they should be at
	 */
	public static int levelFromExp(int exp) {
		boolean found = false;
		int level = 1;
		
		while (!found) {
			if (level == 99) {
				found = true;
				break;
			}
			
			if(exp <= minExpForLevel(level +1)) {
				found = true;
			}
			else {
				level++;
			}
			
		}
		
		return level;
	}
	
	public static int expToNextLevel(int exp) {
		int level = levelFromExp(exp);
		int temp =0; 
		if(!(level == 99)) {
			temp = minExpForLevel(level+1) - exp;
		}
		return temp;
	}
	
}
