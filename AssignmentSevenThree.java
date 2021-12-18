package org.system;

public class AssignmentSevenThree {

	public static void main(String[] args) {
		String sentence = "I am working with Java8";
				//replace 8 to 11 
				//Print the characters from 5 to 14
		String test1=sentence.replace(' ', '#');
		System.out.println(test1);
		String str1=sentence.replaceAll("[0-9]", "11");
		System.out.println(str1);
		String str3=sentence.substring(5, 14);
		System.out.println("Print using string method:"+ str3);
		char str2[]=sentence.toCharArray();
		for(int i=0;i<=sentence.length()-1;i++)
		{
			
		if(i>=5&&i<14)
		{
			System.out.print(str2[i]);
		}
		else
		{
			continue;
		}
		}
		
	}

}

