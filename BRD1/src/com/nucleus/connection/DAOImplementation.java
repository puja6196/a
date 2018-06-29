package com.nucleus.connection;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class DAOImplementation 
{
	public void readFile()
	{
		FileReader fileReader=null;
	BufferedReader bufferedReader=null;
		try
		{
			 fileReader=new FileReader("C:\\Users\\temp\\Desktop\\teastcase1\\testCase1.txt");
			 bufferedReader=new BufferedReader(fileReader);
			String line;
		
			while((line=bufferedReader.readLine())!=null)
			{
				String []sp1=line.split("~");
				for(int i=0;i<sp1.length;i++)
				{   
					
					System.out.println(sp1[i]);
					
				}
				
			
				
			}
	}
		catch (IOException e) 
		{

			e.printStackTrace();
		}
	  finally
	  {
		 
		
		try 
		{
			bufferedReader.close();
			fileReader.close();
		} 
		catch (IOException e) 
		{

			e.printStackTrace();
		} 
		  
		  
	  }
		
		
		
	}
	public static void main(String []args)
	{
		DAOImplementation readClass=new DAOImplementation();
		readClass.readFile();
		
		
		
	}
}
