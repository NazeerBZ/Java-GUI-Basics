
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class Test {

	public static void main (String args[]){
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int chose1, chose2;
		String str1, str2;
		
		str1 = JOptionPane.showInputDialog(null,"Which color of Bull's eye do you want??\n               Enter the first Color"
				+ "\n1: Yellow\n2: Green\n3: Blue\n4: Red\n5: Black\n6: White");
		
		str2 = JOptionPane.showInputDialog(null,"Which color of Bull's eye do you want??\n               Enter the Second Color"
				+ "\n1: Yellow\n2: Green\n3: Blue\n4: Red\n5: Black\n6: White");
		
		JOptionPane.showMessageDialog(null,"Your Chosen Bull's Eye color is ready !!");
		
		chose1 = Integer.parseInt(str1);
		chose2 = Integer.parseInt(str2);
		
		shapes obj1 = new shapes(chose1 , chose2);
		
		frame.add(obj1);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		
	}
}
