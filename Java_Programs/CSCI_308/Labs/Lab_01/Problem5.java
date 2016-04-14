//	AUTHOR	:  Zackary Hermsen
//  DATE	:  02/02/16
//  File	:  Problem1.java
//  Course	:  Csci 308, Section A
//  Purpose	:  To input values and find the mode.


package problem5;

import java.util.Scanner;

public class Problem5 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int array[] = new int[50];
		
		int count = 1;
		int highCount = 0;
		int mode = 0;
		int current;
		int n = 0;
		int swap = 1;
		int temp = 0;
		
		System.out.println("Please enter up to 50 integers : ");
		
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
		
		input.close();
		
		System.out.printf("The mode is %d.", mode);

	}

}
