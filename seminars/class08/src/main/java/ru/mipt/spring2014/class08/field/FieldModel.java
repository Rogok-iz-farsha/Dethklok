/**
 * FieldModel.java
 * Created on Mar 30, 2014
 */
package ru.mipt.spring2014.class08.field;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FieldModel
{
	private final double width, height;
	private final Collection<Car> cars;
	private boolean lights;

	public FieldModel (double width, double height,boolean lights)
	{
		this (width, height, 16,false);
	}

	public FieldModel (double width, double height, int initialCapacity, boolean lights)
	{
		this.width = width;
		this.height = height;
		this.cars = new ArrayList<Car> (initialCapacity);
		this.lights=lights;
		
	}

	public double getWidth ()
	{
		return width;
	}

	public double getHeight ()
	{
		return height;
	}

	public Collection<Car> getCars ()
	{
		return Collections.unmodifiableCollection (cars);
	}
	
	public boolean getLights()
	{
		return lights;
	}
	
	public void setLights(boolean lights)
	{
		this.lights=lights;
	}

	public void addNew (Car car)
	{
		assert (car.getId () == -1);
		final Car newCar = new Car 
		(cars.size (), car.getHeight (),car.getWidht (),car.getColor (),car.getSpeed (),car.getAccelerationY (),car.getAccelerationX (),car.getCrashStatus());
		newCar.setPosition (car.getX (), car.getY ());
		newCar.setVelocity (car.getVy (),car.getVx ());
		cars.add (newCar);
	}

	protected void put (Car car)
	{
		assert (car.getId () == cars.size ());
		cars.add (car);
	}

	
}
