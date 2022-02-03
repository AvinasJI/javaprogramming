package stringProgramming;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveDuplicateWord {

	@Test
	public void removeDuplicate()
	{
				String s="welcome to tyss and welcome to banglore";
				
				LinkedHashSet<String> set = new LinkedHashSet<String>();
				String[] sh = s.split(" ");
				
				for(int i=0 ; i<sh.length;i++)
				{
					set.add(sh[i]);
					
					
				}
				for(String st:set)
				{
					System.out.println(st);
				}
	}
}
