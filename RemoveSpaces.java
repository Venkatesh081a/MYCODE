package comStringPrograms.java;
import java.lang.System;
import java.util.Scanner;
import java.lang.String;

public class RemoveSpaces {
	public static  void main(String args[]) {
		
		System.out.println("enter a string ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] charArray = str.toCharArray();
		
		StringBuffer  sb = new StringBuffer();
		
		for(int i = 0;i < charArray.length ; i++)
			
		{
			if( (charArray[i] != ' ')  &&  (charArray[i] != '\t') )
				
					{
				       sb.append(charArray[i]);
					}
			
		}
		System.out.println(sb);
		
	}

}
