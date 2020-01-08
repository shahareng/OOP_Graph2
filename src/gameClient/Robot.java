package gameClient;

import oop_utils.OOP_Point3D;

public class Robot {

	private int src;
	private OOP_Point3D pos;
	private int id;
	private int dest;
	private int value;
	private int speed;

	public Robot(int src, OOP_Point3D pos, int id, int dest, int value, int speed)
	{
		this.src=src;
		this.pos=pos;
		this.id=id;
		this.dest=dest;
		this.value=value;
		this.speed=speed;
	}
}

