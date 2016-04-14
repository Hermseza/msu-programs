/**
 * Filename		: Garage.java
 * Purpose		: To create a program that creates a garage object to use in the component.
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
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.Color;

public class Garage 
{
	//member instance fields
	private int xLeft;
	private int yTop;
					
	//constructors
	public Garage(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}
	
	public void draw(Graphics2D g2)
	{
		//create and draw the garage
		
		//creating the frame of the garage, a giant rectangle
		Rectangle body = new Rectangle(xLeft, yTop, 200, 100);
		g2.setColor(Color.ORANGE);
		g2.draw(body);
		g2.fill(body);
		
		//creating the door
		Rectangle door = new Rectangle(xLeft+50, yTop+50, 100, 50);
		g2.setColor(Color.BLACK);
		g2.draw(door);
		g2.fill(door);
		
		//creating the windows
		Rectangle window1 = new Rectangle(xLeft+150, yTop+10, 30, 30);
		Rectangle window2 = new Rectangle(xLeft+25, yTop+10, 30, 30);
		g2.setColor(Color.DARK_GRAY);
		g2.draw(window1);
		g2.draw(window2);
		g2.fill(window1);
		g2.fill(window2);
		
		//creating the roof
		Rectangle roof = new Rectangle(xLeft, yTop-50, 200, 50);
		g2.setColor(Color.RED);
		g2.draw(roof);
		g2.fill(roof);
	}

}
