package stringProgramming;

import java.util.LinkedHashSet;

import org.apache.commons.math3.analysis.function.Add;
import org.testng.annotations.Test;

public class NoOfOccuranceOfwords {

	@Test
	public void noOfOccurance()
	{
		String s= "welcome to tyss and welcome to banglore";
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		String[] sp = s.split(" ");
				
		for(int i=0 ;i< sp.length; i++)
		{
			set.add(sp[i]);
			
		}
		System.out.println(set);
		
		for(String sh:set)
		{
			int count=0;
			for(int i=0; i<sp.length;i++) 
			{
				if(sh.equals(sp[i]))
			{
				count++;
			}
			}
			System.out.println(sh+"    "+count);  //for getting occurance of each word
			if(count>1) //for getting duplicate word
			{
				System.out.println(sh+"    "+count);
			}
			/* for getting unique word*/
			if(count==1){
				System.out.println(sh+"    "+count);
			}
		}
		
	}
	@Test
	public void reveseWord()
	{
		String s = "My name is Avinash k";
		
		String[] str = s.split(" ");
		
		int count = str.length;
		System.out.println(count);
		
		for(int i=count-1 ;i>=0 ;i--)
		{
		    System.out.print(str[i]+" ");
		}
	}	
	@Test
	public void revesrWordUsingVariable()
	{
		String s ="My Name is Avinash k";
		String[] str = s.split(" ");
		String rev =" ";
		for(int i =str.length-1 ; i>=0;i--)
		{
			rev =rev+ str[i]+" ";
		}
		
		System.out.println(rev);	
	}
	@Test
	public void reveseWordWithoutUsingLength()
	{
		String s ="My Name is Avinash k";
		String[] str = s.split(" ");
		String rev =""; int count=0;
        for(String word:str) 
        {
        	count++;
        }
		for(int i =count-1 ; i>=0;i--)
		{
			rev =rev+ str[i]+" ";
		}
		
		System.out.println(rev);	
	}
	//write a java program to swap 1st and last word in given string statement
	//s= " welcome to company";
	//o/p= "company to welcome"
	
	@Test
	public void swap1stAndLastWord()
	{
		String s= "welcome to my company";
		
	String[] str = s.split(" ");
		
	String temp= str[0];
	str[0]= str[str.length-1];
	str[str.length-1]=temp;
	
	for(int i =0; i<str.length ;i++)
		
	{
		System.out.print(str[i]+" ");
	}
	}
	@Test
	public void reverseEachWord()
	{
		String s = "welcome to testyantra";
		String[] str = s.split(" ");
		
		int count = str.length;
		
		for(int i=0 ;i<count;i++)
		{
			
			String s1=str[i] ; String rev=" ";
			
			
				for(int j=s1.length()-1;j>=0;j--)
			{
				rev=rev+s1.charAt(j)+" ";
			}
			
			System.out.print(rev);
		}	
		
	}
	
	@Test
	public void printInPattern()     
	{
		String s= "INDIA";
		String temp="";
		for(int i=0; i<s.length();i++)
		{
			temp= temp+s.charAt(i);
			System.out.println(temp);
			
		}
	}
	
	
	@Test
	public void LowerToUpper()
	{
		String s="stone"; String s2="";String s1="";
		for(int i=0; i<s.length();i++)
		{
			if(i==0) {
			 s1 = ""+s.charAt(i);
			s1=s1.toUpperCase();
			
			}
			if(i>0)
			{
				s2=s2+s.charAt(i);
			}
			
	
			
		}
		System.out.print(s1+s2);
	}
	
	

	//Question - welcome to india o/p- Welcome To India
	
	@Test
	public void MakingUpperCaseOfEachWord()
	{
		String s= "welcome to india";
		String [] str = s.split(" ");
		for(int i=0;i<str.length ;i++)
		{
			String s1= " "+ str[i].charAt(0);
			
			System.out.print(s1.toUpperCase());
			for(int j=1;j<str[i].length();j++)
			{
				System.out.print(str[i] .charAt(j));
			}
			
			
			
			System.out.print(" ");
			
		}
	}
	
	
	//Using subString
	@Test
	public void makeUpperCaseOF1stletter()
	{
		String s= "welcome to india";
		String [] str = s.split(" ");
		for(int i=0;i<str.length ;i++)
		{
		String s1= " "+ str[i].charAt(0);
			
			System.out.print(s1.toUpperCase()+str[i].substring(1)+" ");
			
			//here + is used to concanate
			//String s2 = str[i].substring(0,1).toUpperCase()+str[i].substring(1);
			//System.out.println(s2);
			
		}
	}
	
	
	
//Q-String s="15ab10$25"	- not want 14 o/p- 15+10+25
	@Test
	public void additionoftensdigit()
	{
		String s = "15a10b23";
		int sum =0 , tsum=0;
		for(int i=0 ;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n= s.charAt(i)-48;
				sum = sum*10 +n;
			}
			else
			{
				tsum =tsum+sum;
				sum=0;
			}
			
			
		}
		tsum=tsum+sum;
		System.out.println(tsum);
		
		
		
		
	}
	
	
	
	//Q String s= Tester;
	 //o/p -  T=4 ,e=5 ,s=3,r=6  //available in character program
	
	
	
	@Test
	public void swapingOfString()
	{
		String s1 = "java";
		String s2="selenium";
		
		s1 =s1+s2; //javaselenium
		
		
		
		
		s2=s1.substring(0,s1.length()-s2.length()); // (12-8)
		
		System.out.println(s2);
		
		
		s1=s1.substring(s2.length());
		System.out.println(s1);
		
	}
	
	@Test
	public void  interchageOfCharacterofTwoString()
	{
		String s="abc"+"xyz" ; String sp="";
		System.out.println(s);
		
		String s1=s.substring(0,(s.length()/2));
		
		System.out.println(s1);
		String s2 =s.substring(s.length()/2);
		System.out.println(s2);
		
		for(int i=0 ; i< s1.length();i++)
		{
		 sp =sp+s1.charAt(i)+s2.charAt(i);		
	}
	
	
	System.out.println(sp);
	
	
	//Question remove duplicate without using collection
	
		
}
	@Test
	public void reverseString()
	{
		String s ="my name is avinash";
		
		
				
	StringBuffer b= new StringBuffer(s);
		
	b.reverse();
	System.out.println(b);
		
		
	}
	
	
}
