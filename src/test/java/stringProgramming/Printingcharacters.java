package stringProgramming;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Printingcharacters {

	@Test
	public void print() {
		
		Scanner s = new Scanner(System.in);
		String str = s.next();//java
		
		// str.length();
		 for(int i=0 ; i<str.length(); i++)
		 {
			 System.out.println( str.charAt(i));
		 }
		
	}
	@Test
	public void reverseString()//without using 3 rd variable
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();//java
		
		for(int i=str.length()-1 ; i>=0; i--)
		 {
			 System.out.println( str.charAt(i));
		 }
	}
	
	@Test
	public void reverseStringUsing3rdVariable()
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();//java
		String rev="";
		
		for(int i=str.length()-1 ; i>=0; i--)
		 {
			rev=rev+str.charAt(i) ;
		 }
		System.out.println(rev);
	}
	
	@Test
	public void reverseWithoutUsingLength()
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();//java
		String rev="";
		int count=0;
	char[] ch = str.toCharArray();	
	for(char c:ch)
	{
		count++;
	}
		
		
		for(int i=count-1 ; i>=0; i--)
		 {
			rev=rev+str.charAt(i) ;
		 }
		System.out.println(rev);
	}
}
