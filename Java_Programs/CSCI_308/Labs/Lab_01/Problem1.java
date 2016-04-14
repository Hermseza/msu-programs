//	AUTHOR	:  Zackary Hermsen
//  DATE	:  02/02/16
//  File	:  Problem1.java
//  Course	:  Csci 308, Section A
//  Purpose	:  To input 20 scores and print the average.


package problem1;

import java.util.Scanner;

public class Problem1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter 20 integer values");
		for(int i = 0; i <= 19; i++)
		{
			sum += input.nextInt();
		}
		
		input.close();
		System.out.println("Average is : " + sum/20.0);

	}

}
