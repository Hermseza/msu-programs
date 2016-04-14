//	AUTHOR	:  Zackary Hermsen
//  DATE	:  02/11/16
//  File	:  BubbleSort.java
//  Course	:  Csci 308, Section A
//  Purpose	:  To sort an array using bubble sort.


package bubbleSort;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int [] a = { 89, 45, 68, 90, 29, 34, 17 };
		
		System.out.println("\nThe array before using bubble sort is as follows : \n ");
		
		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println("");
		
		bubble_sort(a);
		
		System.out.println("\nThe array after using bubble sort is as follows : \n");
		
		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i] + " ");
		}
		

	}

	public static void bubble_sort(int [] a)
	{
		int i;
		int j;
		int temp;
		int n = a.length;
		
		for(i = 0; i <= n - 2; i++)
		{
			for(j = 0; j <= n - 2 - i; j++)
			{
				if(a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	
}


