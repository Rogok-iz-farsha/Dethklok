/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mipt.spring2014.class08.field;

/**
 *
 * @author Александр
 */
public class Lights
{   private int lights;

	public Lights(int lights)
	{
	this.lights=lights;
	}
	
	void setLights(int lights)
	{
			this.lights=lights;
	}
	public int getLights()
	{
		return lights;
	}
}
