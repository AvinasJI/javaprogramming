package stringProgramming;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveDuplicate {

	@Test
	public void removeDuplicate()
	{
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		String s = "INDIA";
		for(int i=0 ; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			System.out.println(ch);
		}
	}
}
