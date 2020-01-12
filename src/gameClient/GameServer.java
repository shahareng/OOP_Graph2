package gameClient;


public class GameServer {

	private int fruit;
	private int moves;
	private int grade;
	private int robots;
	private String graph;

	public GameServer(int fruit, int moves, int grade, int robots, String graph)
	{
		this.fruit=fruit;
		this.moves=moves;
		this.grade=grade;
		this.robots=robots;
		this.graph=graph;
	}
	
	public int getFruit()
	{
		return this.fruit;
	}
	
	public int getMoves()
	{
		return this.moves;
	}
	
	public int getGrade()
	{
		return this.grade;
	}
	
	public int getRobots()
	{
		return this.robots;
	}
	
	public String getGraph()
	{
		return this.graph;
	}
}

// Graph

/*
 * Edges
 * int src
 * double w
 * int dest
 */

/*
 * Nodes
 * Point3D pos
 * int id
 */
