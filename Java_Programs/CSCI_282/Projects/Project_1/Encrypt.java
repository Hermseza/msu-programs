/**
 * Filename		: Encrypt.java
 * Purpose		: To create a program that encrypts given data for the other classes to use.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 09/30/2015
 * Compiler		: Eclipse
 * Executable	: TempViewer.jar
 * History		: Z.A.H : 09/28/2015 : Program Genesis 
 */

package encryptPackage;

public class Encrypt 
{
	// instance variables
	private int data;

	// constructor
	public Encrypt(int data) 
	{
		this.data = data;
	}

	public int encode() 
	{
		// separates the given input into its separate integers
		int first = data / 1000;
		int second = (data % 1000) / 100;
		int third = (data % 100) / 10;
		int fourth = data % 10;

		// encrypt the integers
		int newFirst = (first + 7) % 10;
		int newSecond = (second + 7) % 10;
		int newThird = (third + 7) % 10;
		int newFourth = (fourth + 7) % 10;

		// returns the encrypted data with the first and third swapped, and second and fourth swapped
		return Integer.parseInt(newThird+""+newFourth+""+newFirst+""+newSecond);
	}

	public int decode(int encryptedData) 
	{
		// separates the given input into its separate integers
		int first = encryptedData / 1000;
		int second = (encryptedData % 1000) / 100;
		int third = (encryptedData % 100) / 10;
		int fourth = encryptedData % 10;

		// decrypt the integers
		int newFirst;
		int newSecond;
		int newThird;
		int newFourth;
		if(first >= 7)
		{
			newFirst = first - 7;
		}
		else
		{
			newFirst = first + 3;
		}
		
		if(second >= 7)
		{
			newSecond = second - 7;
		}
		else
		{
			newSecond = second + 3;
		}
		
		if(third >= 7)
		{
			newThird = third - 7;
		}
		else
		{
			newThird = third + 3;
		}
		
		if(fourth >= 7)
		{
			newFourth = fourth - 7;
		}
		else
		{
			newFourth = fourth + 3;
		}


		// returns the decrypted data with the first and third swapped, and second and fourth swapped
		return Integer.parseInt(newThird+""+newFourth+""+newFirst+""+newSecond);
	}

}
