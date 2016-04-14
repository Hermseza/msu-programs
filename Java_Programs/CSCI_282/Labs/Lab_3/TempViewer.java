/**
 * Filename		: TempViewer.java
 * Purpose		: To create a program that creates a JFrame to view the Temperature component.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 09/24/2015
 * Compiler		: Eclipse
 * Executable	: TempViewer.jar
 * History		: Z.A.H : 09/22/2015 : Program Genesis  
 */


package tempPackage;

import javax.swing.JFrame;
import tempPackage.TempComponent;



public class TempViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a new frame
		JFrame frame = new JFrame("Temperature Conversions");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		TempComponent component = new TempComponent();
		frame.add(component);

		frame.setVisible(true);

		

	}

}
