// AUTHOR	:  Zack Hermsen
// DATE		:  10(October)-07(Tuesday)-2014
// Course	:  Csci 180, Section A
// File		:  program_017_switch_statement.cpp
// Goal		:  To complete lab 17
// Purpose	:  To implement a switch statement, using new terms such as switch, case, break, and default.

#include <stdio.h>

int main()
{
	int score;
	int index;

	printf("\n Please enter your score : ");
	scanf_s("%d", &score);

	index = score / 10;

	switch (index)
	{
	case 10:
	case 9:
		printf("\n Your score of %d gives you an A", score); 
		break;
	case 8:
		printf("\n Your score of %d gives you a B", score); 
		break;
	case 7:
		printf("\n Your score of %d gives you a C", score);
		break;
	case 6:
		printf("\n Your score of %d gives you a D", score);
		break;
	default:
		printf("\n Your score of %d gives you an F", score);
	}
	
	getchar();
	getchar();
	return 0;
}
