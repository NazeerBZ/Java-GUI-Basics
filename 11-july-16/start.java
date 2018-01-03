import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;








public class start extends JFrame{
	
	private JComboBox dropdown;
	private JLabel label;
	private JLabel heading;
	private String[] names={"Bug1", "Bug2", "Bug3", "Bug4"};
	
	private Icon[] images = {new ImageIcon("E:\\bug1.png"), new ImageIcon("E:\\bug2.png"), new ImageIcon("E:\\bug3.png"),
							 new ImageIcon("E:\\bug4.png")};
	
	public start(){
		
		setLayout(new FlowLayout());
		
		heading = new JLabel("Select an Image");
		add(heading);
		
		dropdown = new JComboBox(names);
		dropdown.setMaximumRowCount(2);
	
		
		
		dropdown.addItemListener( new ItemListener(){

					public void itemStateChanged(ItemEvent event) {
						
						if(event.getStateChange() == ItemEvent.SELECTED){
						
							label.setIcon( images[dropdown.getSelectedIndex()] );
							
						}
						
					}
					
				}  );
		
		
		
		add(dropdown);
		label = new JLabel(images[0]);
		add(label);
		
		
		
	}

}
