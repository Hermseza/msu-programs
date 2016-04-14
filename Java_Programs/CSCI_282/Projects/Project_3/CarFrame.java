/**
 * Filename		: CarFrame.java
 * Purpose		: To create a class that creates a car object, using our predefined car
 * 					and draws it to the frame, using a random color. Also
 * 					moves the car across the frame.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 12/02/2015
 * Compiler		: Eclipse
 * Executable	: CarFrameViewer.jar
 * History		: Z.A.H : 11/30/2015 : Program Genesis
 */


package carFramePackage;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;


public class CarFrame 
{
	//instance field
	private static final int INCREMENT = 7;
	private static final int DECREMENT = 7;
	private int moveRight = 1;
	private int xLeft;
	private int yTop;
	private String color;
	
	//constructor
	public CarFrame(int x, int y, String color)
	{
		xLeft = x;
		yTop = y;
		this.color = color;
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
		
		//color the tires of the car
		g2.setColor(Color.BLACK);
		g2.fill(frontTire);
		g2.fill(rearTire);
		
		//creates the colors to choose from randomly
		Color RED = Color.RED;
		Color ORANGE = Color.ORANGE;
		Color YELLOW = Color.YELLOW;
		Color GREEN = Color.GREEN;
		Color BLUE = Color.BLUE;
		Color INDIGO = new Color(75,0,130);
		Color VIOLET = new Color(143,0,255);
		Color BLACK = Color.BLACK;
		Color GRAY = Color.GRAY;
		Color CYAN = Color.CYAN;
		Color PINK = Color.PINK;
		Color MAGENTA = Color.MAGENTA;
		
		//chooses a random color for the car
		if(color == "RED")
		{
			g2.setColor(RED); 
		}
		else if(color == "ORANGE")
		{
			g2.setColor(ORANGE); 
		}
		else if(color == "YELLOW")
		{
			g2.setColor(YELLOW); 
		}
		else if(color == "GREEN")
		{
			g2.setColor(GREEN); 
		}
		else if(color == "BLUE")
		{
			g2.setColor(BLUE); 
		}
		else if(color == "INDIGO")
		{
			g2.setColor(INDIGO); 
		}
		else if(color == "VIOLET")
		{
			g2.setColor(VIOLET); 
		}
		else if(color == "BLACK")
		{
			g2.setColor(BLACK);
		}
		else if(color == "GRAY")
		{
			g2.setColor(GRAY);
		}
		else if(color == "CYAN")
		{
			g2.setColor(CYAN);
		}
		else if(color == "PINK")
		{
			g2.setColor(PINK);
		}
		else if(color == "MAGENTA")
		{
			g2.setColor(MAGENTA);
		}
		
		//colors the body of the car with the random color
		g2.fill(body);
			
		//draws the parts of the car
		g2.draw(body);
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(frontWindshield);
		g2.draw(roof);
		g2.draw(rearWindshield);
	}
	
	//move cars across the frame, bouncing back when the edge is reached
	public void moveCars() 
	{	
        if(moveRight == 1) 
        {
            xLeft += INCREMENT;
            
            if(xLeft >= 1200)
            {
            	moveRight = 0;
            }
        }
        else
		{
        	xLeft -= DECREMENT;
        	
        	if(xLeft <= 0)
            {
            	moveRight = 1;
            }
		}
    }
}
