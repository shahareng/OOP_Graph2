package gameClient;

import oop_utils.OOP_Point3D;

public class Fruit
{
	private double value;
	private int type;
	private OOP_Point3D pos;

	public Fruit(double value, int type, OOP_Point3D pos)
	{
		this.value=value;
		this.type=type;
		this.pos=pos;
	}
}

