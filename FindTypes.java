package org.system;

public class FindTypes {

	public static void main(String[] args) {
		String text = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char str1[]=text.toCharArray();
		for(int i=0;i<=text.length()-1;i++)
		{
			if(Character.isLetter(str1[i]))
			{
				letter=letter+1;
				System.out.println(str1[i] +" is a letter: " + letter);
			}
			else if(Character.isDigit(str1[i]))
			{
				num=num+1;
				System.out.println(str1[i] +" is a Number : " + num);
			}
			else if(Character.isSpaceChar(str1[i]))
			{
				
				space=space+1;
				System.out.println(str1[i] +" is a Space: " + space);
			}
			else
			{
				specialChar=specialChar+1;
				System.out.println(str1[i] +" is a specialCharcter: " + specialChar);
			}
			
		}
		System.out.println();
		System.out.println("Total Counts");
		System.out.println("***************");
		System.out.println("Total Letters " + letter);
		System.out.println("Total Numbers: " + num);
		System.out.println("Total Space : " + space);
		System.out.println("Total Special Characters: "+ specialChar);
	}

}
