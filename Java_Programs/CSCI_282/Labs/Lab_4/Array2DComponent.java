/**
 * Filename		: Array2DComponent.java
 * Purpose		: To create a program that calls the Array2D class and draws from its methods to the frame.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 09/31/2015
 * Compiler		: Eclipse
 * Executable	: Array2DViewer.jar
 * History		: Z.A.H : 09/30/2015 : Program Genesis 
 */


package array2DPackage;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


public class Array2DComponent extends JComponent
{
	//instance field
	private int [][] tester;
	
	//constructor
	public Array2DComponent(int[][] test)
	{
		tester = test;
	}
	
	public void paintComponent(Graphics g)
	{
		//cast g to Graphics2D type
		Graphics2D g2 = (Graphics2D) g;
		
		//call the Array2D class
		Array2D test1 = new Array2D(tester);
		
		//call of the Array2D methods to draw.
		test1.task1(g2);
		test1.task2(g2);
		test1.task3(g2);
		test1.task4(g2);
		test1.task5(g2);
	}

}
