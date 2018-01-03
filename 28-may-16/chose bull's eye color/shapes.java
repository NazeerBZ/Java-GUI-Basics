
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;



public class shapes extends JPanel{
	
	private int one, two;
	
	public shapes(int r, int b){
		
		one = r;
		two = b;
		
	}
	
	
	
	public void paintComponent( Graphics g ){
	
	
	super.paintComponent(g);

	
	if(one == 1 && two==2){
	
	g.setColor(Color.YELLOW);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.GREEN);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.YELLOW);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.GREEN);
	g.fillOval(85, 85, 50, 50);
	
	}
	
	if(one == 1 && two==3){
		
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.BLUE);
		g.fillOval(35, 35, 150, 150);
		
		g.setColor(Color.YELLOW);
		g.fillOval(60, 60, 100, 100);
		
		g.setColor(Color.BLUE);
		g.fillOval(85, 85, 50, 50);
		
		}
		
if(one == 1 && two==4){
		
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.RED);
		g.fillOval(35, 35, 150, 150);
		
		g.setColor(Color.YELLOW);
		g.fillOval(60, 60, 100, 100);
		
		g.setColor(Color.RED);
		g.fillOval(85, 85, 50, 50);
		
		}
		
if(one == 1 && two==5){
	
	g.setColor(Color.YELLOW);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.BLACK);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.YELLOW);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.BLACK);
	g.fillOval(85, 85, 50, 50);
	
	}
		

if(one == 1 && two==6){
	
	g.setColor(Color.YELLOW);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.WHITE);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.YELLOW);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.WHITE);
	g.fillOval(85, 85, 50, 50);
	
	}
	
// second

if(one == 2 && two==1){
	
	g.setColor(Color.GREEN);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.YELLOW);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.GREEN);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.YELLOW);
	g.fillOval(85, 85, 50, 50);
	
	}
	
	if(one == 2 && two==3){
		
		g.setColor(Color.GREEN);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.BLUE);
		g.fillOval(35, 35, 150, 150);
		
		g.setColor(Color.GREEN);
		g.fillOval(60, 60, 100, 100);
		
		g.setColor(Color.BLUE);
		g.fillOval(85, 85, 50, 50);
		
		}
		
if(one ==2 && two==4){
		
		g.setColor(Color.GREEN);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.RED);
		g.fillOval(35, 35, 150, 150);
		
		g.setColor(Color.GREEN);
		g.fillOval(60, 60, 100, 100);
		
		g.setColor(Color.RED);
		g.fillOval(85, 85, 50, 50);
		
		}
		
if(one == 2 && two==5){
	
	g.setColor(Color.GREEN);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.BLACK);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.GREEN);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.BLACK);
	g.fillOval(85, 85, 50, 50);
	
	}
		

if(one == 2 && two==6){
	
	g.setColor(Color.GREEN);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.WHITE);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.GREEN);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.WHITE);
	g.fillOval(85, 85, 50, 50);
	
	}
	

// third

if(one == 3 && two==1){
	
	g.setColor(Color.BLUE);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.YELLOW);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.BLUE);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.YELLOW);
	g.fillOval(85, 85, 50, 50);
	
	}
	
	if(one == 3 && two==2){
		
		g.setColor(Color.BLUE);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.GREEN);
		g.fillOval(35, 35, 150, 150);
		
		g.setColor(Color.BLUE);
		g.fillOval(60, 60, 100, 100);
		
		g.setColor(Color.GREEN);
		g.fillOval(85, 85, 50, 50);
		
		}
		
if(one ==3 && two==4){
		
		g.setColor(Color.BLUE);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.RED);
		g.fillOval(35, 35, 150, 150);
		
		g.setColor(Color.BLUE);
		g.fillOval(60, 60, 100, 100);
		
		g.setColor(Color.RED);
		g.fillOval(85, 85, 50, 50);
		
		}
		
if(one == 3 && two==5){
	
	g.setColor(Color.BLUE);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.BLACK);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.BLUE);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.BLACK);
	g.fillOval(85, 85, 50, 50);
	
	}
		

if(one == 3 && two==6){
	
	g.setColor(Color.BLUE);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.WHITE);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.BLUE);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.WHITE);
	g.fillOval(85, 85, 50, 50);
	
	}
	
