/**
 * Filename		: RandomCharacters.java
 * Purpose		: To create a class that uses lambda to print a list of letters in random order
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 11/20/2015
 * Compiler		: Eclipse
 * Executable	: RandomCharacters.jar
 * History		: Z.A.H : 11/18/2015 : Program Genesis 
 */


package randomCharactersPackage;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RandomCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//write a program that inserts 30 random letters into a List of characters
		List<Character> letters = new ArrayList<>();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		SecureRandom random = new SecureRandom();
		
		for(int i = 0; i < 30; i++)
		{
			letters.add(alphabet.charAt(random.nextInt(26)));
		}
		
		//sort list in ascending order
		letters.stream().sorted().forEach(c -> System.out.printf("%c ", c));
		System.out.println();
		
		Comparator<Character> compare = Character::compareTo;
		
		letters.stream()
			.sorted(compare.reversed())
			.forEach(c -> System.out.printf("%c ", c));
		System.out.println();
		
		//display the list in ascending order with duplicates removed
		letters.stream()
			.distinct()
			.sorted()
			.forEach(c -> System.out.printf("%c ", c));
		System.out.println();
	}

}
