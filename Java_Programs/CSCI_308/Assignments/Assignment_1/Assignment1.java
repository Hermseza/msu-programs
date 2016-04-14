//	AUTHOR	:  Zackary Hermsen
//  DATE	:  03/2/16
//  File	:  Assignment1.java
//  Course	:  CSCI 308, Section A
//  Purpose	:  To use recursion to solve 5 problems, which are described later.




package assignment1;

import java.util.Scanner;

public class Assignment1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//integer used for the first two problems.
		int n;
		
		//array used for the third problem.
		int i = 0;
		int[] pair = {0, 0, 0, 0, 0};
		
		//array used for the fourth problem.
		float[] float_pair = {0, 0, 0, 0, 0};
		
		//arrays used for the fifth problem.
		int[] a = {0, 0, 0, 0, 0};
		int[] b = {0, 0, 0, 0, 0};
		
		Scanner input = new Scanner(System.in);
		
		//get the input n from user for the first two problems.
		System.out.println("\nPlease enter an integer : ");
		
		n = input.nextInt();
		
		System.out.printf("\nThe sum of all integers smaller than %d is %d.\n", 
				n, sum_all(n));
		System.out.printf("\nThe sum of all odd integers smaller than %d is %d.\n",
				n, sum_odd(n));
		
		System.out.println("\nPlease enter five integers : \n");
		
		for(i = 0; i <= 4; i++)
		{
			pair[i] = input.nextInt();
		}
		
		System.out.printf("\n%s\n", pair(pair));
		
		System.out.println("\nPlease enter five floating point numbers : \n");
		
		for(i = 0; i <= 4; i++)
		{
			float_pair[i] = input.nextFloat();
		}
		
		System.out.printf("\n%s\n", float_pair(float_pair));
		
		System.out.println("\nPlease enter five integers for the first array : \n");
		
		for(i = 0; i <= 4; i++)
		{
			a[i] = input.nextInt();
		}
		System.out.println("\nPlease enter five integers for the second array : \n");
		
		for(i = 0; i <= 4; i++)
		{
			b[i] = input.nextInt();
		}
		
		mult(a, b);
	}
	
	//problem 1, returns the sum of all the integers smaller than n.
	public static int sum_all(int n)
	{
		int m = 0;
		for(int i = 0; i <= n - 1; i++)
		{
			m += i;
		}
		return m;
	}
	
	//problem 2, returns the sum of all odd integers smaller than n.
	public static int sum_odd(int n)
	{
		int m = 0;
		for(int i = 1; i <= n - 1; i = i + 2)
		{
			m += i;
		}
		return m;
	}
	
	//problem 3, checks to see if there is a pair of numbers in an array
	//whose product is even
	public static String pair(int[] pair)
	{
		for(int i = 0; i <= pair.length - 1; i++)
		{
			if(pair[i] % 2 == 0)
				return "There is a pair of numbers in the array whose product is even.";
		}
		return "There is not a pair of numbers in the array whose product is even.";
	}
	
	//problem 4, check to see if float values in an array are different
	public static String float_pair(float[] pair)
	{
		for(int i = 0; i <= pair.length - 1; i++)
		{
			for(int j = i + 1; j <= pair.length - 1; j++)
			{
				if(pair[i] == pair[j])
					return "Not all numbers are distinct.";
			}
		}
		return "All numbers are distinct.";
	}
	
	//problem 5, return the dot product of two arrays
	public static void mult(int[] a, int[] b)
	{
		int c[] = {0, 0, 0, 0, 0};
		for(int i = 0; i <= a.length - 1; i++)
		{
			c[i] = a[i] * b[i];
			System.out.printf("\n%d * %d is %d.", a[i], b[i], c[i]);
		}
	}

}
