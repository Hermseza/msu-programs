/**
 * Filename		: Tree.java
 * Purpose		: To create a program that creates a tree object to use in the component.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 09/24/2015
 * Compiler		: Eclipse
 * Executable	: RaceTrackViewer.jar
 * History		: Z.A.H : 09/17/2015 : Program Genesis  
 */


package raceTrackPackage;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.Color;
import java.awt.Rectangle;

public class Tree 
{
	//member instance fields
	private int xLeft;
	private int yTop;
				
	//constructors
	public Tree(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}
	
	//drawing of tree
	public void draw(Graphics2D g2)
	{
		//create trunk using rectangle
		Rectangle trunk = new Rectangle(xLeft+14, yTop+40, 30, 60);
		Color brown = new Color(101, 67, 33);
		g2.setColor(brown);
		g2.fill(trunk);
		g2.draw(trunk);
		
		//create leaves
		Ellipse2D.Double leaves = new Ellipse2D.Double(xLeft, yTop, 60, 60);
		g2.setColor(Color.BLACK);
		g2.draw(leaves);
		g2.setColor(Color.GREEN);
		g2.fill(leaves);
			
	}

}
