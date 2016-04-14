/**
 * Filename		: Array2D.java
 * Purpose		: To create a program that takes in an input as the rows and columns of arrays and displays tasks with the data.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 09/31/2015
 * Compiler		: Eclipse
 * Executable	: Array2DViewer.jar
 * History		: Z.A.H : 09/30/2015 : Program Genesis 
 */


package array2DPackage;

import java.awt.Graphics2D;

public class Array2D {
	
	//instance fields
	private int [][] testArray;
	private int x = 10;
	private int y = 50;
	
	//create a constructor with the given tester array, the number of rows, and the number of columns
	public Array2D(int[][] test)
	{
		testArray = test;
	}
	
	//method to do the first test assigned, to display all entries filled with 0
	public void task1(Graphics2D g2)
	{
		g2.drawString("Task 1: All entries filled with 0.", x, y-25);
		
		for(int i = 0; i < testArray.length; i++)
		{
			for(int j = 0; j < testArray[i].length; j++)
			{
				testArray[i][j] = 0;
				g2.drawString(String.valueOf(testArray[i][j]), x, y);
				x += 10;
			}
			y += 15;
			x = 10;
		}
		y += 50;
	}
	
	//method to do the second test, to fill elements alternatively with 0's and 1's in a checkerboard pattern
	public void task2(Graphics2D g2)
	{
		g2.drawString("Task 2 : Elements filled with 0's and 1's alternatively.", x, y-25);

		for(int i = 0; i < testArray.length; i++)
		{
			for(int j = 0; j < testArray[i].length; j++)
			{
				if((i % 2) == 0)
				{
					if((j % 2) == 0)
					{
						testArray[i][j] = 0;
						g2.drawString(String.valueOf(testArray[i][j]), x, y);
						x += 10;
					}
					else
					{
						testArray[i][j] = 1;
						g2.drawString(String.valueOf(testArray[i][j]), x, y);
						x += 10;
					}
				}
				else
				{
					if((j % 2) == 0)
					{
						testArray[i][j] = 1;
						g2.drawString(String.valueOf(testArray[i][j]), x, y);
						x += 10;
					}
					else
					{
						testArray[i][j] = 0;
						g2.drawString(String.valueOf(testArray[i][j]), x, y);
						x += 10;
					}
				}
			}
			y += 15;
			x = 10;
		}
		y += 50;
	}
	
	//method to do the third test, to fill only the elements in the top and bottom rows with zeroes
	public void task3(Graphics2D g2)
	{
		g2.drawString("Task 3 : Fill only the elements in the top and bottom rows with zeroes.", x, y-25);

		for(int i = 0; i < testArray.length; i++)
		{
			for(int j = 0; j < testArray[i].length; j++)
			{
				if(i == 0 || i == testArray.length - 1)
				{
					testArray[i][j] = 0;
					g2.drawString(String.valueOf(testArray[i][j]), x, y);
					x += 10;
				}
				else
				{
					if((i % 2) == 0)
					{
						if((j % 2) == 0)
						{
							testArray[i][j] = 0;
							g2.drawString(String.valueOf(testArray[i][j]), x, y);
							x += 10;
						}
						else
						{
							testArray[i][j] = 1;
							g2.drawString(String.valueOf(testArray[i][j]), x, y);
							x += 10;
						}
					}
					else
					{
						if((j % 2) == 0)
						{
							testArray[i][j] = 1;
							g2.drawString(String.valueOf(testArray[i][j]), x, y);
							x += 10;
						}
						else
						{
							testArray[i][j] = 0;
							g2.drawString(String.valueOf(testArray[i][j]), x, y);
							x += 10;
						}
					}
				}
			}
			y += 15;
			x = 10;
		}
		y += 50;
	}
	
	//method to do the fourth test, to compute the sum of all elements
	public void task4(Graphics2D g2)
	{
		g2.drawString("Task 4 : Compute the sum of all elements.", x, y-25);
		int total = 0;
		for(int i = 0; i < testArray.length; i++)
		{
			for(int j = 0; j < testArray[i].length; j++)
			{
				total += testArray[i][j];
			}
		}
		y += 50;
		
		g2.drawString("The sum of all elements in the array is : "+total, x, y-25);
		
		y += 50;
		
	}
	
	//method to do the fifth test, to print the array in tabular form on the frame
	public void task5(Graphics2D g2)
	{
		g2.drawString("Task 5 : Print the array in tabular form.", x, y-25);
		
		for(int i = 0; i < testArray.length; i++)
		{
			for(int j = 0; j < testArray[i].length; j++)
			{
				g2.drawString(String.valueOf(testArray[i][j]), x, y);
				x += 10;
			}
			y += 15;
			x = 10;
		}
	}

}
