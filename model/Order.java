

public class Order {
	public int regisTime, tableNo, prepTime, deliveryTime;
	
	public Order(int r, int t, int p)
	{
		regisTime = r;
		tableNo = t;
		prepTime = p;
    }
    
	@Override
	public String toString()
	{
		return regisTime + ", " + tableNo + ", " + prepTime  + ", " +  deliveryTime + "\n";
    }
}
