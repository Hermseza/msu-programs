/**
 * Filename		: GUIFrameViewer.java
 * Purpose		: To create a class that calls the GUIFrame component.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Ms. Kussmann
 * Due Date		: 11/5/2015
 * Compiler		: Eclipse
 * Executable	: GUIFrameViewer.jar
 * History		: Z.A.H : 10/23/2015 : Program Genesis 
 * 				: Z.A.H : 10/30/2015 : added event handlers for action listeners
 */


package gUIFramePackage;

import javax.swing.JFrame;

public class GUIFrameViewer extends JFrame
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JFrame frame = new GUIFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
