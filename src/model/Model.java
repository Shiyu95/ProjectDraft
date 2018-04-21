package model;

public class Model {
	private int width;
	private int height;
	private int imWidth;
	private int imHeight;
	private Direction d;
	private int posX;
	private int posY;
	public Model(int wi, int hi, int imWi, int imHei){
		this.width = wi;
		this.height = hi;
		this.imWidth = imWi;
		this.imHeight = imHei;
		this.posX = 0;
		this.posY = 0;
		this.d = Direction.SOUTHEAST;
		
	}//Model
	public void updateLocationAndDirection(String startCmd, String dirCmd){
		if(startCmd.equalsIgnoreCase("Start")){}else{
    	//posX += d.getXdir() * xInc;
    	//posY += d.getYdir() * yInc;
    	//updateDirection(dirCmd);
    	//updateDir();
			}
	}//updateLocationAndDirection 
	public int getX() {
		 return posX;
	}//getX
	
	public int getY() {
		 return posY;
	}//getX
	
	public Direction getDirect(){
		 return d;
	}//getX
}
