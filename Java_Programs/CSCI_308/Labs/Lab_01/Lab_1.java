//	AUTHOR	:  Zackary Hermsen
//  DATE	:  01/28/16
//  File	:  Lab_1.java
//  Course	:  CSCI 308, Section A
//  Purpose	:  To solve 7 problems, which will be described later.


package lab1Package;

import java.util.Scanner;

public class Lab_1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n;
		boolean condition = true;
		
		while(condition == true)
		{
			menuInfo();
			n = input.nextInt();
			menu(n);
		}
		
		input.close();
	}
	
	//problem 1, inputs 20 scores, and prints the average score without an array.
	public static void problem1()
	{
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter 20 integer values");
		for(int i = 0; i <= 19; i++)
		{
			sum += input.nextInt();
		}
		
		//input.close();
		System.out.println("Average is : " + sum/20.0);
	}
	
	//problem 2, inputs 10 scores, prints the  average score with an array.
	public static void problem2()
	{
		Scanner input = new Scanner(System.in);
		
		int[] scores = new int[10];
		double avg = 0;
		double total = 0;
		
		System.out.println("Enter 10 integer values : ");
		
		for(int i = 0; i < 10; i++)
		{
			scores[i] = input.nextInt();
		}
		
		for(int i = 0; i < 10; i++)
		{
			total += scores[i];
		}
		
		avg = total / 10.0;
		
		//input.close();
		
		System.out.printf("Average is %f", avg);
	}
	
	//problem 3, inputs 10 scores, prints out the highest and lowest score.
	public static void problem3()
	{
		Scanner input = new Scanner(System.in);
		
		int[] scores = new int[10];
		double high = 0;
		double low = 100;
		
		System.out.println("Enter 10 test scores : ");
		
		for(int i = 0; i < 10; i++)
		{
			scores[i] = input.nextInt();
		}
		
		for(int i = 0; i < 10; i++)
		{
			if(scores[i] > high)
			{
				high = scores[i];
			}
			if(scores[i] < low)
			{
				low = scores[i];
			}
		}
		
		//input.close();
		
		System.out.printf("The lowest score is %f, and the highest score is %f", low, high);
	}
	
	//problem 4, inputs scores, in ascending order, prints the median.
	public static void problem4()
	{
		Scanner input = new Scanner(System.in);
		
		double median = 0;
		int size = 0;
		
		System.out.println("Please enter the size of the array (50 max)");
		
		size = input.nextInt();
		
		int scores[] = new int[size];
		
		System.out.println("Please enter " + size + " integer values in ascending order: ");
		
		for(int i = 0; i < size; i++)
		{
			scores[i] = input.nextInt();
		}
		
		if(size % 2 != 0)
		{
			median = scores[(size - 1) / 2];
		}
		else if(size % 2 == 0)
		{
			median = (scores[size / 2] + scores[(size / 2) - 1]) / 2.0;
		}
		
		//input.close();
		
		System.out.printf("The median value is %f", median);
	}
	
	//problem 5, inputs scores, prints out the mode.
	public static void problem5()
	{
		Scanner input = new Scanner(System.in);
		
		int array[] = new int[50];
		
		int count = 1;
		int highCount = 0;
		int mode = 0;
		int current;
		int n = 0;
		int swap = 1;
		int temp = 0;
		
		System.out.println("Please enter up to 50 integers, using -10 to exit : ");
		
		int exit = input.nextInt();
		
		for(int i = 0; i <= 50 && exit != -10; i++)
		{
			array[i] = input.nextInt();
			exit = array[i];
			n++;
		}
		
		while (swap != 0)
		{
			swap = 0;
			
			for(int i = 0; i < (n-1); i++)
			{	
				if (array[i] > array[i+1])
				{	
					temp = array[i];
				
					if (array[i+1] != -10)
					{
						array[i] = array[i+1]; 
						array[i+1] = temp;

						swap++;
					}
				}
			}
		}
		
		current = array[0];
		
		for(int j = 1; j < n; j++)
		{
			System.out.println("" + array[j]);
			if(array[j] == current)
			{
				count++;
			}
			else
			{
				current = array[j];
				count = 1;
			}
			if(count > highCount)
			{
				highCount = count;
				mode = array[j];
			}
		}
		
		//input.close();
		
		System.out.printf("The mode is %d.", mode);
	}
	
	//problem 6, input dimensions for two 3x3 matrices, adds them, and prints the result.
	public static void problem6()
	{
		Scanner input = new Scanner(System.in);
		
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		
		
		System.out.println("Please enter the dimensions of the first 3x3 matrix: ");
		
		for(int i = 0; i <= 2; i++)
		{
			for(int j = 0; j <= 2; j++)
			{
				a[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Please enter the dimensions of the second 3x3 matrix: ");
		
		for(int i = 0; i <= 2; i++)
		{
			for(int j = 0; j <= 2; j++)
			{
				b[i][j] = input.nextInt();
			}
		}
		
		System.out.println("The first matrix plus the second matrix is :\n");
		for(int i = 0; i <= 2; i++)
		{
			for(int j = 0; j <= 2; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				System.out.printf("%5d", c[i][j]);
			}
			
			System.out.println("");
		}
		
		//input.close();
	}
	
	//problem 7, inputs the dimensions of two 3x3 matrices, multiplies them, and prints
	// 				the results.
	public static void problem7()
	{
		Scanner input = new Scanner(System.in);
		
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		
		
		System.out.println("Please enter the dimensions of the first 3x3 matrix: ");
		
		for(int i = 0; i <= 2; i++)
		{
			for(int j = 0; j <= 2; j++)
			{
				a[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Please enter the dimensions of the second 3x3 matrix: ");
		
		for(int i = 0; i <= 2; i++)
		{
			for(int j = 0; j <= 2; j++)
			{
				b[i][j] = input.nextInt();
			}
		}
		
		System.out.println("The first matrix times the second matrix is :\n");
		for(int i = 0; i <= 2; i++)
		{
			for(int j = 0; j <= 2; j++)
			{
				
				c[i][j] = 0;
				
				for(int k = 0; k <= 2; k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
				
				System.out.printf("%5d", c[i][j]);
			}
			
			System.out.println("");
		}
		
		//input.close();
	}
	
	//menu function
	public static void menu(int n)
	{
		if(n == 1)
			problem1();
		else if(n == 2)
			problem2();
		else if(n == 3)
			problem3();
		else if(n == 4)
			problem4();
		else if(n == 5)
			problem5();
		else if(n == 6)
			problem6();
		else if(n == 7)
			problem7();
		else if(n == 0)
			System.exit(0);
		else
			System.out.println("\nPlease enter a valid number.");
	}
	
	//menu info
	public static void menuInfo()
	{
		System.out.println("\nFor problem 1, average score without an array, press 1.");
		System.out.println("For problem 2, average score with an array, press 2.");
		System.out.println("For problem 3, high and low score, press 3.");
		System.out.println("For problem 4, median score, press 4.");
		System.out.println("For problem 5, modal score, press 5.");
		System.out.println("For problem 6, matrix addition, press 6.");
		System.out.println("For problem 7, matrix multiplication, press 7.");
		System.out.println("To exit, press 0.");
	}
}
