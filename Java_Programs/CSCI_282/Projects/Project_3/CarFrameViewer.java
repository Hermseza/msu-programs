/**
 * Filename		: CarFrameViewer.java
 * Purpose		: To create a class that uses a runnable thread to display cars on a frame
 * 					that move on a mouse event and rebound off the edges of the frame
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

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;


public class CarFrameViewer extends JPanel implements MouseListener
{

	//instance field
	private static int numCars = 1;
	private static int numClicks = 1;
	private String color = randomColor();

	//counts the number of times the mouse is pressed
	public void mousePressed(MouseEvent event)
	{
		numClicks++;
	}

	//creates a list for the cars
	List<CarFrame> cars;

	//constructor
	public CarFrameViewer() 
	{	
		addMouseListener(this);

		//creates a new ArrayList for the cars
		cars = new ArrayList<>();

		//adds a car to the ArrayList
		cars.add(new CarFrame(-50, -50, color));

		//creates a new timer for the movement of the car
		Timer timer = new Timer(15, new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				//moves the cars across the frame 
				for(CarFrame car : cars) 
				{
					car.moveCars();
					repaint();
				}
			}
		});
		timer.start();
	}

	//paint method
	@Override
	protected void paintComponent(Graphics g) 
	{   
		//uses paintComponent from the superclass
		super.paintComponent(g);

		//sets a random color for the car
		color = randomColor();

		//adds another car when the user clicks
		if(numClicks > numCars)
		{	
			//adds the cars to list if the required number of mouse 
			//clicks has been reached
			if(numClicks == 2)
			{
				cars.add(new CarFrame(1, 5, color));
			}
			if(numClicks == 3)
			{
				cars.add(new CarFrame(1, 40, color));
			}
			else if(numClicks == 4)
			{
				cars.add(new CarFrame(1, 75, color));
			}
			else if(numClicks == 5)
			{
				cars.add(new CarFrame(1, 110, color));
			}
			else if(numClicks == 6)
			{
				cars.add(new CarFrame(1, 145, color));
			}
			else if(numClicks == 7)
			{
				cars.add(new CarFrame(1, 180, color));
			}
			else if(numClicks == 8)
			{
				cars.add(new CarFrame(1, 215, color));
			}
			else if(numClicks == 9)
			{
				cars.add(new CarFrame(1, 250, color));
			}
			else if(numClicks == 10)
			{
				cars.add(new CarFrame(1, 285, color));
			}
			else if(numClicks == 11)
			{
				cars.add(new CarFrame(1, 320, color));
			}
			else if(numClicks == 12)
			{
				cars.add(new CarFrame(1, 355, color));
			}
			else if(numClicks == 13)
			{
				cars.add(new CarFrame(1, 390, color));
			}
			else if(numClicks == 14)
			{
				cars.add(new CarFrame(1, 425, color));
			}
			else if(numClicks == 15)
			{
				cars.add(new CarFrame(1, 460, color));
			}
			else if(numClicks == 16)
			{
				cars.add(new CarFrame(1, 495, color));
			}
			else if(numClicks == 17)
			{
				cars.add(new CarFrame(1, 530, color));
			}
			else if(numClicks == 18)
			{
				cars.add(new CarFrame(1, 565, color));
			}
			else if(numClicks == 19)
			{
				cars.add(new CarFrame(1, 600, color));
			}
			else if(numClicks == 20)
			{
				cars.add(new CarFrame(1, 635, color));
			}
			else if(numClicks == 21)
			{
				cars.add(new CarFrame(1, 670, color));
			}

			//increments the number of cars
			numCars++;
		}

		//draws each car from the cars ArrayList
		for (CarFrame car : cars) 
		{
			car.draw((Graphics2D) g);
		}
	}

	//main method
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater
		(
				new Runnable() 
				{
					public void run() 
					{
						//creates a new JFrame
						JFrame frame = new JFrame("Concurrent Cars");

						//adds this class to the frame
						frame.add(new CarFrameViewer());

						//format the frame
						frame.setSize(1275, 750);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}
				}
				);
	}

	//unused mouse events 
	public void mouseEntered(MouseEvent event){}
	public void mouseClicked(MouseEvent event){}
	public void mouseReleased(MouseEvent event){}
	public void mouseMoved(MouseEvent event){}
	public void mouseDragged(MouseEvent event){}
	public void mouseExited(MouseEvent event){}

	//returns a random color name
	public String randomColor()
	{
		//creates an ArrayList to hold color names
		ArrayList<String> colors = new ArrayList<String>();

		//add color names to the list
		colors.add("RED");
		colors.add("ORANGE");
		colors.add("YELLOW");
		colors.add("GREEN");
		colors.add("BLUE");
		colors.add("INDIGO");
		colors.add("VIOLET");
		colors.add("BLACK");
		colors.add("GRAY");
		colors.add("CYAN");
		colors.add("PINK");
		colors.add("MAGENTA");

		//select a random color name from the list
		int size = colors.size();
		int randomColor = new Random().nextInt(size);
		String newColor = colors.get(randomColor);			

		return newColor;
	}
}
