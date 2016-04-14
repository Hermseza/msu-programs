/**
 * Filename		: RaceTrack.java
 * Purpose		: To create a program that creates a racetrack object to use in the component.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 09/24/2015
 * Compiler		: Eclipse
 * Executable	: RaceTrackViewer.jar
 * History		: Z.A.H : 09/17/2015 : Program Genesis 
 * 				: Z.A.H	: 09/18/2015 : Created the cloud class, modified the car class to add color, and started the garage class 
 * 				: Z.A.H : 09/22/2015 : completed the garage class 
 */


package raceTrackPackage;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.Color;

public class RaceTrack 
{
	
	//member instance fields
	private int xLeft;
	private int yTop;
			
	//constructors
	public RaceTrack(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}
	
	//create the race track
	public void draw(Graphics2D g2)
	{
		Ellipse2D.Double outer = new Ellipse2D.Double(xLeft, yTop+150, 600, 300);
		g2.setColor(Color.BLACK);
		g2.draw(outer);
		g2.fill(outer);
		Ellipse2D.Double inner = new Ellipse2D.Double(xLeft+150, yTop+225, 300, 150);
		g2.setColor(Color.GREEN);
		g2.draw(inner);
		g2.fill(inner);
		
		
	}

}
