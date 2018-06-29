package collection;
import java.util.*;

public class Student implements Comparable
{  int rollno;
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

 public static void main(String[] args)  
 {
	Student s1=new  Student(1,"puja",22,"science");
	Student s2=new  Student(2,"neha",22,"science");
	Student s3=new  Student(3,"sneha",22,"science");
	
	List list1=new ArrayList();
	list1.add(s1);
	list1.add(s2);
	list1.add(s3);
	 Iterator<Student>itr=list1.iterator();
	 while(itr.hasNext())
	 {
		Student b=itr.next(); 
		System.out.println(b.rollno+" "+b.name+" "+b.age+" "+b.stream);
		 
	 }
	
	
	
	
	
 
 
 }
 }
   
	


