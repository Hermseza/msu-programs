/**
 * Filename		: SequenceViewer.java
 * Purpose		: To create a class that calls the component to the frame to display
 * 					the newly created sequences.
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

import javax.swing.JFrame;

public class SequenceViewer {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//create the first arraylist used for testing, called first
		Sequence first = new Sequence();
		first.add(1);
		first.add(4);
		first.add(9);
		first.add(16);
		
		//create the second arraylist for testing, called second
		Sequence second = new Sequence();
		second.add(9);
		second.add(7);
		second.add(4);
		second.add(9);
		second.add(11);
		
		//create a new frame
		JFrame frame = new JFrame("Array List Methods");
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add the Sequence component
		SequenceComponent component = new SequenceComponent(first, second);
		frame.add(component);
		frame.setVisible(true);
	}
}
