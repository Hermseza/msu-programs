/**
 * Filename		: HireDate.java
 * Purpose		: To create a class that accepts input and returns a formatted date.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 10/08/2015
 * Compiler		: Eclipse
 * Executable	: BusinessViewer.jar
 * History		: Z.A.H : 10/08/2015 : Program Genesis 
 */


package businessPackage;

public class HireDate {
	private int month;//1-12
	private int day; //1-31 based on month
	private int year; //any year

	//constructor: confirm proper value for month and day given the year
	public HireDate(int month, int day, int year) 
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}

	//return a String of the form month/day/year
	public String toString() 
	{
		return String.format("%d/%d/%d", month, day, year);
	}
}