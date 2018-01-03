
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;






public class start extends JFrame{
	
	private JLabel label;
	private JPanel panel;
	
	
	public start(){
		
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel,BorderLayout.CENTER);
		
		label = new JLabel("Mouse Outside JPanel");
		add(label,BorderLayout.SOUTH);
	
		
		panel.addMouseListener(
				
				new MouseListener(){

					
					public void mouseClicked(MouseEvent event) {
			
						label.setText(String.format("Clicked At %d , %d", event.getX(), event.getY() ));
						
					}

					
					public void mouseEntered(MouseEvent event) {
						
						//label.setText(String.format("Mouse Entered At %d , %d", event.getX(), event.getY() ) );
						panel.setBackground(Color.GREEN);
						
					}

					
					public void mouseExited(MouseEvent event) {
						
						label.setText("Mouse Outside JPanel");
						panel.setBackground(Color.WHITE);
					}

					
					public void mousePressed(MouseEvent event) {
						
						
						label.setText(String.format("Pressed At %d , %d", event.getX(), event.getY() ));
						
					}

					
					public void mouseReleased(MouseEvent event) {
						
						
						label.setText(String.format("Released At %d , %d", event.getX(), event.getY() ));

					}
					
				}	);
		
		
		
		panel.addMouseMotionListener(
				
				
				new MouseMotionListener(){

					
					public void mouseDragged(MouseEvent event) {
						
						label.setText(String.format("Dragged At %d , %d", event.getX() , event.getY() ) );
						
						
					}

					
					public void mouseMoved(MouseEvent event) {
						
						label.setText(String.format("Moved At %d , %d", event.getX(), event.getY() ) );
						
					}
					
					
					
					
					
					
				}
				
				
				
				
				
				
				
				);
		
		
		
		
		
		
		
	}

}
