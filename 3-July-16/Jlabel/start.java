import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;






public class start extends JFrame {
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private ImageIcon image;
	private JPanel panel;
	
	public start(){
		
		
		setLayout(new FlowLayout());
		
	label1 = new JLabel("This is first label");
	label1.setToolTipText("label1");
	add(label1);
	
	image = new ImageIcon ("E:\\bugs.png");
	
	label2 = new JLabel ("this is second label with PIC");
	label2.setIcon(image);
	label2.setToolTipText( "label2" );
	add(label2);
	
	
	label3 = new JLabel();
	label3.setText("this is thrid label");
	label3.setIcon(image);
	add(label3);
		
	}
	

}
