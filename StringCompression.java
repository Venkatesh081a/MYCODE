package comStringPrograms.java;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class StringCompression {
	
	
	
		public static  void compressString(String str) {
		
		int count = 0;
		
		int temp = str.charAt(0);
		
		for(int i = 0 ;i < str.length() ; i++)
		{
			if(str.charAt(i) == temp)
			{
				count ++;
			}
			else
			{
				System.out.print(temp +" "+ count);
				count = 1;
				temp = str.charAt(i);
			}
		}
		System.out.print( temp +" "+ count);
	}
	
public  static void main(String args[]) 
{
		
		System.out.println("enter a String of ur choice : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		compressString(str);
	}
}
