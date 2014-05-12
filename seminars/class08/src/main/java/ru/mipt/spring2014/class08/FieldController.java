/**
 * ImagePositioner.java Created On Apr 24, 2013
 *
 * @author Andrei
 */
package ru.mipt.spring2014.class08;

import java.awt.Color;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.swing.JComponent;
import ru.mipt.spring2014.class08.field.Car;
import ru.mipt.spring2014.class08.field.FieldEngine;
import ru.mipt.spring2014.class08.field.FieldModel;
import ru.mipt.spring2014.class08.field.Lights;

public class FieldController implements Runnable
{

	private static final Color[] COLORS = new Color[]
	{
		Color.GREEN, Color.BLACK, Color.BLUE, Color.RED, Color.YELLOW, Color.ORANGE
	};

	private final FieldEngine engine = new FieldEngine ();
	private final Queue<Car> changeRequests = new ConcurrentLinkedQueue ();
	private final Queue <Boolean> changeRequestsLights = new ConcurrentLinkedQueue ();
	
	private final JComponent component;
	private FieldModel currentState;

	public FieldController (JComponent component)
	{
		this.component = component;

		currentState = new FieldModel (4, 3, 5, false);
		for (int i = 0; i < 8; i++)
		{
			Car car = new Car (0.1, 0.1, COLORS[i % COLORS.length], Math.random () + 0.5,Math.random ()*0.1+0.01,0,false);
			car.setPosition (0.175 + 0.5 * i, 0);
			car.setVelocity (0,0);
			currentState.addNew (car);
		}    //Y cars

		Car carStop = new Car (0.1, 0.1, Color.WHITE, 0, 0,0,true);   //препятствие
		carStop.setPosition (2.175, 1.05);
		carStop.setVelocity (0,0);
		currentState.addNew (carStop);
		
		Car carStop2 = new Car (0.1, 0.1, Color.BLUE, 0, 0,0,true);   //препятствие
		carStop2.setPosition (3.175, 2.6);
		carStop2.setVelocity (0,0);
		currentState.addNew (carStop2);
		
		Car carStop3 = new Car (0.1, 0.1, Color.YELLOW, 0, 0,0,true);   //препятствие
		carStop3.setPosition (1.175, 1.9);
		carStop3.setVelocity (0,0);
		currentState.addNew (carStop3);
		
		for(int i=0; i<3;i++)
		{
			Car car = new Car (0.1, 0.1, COLORS[i % COLORS.length], Math.random () * 1.5 + 0.5,0,Math.random ()*0.1+0.01,false);
			car.setPosition (-0.15, 1.3+0.25*i);
			car.setVelocity (0,0);
			currentState.addNew (car);
		}  // X cars
		Lights lightsY= new Lights(3); // 3 - зеленый
		Lights lightsX= new Lights(1); // 1 - красный  . 2 - желтый
	}

	public FieldModel getCurrentState ()
	{
		return currentState;
	}

	public void changeCar (Car car)
	{
		changeRequests.add (car);
	}


	public void changeLights (boolean lights)
	{
		changeRequestsLights.add (lights);
	}
	

	public void stepOver (long dTime)
	{
		currentState = engine.calculateNewState (processChanges (), dTime);
		component.repaint ();
	}

	private FieldModel processChanges ()
	{   
		final FieldModel state = engine.calculateNewState (currentState, 0);
		while (!changeRequests.isEmpty ())
		{
			final Car changeRequest = changeRequests.poll ();
			for (Car car : state.getCars ())
			{
				if (changeRequest.getId () == car.getId ())
				{
					car.setPosition (changeRequest.getX (), changeRequest.getY ());
					car.setCrashStatus (changeRequest.getCrashStatus ());
				}
			}
			

		}

		while (!changeRequestsLights.isEmpty ())
		{
			final Boolean changeRequests3 = changeRequestsLights.poll ();
			state.setLights (changeRequests3);
			
		
		}
		return state;
	}

	@Override
	public void run ()
	{   
		long time = System.currentTimeMillis ();
		while (!Thread.interrupted ())
		{
			long newTime = System.currentTimeMillis ();
			stepOver (newTime - time);
			time = newTime;
			try
			{
				Thread.sleep (20L);
			} catch (InterruptedException e)
			{
				break;
			}
		}
	}
}
