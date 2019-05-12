package comStringPrograms.java;
import java.lang.String;
import java.lang.System;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubString {
	
	public static void main(String args[]) {
		
		System.out.println("enter a string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		islongestSubString(str);
	}

	private static void islongestSubString(String str) {
		
		char[] charArray = str.toCharArray();
		
		String longestsubstring = null;
		int longestsubstringlength = 0;
		
		Map<Character,Integer> hashmap = new LinkedHashMap <Character,Integer>();
		
		for(int i = 0 ;i < charArray.length ;i++)
		{
			char ch = charArray[i];
			
			if(!hashmap.containsKey(ch))
			{
				hashmap.put(ch, i);
			}
			else
			{
				i = hashmap.get(ch);
				hashmap.clear();
				
			}
		}
		
		if(hashmap.size() > longestsubstringlength)
		{
			longestsubstringlength  = hashmap.size();
			
			longestsubstring = hashmap.keySet().toString();
		}
		
		System.out.println("the longestsubstring  is : " + longestsubstring);
		
		System.out.println("the length of the longestsubstring is : " + longestsubstringlength);
	}
	

}
