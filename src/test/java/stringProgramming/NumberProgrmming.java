package stringProgramming;

import java.util.Scanner;

import org.testng.annotations.Test;

public class NumberProgrmming {

	@Test
	public void prime()  // prime number
	{
		int count=0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter any +ve no.");
		
		int no =s.nextInt();
		for(int i=2;i<no;i++) {
		if(no%i==0)
		{
			count++;
			break;
		}}
		if(count>0)
		{
			System.out.println(" no is composite");
		}
		else
			System.out.println("no is prime");
		
		
	}
	
	@Test
	public void fibonaci()// fibonaci series
	{
		
		int a=0;
		int b=1;
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter any no.");
		int no =s.nextInt();
		while(a<=no)
			//while(no>0)
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
			//no--;
		}
	}
	@Test
	public void sumOfEachdigitno() //sum of each digit no.
	{
		int sum =0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter any no.");
		int n =s.nextInt();
		
		while(n>0) 
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
		
	}
	
	@Test
	public void factorial()
	{
		int sum =1;
		Scanner s= new Scanner(System.in);
		System.out.println("enter any no.");
		int n =s.nextInt();
		while(n>0)
		{
			sum=sum*n;
			n--;
					
		}
		System.out.println(sum);
		
	}
	@Test
	public void swapToNumber() //using 3rd variable
	{
		int a =10;
		int b=20;
		  
		int c=a+b;
		 
		a=c-a;
		 b=c-b;
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test
	public void swapToNumberWithoutUsing3rdVariable()
	{
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	@Test
	public void reverseNo()  //logic for reverse number
	{
		int rev=0; 
		Scanner s= new Scanner(System.in);
		System.out.println("enter any no.");
		int n =s.nextInt(); int temp=n;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			
			n=n/10;
		}
		System.out.println(rev);
		
		if(temp==rev) // logic for pallandrome
		{
			System.out.println(temp + "  is pallandrome");
		}
		else
			System.out.println(temp + "   is not pallandrome");
	}
	
	
	
	@Test
	public void perfectno()
	
	{
	 int n =28;  int sum=0;   //6
	 for(int i=1; i<n;i++)
	 {
		 if(n%i==0)
		 {
			 sum=sum+i;
		 }
	 }
		
		if(n==sum)
		{
			System.out.println(n + "is perfect no");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
