/**
 * Filename		: EncryptViewer.java
 * Purpose		: To create a program that takes in an input, encrypts it, then displays the result.
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

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EncryptViewer 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//create a new frame
		JFrame frame = new JFrame("Cryptology");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		int data = 0;
		
		for(int i = 1; data != 1; i++)
		{
			
			//prompt user to input the integers
			String message = ("Please enter a 4-Digit Integer, or enter 1 to quit.");
			
			//convert input into an integer
			String inputData = JOptionPane.showInputDialog(message);
			data = Integer.parseInt(inputData);
			
			frame.getContentPane().removeAll();
			
			//encrypt and decrypt data
			String original = inputData;
			Encrypt userData = new Encrypt(data);
			int encrypted = userData.encode();
			int decrypted = userData.decode(encrypted);
			
			//display results
			EncryptComponent cryptology = new EncryptComponent(original, encrypted, decrypted, i);
			frame.add(cryptology);
			
			frame.validate();
		}
		
		//display a message showing that the program has stopped
		String exitMessage = String.format("The program has stopped because you selected Quit.");
		JOptionPane.showMessageDialog(null, exitMessage);

	}

}
