package comStringPrograms.java;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class StringContainsOnlyDigits {
	
	static String strname = "venkatesh";
	static String strcellnum = "999990029";
	
	public static boolean verifystrname()
	{
		
		if(strname.matches("[a-zA-Z]+"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static boolean verifystrcell()
	{
		
		if(strcellnum.matches("[0-9]+"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String args[]) 
	{
		

		System.out.println(verifystrname());
		System.out.println(verifystrcell());
		
		}

}
