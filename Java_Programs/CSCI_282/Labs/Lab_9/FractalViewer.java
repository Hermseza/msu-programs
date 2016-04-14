/**
 * Filename		: Fractal.java
 * Purpose		: To create a class that creates an instance of the Fractal GUI frame
 * Author		: Zackary Hermsen and Taylor Venissat
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 11/20/2015
 * Compiler		: Eclipse
 * Executable	: FractalViewer.jar
 * History		: Z.A.H : 11/18/2015 : Program Genesis 
 */


package fractalPackage;

import javax.swing.JFrame;

public class FractalViewer extends JFrame
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//instantiate a fractal frame
		Fractal fractal = new Fractal();
		fractal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
