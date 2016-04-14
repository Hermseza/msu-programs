//	AUTHOR	:  Zackary Hermsen
//  DATE	:  03/03/16
//  File	:  Lab_4_Recursion.java
//  Course	:  CSCI 308, Section A
//  Purpose	:  To use recursion, iteration, and formulas to solve 15 problems,
//					which will be described later.


package lab4Package;

import java.util.Scanner;

public class Lab_4_Recursion_and_Iteration 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//input the number used for factorial and all of the sums
		System.out.println("\n Please enter a number, which we will find the factorial of : ");
		
		int a = input.nextInt();
		
		//print out the factorial using recursion and iteration
		System.out.printf("\n Using iteration, the factorial of %d is %d\n", a, factorial_iterative(a));
		
		System.out.printf("\n Using recursion, the factorial of %d is %d\n", a, factorial_recursive(a));
		
		//print out the sum using recursion, iteration, and the formula
		System.out.printf("\n Now we will find the sum, the sum of the square, and the "
				+ "sum of the cube of %d\n", a);
		
		System.out.printf("\n Using recursion, the sum of %d is %d", a, sum_recursive(a));
		System.out.printf("\n Using iteration, the sum of %d is %d", a, sum_iterative(a));
		System.out.printf("\n Using the formula, the sum of %d is %d\n", a, sum_formula(a));
		
		//print out the sum of the square using recursion, iteration, and the formula
		System.out.printf("\n Using recursion, the sum of the square of %d is %d", a, square_recursive(a));
		System.out.printf("\n Using iteration, the sum of the square of %d is %d", a, square_iterative(a));
		System.out.printf("\n Using the formula, the sum of the square of %d is %d\n", a, square_formula(a));
		
		//print out the sum of the cube using recursion, iteration, and the formula
		System.out.printf("\n Using recursion, the sum of the cube of %d is %d", a, cube_recursive(a));
		System.out.printf("\n Using iteration, the sum of the cube of %d is %d", a, cube_iterative(a));
		System.out.printf("\n Using the formula, the sum of the cube of %d is %d\n", a, cube_formula(a));
		
		//input the numbers used for division and multiplication
		System.out.println("\n Please enter two numbers, with the first being divisible by the second : ");
		
		int m = input.nextInt();
		int n = input.nextInt();
		
		//print out the multiplication and division of the numbers using recursion
		System.out.printf("\n Using recursion, the multiplication of %d and %d is %d\n", m, n, mult(m, n));
		
		System.out.printf("\n Using recursion, the division of %d and %d is %d\n", m, n, div(m, n));
		
		//print out the gcd of the two numbers using Euclid's algorithm using recursion and iteration
		System.out.printf("\n Using the iterative version of Euclid's algorithm, the greatest"
				+ " common divisor of %d and %d is %d\n", m, n, euclid_iterative(m, n));
		
		System.out.printf("\n Using the recursive version of Euclid's algorithm, the greatest"
				+ " common divisor of %d and %d is %d\n", m, n, euclid_recursive(m, n));
		
		input.close();
	}

	//first problem, using iteration on a factorial
	public static int factorial_iterative(int a)
	{
		int i;
		int f = 1;
		for(i = 1; i <= a; i++)
		{
			f *= i;
		}
		
		return f;
	}
	
	//second problem, using recursion on a factorial
	public static int factorial_recursive(int a)
	{
		if(a == 1)
		{
			return 1;
		}
		else
		{
			return a * factorial_recursive(a - 1);
		}
	}
	
	//third problem, using recursion to find the sum
	public static int sum_recursive(int n)
	{
		if(n == 1)
			return 1;
		else
			return n + sum_recursive(n - 1);
	}
	
	//fourth problem, using iteration to find the sum
	public static int sum_iterative(int n)
	{
		int i;
		int total = 0;
		for(i = 1; i <= n; i++)
		{
			total += i;
		}
		return total;
	}
	
	//fifth problem, using the formula to find the sum
	public static int sum_formula(int n)
	{
		return ((n * (n + 1)) / 2);
	}
	
	//sixth problem, using recursion to find the sum of the square
	public static int square_recursive(int n)
	{
		if(n == 1)
			return 1;
		else
			return (n * n) + square_recursive(n - 1);
	}
	
	//seventh problem, using iteration to find the sum of the square
	public static int square_iterative(int n)
	{
		int i;
		int total = 0;
		for(i = 1; i <= n; i++)
		{
			total += (i * i);
		}
		return total;
	}
	
	//eighth problem, using the formula to find the sum of the square
	public static int square_formula(int n)
	{
		return((n * (n + 1) * ((2 * n) + 1)) / 6);
	}
	
	//ninth problem, using recursion to find the sum of the cube
	public static int cube_recursive(int n)
	{
		if(n == 1)
			return 1;
		else
			return(n * n * n) + cube_recursive(n - 1);
	}
	
	//tenth problem, using iteration to find the sum of the cube
	public static int cube_iterative(int n)
	{
		int i;
		int total = 0;
		for(i = 1; i <= n; i++)
		{
			total += (i * i * i);
		}
		return total;
	}
	
	//eleventh problem, using the formula to find the sum of the cube
	public static int cube_formula(int n)
	{
		return(((n * (n + 1)) / 2)) * ((n * (n + 1)) / 2);
	}
	
	//twelfth problem, using recursion on multiplication
	public static int mult(int m, int n)
	{
		if(n == 1)
		{
			return m;
		}
		else
		{
			return (m + mult(m, n - 1));
		}
	}
	
	//thirteenth problem, using recursion on division
	public static int div(int m, int n)
	{
		if(m == n)
		{
			return 1;
		}
		else
		{
			return 1 + div(m - n, n);
		}
	}
	
	//fourteenth problem, using iteration with Euclid's algorithm
	public static int euclid_iterative(int m, int n)
	{
		int r;
		while(n != 0)
		{
			r = m % n;
			m = n;
			n = r;
		}
		return m;
	}
	
	//fifteenth problem, using recursion with Euclid's algorithm
	public static int euclid_recursive(int m, int n)
	{
		if(n == 0)
		{
			return m;
		}
		else
		{
			return euclid_recursive(n, m % n);
		}
	}
}

