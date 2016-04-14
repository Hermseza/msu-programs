/**
 * Filename		: Car.java
 * Purpose		: To create a program that creates a car object to use in the component.
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

public class Car 
{
	//member instance fields
	private int xLeft;
	private int yTop;
		
	//constructors
	public Car(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}
		
	//drawing of car
	public void draw(Graphics2D g2)
	{
		//create body using rectangle
		Rectangle body = new Rectangle(xLeft, yTop+10, 60, 10);
			
		//create wheels
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft+10, yTop+20, 10, 10);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft+40, yTop+20, 10, 10);
			
		//create roof and windshield
		Point2D.Double r1 = new Point2D.Double(xLeft+10, yTop+10);
		Point2D.Double r2 = new Point2D.Double(xLeft+20, yTop);
		Point2D.Double r3 = new Point2D.Double(xLeft+40, yTop);
		Point2D.Double r4 = new Point2D.Double(xLeft+50, yTop+10);
		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
		Line2D.Double roof = new Line2D.Double(r2, r3);
		Line2D.Double rearWindshield = new Line2D.Double(r3, r4);
			
			
			
		//draw the car
		//adding color to the original car class
		g2.setColor(Color.DARK_GRAY);
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(frontWindshield);
		g2.draw(roof);
		g2.draw(rearWindshield);
		g2.draw(body);
		g2.setColor(Color.RED);
		g2.fill(body);
		g2.setColor(Color.BLACK);
		g2.fill(frontTire);
		g2.fill(rearTire);
	}
		
	

}
