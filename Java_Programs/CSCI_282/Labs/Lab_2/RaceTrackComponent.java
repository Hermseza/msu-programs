/**
 * Filename		: RaceTrackComponent.java
 * Purpose		: To create a program that creates the components to draw the entire race track scene.
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

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Font;

public class RaceTrackComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		//cast to Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		//creates the sky
		g2.setColor(Color.CYAN);
		Rectangle sky = new Rectangle(0, 0, 800, 400);
		g2.draw(sky);
		g2.fill(sky);
		
		//creates the earth
		g2.setColor(Color.GREEN);
		Rectangle earth = new Rectangle(0, 400, 800, 400);
		g2.draw(earth);
		g2.fill(earth);
		
		//draws the track
		RaceTrack track = new RaceTrack(100, 100);
		track.draw(g2);
		
		//creates and draws the trees
		Tree tree1 = new Tree(0, 500);
		Tree tree2 = new Tree(60, 600);
		Tree tree3 = new Tree(0, 600);
		Tree tree4 = new Tree(60, 500);
		tree1.draw(g2);
		tree2.draw(g2);
		tree3.draw(g2);
		tree4.draw(g2);
		
		//creates and draws the clouds
		Cloud cloud1 = new Cloud(0, 0);
		Cloud cloud2 = new Cloud(100, 0);
		Cloud cloud3 = new Cloud(0, 100);
		Cloud cloud4 = new Cloud(100, 100);
		Cloud cloud5 = new Cloud(200, 0);
		Cloud cloud6 = new Cloud(300, 0);
		Cloud cloud7 = new Cloud(200, 100);
		Cloud cloud8 = new Cloud(300, 100);
		Cloud cloud9 = new Cloud(400, 0);
		Cloud cloud10 = new Cloud(500, 0);
		Cloud cloud11 = new Cloud(400, 100);
		Cloud cloud12 = new Cloud(500, 100);
		Cloud cloud13 = new Cloud(600, 0);
		Cloud cloud14 = new Cloud(700, 0);
		Cloud cloud15 = new Cloud(600, 100);
		Cloud cloud16 = new Cloud(700, 100);
		cloud1.draw(g2);
		cloud2.draw(g2);
		cloud3.draw(g2);
		cloud4.draw(g2);
		cloud5.draw(g2);
		cloud6.draw(g2);
		cloud7.draw(g2);
		cloud8.draw(g2);
		cloud9.draw(g2);
		cloud10.draw(g2);
		cloud11.draw(g2);
		cloud12.draw(g2);
		cloud13.draw(g2);
		cloud14.draw(g2);
		cloud15.draw(g2);
		cloud16.draw(g2);
		
		//creates and draws the cars
		Car car1 = new Car(145, 375);
		Car car2 = new Car(600, 375);
		car1.draw(g2);
		car2.draw(g2);
		
		//creates and draws the garage
		Garage garage = new Garage(500, 600);
		garage.draw(g2);
		
	
	}

}
