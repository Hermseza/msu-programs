// AUTHOR	:  Zack Hermsen
// DATE		:  10(October)-01(Wednesday)-2014
// Course	:  Csci 180, Section A
// Program	:  program_013_const_keyword.cpp
// Goal		:  To complete Lab 13
// Purpose	:  To use const and keywords

#include <stdio.h>


int main()
{
	double r;
	double area;
	const double PI = 3.1415926

	printf("\n Please enter the radius of a circle : ");
	scanf_s("%lf", &r);

	area = PI * r * r;
	
	printf("\n For a circle with radius %lf, the area is %lf", r, area);

	getchar();
	getchar();
	return 0;
}
