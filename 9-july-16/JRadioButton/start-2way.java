import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;








public class start extends JFrame{

	private JTextField field;
	private JRadioButton plainButton;
	private JRadioButton boldButton;
	private JRadioButton italicButton;
	private JRadioButton italicbold;
	private ButtonGroup groupRadio;
	
	
	
	public start(){
		
		setLayout(new FlowLayout());

		field = new JTextField("Watch how Style changes",21);
		add(field);
		
		
		plainButton = new JRadioButton("Plain",true);
		add(plainButton);
		
		boldButton = new JRadioButton("Bold",false);
		add(boldButton);
		
		italicButton = new JRadioButton("Italic",false);
		add(italicButton);
		
		italicbold = new JRadioButton("Italic & Bold",false);
		add(italicbold);
		
		
		groupRadio = new ButtonGroup();
		
		groupRadio.add(plainButton);
		groupRadio.add(boldButton);
		groupRadio.add(italicButton);
		groupRadio.add(italicbold);
		
		
		
		radiohandler obj = new radiohandler();
	
		
		plainButton.addItemListener(obj);
		boldButton.addItemListener(obj);
		italicButton.addItemListener(obj);
		italicbold.addItemListener(obj);
		
		
	}
		

				
		private class radiohandler implements ItemListener{
			
			

			
			public void itemStateChanged(ItemEvent event) {
				
				
				if(plainButton.isSelected()){
					
					field.setFont(new Font("Serif", Font.PLAIN, 14));
					
				}
				
				if(boldButton.isSelected()){
					
					field.setFont(new Font("Serif", Font.BOLD, 14));
					
				}

		if(italicButton.isSelected()){
	
	field.setFont(new Font("Serif", Font.ITALIC, 14));
	
}

		if(italicbold.isSelected()){
	
	field.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 14));
	
}
				
			}
			
			
			
		}
	
	
	
			
			
			
		}
		
		
