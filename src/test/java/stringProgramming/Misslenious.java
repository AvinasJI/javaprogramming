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






	public class Leap_year  //any year divisible by 4,and not by 100 or divisible by 400
{
public static void main(String args[])
{
	System.out.println("enter any year");
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	if((n%4==0 && n%100 != 0)|| (n%400==0))
	{
		System.out.println(n+"  is leap year");
	}
	else
		System.out.println(n+" is not leap year");
}
}






	public class Largesdigit_in_number 
{
public static void main(String []args)
{
	System.out.println("enter any no");
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	int large=0;
	while(n!=0)
	{
		int r=n%10;
		if(r>large)
		{
			large=r;
		}
		n=n/10;
		
	}
	System.out.println(large);
}
}


public class Smallet_digit_in_numbr 
{
	public static void main(String []args)
	{
		System.out.println("enter any number");
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int small=9;
		while(n!=0)
		{
			
			int r=n%10;
			n=n/10;	
		if(r<small)
		{
			small=r;
		}
		
		
	}
System.out.println(small);
}
}




	public class Perfect_no //eg  1+2+3 =6 sum of its factor or divisor equals to that number.eg 28
{
	public static void main ( String args [])
	{
		System.out.println("enter any number");
		
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int sum=0; int t=n;
		for(int i=1;i<n;i++)
		if(n%i==0)
		{
			sum = sum +i;
			
		}
		if(sum==t)
		{
			System.out.println(n + " is perfect no.");
		}
		else
			System.out.println(n + " is not perfect no");
		
		
	}

}




	





	
	
	
}
