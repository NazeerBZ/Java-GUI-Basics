
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;



public class shapes extends JPanel{
	

	private Color INDIGO = new Color(128, 0, 128);
	
	
	private Color[] rang = {Color.WHITE, Color.RED, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.BLUE, Color.MAGENTA,
		                    Color.PINK, INDIGO};
	  
	
	public shapes(){
		
		setBackground(Color.BLACK);
		
	}
	
	
	public void paintComponent(Graphics g){
		
		
		super.paintComponent(g);
		
		
		for(int i=0; i<rang.length; i++){
			
			
			g.setColor(rang[i]);
			
			
			     g.fillRect(10 + i*10, 10 + i*10, 50 + i*10, 50 + i*10);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}