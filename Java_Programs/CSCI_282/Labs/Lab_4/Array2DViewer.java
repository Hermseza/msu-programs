/**
 * Filename		: Array2DViewer.java
 * Purpose		: To create a program that takes in an input as the rows and columns of arrays and displays patterns with the data.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 09/31/2015
 * Compiler		: Eclipse
 * Executable	: Array2DViewer.jar
 * History		: Z.A.H : 09/30/2015 : Program Genesis 
 */


package array2DPackage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Array2DViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a new frame
		JFrame frame = new JFrame("2D Array");
		frame.setSize(700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int rows;
		int columns;
		
		//prompt user to input the number of rows
		String rowMessage = ("Please enter the number of rows.");
			
		//convert input into an integer and store as rows
		String rowNum = JOptionPane.showInputDialog(rowMessage);
		rows = Integer.parseInt(rowNum);
		
		//prompt user to input the number of column
		String columnMessage = ("Please enter the number of columns.");
		
		//convert input into an integer and store as rows
		String columnNum = JOptionPane.showInputDialog(columnMessage);
		columns = Integer.parseInt(columnNum);
		
		//declare the 2D array with the user input as rows and columns
		int [][] test = new int [rows][columns];
		
		//create and add components to run
		Array2DComponent test1 = new Array2DComponent(test);
		frame.add(test1);
		
		frame.setVisible(true);


	}

}
