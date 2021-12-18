package org.system;

public class ReverseEvenWords {

		public static void main(String[] args) {
			String test = "I am a software tester"; 
			String test1[]=test.split(" ");
			
			int len2=test1.length;
			
			for(int i=0;i<len2;i++)
			{
				
			if(i%2!=0)
			{
				
				for(int j=test1[i].length()-1;j>=0;j--)
				{
				System.out.print(test1[i].charAt(j));
					
				}
				
			}
			else
			{
				System.out.print(test1[i]);
			}
			System.out.print(" ");
			}

	}
}



