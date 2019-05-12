package comStringPrograms.java;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class StringSorting {
	public static void main(String args[]) {
		
		System.out.println("enter a string to be sorted : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String sortedString = " ";
		
		char[] chArray = str.toCharArray();
		
		for(int i = 0 ; i < chArray.length ; i ++)
		{
			for(int j = 0 ; j < chArray.length ; j++)
			{
				if(chArray[i] < chArray[j])
				{
					char temp = chArray[i];
					chArray[i] = chArray[j];
					chArray[j] = temp;
				}
			}
		}
		
		for(int K = 0 ; K < chArray.length ; K ++)
		{
			sortedString = sortedString + chArray[K];
		}
		System.out.println("sorted String is " + sortedString);
	}

}
