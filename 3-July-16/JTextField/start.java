import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;






public class start extends JFrame {
	
	
	private JTextField field1;
	private JTextField field2;
	private JTextField field3;
	private JPasswordField password;
	
	public start(){
		
		setLayout(new FlowLayout());
		
		field1 = new JTextField(21);
		add(field1);
		
			
		field2 = new JTextField("Enter your name",21);
		add(field2);
		
		
		field3 = new JTextField("this is not Editable",21);
		field3.setEditable(false);
		add(field3);
		
		password = new JPasswordField ("this is Hidden",21);
		add(password);		
		
		
		handlingfields obj = new handlingfields();
		
		field1.addActionListener(obj);
		field2.addActionListener(obj);
		field3.addActionListener(obj);
		password.addActionListener(obj);
		
	}
	
	
		private class handlingfields implements ActionListener{
			
			
			public void actionPerformed(ActionEvent event){
				
				
				
				if(event.getSource() == field1){
					
					JOptionPane.showMessageDialog(null,"Field1:"+event.getActionCommand());
					
				}
				
				else if(event.getSource() == field2){
					
					JOptionPane.showMessageDialog(null,"Field2:"+event.getActionCommand());
				}
				
				else if(event.getSource() == field3){
					
					JOptionPane.showMessageDialog(null,"Field3:"+event.getActionCommand());
				}
				
				else if(event.getSource() == password){
					
					JOptionPane.showMessageDialog(null,"password:"+event.getActionCommand());
				}
				
				
				
			}
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
