
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;



public class shapes extends JPanel{
	
	
	public void paintComponent( Graphics g ){
	
	
	super.paintComponent(g);
	
	//Face
	g.setColor(Color.YELLOW);
	g.fillOval(10, 10, 200, 200);
	
	//Eyes
	g.setColor(Color.BLACK);
	g.fillOval(55, 65, 30, 30);
	g.fillOval(135, 65, 30, 30);
	
	//Lips
	g.setColor(Color.BLACK);
	g.fillOval( 50, 110, 120, 60 );
	
	//Fixing lips into Smile
	g.setColor( Color.YELLOW );
	g.fillRect( 50, 110, 120, 30 );
	g.fillOval(50, 120, 120, 40);
	}


}