package string;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Duplicate {
	static void countDuplicate(String s) {
		String[] words = s.split(" ");
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		for(String word:words)
		{
			if(map.containsKey(word.toLowerCase()))
			{
				map.put(word.toLowerCase(), map.get(word.toLowerCase())+1);
			}
			else
			{
				map.put(word.toLowerCase(), 1);
			}
		}
		for(String w:map.keySet())
		{
			if(map.get(w)>1)
			{
				System.out.println(w+"---> "+map.get(w));
			}
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the sentence to find the duplicate word.");
		String str=input.nextLine();
		countDuplicate(str);
		input.close();
	}
}