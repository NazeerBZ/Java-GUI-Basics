
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class Test {

	public static void main (String args[]){
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		shapes obj1 = new shapes();
		
		String which;
			
		which = JOptionPane.showInputDialog(null,"Enter The number for The Shapes\n"+"\n 1: Draw Rectangle"+"\n 2: Draw Oval");
		
		int choice = Integer.parseInt(which);
		
		obj1.chooseshape(choice);
		
		frame.add(obj1);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		
	}
}
