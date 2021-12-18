package org.system;

public class AssignmentSevenTwo {
	
	String str1="I am Learning Java" ;
	String str2="I am learning java";   
	public void Operatorequal()
	{
		if(str1==str2)
		{
			System.out.println("== operator test");
		}
		else
		{
			System.out.println("== operator test2");
			
		}
	}
	public void euqalMethod()
	{
		if(str1.equals(str2))
		{
			System.out.println("Equals operator test");
		}
		else
		{
			System.out.println("Equals operator test2");
			
		}
	}
	public void euqalcaseignore()
	{
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Equals ignore case operator test");
		}
		else
		{
			System.out.println("Equals ignore case operator test2");
			
		}
	}
	public static void main(String[] args) 
	{
		AssignmentSevenTwo assign = new AssignmentSevenTwo();
		
		assign.Operatorequal();
		assign.euqalMethod();
		assign.euqalcaseignore();
		
		 

	}

}
