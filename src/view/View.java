package view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Direction;

public class View extends JFrame{
	final static int FWIDTH = 800;
	final static int FHEIGHT = 800;
	private int imgWidth = 165;
	private int imgHeight = 165;
	private int imgIdx;
    final int frameCount = 10;
    private int xloc;
	private int yloc;
	private String currentDir;
	private String currentState;
	DrawPanel drawPanel = new DrawPanel();
	BtnPane btn = new BtnPane();
	public View(){
		imgIdx = 0;
		
		currentDir = "southeast";
		currentState = "forward";
		
		//lodImg = new LoadImages();
		
		this.getContentPane().setLayout(new FlowLayout());
		
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setSize(FWIDTH, FHEIGHT);
    	this.getContentPane().add(btn);
    	this.getContentPane().add(drawPanel);
    	setVisible(true);
    	//pack();
	}
	public int getWidth(){
		return FWIDTH;
	}//getWidth
	
	public int getHeight(){
		return FHEIGHT;
	}//getWidth
	
	public int getImageWidth(){
		return imgWidth;
	}//getWidth
	
	public int getImageHeight(){
		return imgHeight;
	}//getWidth
	
	public BtnPane getBtnPane(){
		return btn;
	}
	public void update(int x, int y, Direction d){

		xloc = x;
		yloc = y;
		currentDir = d.getName();
    	imgIdx = (btn.getStartCmd().equalsIgnoreCase("Start"))? imgIdx:(imgIdx+1) % frameCount;
    	drawPanel.repaint();
	}
	@SuppressWarnings("serial")
	private class DrawPanel extends JPanel {
    	int picNum = 0;

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.gray);
	    	//g.drawImage(lodImg.getImages(currentState).getbfImg(currentDir)[imgIdx], xloc, yloc, Color.gray, this);
		}

		public Dimension getPreferredSize() {
			return new Dimension(FWIDTH, FHEIGHT);
		}
	}
	
}
