//	AUTHOR	:  Zackary Hermsen
//  DATE	:  02/02/16
//  File	:  Problem1.java
//  Course	:  Csci 308, Section A
//  Purpose	:  To input values and find the median.


package problem4;

import java.util.Scanner;

public class Problem4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
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
		
		input.close();
		
		System.out.printf("The median value is %f", median);

	}

}
