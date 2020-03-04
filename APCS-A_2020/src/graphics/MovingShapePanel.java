package graphics;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Font; 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingShapePanel extends JPanel implements Runnable
{
	private Shape sh;

	public MovingShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);

		//refer sh to a new Shape
		sh = new Shape(100,100,100,100, Color.BLUE,10,7);

		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("Yo what's up!",40,40);

		//tell sh to move and draw
		
		//sh.draw(getGraphics());
		sh.moveAndDraw(window);
		
		
		 
		if(!(sh.getX()>=10 && sh.getX()<=700))
		{
			sh.setXSpeed(-sh.getXSpeed());
		}
		
		if(!(sh.getY()>=10 && sh.getY()<=500)) {
			sh.setYSpeed(-sh.getYSpeed());
		}
		

		//add code to handle the top and bottom walls

	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(10);
            repaint();
         }
      }catch(Exception e)
      {
    	  System.out.println("AAAAA");
      }
  	}
}