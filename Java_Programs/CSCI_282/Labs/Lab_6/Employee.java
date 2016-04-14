/**
 * Filename		: Employee.java
 * Purpose		: To create a class that accepts input and makes a method to draw to frame.
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

import java.awt.Graphics2D;

public class Employee 
{
	//instance variables
	private String name;
	private float salary;
	private int month;
	private int day;
	private int year;
	HireDate hireDate = new HireDate(month, day, year);
	
	//constructor
	public Employee(String name, float salary, HireDate hireDate)
	{
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	//accessor methods
	public String getName()
	{
		return name;
	}
	
	public float getSalary()
	{
		return salary;
	}
	
	public HireDate getHireDate()
	{
		return hireDate;
	}
	
	//override toString
	public String toString()
	{
		return String.format("The Employee name is %s.\n"
				+ "The salary is $%.2f.\nThe hire date is %s.\n", name, salary, hireDate);
	}
	
	//draw to frame
	public void employeeDraw(Graphics2D g2)
	{
		g2.drawString("The Employee name is : " + name + ".", 20, 75);
		g2.drawString("Their salary is : $" + salary + ".", 20, 100);
		g2.drawString("Their hire date is : " + hireDate + ".", 20, 125);
	}
}
