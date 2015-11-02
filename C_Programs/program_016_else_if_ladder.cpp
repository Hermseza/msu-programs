// AUTHOR	:  Zack Hermsen
// DATE		:  10(October)-07(Tuesday)-2014
// Course	:  Csci 180, Section A
// File		:  program_016_else_if_ladder.cpp
// Goal		:  To complete Lab 16
// Purpose	:  To be able to create the logic and implement it, for a situation when
//				I have a whole bunch of conditions, only ONE of which will be true at a time

#include <stdio.h>

int main()
{
	int score;

	printf("\n Please enter your score : ");
	scanf_s("%d", &score);

	if (score >= 90)
	{
		printf("\n Your score of %d gives you an A", score);
	}
	else if (score >= 80)
	{
		printf("\n Your score of %d gives you a B", score);
	}
	else if (score >= 70)
	{
		printf("\n Your score of %d gives you a C", score);
	}
	else if (score >= 60)
	{
		printf("\n Your score of %d gives you a D", score);
	}
	else
	{
		printf("\n Your score of %d gives you an F", score);
	}

	getchar();
	getchar();
	return 0;
}
