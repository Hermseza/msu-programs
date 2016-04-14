/**
 * Filename		: CharacterCountViewer.java
 * Purpose		: To create a class that accepts a file name and shows a frame.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 11/20/2015
 * Compiler		: Eclipse
 * Executable	: CharacterCountViewer.jar
 * History		: Z.A.H : 11/11/2015 : Program Genesis
 * 				: Z.A.H : 11/12/2015 : Completed the Frame and made the button handlers  
 */


package characterCountPackage;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CharacterCountViewer extends JFrame
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//prompt the user to give the name of the file to open
		String inFilename = JOptionPane.showInputDialog("Please enter the input filename: ");
		String outFilename = JOptionPane.showInputDialog("Please enter the output filename: ");
		
		//create the frame by instantiating the CharacterCount class
		JFrame frame = new CharacterCount(inFilename, outFilename);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		

	}

}
