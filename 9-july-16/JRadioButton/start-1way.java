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
	private Font plain;
	private Font bold;
	private Font italic;
	private Font both;
	
	
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
		
		
		plain = new Font("Serif", Font.PLAIN, 14);
		bold = new Font("Serif", Font.BOLD, 14);
		italic = new Font("Serif", Font.ITALIC, 14);
		both = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		
	
		
		plainButton.addItemListener(new radiohandler(plain));
		boldButton.addItemListener(new radiohandler(bold));
		italicButton.addItemListener(new radiohandler(italic));
		italicbold.addItemListener(new radiohandler(both));
		
		
	}
		

				
		private class radiohandler implements ItemListener{
			
			private Font font;
			
			public radiohandler(Font f){
				
				font = f;
				
			}
			

			
			public void itemStateChanged(ItemEvent event) {
				
				field.setFont(font);
				
				
				
			}
			
			
			
		}
	
	
	
			
			
			
		}
		
		
