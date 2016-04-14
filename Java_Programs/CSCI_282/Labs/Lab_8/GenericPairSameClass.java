/**
 * Filename		: GenericPairSameClass.java
 * Purpose		: To create a class that converts two given inputs to the
 * 					same generic type
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

public class GenericPairSameClass <SameType>
{
	//instance field
	private SameType c;
	private SameType d;
	
	//constructor
	public GenericPairSameClass(SameType type1, SameType type2)
	{
		c = type1;
		d = type2;
	}
	
	//get methods
	public SameType getC()
	{
		return c;
	}
	
	public SameType getD()
	{
		return d;
	}
	

}
