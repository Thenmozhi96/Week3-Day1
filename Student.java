package org.system;

public class Student extends Department 
{
	public void studentName()
	{
		System.out.println("Thenmozhi A");
	}
	public void studentDept()
	{
		System.out.println("CS");
	}
	public void studentId()
	{
		System.out.println("12BIT058");
	}

	public static void main(String args[])
	{
	Student stu = new Student();
	stu.collegeName();
	stu.collegeCode();
	stu.collegeRank();
	stu.deptName();
	stu.studentId();
	stu.studentName();
	stu.studentDept();

	
	}
}