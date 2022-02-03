package stringProgramming;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class NoOfOccuranceOfEachCharacter {

	@Test
	public void noOfOccurance()
	{
		String s ="java" ;
/* step:1 create any set collection and add all the character of given string into set*/
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
/* step:2 compare each char of set with all the character of given String*/
		for(Character ch:set) {
			int count=0;
			for( int i= 0; i<s.length();i++) {
				if(ch==s.charAt(i))
				{
/* step:3 if character matches increase the count */
					count++;
				}
			}
/* step:4 print both character of set and count */
			System.out.println(ch+"   "+count);
		}
	}
	
@Test
public void noOfOcurance()
{
	System.out.println("enter any letter");
	Scanner s = new Scanner(System.in);
	String str = s.next();
  
LinkedHashSet<Character> set = new LinkedHashSet<Character>();
for(int i =0 ;i<str.length();i++)
{
	set.add(str.charAt(i));
}
System.out.println(set);

for(   Character ch:set)
{
	int count=0;
	for(int i =0 ;i<str.length();i++)
	{
	if(ch==str.charAt(i))
	{
		count++;
	}
}
	if(count>1)   // for getting duplicate characters
	System.out.println( ch+" "+count);
	
	if(count==1)  // for getting unique character
	{
		System.out.println(ch+ "    "+count);
	}
	
	
}
}

@Test
public void FindThePositionOfEachCharacter()//Tester
{
	String s= "Tester";
	String str = s.toLowerCase();
	int count=0;
	LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	for(int i=0;i<str.length();i++)
	{
		set.add(str.charAt(i));
		//System.out.println(str.charAt(i)+" "+ (1+i));
		
		
	}
	for(Character ch:set)
	{
		for(int i=0 ;i<str.length();i++)
		{
			if(ch==str.charAt(i))
		{
				System.out.println(ch + " "+ (1+i));
				break;
		}
	      }
		
		
}
}
}

























