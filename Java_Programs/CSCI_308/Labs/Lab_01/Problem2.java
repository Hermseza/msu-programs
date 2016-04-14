//	AUTHOR	:  Zackary Hermsen
//  DATE	:  02/02/16
//  File	:  Problem2.java
//  Course	:  Csci 308, Section A
//  Purpose	:  To input 10 scores and print the average with an array


package problem2;

import java.util.Scanner;

public class Problem2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
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
		
		input.close();
		
		System.out.printf("Average is %f", avg);

	}

}
