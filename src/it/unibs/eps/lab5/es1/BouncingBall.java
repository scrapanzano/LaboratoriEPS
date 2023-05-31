package it.unibs.eps.lab5.es1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BouncingBall extends JPanel implements Runnable{

	private static final int SPEED = 5;
	private int x;
	private int y;
	private int angleX;
	private int angleY;

	
	public BouncingBall() {
		angleX = SPEED;
		angleY = SPEED;
	}
	
	@Override
	public void run() {
		while(true) {
			
			if(x + angleX <= 0)
				angleX = SPEED;
			else if(x + angleX > getWidth() - 50)
				angleX = -SPEED;
			else if(y + angleY < 0)
				angleY = SPEED;
			else if(y + angleY > getHeight() - 50)
				angleY = -SPEED;
			
			x += angleX;
			y += angleY;
			
			repaint();
			 
	          try {
	            Thread.sleep(50);
	          } catch (InterruptedException ex) {
	          }
		}
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLUE);
		g.fillOval(x, y, 50, 50);  
	  }
	
}
