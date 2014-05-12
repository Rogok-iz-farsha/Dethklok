/**
 * FieldEngine.java Created on Mar 30, 2014
 */
package ru.mipt.spring2014.class08.field;

import java.util.Collection;

public class FieldEngine
{

	public FieldModel calculateNewState (FieldModel state, long dTime)
	{
		final Collection<Car> cars = state.getCars ();
		final FieldModel newState = new FieldModel (state.getWidth (), state.getHeight (), cars.size (), state.getLights ());

		for (Car car : cars)
		{
			newState.put (calculateNewState (state, car, dTime));
		}

		return newState;
	}

	private Car calculateNewState (FieldModel field, Car car, long dTime)
	{
		boolean stopY = false;
		boolean stopX = false;
		boolean crash = car.getCrashStatus ();

		double vx = car.getVx ();
		double vy = car.getVy ();
		double x = car.getX () + vx * .001 * dTime;
		double y = car.getY () + vy * .001 * dTime;
		double random;

		if (y > field.getHeight () - car.getHeight ())
		{
			y = -0.2;
		}

		if (x > field.getWidth () - car.getWidht () + 0.5)
		{
			x = -0.3;
		}
////////////////////////////////////Догонялки YYYYYY////////////////////////////////////////////////////	
		for (Car nextCar : field.getCars ())
		{

			if (Math.abs (car.getY () - nextCar.getY ()) < 0.5 && Math.abs (car.getX () - nextCar.getX ()) < car.getWidht ()
					&& car != nextCar)

			{
				if (vy > nextCar.getVy ())

				{
					stopY = true;
					vy -= 0.03;
					if (vy < 0)
					{
						vy = 0;
					}
				}
			}

		}
////////////////////////////////////Догонялки XXXXXX////////////////////////////////////////////////////	
		for (Car nextCar : field.getCars ())
		{
			if (Math.abs (nextCar.getX () - car.getX ()) < 0.5 && nextCar != car
					&& Math.abs (nextCar.getY () - car.getY ()) <= car.getHeight ())
			{
				if (vx > nextCar.getVx ())
				{
					stopX = true;
					vx -= 0.04;
					if (vx < 0)
					{
						vx = 0;
					}
				}
			}
		}
/////////////////////////////////Светофор/////////////////////////////////////////////////////////		
////////////////////////////////YYYYYYY///////////////////////////////////////////////////////////
		if (field.getLights () && car.getY () > 0.3 && car.getY () < 1.05)
		{
			if (vy - car.getAccelerationY () > 0.5)
			{
				vy -= 0.02;
			}
			if (car.getY () > 1)
			{
				vy -= 0.05;
			}
			if (vy < 0)
			{
				vy = 0;
			}

		} else
		{
			if (vy < car.getSpeed () && !stopY && !car.getCrashStatus ())
			{
				vy += car.getAccelerationY ();
			}
		}
////////////////////////////////XXXXXXXX///////////////////////////////////////////////////////////		
		if (!field.getLights () && (car.getX () > 3.5 || car.getX () < 0))
		{
			if (vx - car.getAccelerationX () > 0.5)
			{
				vx -= 0.01;
			}
			if (car.getX () >= -0.3 && car.getX () < 0)
			{
				vx -= 0.01;
			}
			if (vx < 0)
			{
				vx = 0;
			}

		} else
		{
			if (vx < car.getSpeed () && !stopX && !car.getCrashStatus ())
			{
				vx += car.getAccelerationX ();
			}
		}

		/////////////////////////////////////Авария////////////////////////////////////////////////////////////  
		for (Car nextCar : field.getCars ())
		{
			if (Math.abs (nextCar.getY () - car.getY ()) <= car.getHeight ()
					&& Math.abs (car.getX () - nextCar.getX ()) <= car.getWidht ()
					&& car != nextCar)
			{
				vy = 0;
				vx = 0;
				crash = true;
			}
		}

 //////////////////////////////////////Обгон////////////////////////////////////////////////////////////
///////////////////////////////////////YYYYY////////////////////////////////////////////////////////////
		if (stopY && !car.getCrashStatus () && !field.getLights ()
				&& car.getVy () < 0.1)
		{
			random = Math.random () * 101 - 50;
			x += (random > 0) ? 0.3 : -0.3;
			stopY = false;
		}
//////////////////////////////////Перестроение/////////////////////////////////////////////////////////
//		
//			random = Math.random()*10000;
//			if(car.getX()<3 && car.getX ()>0.175 && !stopY && !car.getCrashStatus () &&  !field.getLights () && random>5000 && random<5010)
//		    x+=(random>5005) ? 0.1:-0.1;
//		
///////////////////////////////////////////////////////////////////////////////////////////////////////
		final Car result = car.copyBase ();
		result.setPosition (x, y);
		result.setVelocity (vy, vx);
		result.setCrashStatus (crash);
		return result;
	}
}
