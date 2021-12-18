package org.system;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
	//	System.out.println("hi");
		if((text1.length()) ==(text2.length())) 
		{
			
			char str1[]=text1.toCharArray();
			char str2[]=text2.toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2);
			for(int i=0;i<=text1.length()-1;i++)
			{
				
				if(str1[i]==str2[i])
				{
					System.out.println(" Text1: " + Character.valueOf(str1[i]) + " Text2: " +Character.valueOf(str2[i]) );
				}
				else
				{
					System.out.println("The texts are not same");
				}
			}
		}
		else 
		{
			System.out.println("The given string lengths are not matching!!");
		}
	}

}
