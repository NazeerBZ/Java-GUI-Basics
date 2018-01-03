import java.awt.Color;
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
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;








public class start extends JFrame{
	
	private JList list;
	
	private String[] colorNames = { "Black", "Blue", "Cyan",
		 "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
		 "Orange", "Pink", "Red", "White", "Yellow" };
	
	private Color[] colors = { Color.BLACK, Color.BLUE,
			 Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
			 Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
			 Color.RED, Color.WHITE, Color.YELLOW };
	
	public start(){
		
		setLayout(new FlowLayout());
		
		
		list = new JList(colorNames);
		list.setVisibleRowCount(3);
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane scrollbox = new JScrollPane(list);
		
		
		add(scrollbox);
		
		
		list.addListSelectionListener(
				
				new ListSelectionListener(){
						
					public void valueChanged(ListSelectionEvent event) {
					
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
						
					}
					
					
					
					
					
					
				}
				
				
				
				
				);
		
		
		
		
		
		
		
	}

}
