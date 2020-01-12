package gameClient;

import utils.Point3D;

public class Fruit
{
	private double value;
	private int type;
	private Point3D pos;

	public Fruit(double value, int type, Point3D pos)
	{
		this.value=value;
		this.type=type;
		this.pos=pos;
	}
	
	public double getValue()
	{
		return this.value;
	}
	
	public int getType()
	{
		return this.type;
	}
	
	public Point3D getPos()
	{
		return this.pos;
	}
}

