import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
	private JList copyList;
	private JScrollPane scrollBox;
	private JButton button;
	private JButton rmButton;
	
	private String[] colorNames = { "Black", "Blue", "Cyan",
		 "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
		 "Orange", "Pink", "Red", "White", "Yellow" };
	
	
	public start(){
		
		setLayout(new FlowLayout());
		
		
		list = new JList(colorNames);	
		list.setVisibleRowCount(4);
		
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		scrollBox = new JScrollPane(list);
		add(scrollBox);
		
		
		button = new JButton("Copy");
		
		
		button.addActionListener(
				
				new ActionListener(){

					public void actionPerformed(ActionEvent event) {
						
						
						
						copyList.setListData(list.getSelectedValues());
						
					}
					
				}
				);
					
		
			add(button);
		
			
			
				copyList = new  JList();
				copyList.setVisibleRowCount(4);
				
				copyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				copyList.setFixedCellWidth(100);
				copyList.setFixedCellHeight(15);
				
				JScrollPane copyScrollBox = new JScrollPane(copyList);
				
				add(copyScrollBox);
				

		
		
		
		
		
		
	}

}