//Fourth

if(one == 4 && two==1){
	
	g.setColor(Color.RED);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.YELLOW);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.RED);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.YELLOW);
	g.fillOval(85, 85, 50, 50);
	
	}
	
	if(one == 4 && two==2){
		
		g.setColor(Color.RED);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.GREEN);
		g.fillOval(35, 35, 150, 150);
		
		g.setColor(Color.RED);
		g.fillOval(60, 60, 100, 100);
		
		g.setColor(Color.GREEN);
		g.fillOval(85, 85, 50, 50);
		
		}
		
if(one ==4 && two==3){
		
		g.setColor(Color.RED);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.BLUE);
		g.fillOval(35, 35, 150, 150);
		
		g.setColor(Color.RED);
		g.fillOval(60, 60, 100, 100);
		
		g.setColor(Color.BLUE);
		g.fillOval(85, 85, 50, 50);
		
		}
		
if(one == 4 && two==5){
	
	g.setColor(Color.RED);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.BLACK);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.RED);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.BLACK);
	g.fillOval(85, 85, 50, 50);
	
	}
		

if(one == 4 && two==6){
	
	g.setColor(Color.RED);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.WHITE);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.RED);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.WHITE);
	g.fillOval(85, 85, 50, 50);
	
	}


//Fifth

if(one == 5 && two==1){
	
	g.setColor(Color.BLACK);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.YELLOW);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.BLACK);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.YELLOW);
	g.fillOval(85, 85, 50, 50);
	
	}
	
	if(one == 5 && two==2){
		
		g.setColor(Color.BLACK);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.GREEN);
		g.fillOval(35, 35, 150, 150);
		
		g.setColor(Color.BLACK);
		g.fillOval(60, 60, 100, 100);
		
		g.setColor(Color.GREEN);
		g.fillOval(85, 85, 50, 50);
		
		}
		
if(one ==5 && two==3){
		
		g.setColor(Color.BLACK);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.BLUE);
		g.fillOval(35, 35, 150, 150);
		
		g.setColor(Color.BLACK);
		g.fillOval(60, 60, 100, 100);
		
		g.setColor(Color.BLUE);
		g.fillOval(85, 85, 50, 50);
		
		}
		
if(one == 5 && two==4){
	
	g.setColor(Color.BLACK);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.RED);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.BLACK);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.RED);
	g.fillOval(85, 85, 50, 50);
	
	}
		

if(one == 5 && two==6){
	
	g.setColor(Color.BLACK);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.WHITE);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.BLACK);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.WHITE);
	g.fillOval(85, 85, 50, 50);
	
	}


//SIXTH

if(one == 6 && two==1){
	
	g.setColor(Color.WHITE);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.YELLOW);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.WHITE);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.YELLOW);
	g.fillOval(85, 85, 50, 50);
	
	}
	
	if(one == 6 && two==2){
		
		g.setColor(Color.WHITE);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.GREEN);
		g.fillOval(35, 35, 150, 150);
		
		g.setColor(Color.WHITE);
		g.fillOval(60, 60, 100, 100);
		
		g.setColor(Color.GREEN);
		g.fillOval(85, 85, 50, 50);
		
		}
		
if(one ==6 && two==3){
		
		g.setColor(Color.WHITE);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.BLUE);
		g.fillOval(35, 35, 150, 150);
		
		g.setColor(Color.WHITE);
		g.fillOval(60, 60, 100, 100);
		
		g.setColor(Color.BLUE);
		g.fillOval(85, 85, 50, 50);
		
		}
		
if(one == 6 && two==4){
	
	g.setColor(Color.WHITE);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.RED);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.WHITE);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.RED);
	g.fillOval(85, 85, 50, 50);
	
	}
		

if(one == 6 && two==5){
	
	g.setColor(Color.WHITE);
	g.fillOval(10, 10, 200, 200);
	
	g.setColor(Color.BLACK);
	g.fillOval(35, 35, 150, 150);
	
	g.setColor(Color.WHITE);
	g.fillOval(60, 60, 100, 100);
	
	g.setColor(Color.BLACK);
	g.fillOval(85, 85, 50, 50);
	
	}



}
	
}