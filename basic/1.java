
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class learning{

	public static void main(String args[]){
		
		
		JFrame frame = new JFrame();
		
		JButton print = new JButton("Hello");
		
		frame.setTitle("My Window");
		
		
		print.setBounds(34,150,130,46);
		
		
		frame.add(print);

		
		frame.setVisible(true);
		
	
		
	}
	
}
