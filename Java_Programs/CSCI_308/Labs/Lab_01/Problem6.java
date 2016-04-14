//	AUTHOR	:  Zackary Hermsen
//  DATE	:  02/02/16
//  File	:  Problem1.java
//  Course	:  Csci 308, Section A
//  Purpose	:  To input two 3x3 matricies and add them together.


package problem6;

import java.util.Scanner;

public class Problem6 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
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
		
		for(int i = 0; i <= 2; i++)
		{
			for(int j = 0; j <= 2; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
				System.out.printf("%5d", c[i][j]);
			}
			
			System.out.println("");
		}
		
		input.close();

	}

}
