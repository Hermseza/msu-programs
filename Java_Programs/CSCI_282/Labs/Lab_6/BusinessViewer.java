/**
 * Filename		: BusinessViewer.java
 * Purpose		: To create a class that accepts input and draws to frame using methods.
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

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BusinessViewer 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//prompt user for all of the input
		String name = JOptionPane.showInputDialog("Please enter Employee name.");
		float salary = Float.parseFloat(JOptionPane.showInputDialog("Please enter salary."));
		int month = Integer.parseInt((JOptionPane.showInputDialog("Please enter month of hire date.")));
		int day = Integer.parseInt((JOptionPane.showInputDialog("Please enter day of hire date.")));
		int year = Integer.parseInt((JOptionPane.showInputDialog("Please enter year of hire date.")));
		HireDate hireDate = new HireDate(month, day, year);
		String department = JOptionPane.showInputDialog("Please enter department name,\n"
				+ "or enter 0 if you are not a manager/executive.");
		String title = JOptionPane.showInputDialog("Please enter title, or enter 0 if you "
				+ "are not an executive.");
		
		//create a new frame
		JFrame frame = new JFrame("Business Viewer");
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add the Sequence component
		BusinessComponent component = new BusinessComponent(name, salary, hireDate, department, title);
		frame.add(component);
		frame.setVisible(true);
	}
}
