/**
 * Filename		: BusinessComponent.java
 * Purpose		: To create a class that accepts input and uses a component to frame.
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

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class BusinessComponent extends JComponent
{
	//instance field
	private String name;
	private float salary;
	private HireDate hireDate;
	private String department;
	private String title;
	
	//constructor
	public BusinessComponent(String name, float salary, HireDate hireDate, String department, String title)
	{
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
		this.department = department;
		this.title = title;
	}
	
	//paint component
	public void paintComponent(Graphics g)
	{
		//Cast g to Graphics2D type
		Graphics2D g2 = (Graphics2D) g;
		
		//call the Employee, Manager, and Executive classes
		Employee employee = new Employee(name, salary, hireDate);
		Manager manager = new Manager(name, salary, hireDate, department);
		Executive executive = new Executive(name, salary, hireDate, department, title);

		//draw the inputs
		/**for(JobType type : JobType.values())
		{
			if (type.equals("Employee"))
			{
				g2.drawString("The Job Type is : " + type.getjobType(), 20, 50);
				employee.employeeDraw(g2);
			}
			else if(type.equals("Manager"))
			{
				g2.drawString("The Job Type is : " + type.getjobType(), 20, 50);
				manager.managerDraw(g2);
			}
			else if(type.equals("3"))
			{
				g2.drawString("The Job Type is : " + type.getjobType(), 20, 50);
				executive.executiveDraw(g2);
			}
		}*/
		//if JobType = employee
		if(department.equals("0") && title.equals("0"))
		{
			g2.drawString("The Job Type is : Employee", 20, 50);
			employee.employeeDraw(g2);
		}
		//if JobType = manager
		else if(title.equals("0"))
		{
			g2.drawString("The Job Type is : Manager", 20, 50);
			manager.managerDraw(g2);
		}
		//if JobType = executive
		else
		{
			g2.drawString("The Job Type is : Executive", 20, 50);
			executive.executiveDraw(g2);
		}
	}

}
