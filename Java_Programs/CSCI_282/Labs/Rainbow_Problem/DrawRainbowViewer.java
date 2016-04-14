/**
 * Filename		: DrawRainbowViewer.java
 * Purpose		: To create a program that calls the component to the frame to draw a rainbow.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 10/05/2015
 * Compiler		: Eclipse
 * Executable	: DrawRainbowViewer.jar
 * History		: Z.A.H : 10/03/2015 : Program Genesis 
 */


package drawRainbowPackage;

import javax.swing.JFrame;

public class DrawRainbowViewer 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//create a component for DrawRainbowComponent
		DrawRainbowComponent component = new DrawRainbowComponent();
		
		//create a JFrame and add component to it
		JFrame frame = new JFrame("Draw Rainbow");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(component);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}

}
