//	AUTHOR	:  Zackary Hermsen
//  DATE	:  02/11/16
//  File	:  SelectionSort.java
//  Course	:  Csci 308, Section A
//  Purpose	:  To sort an array using selection sort.


package selectionSort;

public class SelectionSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int [] a = { 89, 45, 68, 90, 29, 34, 17 };
		
		System.out.println("\nThe array before using section sort is as follows : \n ");
		
		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println("");
		
		selection_sort(a);
		
		System.out.println("\nThe array after using selection sort is as follows : \n");
		
		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i] + " ");
		}
		

	}

	public static void selection_sort(int [] a)
	{
		int i;
		int j;
		int temp;
		int n = a.length;
		int min;
		
		for(i = 0; i <= n - 2; i++)
		{
			
			min = i;
			
			for(j = i + 1; j <= n - 1; j++)
			{
				if(a[j] < a[min])
				{
					min = j;
				}
			}
			
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
	}
}
