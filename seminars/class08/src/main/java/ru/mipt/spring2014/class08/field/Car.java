/**
 * Car.java
 * Created on Mar 30, 2014
 */
package ru.mipt.spring2014.class08.field;

import java.awt.Color;

public class Car
{
	private final long id;
	private final double h,w;
	private final Color color;
	private double x, y;
	private double  vy,vx;
	private final double maxSpeed;
	private double accelerationY;
	private double accelerationX;
	private boolean crash;

	public Car (double h,double w, Color color,double maxSpeed,double accelerationY,double accelerationX,boolean crash)
	{
		this.id = -1;
		this.h = h;
		this.w=w;
		this.color = color;
		this.maxSpeed=maxSpeed;
		this.accelerationY=accelerationY;
		this.accelerationX=accelerationX;
		this.crash=crash;
	}

	protected Car (long id, double h,double w, Color color,double maxSpeed,double accelerationY,double accelerationX,boolean crash)
	{
		assert (id >= 0);
		this.id = id;
		this.h=h;
		this.w=w;
		this.color = color;
		this.maxSpeed=maxSpeed;
		this.accelerationY=accelerationY;
		this.accelerationX=accelerationX;
		this.crash=crash;
	}

	public Car copyBase ()
	{
		return new Car (id, h,w, color,maxSpeed,accelerationY,accelerationX,crash);
	}

	public long getId ()
	{
		return id;
	}

	public double getX ()
	{
		return x;
	}

	public double getY ()
	{
		return y;
	}

	public double getHeight ()
	{
		return h;
	}
	
	public double getWidht ()
	{
		return w;
	}

	public Color getColor ()
	{
		return color;
	}
	
	public double getSpeed()
	{
		return maxSpeed;
	}
	public double getAccelerationY()
	{
		return accelerationY;
	}
	public double getAccelerationX()
	{
		return accelerationX;
	}
	
	public void setPosition (double x, double y)
	{
		this.x = x;
		this.y = y;
	}



	public double getVy ()
	{
		return vy;
	}
    
	public double getVx()
	{
		return vx;
	}
	public void setVelocity (double vy,double vx)
	{
	
		this.vy = vy;
		this.vx = vx;
	}
	
	public void setAcceleration(double accelerationY,double accelerationX)
	{
		this.accelerationY=accelerationY;
		this.accelerationX=accelerationX;
	}
	
	public boolean getCrashStatus()
	{
		return crash;
	}
	public void setCrashStatus(boolean crash)
	{
		this.crash=crash;
	}

}
