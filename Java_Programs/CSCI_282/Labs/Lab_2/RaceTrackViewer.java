/**
 * Filename		: RaceTrackViewer.java
 * Purpose		: To create a program that creates a JFrame to view the RaceTrack component.
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

import javax.swing.JFrame;

import raceTrackPackage.RaceTrackComponent;

public class RaceTrackViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Race Track");
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create CarComponent
		RaceTrackComponent component = new RaceTrackComponent();
		frame.add(component);
		
		frame.setVisible(true);

	}

}
