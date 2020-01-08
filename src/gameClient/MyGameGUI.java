package gameClient;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class MyGameGUI {
	
	public void drowFruit(String json_file)
	{
		Fruit fruit = null;
		Gson gson = new Gson();
		try 
		{
			FileReader reader = new FileReader(json_file);
			fruit = gson.fromJson(reader,Fruit.class);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void drowRobot(String json_file)
	{
		Robot robot = null;
		Gson gson = new Gson();
		try 
		{
			FileReader reader = new FileReader(json_file);
			robot = gson.fromJson(reader,Robot.class);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void drowEdge()
	{
		
	}
	
	public void drowNode()
	{
		
	}
	
	public void drowTime()
	{
		
	}
}
