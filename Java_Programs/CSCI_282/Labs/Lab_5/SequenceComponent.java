/**
 * Filename		: SequenceComponent.java
 * Purpose		: To create a class that calls the created sequences and paints them to the frame.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 10/08/2015
 * Compiler		: Eclipse
 * Executable	: SequenceViewer.jar
 * History		: Z.A.H : 10/06/2015 : Program Genesis 
 * 				: Z.A.H : 10/07/2015 : Added the SequenceComponent class to draw the arrays
 * 						to a frame instead of printing on the console. 
 */


package arrayListPackage;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class SequenceComponent extends JComponent
{
	//instance field
	Sequence first;
	Sequence second;

	//constructor
	public SequenceComponent(Sequence c, Sequence d)
	{
		first = c;
		second = d;
	}
	
	public void paintComponent(Graphics g)
	{
		//Cast g to Graphics2D type
		Graphics2D g2 = (Graphics2D) g;
		
		//draw the arrays to the frame
		g2.drawString("The first sequence is : " + first.toString(), 20, 75);
		g2.drawString("The second sequence is : " + second.toString(), 20, 100);
		g2.drawString("The appended sequence is : " + first.append(second), 20, 125);
		g2.drawString("The merged sequence is : " + first.merge(second), 20, 150);
		g2.drawString("The sorted merged sequence is : " + first.mergeSorted(second), 20, 175);
	}

}
