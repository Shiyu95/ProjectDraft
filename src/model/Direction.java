package model;
/*
 * name : ZhangQingsen
 * name : FengYue
 * */

public enum Direction {

	NORTH("north", 0, -1),
	NORTHEAST("northeast", 1, -1),
	EAST("east", 1, 0),
	SOUTHEAST("southeast", 1, 1),
	SOUTH("south", 0, 1),
	SOUTHWEST("southwest", -1, 1),
	WEST("west", -1, 0),
	NORTHWEST("northwest", -1, -1);
	
	private String name = null;
	private int xDir;
	private int yDir;
	
	private Direction(String s, int x, int y){
		name = s;
		xDir = x;
		yDir = y;
	}
	public String getName() {
		return name;
	}
	
	public int getXdir(){
		return xDir;
	}
	
	public int getYdir(){
		return yDir;
	}

}
