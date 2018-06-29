package fh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


class Student
{
	int rollno;
	String name;
	int age;
	String stream;
	
	public Student(int rollno, String name, int age, String stream) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.stream = stream;
	}
}
	
public class DataFileHandling
{
	public void saveToFile(Student s)
	{
		FileWriter fileWriter=null;
		PrintWriter printWriter=null;
		try
		{
			fileWriter = new FileWriter("abc.txt",true);
			printWriter=new PrintWriter(fileWriter);
			printWriter.write(s.rollno+" "+s.name+" "+s.age+" "+s.stream+"\n");
			printWriter.flush();
		} 
		catch (IOException e) 
		{

			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fileWriter.close();
				printWriter.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
}

	public static void main(String[] args)
	{   
	
		Student s1=new Student(1,"puja",22,"science");
		Student s2=new Student(2,"sadiya",21,"science");
		Student s3=new Student(3,"pranjali",22,"science");
		List <Student>list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		
		DataFileHandling dataFileHandling=new DataFileHandling ();
		for(Student s:list)
		{
			dataFileHandling.saveToFile(s);
		}
		

		
	}
	

}
