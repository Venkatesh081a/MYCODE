package comStringPrograms.java;
import java.lang.String;
import java.lang.System;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FollowsPattern {
	
	public static void main(String args[]) {
		
		String str = "venkatesh";
		System.out.println("enter the pattern u want to serch in the string : ");
		Scanner sc = new Scanner(System.in);
		String pattern = sc.nextLine();
		
		System.out.println(isfollowspattern(str,pattern));
	}

	public static boolean isfollowspattern(String str , String pattern) {
		
		Set<Character> hashset = new HashSet<>();
		for(int i = 0 ; i < pattern.length() ; i ++)
		{
			hashset.add(pattern.charAt(i));
			
		}
		
		StringBuilder sb = new StringBuilder(str);
		
		for(int  i = str.length()-1 ; i > 0 ; i--)
		{
			if(!hashset.contains(sb.charAt(i)))
			{
				sb.deleteCharAt(i);
				
			}
		}
		for(int i = sb.length()-1 ; i > 0 ;i --)
		{
			if(sb.charAt(i) == sb.charAt(i - 1))
				
				sb.deleteCharAt(i);
		}
		
		if(pattern.length() != sb.length())
		
			return false;
		 
		
		for(int i = 0 ; i < pattern.length() ; i ++)
		{
			if(pattern.charAt(i) == sb.charAt(i))
				return true;
			else
				return false;
			
		}
		return false;
		
		
	}
}
