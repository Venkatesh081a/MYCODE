package comStringPrograms.java;
import java.lang.System;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.String;

public class firstNonRepeatedCharacter {
	public static void main(String args[]) {
		
		System.out.println("enter a string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		HashMap < Character , Integer > hm = new HashMap < Character , Integer > ();
		
		Character ch;
		
		for(int i = 0 ;i < str.length() ; i ++)
		{
			ch = str.charAt(i);
			
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch) + 1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		
		for(int j = 0 ; j < str.length() ; j ++)
		{
			ch = str.charAt(j);
			
			if(hm.get(ch) == 1)
			{
				System.out.println("the firstnonrepeatesd character is " + ch);
				
				break;
				
			}
		}
	}

}
