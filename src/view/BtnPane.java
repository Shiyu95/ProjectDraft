package view;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class BtnPane extends JPanel {
	private JButton pauseBtn;
	private JPanel radioPane;
	private JRadioButton eastBtn;
	private JRadioButton westBtn;	
//	private JRadioButton weNBtn;
	private JRadioButton northBtn;
	private JRadioButton southBtn;
//	private JRadioButton nsNBtn;
	private ActionHandle ahandle = new ActionHandle(); 
	private String startCmd;
	private String directionCmd;
	private String statusCmd = "forward";
	
	
	public BtnPane(){
		
		
		
		
	}//constructor
	
	public String getStartCmd(){
		return startCmd;
	}
	
	public String getDirectionCmd(){
		return directionCmd;
	};
	
	public String getStatusCmd(){
		return statusCmd;
	};
	
	public static void main(String[] args){
		JFrame jf = new JFrame();
		jf.setContentPane(new BtnPane());
		jf.setSize(800, 800);
		jf.setVisible(true);
		
	}//main
	
	public class ActionHandle implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = e.getActionCommand();
			if(str.equalsIgnoreCase("pause")){
				JButton jBtn = (JButton) e.getSource();
				jBtn.setActionCommand("start");
				jBtn.setText("Start");
				startCmd = "Start";
				//System.out.println(startCmd);
			}else if(str.equalsIgnoreCase("start")){
				JButton jBtn = (JButton) e.getSource();
				jBtn.setActionCommand("pause");
				jBtn.setText("Pause");
				startCmd = "Pause";
				//System.out.println(startCmd);
			}else{
				switch(str){
				case "east" : directionCmd = directionCmd.substring(0, 5) + str; break;
				case "west" : directionCmd = directionCmd.substring(0, 5) + str; break;
				//case "weNone" : directionCmd = directionCmd.substring(0, 5); break;
				case "north" : directionCmd = str + directionCmd.substring(5) ; break;
				case "south" : directionCmd = str + directionCmd.substring(5); break;
				//case "nsNone" : directionCmd = directionCmd.substring(5); break;
				default : directionCmd = "southeast"; break;
				}//swithc
				System.out.println(directionCmd);
			}//if-else if-else
		}

	}

}