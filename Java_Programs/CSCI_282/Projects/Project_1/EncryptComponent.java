/**
 * Filename		: EncryptComponent.java
 * Purpose		: To create a program that draws the encrypted data to a frame.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 09/30/2015
 * Compiler		: Eclipse
 * Executable	: TempViewer.jar
 * History		: Z.A.H : 09/28/2015 : Program Genesis 
 */

package encryptPackage;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class EncryptComponent extends JComponent
{
	//instance variables
	int counter;
	String original;
	String encoded;
	String decoded;
	
	//constructor
	public EncryptComponent(String orig, int encode, int decode, int count)
	{
		original = orig;
		encoded = String.valueOf(encode);
		decoded = String.valueOf(decode);
		counter = count;
	}
	
	public void paintComponent(Graphics g)
	{
		//Cast g to Graphics2D type
		Graphics2D g2 = (Graphics2D) g;
		
		//draw the inputs and converted integers to the frame
		g2.drawString("Counter Number: "+counter, 0, 75);

		g2.drawString("Original Integer : "+original, 0, 100);
		
		g2.drawString("Encoded Integer : "+encoded, 0, 125);

		g2.drawString("Decoded Integer : "+decoded, 0, 150);
	}

}
