package controller;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Timer;

import model.Model;
import view.View;

public class Controller {

	private Model model;
	private View view;
	private final int drawDelay = 40; //msec
	private String startCmd;
	private String dirCmd;
	private String StatusCmd;
	
	private Action drawAction = new AbstractAction(){
		public void actionPerformed(ActionEvent e){
			updateStatus();
			model.updateLocationAndDirection(startCmd, dirCmd);
			view.update(model.getX(), model.getY(), model.getDirect());
		}
	};
	
	public Controller(){
		view = new View();
		model = new Model(view.getWidth(), view.getHeight(), view.getImageWidth(), view.getImageHeight());
	}
	
	public void updateStatus(){
		startCmd = view.getBtnPane().getStartCmd();
		dirCmd = view.getBtnPane().getDirectionCmd();
		StatusCmd = view.getBtnPane().getStatusCmd();		
		//System.out.println(startCmd);
	}
	
	public View getView(){
		return view;
	}
	
        //run the simulation
	public void start() {
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				Timer t = new Timer(drawDelay, drawAction);
				t.start();
			}
		});
	}
	public static void main(String[] args) throws InterruptedException{
    	Controller cl = new Controller();
    	cl.start();
    }//main
}
