package comStringPrograms.java;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class StringReverseWithpreseevingSpaces {
	
	public static void main(String args[])
	{
		System.out.println("enter a string : ");
		Scanner sc = new Scanner(System.in);
		String str  = sc.nextLine();
		
		String[] strArray = str.split(" ");
		
		StringBuffer  sb = new StringBuffer(str);
		sb.reverse();
		
		for(int i = 0 ; i < str.length() ; i ++)
		{
			if(str.charAt(i) ==  ' ') 
			{
				sb.insert(i," ");
			}
		}
		
		sb.append(" ");
		
		System.out.println(sb);
	}
	}
	
	
