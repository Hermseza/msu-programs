/**
 * Filename		: Cloud.java
 * Purpose		: To create a program that creates a cloud object to use in the component.
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

public class Cloud 
{
	//member instance fields
	private int xLeft;
	private int yTop;
				
	//constructors
	public Cloud(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}
	
	public void draw(Graphics2D g2)
	{
		//create and draw the circles making the cloud
		g2.setColor(Color.WHITE);
		Ellipse2D.Double first = new Ellipse2D.Double(xLeft, yTop, 30, 30);
		Ellipse2D.Double second = new Ellipse2D.Double(xLeft+30, yTop, 30, 30);
		Ellipse2D.Double third = new Ellipse2D.Double(xLeft+60, yTop, 30, 30);
		Ellipse2D.Double fourth = new Ellipse2D.Double(xLeft, yTop+30, 30, 30);
		Ellipse2D.Double fifth = new Ellipse2D.Double(xLeft+30, yTop+30, 30, 30);
		Ellipse2D.Double sixth = new Ellipse2D.Double(xLeft+60, yTop+30, 30, 30);
		Ellipse2D.Double seventh = new Ellipse2D.Double(xLeft+15, yTop+15, 30, 30);
		Ellipse2D.Double eight = new Ellipse2D.Double(xLeft+45, yTop+15, 30, 30);
		g2.draw(first);
		g2.fill(first);
		g2.draw(second);
		g2.fill(second);
		g2.draw(third);
		g2.fill(third);
		g2.draw(fourth);
		g2.fill(fourth);
		g2.draw(fifth);
		g2.fill(fifth);
		g2.draw(sixth);
		g2.fill(sixth);
		g2.draw(seventh);
		g2.fill(seventh);
		g2.draw(eight);
		g2.fill(eight);
	}

}
