package model;

public class SnakeHead extends InvasiveSpecies{
	int speed = 10;
	int score = 100;
	public static void main(String args[]) {
		SnakeHead a = new SnakeHead();
		System.out.println(a.getXloc());
		System.out.println(a.speed);
	}
}
