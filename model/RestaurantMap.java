

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
		@Override
		public String toString()
		{
			return ID + "," + weight;
		}
	}

	public void addVertex(int row, Vertex v)
	{
		matrix.get(row).add(v);
	}
	public Vertex getVertex(int row, int col)
	{
		return matrix.get(row).get(col);
	}
	
	public RestaurantMap()
	{
		matrix = new ArrayList<ArrayList<Vertex>>();
		for(int row = 0; row < 8; row++)
		{
			matrix.add(new ArrayList<Vertex>());
		}
	}
	
	@Override
	public String toString()
	{
		String ret = "";
		for (int row = 0; row < 8; row++)
		 {
			 for (int col = 0; col < 8; col++)
			 {
				 ret += getVertex(row, col).toString() + " ";
			 }
			 ret += "\n";
		 }
		return ret;
	}
}
