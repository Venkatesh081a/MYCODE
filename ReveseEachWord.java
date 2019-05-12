package comStringPrograms.java;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class ReveseEachWord {
	public static void main(String args[])
	{
		System.out.println("enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		reverseEachWordOfAString(str);
	}

	public static void reverseEachWordOfAString(String str) 
	{
		
		String[] strArray = str.split(" ");
		String reversedStr = " ";
		
		for(int i = 0 ; i < strArray.length ; i ++)
		{
			String word = strArray[i];
			String reversedWord = " ";
			
			for(int j = word.length()-1 ; j >= 0 ; j --)
			{
				reversedWord = reversedWord + word.charAt(j);
			}
			reversedStr = reversedStr + reversedWord ;
		}
		
		//System.out.println(str);
		
		System.out.println(reversedStr);
	}
}
