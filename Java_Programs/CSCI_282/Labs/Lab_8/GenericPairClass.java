/**
 * Filename		: GenericPairClass.java
 * Purpose		: To create a class that converts two given inputs to two
 * 					separate generic types
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

public class GenericPairClass <T, S> 
{

	//instance field
	private T a;
	private S b;
	
	//constructor
	public GenericPairClass(T type1, S type2)
	{
		a = type1;
		b = type2;
	}
	
	//get methods
	public T getA()
	{
		return a;
	}
	
	public S getB()
	{
		return b;
	}
	

}
