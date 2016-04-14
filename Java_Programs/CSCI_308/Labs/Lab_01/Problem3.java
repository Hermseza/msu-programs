//	AUTHOR	:  Zackary Hermsen
//  DATE	:  02/02/16
//  File	:  Problem3.java
//  Course	:  Csci 308, Section A
//  Purpose	:  To input 10 scores and print the highest and lowest scores.


package problem3;

import java.util.Scanner;

public class Problem3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
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
		
		input.close();
		
		System.out.printf("The lowest score is %f, and the highest score is %f", low, high);

	}

}
