

import java.util.ArrayList;
import java.util.Random;

public class RestaurantMap {
	
	public ArrayList<ArrayList<Vertex>> matrix;
	
	public static class Vertex
	{
		public int weight;
		public String ID;
		public Vertex(String id)
		{
			ID = id;
			switch(ID)
			{
			case "0":
				weight = Config.GetConfig().passTime_;
				break;
			case "K":
				weight = Config.GetConfig().passTime_;
				break;
			case "A":
				boolean isAccident = new Random().nextDouble() <= 0.3;
				if (isAccident)
				{
					weight = Config.GetConfig().accdTime_;
				}
				else
				{
					weight = Config.GetConfig().passTime_;
				}
				break;
			default:
				weight = Integer.MAX_VALUE;
				break;
			}
		}
	}
	
	
	public RestaurantMap()
	{
		
	}
}
