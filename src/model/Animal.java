package model;

public abstract class Animal implements FloatingObjs{
	//TO DO :Please fill in the functions
	private int score;
	private int speed;
	private int Xloc=4;
	private int Yloc=5;
	public int getXloc() {
		return Xloc;
	};
	public int getYloc() {
		return Yloc;
	};
	public void spawn() {};
	public void onClick() {};
	public void destory() {};
	public void move() {
		
	};
	public void onCollision() {};
	public void Frozen() {};
}
