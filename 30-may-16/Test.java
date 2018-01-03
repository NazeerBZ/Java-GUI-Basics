
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class Test {

	public static void main (String args[]){
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		shapes obj = new shapes();
		
		
		frame.add(obj);
		frame.setTitle("Color Rectangle");
		frame.setSize(300,300);
		frame.setVisible(true);
		
		
	}
}
