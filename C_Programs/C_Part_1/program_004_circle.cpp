// AUTHOR	: Zack Hermsen
// DATE		: 09(September)-19(Friday)-2014
// Course	: Csci 180, Section A
// File		: program_004_circle.cpp
// Goal		: To complete Lab 4, a program to print area and circumference of a circle
// PURPOSE	: First program where we used the FLOATING POINT number as a data type

# include <stdio.h>

int main()
{
	// First we declare our variables
	float radius;
	float area;
	float circumference;

	// Then we prompt the user to input the radius
	printf("\n Please enter radius of the circle : ");
	scanf_s("%f", &radius);


	// Then we calculate the area and circumference
	area = 3.14159 * radius * radius;
	circumference = 2 * 3.14159 * radius;

	// Then we print the data
	printf("\n For a circle with radius %f, the area is %f, and the circumference is %f", radius, area, circumference);
	getchar();
	getchar();
	return 0;
}
