package Array_Programming;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class ArrayInAscendingOrder {
	/*
  1 print all elements of array in ascending order  // we create two for loop and compare 1 element to other element ,after comparing we do shifting operation,intj=i+1
	2 find the 1st maxm element in given array
	3 find the 2nd maxm element in given array
	4 find the 1st min element in given array
	5find the 2nd min element in given array
	6 print the sum of 1st 3  maxm element in given array
	7print the sum of 1st 3  min elements in given array

	8 find the string value which is having maximum length in given array  // assume 1st element is  max and compare max.length to every element ,if false then we do intializing in to max
	9 find the string value which is having minimum or least length in given array//IN both we use only one for loop.
	10 print all the elements of array in  descending order
	11 print duplicate elements of array

	 */
	@Test
	public void allElementInDscendingOrder() 
	{
		int [] a = {20,10,30,50,40};

		for(int i=0 ;i<a.length;i++)
		{
			for(int j=i+1; j< a.length;j++)
			{
				if(a[i] <a[j])    //this sign for descending order
				{
					int temp =a[i];
					a[i] =a[j];
					a[j]=temp;

				}
			}

		}
		for(int i=0 ; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}


	@Test
	public void allElementInAscendingOrder() 
	{
		int [] a = {20,10,30,50,40};

		for(int i=0 ;i<a.length;i++)
		{
			for(int j=i+1; j< a.length;j++)
			{
				if(a[i]>a[j])    //this sign for Ascending order
				{
					int temp =a[i];
					a[i] =a[j];
					a[j]=temp;

				}
			}

		}
		for(int i=0 ; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	@Test
	public void firstMinElement() 
	{
		int [] a = {20,10,30,50,40};

		for(int i=0 ;i<a.length;i++)
		{
			for(int j=i+1; j< a.length;j++)
			{
				if(a[i]>a[j])    
				{
					int temp =a[i];
					a[i] =a[j];
					a[j]=temp;

				}
			}

		}


		System.out.println(a[0]); //first min
		System.out.println(a[1]); //secon min
		System.out.println(a[2]); //third min
	}
	@Test
	public void firstMaxmElement() 
	{
		int [] a = {20,10,30,50,40};

		for(int i=0 ;i<a.length;i++)
		{
			for(int j=i+1; j< a.length;j++)
			{
				if(a[i] <a[j])    //this sign for descending order
				{
					int temp =a[i];
					a[i] =a[j];
					a[j]=temp;

				}
			}

		}
		System.out.println(a[0]);  //1st maximum no.
		System.out.println(a[1]);//second maximum no
		System.out.println(a[2]); //third maximum no
	}
	@Test
	public void sumOffirst3MaxmElement() 
	{
		int [] a = {20,10,30,50,40};

		for(int i=0 ;i<a.length;i++)
		{
			for(int j=i+1; j< a.length;j++)
			{
				if(a[i] <a[j])    //this sign for descending order
				{
					int temp =a[i];
					a[i] =a[j];
					a[j]=temp;

				}
			}

		}
		int n=3;
		int sum =0;
		for(int i=0 ;i<n;i++)
		{
			sum= sum+a[i];
		}
		System.out.println(sum);
	}

	@Test
	public void sumOffirst3minElement() 
	{
		int [] a = {20,10,30,50,40};

		for(int i=0 ;i<a.length;i++)
		{
			for(int j=i+1; j< a.length;j++)
			{
				if(a[i]>a[j])    //this sign for ascending order
				{
					int temp =a[i];
					a[i] =a[j];
					a[j]=temp;

				}
			}

		}
		//int n=3;
		int sum =0;
		for(int i=0 ;i<3;i++)
		{
			sum= sum+a[i];
		}
		System.out.println(sum);
	}
	@Test
	public void StringOfMaximumLength() 
	{
		String str[]={"abc","hi","mango","j","tyss","abcde"};


		String max =str[0];

		for(int i=0 ; i<str.length ;i++)
		{
			if(max.length()<str[i].length())
			{
				max=str[i];
			}
		}
		for(int i=0 ; i<str.length ;i++)

		{


			if(max.length()==str[i].length())
			{
				System.out.println(str[i]);
			}

		}




	}
	@Test
	public void PrintStringOfMinimumlength() 
	{
		String str[]={"abc","hi","mango","j","tyss","abcde","k"};


		String min =str[0];

		for(int i=0 ; i<str.length ;i++)
		{
			if(min.length()>str[i].length())
			{
				min=str[i];
			}
		}
		for(int i=0 ; i<str.length ;i++)

		{


			if(min.length()==str[i].length())
			{
				System.out.println(str[i]);
			}

		}

	}
	@Test
	public void PrintduplicateElementInArray()
	{

		int []a ={1,2,3,4,5,1,1,2}; 

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for( int i=0; i<a.length ;i++)
		{
			set.add(a[i]);
		}
		for(Integer in:set)
		{
			int count=0;
			for(int i=0 ;i<a.length ;i++) 
			{
				if(in==a[i])
				{
					count++;
				}


			}

			if(count>1)
			{
				System.out.println(in + "of count "+count);
			}

		}
	}
	
	@Test
public void segregateZeroAtLast() 
{
	int a[] = {1,0,2,0,3,0,4,0};
	
	int b[] =new int[a.length];
	
	
	int m =0; int n=a.length-1;
	
	for(int i=0 ;i<a.length ;i++)
	{
		if(a[i]==0)
		{
			b[n]=a[i];
			n--;
		}
		else
		{
			b[m] =a[i];
			m++;
		}
	}
	for(int i=0 ;i<b.length ;i++)
	{
		System.out.print(b[i]+" ");
		
		
		
	}
}
	
	@Test
	public void ItrateDependsOnKey()
	{
		int a[]= {1,2,3,4,5};
		
		int key =4;
		
	for(int i=0;i<key;i++)	
	{
		int temp =a[0];
		for(int j=1; j<a.length;j++)
		{
			a[j-1]=a[j];
		}
		a[a.length-1]=temp;
	}
	for(int k=0;k<a.length ;k++)
	{
		System.out.println(a[k]+" ");
	}
		
	}
	
	@Test
	public void  additionOfArray() 
	{	
	
	int a[] = {1,2,3,9};
	int b[]= {4,5,6};
	
	int count=a.length; int c;
	if(a.length<b.length)
	{
		count= b.length;
	}
	for(int i=0;i<count;i++)
	
	{
		try {
			System.out.println(a[i]+b[i]);
			//c = a[i]+b[i];
			
			//System.out.println(c);
		}
		catch(Exception e)
		{
			if(a.length >b.length)
			{
				System.out.println(a[i]);
				
				//c=a[i];
				//System.out.println(c);
				
				
			}
			else
				System.out.println(b[i]);
		}
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Assignment get the second maximum element in the array without using bubble sort technique and collection
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
