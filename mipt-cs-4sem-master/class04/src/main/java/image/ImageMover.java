/**
 * ImagePositioner.java
 * Created On Apr 24, 2013
 * @author Andrei
 */
package image;

import java.awt.Point;
import javax.swing.JComponent;

public class ImageMover extends Thread
{
	private final JComponent component;

	private int width = 0, height = 0;
	private Point position = new Point ();
	private int vx = 0, vy = 0;
       
        

	public ImageMover (JComponent component)
	{
		this.component = component;
	}

	public void setVelocity (int vx, int vy)
	{
		this.vx = vx;
		this.vy = vy;
	}

	public synchronized void resize (int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	public Point getCurrentPosition ()
	{
		return new Point (position);
	}

	private Point calculateNewPosition (long dtime)
	{      
               
		Point newPos = new Point (position);
                
		newPos.x += vx*dtime/10;
		newPos.y += vy*dtime/10;
                timeIn=timeOut;
		if (newPos.x < 0)
		{
			newPos.x = -newPos.x;
			vx = -vx;
		}
		if (newPos.y < 0)
		{
			newPos.y = -newPos.y;
			vy = -vy;
		}
		if (newPos.x >= width)
		{
			newPos.x = 2 * width - newPos.x;
			vx = -vx;
		}
		if (newPos.y >= height)
		{
			newPos.y = 2 * height - newPos.y;
			vy = -vy;
		}
		return newPos;
                
	}

	public synchronized void stepOver ()
	{
		if (width == 0 || height == 0 || Math.abs (vx) >= width || Math.abs (vy) >= height)
		{
			return;
		}

		position = calculateNewPosition ();
		component.repaint ();
	}

	@Override
	public void run ()
	{       long time=System.currentTimeMillis();
		while (!Thread.interrupted ())
		{       long newTime=System.currentTimeMillis();
			stepOver (newTime-time);
			try{
				Thread.sleep (20L);
                                
			} catch (InterruptedException e)
			{
				break;
			}
		}
	}
}
