package stringProgramming;

import org.testng.annotations.Test;

public class Misslenious {

	@Test
	public void readEachAndEveryCharacter()
	{
		String s="a1$b2";
		String al="" , num ="" , spChar=" ";
		
		
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a' && s.charAt(i) <='z') ||(s.charAt(i)>='A' && s.charAt(i)<='Z'))
			{
			
				al=al+s.charAt(i)+" "; 
				
				
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num =num+s.charAt(i)+" ";
				
			}
			else
			{
				spChar=spChar +s.charAt(i);
				
			}
			
		}
		System.out.println("alphabet-- "+al);
		System.out.println("number---"+num);                         
		System.out.println("specialChar--- "+spChar);
	}
	@Test
	public void readandSuminteger()  //48 - for 0 ,57 - for 9   /*ascii value for a -97 z -122 and A- 65 Z - 90*/
	{
		int sum =0;
		String s= "a1$b23";
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n = s.charAt(i)-48;
				sum=sum+n;
				
				
			}
			
		}
		System.out.println(sum);
	}
	
	
	
}
