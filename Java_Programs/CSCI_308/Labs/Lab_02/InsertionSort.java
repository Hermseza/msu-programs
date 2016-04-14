//	AUTHOR	:  Zackary Hermsen
//  DATE	:  02/11/16
//  File	:  BubbleSort.java
//  Course	:  Csci 308, Section A
//  Purpose	:  To sort an array using insertion sort.



package insertionSort;

public class InsertionSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int [] a = { 89, 45, 68, 90, 29, 34, 17 };
		
		System.out.println("\nThe array before using insertion sort is as follows : \n ");
		
		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println("");
		
		insertion_sort(a);
		
		System.out.println("\nThe array after using insertion sort is as follows : \n");
		
		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
	public static void insertion_sort(int [] a)
	{
		int i;
		int v; //value to be inserted
		int j;
		int n = a.length;
		
		for(i = 1; i <= n - 1; i++)
		{
			v = a[i];
			j = i - 1;
			while((j >= 0) && (a[j] > v))
			{
				a[j + 1] = a[j];
				j --;
			}
			a[j + 1] = v;
		}
	}
}
