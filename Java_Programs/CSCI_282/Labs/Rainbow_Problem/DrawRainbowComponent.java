/**
 * Filename		: DrawRainbowComponent.java
 * Purpose		: To create a program that draws a rainbow using arcs.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 10/05/2015
 * Compiler		: Eclipse
 * Executable	: DrawRainbowComponent.jar
 * History		: Z.A.H : 10/03/2015 : Program Genesis 
 */


package drawRainbowPackage;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawRainbowComponent extends JPanel
{
	//define custom colors for indigo and violet
	private final static Color violet = new Color(128, 0, 128);
	private final static Color indigo = new Color(75, 0, 130);
	
	//create an array list for the colors of the rainbow, starting from the last going to the first
	private Color[] colors = {Color.WHITE, Color.WHITE, violet, indigo, Color.BLUE,
			Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
	
	//constructor
	public DrawRainbowComponent()
	{
		//set background to white
		setBackground(Color.WHITE);
	}
	
	//draw a rainbow using arcs
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		//radius of an arc
		int radius = 20;
		
		//set the rainbow near the bottom center
		int centerX = getWidth() / 2;
		int centerY = getHeight() - 10;
		
		//draws the arcs from the outside in
		for(int i = colors.length; i > 0; i--)
		{
			//set the color for the current arc
			g.setColor(colors[i - 1]);
			
			//fill the arc from 0-180 degrees
			g.fillArc(centerX - (i * radius), centerY - (i * radius), (i * radius) * 2,
					(i * radius) * 2, 0, 180);
		}
	}
	
	

}
