// AUTHOR	: Zack Hermsen
// DATE		: 09(Sept)-16(Tue)-2014
// File		: program_003_rectangle.cpp
// Course	: Csci 180, section A
// Goal		: To complete Lab 3, Rectangle
// Purpose	: 1) To be able to understand how to input multiple values to a program, and
//				 have the program use them to do meaningful calculations.
//			  2) To understand how to document our programs purposefully.

#include <stdio.h>


int main()
{
	int length;  // Length of the rectangle
	int breadth;  // Breadth or WIDTH of the rectangle
	int area;  // The area of the rectangle, as computed by the program
	int perimeter;  // The perimeter of the rectangle, as computed by the program

	printf("\n Please enter the length of the rectangle : ");
	scanf_s("%d", &length);

	printf("\n Please enter the breadth of the rectangle : ");
	scanf_s("%d", &breadth);
	
	area = length * breadth;
	perimeter = 2 * (length + breadth);

	printf("\n For a rectangle with length %d and breadth %d, the area is %d, and the perimeter is %d", length, breadth, area, perimeter);
	getchar();
	getchar();
	return 0;
}
