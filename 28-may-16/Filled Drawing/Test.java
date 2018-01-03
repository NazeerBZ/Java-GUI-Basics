
import javax.swing.JFrame;




public class Test {

	public static void main (String args[]){
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		shapes obj1 = new shapes();
		
		frame.add(obj1);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		
	}
}
