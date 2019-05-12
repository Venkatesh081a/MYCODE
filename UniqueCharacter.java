package comStringPrograms.java;
import java.lang.String;
import java.lang.System;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {
	
	public static void main(String args[]) {
		
		System.out.println("enter the string of ur choice");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(hasUniqueCharacter(str));
		
	}

	
	public static boolean hasUniqueCharacter(String str)
	{
		Set<Character> set = new HashSet<>();
		
		for(char c : str.toCharArray())
		{
			if(set.contains(c))
			{
				return false;
		    }
			set.add(c);
		
	}
		return true;
}

}