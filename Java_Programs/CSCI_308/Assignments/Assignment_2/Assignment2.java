//	AUTHOR	:  Zackary Hermsen
//  DATE	:  03/07/16
//  File	:  Assignment2.java
//  Course	:  Csci 308, Section A
//  Purpose	:  To find the post order traversal of a tree using recursion.


package assignment2Package;

public class Assignment2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		// given data
		String In = "BXRDSAPCTQY";
		String Pre = "AXBDRSCPQTY";

		// print statements
		System.out.printf("\n Starting the work...\n ");

		print_post_order_traversal(In, Pre);

		System.out.printf("\n Ending the work...\n");
		System.out.printf("\n Type any key to continue");
		System.out.printf("\n\n");

	}

	public static void print_post_order_traversal(String InOrder, String PreOrder)
	{
		//instance variables
		int i = 0;
		int length_of_left_subtree = 0;
		int length_of_right_subtree = 0;
		String String_left_subtree_InOrder = new String("");
		String String_left_subtree_PreOrder = new String("");
		String String_right_subtree_InOrder = new String("");
		String String_right_subtree_PreOrder = new String("");

		//handle the base cases first
		if (InOrder.length() == 0)
			System.out.printf("");
		else if (InOrder.length() == 1)
			System.out.printf("%c", (InOrder.charAt(0)));
		else if (InOrder.length() == 2)
		{
			if (InOrder.equals(PreOrder))
				System.out.printf("%c%c", InOrder.charAt(1), InOrder.charAt(0));
			else
				System.out.printf("%c%c", InOrder.charAt(0), InOrder.charAt(1));
		}
		else if (InOrder.length() == 3)
			System.out.printf("%c%c%c", InOrder.charAt(0), InOrder.charAt(2), InOrder.charAt(1));
		else
		{
			//recursive case

			//1. Find the root node from the Pre-Order traversal
			char root_preorder = PreOrder.charAt(0);

			//2. Find the location of the root in the InOrder traversal
			int root_inorder = 0;

			for (i = 0; i < InOrder.length(); i++)
			{
				if (InOrder.charAt(i) == root_preorder)
					root_inorder = i;
			}

			//3. Find the length of the left subtree
			for (i = 0; i < root_inorder; i++)
				length_of_left_subtree++;

			//4. Find the length of the right subtree
			for (i = root_inorder + 1; i < InOrder.length(); i++)
				length_of_right_subtree++;

			//5. Find :
			//a. The inorder traversal of the left subtree
			for (i = 0; i < length_of_left_subtree; i++)
				String_left_subtree_InOrder += InOrder.charAt(i);

			//b. The preorder traversal of the left subtree
			for (i = 1; i < length_of_left_subtree + 1; i++)
				String_left_subtree_PreOrder += PreOrder.charAt(i);

			//c. The inorder traversal of the right subtree
			for (i = root_inorder + 1; i < InOrder.length(); i++)
				String_right_subtree_InOrder += InOrder.charAt(i);

			//d. The preorder traversal of the right subtree
			for (i = length_of_right_subtree + 1; i < PreOrder.length(); i++)
				String_right_subtree_PreOrder += PreOrder.charAt(i);

			//Final answer, print out left subtree
			print_post_order_traversal(String_left_subtree_InOrder, String_left_subtree_PreOrder);
			//print out the right subtree
			print_post_order_traversal(String_right_subtree_InOrder, String_right_subtree_PreOrder);

			System.out.printf("%c", PreOrder.charAt(0));
		}
	}
}
