

import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

import model.RestaurantMap.*;

public class MyFileReader {
    Scanner scan;
    File file;
    
    public MyFileReader(String filename)
    {
        try 
        {
           file = new File(filename);
           scan = new Scanner(file);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public void ReadInputFile()
    {
        Config c = GetConfig();
        System.out.println(c.toString());
        
        RestaurantMap rMap = GetMap();
        System.out.println(rMap);
        
        ArrayList<Order> orders = GetOrders();
        System.out.println(orders);
    }
    
    public Config GetConfig()
    {
        int pass = 0, accd = 0, handOver = 0, deliver = 0;
        try
        {
            pass = scan.nextInt();
            accd = scan.nextInt();
            handOver = scan.nextInt();
            deliver = scan.nextInt();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        scan.nextLine();
       return Config.NewConfig(pass, accd, handOver, deliver);
    }
    
    public RestaurantMap GetMap()
    {
        RestaurantMap rMap = new RestaurantMap();
        for (int row = 0; row < 8; row++)
        {
            String line = scan.nextLine();
            System.out.println(line);
            String[] tokens = line.split(" ");
            for (int col = 0; col < 8; col++)
            {
                Vertex v = new Vertex(tokens[col]);
                rMap.addVertex(row, v);
            }
        }
        return rMap;
    }
    
    public ArrayList<Order> GetOrders()
    {
        ArrayList<Order> orders = new ArrayList<Order>();
        while (scan.hasNext())
        {
            orders.add(GetNextOrder());
        }
        return orders;
    }
    
    public Order GetNextOrder()
    {
        int r, t, p;
        r = scan.nextInt();
        t = scan.nextInt();
        p = scan.nextInt();
        return new Order(r,t,p); // Bizarre Love Triangle
    }
    
}