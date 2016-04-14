/**
 * Filename		: Executive.java
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

public class Executive extends Manager
{
	//instance fields
	private String title;
	
	//constructor
	public Executive(String name, float salary, HireDate hireDate, String department, String title)
	{
		super(name, salary, hireDate, department);
		this.title = title;
	}
	
	//accessor methods
	public String getTitle()
	{
		return title;
	}
	
	//override toString
	public String toString()
	{
		return String.format("The title is %s.\n", title);
	}
	
	//draw to frame
	public void executiveDraw(Graphics2D g2)
	{
		super.managerDraw(g2);
		g2.drawString("Their title is : " + title + ".", 20, 175);
	}
}
