package gameClient;

import utils.Point3D;

public class Robot {

	private int src;
	private Point3D pos;
	private int id;
	private int dest;
	private int value;
	private int speed;

	public Robot(int src, Point3D pos, int id, int dest, int value, int speed)
	{
		this.src=src;
		this.pos=pos;
		this.id=id;
		this.dest=dest;
		this.value=value;
		this.speed=speed;
	}
	
	public int getSrc()
	{
		return this.src;
	}
	
	public Point3D getPos()
	{
		return this.pos;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public int getDest()
	{
		return this.dest;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
}

