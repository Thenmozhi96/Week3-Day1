package org.system;

public class AssignmentSeven {

	public static void main(String[] args) {
		String text = "Java Exercise"; 
		char str1[]=text.toCharArray();
		for(int i=0;i<=text.length()-1;i++)
		{
			if( str1[i]=='E'|| str1[i]=='s')
			{
				System.out.println("The index of " + str1[i] +" is "+i );
			}
			else
			{
				continue;
			}
		}
	}

}