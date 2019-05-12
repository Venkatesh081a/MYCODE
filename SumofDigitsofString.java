package comStringPrograms.java;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class SumofDigitsofString {
	public static void main(String args[]) {
		
		System.out.println("enter a String with numbers");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		SumofDigits(str);
	}
public static void SumofDigits(String str)
{
	int sum = 0;
	for(int i = 0 ; i < str.length() ; i ++)
	{
		char c = str.charAt(i);
		
		if(Character.isDigit(c))
		{
			int b = Integer.parseInt(String.valueOf(c));
			if(b % 2 == 0)
			{
				sum = sum + b ;
			}
			else
			{
				System.out.println("it is an odd value");
			}
			 
		}
	}
	
	if(sum == 0)
		System.out.println(-1);
	else
		System.out.println(sum);
}
}
