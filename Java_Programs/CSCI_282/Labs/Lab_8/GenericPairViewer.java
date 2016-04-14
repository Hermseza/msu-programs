/**
 * Filename		: GenericPairViewer.java
 * Purpose		: To create a class that passes variables through
 * 					the constructors and prints the values given
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 11/16/2015
 * Compiler		: Eclipse
 * Executable	: GenericPairViewer.jar
 * History		: Z.A.H : 11/13/2015 : Program Genesis 
 */


package genericPairClassPackage;

public class GenericPairViewer {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//instance field
		int a = 100;
		String b = "Hello";
		String c = "I love programming";
		String d = "Haha just kidding";
		
		//pass variables through the pair constructor
		GenericPairClass <Integer, String> pair1 = new GenericPairClass <Integer, String> (a, b);

		//print the values
		System.out.println(pair1.getA());
		System.out.println(pair1.getB());
		
		//line to separate the output of the two classes
		System.out.println();
		
		//pass variable through the same type constructor
		GenericPairSameClass <String> pair2 = new GenericPairSameClass <String> (c, d);
		
		//print the values
		System.out.println(pair2.getC());
		System.out.println(pair2.getD());

	}

}
