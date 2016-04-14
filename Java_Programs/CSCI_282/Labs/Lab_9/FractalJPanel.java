/**
 * Filename		: FractalJPanel.java
 * Purpose		: To create a class with methods that will draw to the GUI frame
 * Author		: Zackary Hermsen and Taylor Venissat
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 11/20/2015
 * Compiler		: Eclipse
 * Executable	: FractalViewer.jar
 * History		: Z.A.H : 11/18/2015 : Program Genesis 
 */

//written by Zack Hermsen

package fractalPackage;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class FractalJPanel extends JPanel
{
	private int level; // stores current level of fractal
	
	private static final int WIDTH = 400; // defines width of JPanel
	private static final int HEIGHT = 400; // defines height of JPanel
	
	// set the initial fractal level to the value specified
	// and set up JPanel specifications
	public FractalJPanel(int currentLevel)
	{
		level = currentLevel; // set initial fractal level
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
	
	// draw fractal recursively
	public void drawFractal(int level, int xA, int yA, int xB,
	int yB, Graphics g)
	{
		// base case: draw a line connecting two given points
		if (level == 0)
		g.drawLine(xA, yA, xB, yB);
		else // recursion step: determine new points, draw next level
		{
		// calculate midpoint between (xA, yA) and (xB, yB)
		int xC = (xA + xB) / 2;
		int yC = (yA + yB) / 2;
		// calculate the fourth point (xD, yD) which forms an
		// isosceles right triangle between (xA, yA) and (xC, yC)
		// where the right angle is at (xD, yD)
		int xD = xA + (xC - xA) / 2 - (yC - yA) / 2;
		int yD = yA + (yC - yA) / 2 + (xC - xA) / 2;
		// recursively draw the Fractal
		drawFractal(level - 1, xD, yD, xA, yA, g);
		drawFractal(level - 1, xD, yD, xC, yC, g);
		drawFractal(level - 1, xD, yD, xB, yB, g);
		}
	}
	
	// start drawing the fractal
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	
		// draw fractal pattern
		
		//set the color and draw the top left fractal
		g.setColor(Color.BLUE);
		drawFractal(level, 200, 200, 100, 100, g);
		//set the color and draw the top right fractal
		g.setColor(Color.RED);
		drawFractal(level, 200, 200, 300, 100, g);
		//set the color and draw the middle fractal
		g.setColor(Color.ORANGE);
		drawFractal(level, 200, 200, 200, 300, g); 
		//set the color and draw the bottom left fractal
		g.setColor(Color.PINK);
		drawFractal(level, 200, 200, 70, 220, g); 
		//set the color and draw the bottom right fractal
		g.setColor(Color.GREEN);
		drawFractal(level, 200, 200, 330, 220, g); 
		
	}
	
	// set the new level of recursion
	public void setLevel(int currentLevel)
	{
		level = currentLevel;
	}
	
	// returns level of recursion
	public int getLevel()
	{
		return level;
	}
} // end class FractalJPanel
