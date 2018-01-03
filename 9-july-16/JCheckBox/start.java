import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;








public class start extends JFrame{

	private JTextField field;
	private JCheckBox boldBox;
	private JCheckBox italicBox;
	
	public start(){
		
		setLayout(new FlowLayout());
		
		
		field = new JTextField("Watch how style changes",21);
		field.setFont(new Font("Serif", Font.PLAIN, 14));
		add(field);
		
		
		boldBox = new JCheckBox("Bold");
		add(boldBox);
		
		italicBox = new JCheckBox("Italic");
		add(italicBox);
		
		
		itemshandler obj = new itemshandler();
		
		boldBox.addItemListener(obj);
		italicBox.addItemListener(obj);
		
	}
		
		private class itemshandler implements ItemListener{

			
			public void itemStateChanged(ItemEvent event) {
				
				
				if(boldBox.isSelected()){
					
					field.setFont(new Font("Serif", Font.BOLD, 14));
					
				}
				
				if(italicBox.isSelected()){
					
					field.setFont(new Font("Serif", Font.ITALIC, 14));
				}
				
				if(italicBox.isSelected() && boldBox.isSelected()){
					
					field.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 14));
				}
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
	
}