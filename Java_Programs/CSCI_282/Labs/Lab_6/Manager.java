/**
 * Filename		: Manager.java
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

import businessPackage.Employee;

public class Manager extends Employee
{
	//instance variables
	private String department;
	
	//constructor
	public Manager(String name, float salary, HireDate hireDate, String department)
	{
		super(name, salary, hireDate);
		this.department = department;
	}
	
	//accessor methods
	public String getDepartment()
	{
		return department;
	}
	
	//override toString
	public String toString()
	{
		return String.format("The department is %s.\n", department);
	}
	
	//draw to frame
	public void managerDraw(Graphics2D g2)
	{
		super.employeeDraw(g2);
		g2.drawString("Their department is : " + department + ".", 20, 150);
	}
}
