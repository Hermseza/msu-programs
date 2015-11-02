// AUTHOR	:  Zack Hermsen
// DATE		:  09(September)-30(Tuesday)-2014
// Course	:  Csci 180, Section A
// File		:  program_011_IF_valid_triangle_OR.cpp
// Goal		:  To complete Lab 11, which determines if a triangle is valid using the OR operation
// Purpose	:  To rewrite program 10 using the OR operation instead of AND

#include <stdio.h>

int main()
{
	int a;  // The first side of the triangle
	int b;  // The second side of the triangle
	int c;  // The third side of the triangle

	printf("\n Please enter the sides of a triangle : ");
	scanf_s("%d %d %d", &a, &b, &c);

	if ( (a + b <= c) || (a + c <= b) || (b + c <= a) )
	{
		printf("\n The sides %d, %d, and %d DO NOT FORM a valid triangle", a, b, c);
	}
	else
	{
		printf("\n The sides %d, %d, and %d form a valid triangle", a, b, c);
	}

	getchar();
	getchar();
	return 0;
}
