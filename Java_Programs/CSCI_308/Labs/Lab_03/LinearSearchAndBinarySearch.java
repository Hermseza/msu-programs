//	AUTHOR	:  Zackary Hermsen
//  DATE	:  02/25/16
//  File	:  LinearSearchAndBinarySearch.java
//  Course	:  CSCI 308, Section A
//  Purpose	:  To use linear search and binary search both
//				iteratively and recursively to find the location
//				of an element in an array.


package lab3Package;

public class LinearSearchAndBinarySearch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] A = {30, 53, 74, 93, 14}; //array used for linear search
		int[] B = {20, 30, 40, 50, 60, 70, 80}; //array used for binary search
		int b; //the index of the location in the array using iteration (linear)
		int c; //the index of the location in the array using recursion (linear)
		int d; //the index of the location in the array using recursion (binary)
		int e; //the index of the location in the array using iteration (binary)
		
		//linear search print statements
		
		//iteratively
		b = linear_search_iterative(A, 14);
		System.out.printf("\n The element %d is at location %d, using "
				+ "linear search iteratively.\n", 14, b);
		
		//recursively
		c = linear_search_recursive(A, 0, 14);
		System.out.printf("\n The element %d is at location %d, using "
				+ "linear search recursively. \n", 14, c);
		
		//binary search print statements
		
		//recursively
		d = binary_search_recursive(B, 50, 0, B.length - 1);
		System.out.printf("\n The element %d is at location %d, using "
				+ "binary search recursively.\n", 50, d);
		
		//iteratively
		e = binary_search_iterative(B, 50);
		System.out.printf("\n The element %d is at location %d, using "
				+ "binary search iteratively.\n", 50, e);
	}
	
	//Problem 1, using linear search iteratively
	public static int linear_search_iterative(int[] A, int key)
	{
		int i; //counter variable
		for(i = 0; i <= A.length - 1; i++)
		{
			if(A[i] == key)
				return i;
		}
		
		return -1; //not found
	}
	
	//Problem 2, using linear search recursively
	public static int linear_search_recursive(int[] A, int start, int key)
	{
		if(start >= A.length)
			return start;
		if(A[start] == key)
			return start;
		else
			return linear_search_recursive(A, start + 1, key);
	}
	
	//Problem 3, using binary search recursively
	public static int binary_search_recursive(int[] A, int key, int low, int high)
	{
		int mid;
		if(low <= high)
		{
			mid = (low + high) / 2;
			if(key == A[mid])
				return mid;
			else if(key < A[mid]) //element in lower half of array
			{
				high = mid - 1;
				return binary_search_recursive(A, key, low, high);
			}
			else if(key > A[mid]) //element in upper half of array
			{
				low = mid + 1;
				return binary_search_recursive(A, key, low, high);
			}
		}
		return -1; //not found
	}
	
	//Problem 4, using binary search iteratively
	public static int binary_search_iterative(int[] A, int key)
	{
		int m; //middle index
		int l; //left index
		int r; //right index
		l = 0;
		r = A.length - 1;
		
		while( l <= r)
		{
			m = (l + r) / 2;
			if(key == A[m])
				return m;
			else if(key < A[m])
				r = m - 1;
			else if(key > A[m])
				l = m + 1;
		}
		return -1; //not found
	}
}
