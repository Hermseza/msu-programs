//	AUTHOR	:  Zackary Hermsen
//  DATE	:  03/24/16
//  File	:  Lab_6_Prime_and_Selection_Sort.java
//  Course	:  Csci 308, Section A
//  Purpose	:  To create make an isPrime function using iteration and recursion
//				As well as Selection sort


package lab6Package;

import java.util.Scanner;

public class Lab_6_Prime_and_Selection_Sort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n;
		
		//prompt user for input
		System.out.println("Please enter an integer to test for prime : \n");
		
		//accept user input
		n = input.nextInt();
		input.close();
		
		//determine if the input is prime, iteratively
		if(is_prime_iterative(n) == 1)
			System.out.println("\nUsing iteration, " + n + " is prime.\n");
		else
			System.out.println("\nUsing iteration, " + n + " is composite.\n");
		
		//determine if the input is prime, recursively
		//first method
		if(is_prime_recursive_first(n) == 1)
		{
			System.out.println("\nUsing recursion (the easy way), "
					+ n + " is prime.\n");
		}
		else
		{
			System.out.println("\nUsing recursion (the easy way), "
					+ n + " is composite.\n");
		}
		
		//second method
		if(is_prime_recursive_second(n) == 1)
		{
			System.out.println("\nUsing recursion (the other way), "
					+ n + " is prime.\n");
		}
		else
		{
			System.out.println("\nUsing recursion (the other way), "
					+ n + " is composite.\n");
		}
		
		//use selection sort to sort an array of integers, both iteratively and recursively
		int[] A = {31, 15, 20, 3, 8, 17, 19, 16};
		
		//print the array before using selection sort, sort, then print after
		//using iteration
		System.out.println("\nThe array before sorting iteratively is : ");
		print_array(A);
		selection_sort_iterative(A);
		System.out.println("\nThe array after sorting iteratively is : ");
		print_array(A);
		
		//using recursion
		int[] B = {31, 15, 20, 3, 8, 17, 19, 16};
		System.out.println("\nThe array before sorting recursively is : ");
		print_array(B);
		System.out.println("\n");
		System.out.printf("\n selection_sort_recursive(A, 0)");
		selection_sort_recursive(B, 0);
		System.out.println("\n\nThe array after sorting recursively is : ");
		print_array(B);
	}
	
	//First problem, is_prime using iteration
	public static int is_prime_iterative(int n)
	{
		//variable for number of factors
		int num_of_factors = 0;
		
		//determine the number of factors n has
		for(int i = 1; i <= n; i++)
		{
			if(n % i == 0)
			{
				num_of_factors++;
			}
		}
		
		if(num_of_factors == 2)
		{
			//n is prime if it only has two factors
			return 1;
		}
		else
		{
			//n is composite if it has more than two factors
			return 0;
		}
	}
	
	//Second problem, is_prime using recursion the easy way (wrapper function)
	public static int is_prime_recursive_first(int n)
	{
		if(n < 2)
		{
			//any number less than 2 is not prime.
			return 0;
		}
		
		else if(n == 2)
		{
			//2 is the first prime number.
			return 1;
		}
		
		else
		{
			//test to see if the number is prime recursively.
			return is_prime_rec_first(n, 2);
		}
	}
	
	//Second problem, recursive function
	public static int is_prime_rec_first(int n, int m)
	{
		if(n == m)
		{
			//the smallest factor of a prime number, besides 1, is n itself.
			return 1;
		}
		else if(n % m == 0)
		{
			//Not a prime because m is a factor of n.
			return 0;
		}
		else
		{
			return is_prime_rec_first(n, m + 1);
		}
	}
	
	//Third problem, is_prime using recursion the other way (wrapper function)
	public static int is_prime_recursive_second(int n)
	{
		if(n < 2)
		{
			//any number less than 2 is not prime.
			return 0;
		}
		
		else if(n == 2)
		{
			//2 is the first prime number.
			return 1;
		}
		
		else
		{
			//test to see if the number is prime recursively.
			return is_prime_rec_second(n, n);
		}
	}
	
	//Third problem, recursive function
	public static int is_prime_rec_second(int n, int m)
	{
		if((n - 1) == 1)
		{
			//the smallest factor of a prime number, besides 1, is n itself.
			return 1;
		}
		else if(m % (n - 1) == 0)
		{
			//Not a prime because n is a factor of m.
			return 0;
		}
		else
		{
			return is_prime_rec_second(n - 1, m);
		}
	}
	
	//Fourth problem, selection_sort using iteration
	public static void selection_sort_iterative(int[] A)
	{
		int i;
		int min;
		int j;
		int temp;
		for(i = 0; i <= A.length - 2; i++)
		{
			//1. Pick the minimum element from A[i + 1] to A[n -1]
			min = i;
			for(j = i + 1; j <= A.length - 1; j++)
			{
				if(A[j] < A[min])
				{
					min = j;
				}
			}
			//2. Swap A[i] and A[min]
			temp = A[i];
			A[i] = A[min];
			A[min] = temp;
		}
	}
	
	//Fifth problem, selection_sort using recursion
	public static void selection_sort_recursive(int[] A, int i)
	{
		int min;
		int temp; //necessary for the swap/exchange
		int j;
		if(i == A.length - 1) //base case
		{
			return;
		}
		else
		{
			//1. Find the minimum element in A[i] through A[n - 1]
			//and determine that it is in location min, with value A[min]
			min = i;
			for(j = i; j <= A.length - 1; j++)
			{
				if(A[j] < A[min])
				{
					min = j;
				}
			}
			//2. Swap A[i] and A[min]
			temp = A[i];
			A[i] = A[min];
			A[min] = temp;
			//3. selection_sort_recursive(A, i + 1);
			System.out.printf("\n selection_sort_recursive(A, %d)", i + 1);
			selection_sort_recursive(A, i + 1);
		}
	}
	
	//method to print arrays
	public static void print_array(int[] A)
	{
		System.out.println("");
		for(int i = 0; i <= A.length - 1; i++)
		{
			System.out.printf("%5d", A[i]);
		}
		System.out.println("");
	}
	

}
