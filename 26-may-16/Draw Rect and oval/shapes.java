
import javax.swing.JPanel;

import java.awt.Graphics;


public class shapes extends JPanel{
	
	
	private int choose;
	
	public void chooseshape(int num){
		
		choose = num;
		
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		
		if(choose==1){
			
			for(int i=0; i<10; i++){
				
				g.drawRect(10 + i*10, 10 + i*10, 50 + i*10, 50 + i*10);
				
			}
		}
			
		if(choose==2){
			
			 for(int j=0; j<10; j++){
				
				g.drawOval(10 + j*10, 10 + j*10, 50 + j*10, 50 + j*10);
				
			}
	}
		
			
	}
	
	
	
		
	}


