// AUTHOR	:  Zack Hermsen
// DATE		:  09(September)-22(Monday)-2014
// Course	:  Csci 180, Section A
// File		:  program_005_square_rectangle.cpp
// Goal		:  To complete Lab 5
// Purpose	:  To find the area of a square that has the same perimeter as a given rectangle
//				To understand the correct usage of data types

#include <stdio.h>

int main()
{
	int length_of_rectangle;
	int area_of_rectangle;
	float breadth_of_rectangle;
	float perimeter_of_rectangle;
	float perimeter_of_square;
	float side_of_square;
	float area_of_square;

	printf("\n Please enter the length of the rectangle : ");
	scanf_s("%d", &length_of_rectangle);

	printf("\n Please enter the area of the rectangle : ");
	scanf_s("%d", &area_of_rectangle);

	breadth_of_rectangle = area_of_rectangle/length_of_rectangle;

	perimeter_of_rectangle = 2 * (length_of_rectangle + breadth_of_rectangle);

	perimeter_of_square = perimeter_of_rectangle;

	side_of_square = perimeter_of_square/4;

	area_of_square = side_of_square * side_of_square;

	printf("\n If a rectangle has an area of %d, and has a length of %d", area_of_rectangle, length_of_rectangle);
	printf("\n .. then a square with the same perimeter as the rectangle has an area of %f", area_of_square);

	getchar();
	getchar();

	return 0;
}
