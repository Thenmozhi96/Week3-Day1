package org.system;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char str1[]=test.toCharArray();
		for(int i=0;i<=test.length()-1;i++)
		{
			if(i%2==0)
			{
			System.out.print(Character.toUpperCase(str1[i]));
			}
			else
			{
				System.out.print(str1[i]);
			}
		}
	}

}
