package winterScene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;

public class WinterScenePanel extends JPanel implements Runnable
{
	private List<AbstractShape> shapes;
	private AbstractShape sMan;
	private Tree tree;

	public WinterScenePanel()
	{
		setVisible(true);
		//refer shapes to a new ArrayList of AbstractShape
		shapes = new ArrayList<AbstractShape>();
		//populate the list with 50 unique snowflakes
		
		Random randy = new Random();
		
		for(int i = 0; i < 50; i++) {
			shapes.add(new FancySnowFlake(randy.nextInt(800),randy.nextInt(600),10,10));
			//shapes.add(new FancySnowFlake(((int) Math.random()*400),((int) Math.random()*400),10,10));
			//shapes.add(new FancySnowFlake(100,100,10,10));
		}
		//instantiate a snowman
		sMan = new SnowMan(350,480,80,80);
		
		tree = new Tree(150,480,80,80, new Color(101,67,33));

		new Thread(this).start();
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	public void paint(Graphics window)
	{
		window.setColor(new Color(135,206,235));
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("WINTER SCENE!",40,40);
		shapes.get(0).draw(window);
		for(int i = 0; i < shapes.size(); i++) {
			shapes.get(i).moveAndDraw(window);
		}
		//make the snowman appear
		sMan.draw(window);
		tree.draw(window);
		//make the snowflakes appear and move down the screen
		//check to see if any of the snowflakes need to be reset to the top of the screen
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(35);
            repaint();
         }
      }catch(Exception e)
      {
    	  System.out.println("UH-OH, FAIL");
      }
  	}
}