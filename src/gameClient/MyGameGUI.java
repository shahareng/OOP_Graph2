package gameClient;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

import Server.Game_Server;
import Server.game_service;
import oop_dataStructure.OOP_DGraph;

public class MyGameGUI {

	public static void main(String[] a) {
		Dgraph();
	}

	public static void Dgraph()
	{
		int scenario_num; // get from the user
		game_service game = Game_Server.getServer(20); // you have [0,23] games
		String gameStr = game.toString();
		setGameServer(gameStr);
		OOP_DGraph g = new OOP_DGraph();
		//		g.init(game.getGraph());
		System.out.println(game); //
		System.out.println(game.getGraph()); //
//		String edge = game.getGraph();
//		drowEdge(edge);
		for(String fruit : game.getFruits())
		{
			System.out.println(fruit);
//						drowFruit(fruit);
		}
	}

	public static void setGameServer(String str)
	{
		Gson gson = new Gson();
		try 
		{
			FileReader reader = new FileReader(str);
			GameServer game = gson.fromJson(reader,GameServer.class);
			int numOfRobot = game.getRobots();
			drowRobot(numOfRobot);
			int grade = game.getGrade();
			showGrade(grade);
			String graph = game.getGraph();
			// create the graph in this line
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	// drow the fruits automatic on the graph
	public static void drowFruit(String json_file)
	{
		Gson gson = new Gson();
		try 
		{
			FileReader reader = new FileReader(json_file);
			Fruit fruit = gson.fromJson(reader,Fruit.class);
			if(fruit.getType() == 1)
			{
				// drow apple
			}
			else
			{
				// drow banana
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

	// the user click on nodes in the graph and this function create the robots on the nodes
	public static void drowRobot(int num)
	{
		// the user need to put robots on the graph with the mouse or the keyboard

	}

	// paint the edges on the graph
	public static void drowEdge(String json_file)
	{
		Gson gson = new Gson();
		try 
		{
			FileReader reader = new FileReader(json_file);
			Edges edge = gson.fromJson(reader,Edges.class);
			System.out.println(edge);
//			Nodes node = 
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

	// paint the nodes on the graph
	public static void drowNode()
	{

	}

	// show the time on the screen
	public static void showTime()
	{

	}

	// show the grade on the screen
	public static void showGrade(int grade)
	{

	}
}
