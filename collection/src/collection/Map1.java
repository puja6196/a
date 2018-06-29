package collection;

import java.util.*;


public class Map1 
{
	public static void main(String []args)
	{
		Map<Integer,String> map1=new HashMap<Integer,String> ();
		map1.put(1,"puja");
		map1.put(2 ,"sadiya");
		map1.put(3 ,"sadiya");
		
		
		System.out.println(map1);
		System.out.println("size="+map1.size());
		map1.clear();
		System.out.println("size after clear="+map1.size());
		
		
		
	}

}
