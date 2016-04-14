/**
 * Filename		: TempComponent.java
 * Purpose		: To create a program that creates a component to draw values being passed from main to the frame.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 09/24/2015
 * Compiler		: Eclipse
 * Executable	: TempViewer.jar
 * History		: Z.A.H : 09/22/2015 : Program Genesis  
 * 				: Z.A.H : 09/24/2015 : Changed everything from being in component to being in the main, while also
 * 									 : making the component only draw the things being passed to it from main
 */


package tempPackage;


import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


public class TempComponent extends JComponent
{
	int counter;
	double origTemp;
	double convTemp;
	
	public TempComponent(double orig, double converted, int count)
	{
		origTemp = orig;
		convTemp = converted;
		counter = count;
		
	} //end constructor
	
	public void paintComponent(Graphics g)
	{
		//Cast g to Graphics2D type
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawString("Counter Number: "+counter, 0, 75);

		g2.drawString("Original Temperature : "+origTemp, 0, 100);

		g2.drawString("Converted Temperature : "+convTemp, 0, 125);

	}

}
