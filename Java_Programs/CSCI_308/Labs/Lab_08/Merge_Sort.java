//	AUTHOR	:  Zackary Hermsen
//  DATE	:  04/14/16
//  File	:  Merge_Sort.java
//  Course	:  Csci 308, Section A
//  Purpose	:  To implement the Merge sort algorithm


package mergeSortPackage;


public class Merge_Sort 
{

	//main method, prints array before and after merging
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//initialize array A
		int[] A = { 89, 45, 68, 90, 29, 34, 17 };
		
		//print the array before sorting
		System.out.println("\n The array before sorting is as follows : \n");
		print_array(A);
		
		//sort the array
		MergeSort(A);
		
		//print the array after sorting
		System.out.println("\n The array after sorting is as follows : \n");
		print_array(A);
		System.out.println("\n\n");
	}
	
	//MergeSort method, breaks down arrays into smaller components, then merges them
	public static void MergeSort(int[] A)
	{
		if(A.length > 1)
		{
			//1. Copy A[0...floor(n/2) - 1] to B
			int[] B;
			int B_SIZE = (int) Math.floor((A.length) / 2);
			B = new int[B_SIZE];
			
			int i; //used for array B
			int j; //used for array C
			
			for(i = 0; i <= B_SIZE - 1; i++)
			{
				B[i] = A[i];
			}
			
			//2. Copy A[floor(n/2)...(n-1)] to C
			int[] C;
			int C_SIZE = A.length - B.length;
			C = new int[C_SIZE];
			
			int A_lower_limit = (int) Math.floor((A.length) / 2);
			
			for(i = A_lower_limit, j = 0; (i <= (A.length - 1) && (j <= C_SIZE - 1));
					i++, j++)
			{
				C[j] = A[i];
			}
			
			//3. MergeSort B
			MergeSort(B);
			
			//4. MergeSort C
			MergeSort(C);
			
			//5 Merge B + C to get A
			Merge(B, C, A);
		}
	}
	
	//Merge method, combines the broken down pieces into a sorted array
	public static void Merge(int[] B, int[] C, int[] A)
	{
		int i = 0; //to index array B
		int j = 0; //to index array C
		int k = 0; //to index array A
		
		while((i < B.length) && (j < C.length))
		{
			if(B[i] <= C[j])
			{
				A[k] = B[i];
				i++;
			}
			else
			{
				A[k] = C[j];
				j++;
			}
			k++;
		}
		
		if(i == B.length)
		{
			for(; j <= C.length - 1; j++, k++)
			{
				A[k] = C[j];
			}
		}
		else
		{
			for(; i <= B.length - 1; i++, j++)
			{
				A[k] = B[i];
			}
		}
	}
	
	//print_array method
	public static void print_array(int[] a)
	{
		System.out.print(" ");
		for(int i = 0; i <= a.length - 1; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
