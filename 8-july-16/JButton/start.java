import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;





public class start extends JFrame{

	private JButton simpleButton;
	private JButton fencyButton;
	
	public start(){
		
		setLayout(new FlowLayout());
	
		
		
		simpleButton = new JButton("Simple Button");
		add(simpleButton);
		
		
		Icon image1 = new ImageIcon("E:\\bugs.png");
		Icon image2 = new ImageIcon("E:\\bug2.png");
		
		fencyButton = new JButton("Fency button", image1);
		fencyButton.setRolloverIcon(image2);
		
		add(fencyButton);
		
		
		ButtonHandling obj = new ButtonHandling();
		
		simpleButton.addActionListener(obj);
		fencyButton.addActionListener(obj);
	
	}
	
	
		private class ButtonHandling implements ActionListener{

			
			public void actionPerformed(ActionEvent event) {
				
				
				if(event.getSource() == simpleButton){
					
					JOptionPane.showMessageDialog(null,"You pressed simple button");
				}
				
				if(event.getSource() == fencyButton){
					
					JOptionPane.showMessageDialog(null,"You pressed Fency button");
				}
				
			}
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
}
