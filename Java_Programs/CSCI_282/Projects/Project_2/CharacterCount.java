/**
 * Filename		: CharacterCount.java
 * Purpose		: To create a class that counts the characters in a file and shows a GUI
 * 					frame that lets the user select which characters to count.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 11/20/2015
 * Compiler		: Eclipse
 * Executable	: CharacterCountViewer.jar
 * History		: Z.A.H : 11/11/2015 : Program Genesis
 * 				: Z.A.H : 11/12/2015 : Completed the Frame and made the button handlers 
 */


package characterCountPackage;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class CharacterCount extends CharacterCountViewer
{
	//declare instance variables
	
	private static Scanner input;
	private String[] allCharsList;
	private String[] noSpaceList;
	private static BufferedWriter out;
	int countChars;
	int countNoSpace;
	private final JLabel allCharLabel;
	private final JLabel allCharNumber;
	private final JLabel noSpaceLabel;
	private final JLabel noSpaceNumber;
	private final JCheckBox aBox;
	private final JLabel aLabel;
	private final JCheckBox bBox;
	private final JLabel bLabel;
	private final JCheckBox cBox;
	private final JLabel cLabel;
	private final JCheckBox dBox;
	private final JLabel dLabel;
	private final JCheckBox eBox;
	private final JLabel eLabel;
	private final JCheckBox fBox;
	private final JLabel fLabel;
	private final JCheckBox gBox;
	private final JLabel gLabel;
	private final JCheckBox hBox;
	private final JLabel hLabel;
	private final JCheckBox iBox;
	private final JLabel iLabel;
	private final JCheckBox jBox;
	private final JLabel jLabel;
	private final JCheckBox kBox;
	private final JLabel kLabel;
	private final JCheckBox lBox;
	private final JLabel lLabel;
	private final JCheckBox mBox;
	private final JLabel mLabel;
	private final JCheckBox nBox;
	private final JLabel nLabel;
	private final JCheckBox oBox;
	private final JLabel oLabel;
	private final JCheckBox pBox;
	private final JLabel pLabel;
	private final JCheckBox qBox;
	private final JLabel qLabel;
	private final JCheckBox rBox;
	private final JLabel rLabel;
	private final JCheckBox sBox;
	private final JLabel sLabel;
	private final JCheckBox tBox;
	private final JLabel tLabel;
	private final JCheckBox uBox;
	private final JLabel uLabel;
	private final JCheckBox vBox;
	private final JLabel vLabel;
	private final JCheckBox wBox;
	private final JLabel wLabel;
	private final JCheckBox xBox;
	private final JLabel xLabel;
	private final JCheckBox yBox;
	private final JLabel yLabel;
	private final JCheckBox zBox;
	private final JLabel zLabel;
	private final JCheckBox graveBox;
	private final JLabel graveLabel;
	private final JCheckBox tildaBox;
	private final JLabel tildaLabel;
	private final JCheckBox exclamationBox;
	private final JLabel exclamationLabel;
	private final JCheckBox atBox;
	private final JLabel atLabel;
	private final JCheckBox poundBox;
	private final JLabel poundLabel;
	private final JCheckBox dollarBox;
	private final JLabel dollarLabel;
	private final JCheckBox divisionBox;
	private final JLabel divisionLabel;
	private final JCheckBox caratBox;
	private final JLabel caratLabel;
	private final JCheckBox andBox;
	private final JLabel andLabel;
	private final JCheckBox asteriskBox;
	private final JLabel asteriskLabel;
	private final JCheckBox openPBox;
	private final JLabel openPLabel;
	private final JCheckBox closePBox;
	private final JLabel closePLabel;
	private final JCheckBox dashBox;
	private final JLabel dashLabel;
	private final JCheckBox underBox;
	private final JLabel underLabel;
	private final JCheckBox plusBox;
	private final JLabel plusLabel;
	private final JCheckBox equalBox;
	private final JLabel equalLabel;
	private final JCheckBox openBBox;
	private final JLabel openBLabel;
	private final JCheckBox openCBBox;
	private final JLabel openCBLabel;
	private final JCheckBox closeBBox;
	private final JLabel closeBLabel;
	private final JCheckBox closeCBBox;
	private final JLabel closeCBLabel;
	private final JCheckBox pipeBox;
	private final JLabel pipeLabel;
	private final JCheckBox backSlashBox;
	private final JLabel backSlashLabel;
	private final JCheckBox semiCBox;
	private final JLabel semiCLabel;
	private final JCheckBox colonBox;
	private final JLabel colonLabel;
	private final JCheckBox apostBox;
	private final JLabel apostLabel;
	private final JCheckBox quoteBox;
	private final JLabel quoteLabel;
	private final JCheckBox commaBox;
	private final JLabel commaLabel;
	private final JCheckBox lessThanBox;
	private final JLabel lessThanLabel;
	private final JCheckBox periodBox;
	private final JLabel periodLabel;
	private final JCheckBox greaterThanBox;
	private final JLabel greaterThanLabel;
	private final JCheckBox forwardSlashBox;
	private final JLabel forwardSlashLabel;
	private final JCheckBox questionBox;
	private final JLabel questionLabel;
	
	public CharacterCount(String inFilename, String outFilename) throws IOException
	{
		//set variables used in input/output
		allCharsList = new String[100];
		noSpaceList = new String[100];
		char[] allCharList = new char[100];
		String sentence = new String();
		
		//get input from file
		try
		{
			out = new BufferedWriter(new FileWriter(outFilename));
			input = new Scanner(new File(inFilename));
			while(input.hasNext())
			{
				sentence += input.nextLine();
			}
			
			//set the two lists, one for all characters and one for no spaces
			allCharsList = sentence.split("");
			noSpaceList = sentence.split("");
			allCharList = sentence.toCharArray();
			
			//gets the number of characters with spaces
			countChars = allCharsList.length;
			
			//gets the number of characters without spaces
			for(String word : noSpaceList)
			{
				word = word.trim();
				if(!word.equals(""))
				{
					countNoSpace += word.length();
				}
			}

			//write the input file to the output file
			for(String word : allCharsList)
			{
				out.write(word);
			}
		}
		
		//catch exceptions
		catch(IOException e)
		{
			System.err.println("Error Opening File: Terminating");
			System.exit(1);
		}
		
		//close the streams
		finally
		{
			input.close();
			out.close();
		}
		
		//create the frame
		
		//create the grid bag layout and set constraints
        super.setLayout(new GridBagLayout()); 
        GridBagConstraints gBC = new GridBagConstraints(); 
        gBC.fill = GridBagConstraints.HORIZONTAL;
        
		//set the title of the frame to "order"
		super.setTitle("Character Count");
		
		//create the GUI frame
		
		//create the first grid of the GUI, which contain check boxes for A, `, and ,
		
		//create the first cell, containing the checkbox for A
		aBox = new JCheckBox("A");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 0;
        gBC.ipadx = 20;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(aBox, gBC);
		
		//create the second cell, containing the number of A
		int aCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'a' || letter == 'A')
				aCount++;
		}
		aLabel = new JLabel(String.valueOf(aCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 0;
		gBC.insets = new Insets(10, 0, 0, 0);
		aLabel.setVisible(false);
		super.add(aLabel, gBC);
		
		//create the third cell, containing the checkbox for `
		graveBox = new JCheckBox("`");
		gBC.gridheight = 1;
		gBC.gridx = 8;
		gBC.gridy = 6;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(graveBox, gBC);
		
		//create the fourth cell, containing the number of `
		int graveCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '`')
				graveCount++;
		}
		graveLabel = new JLabel(String.valueOf(graveCount));
		gBC.gridheight = 1;
		gBC.gridx = 10;
		gBC.gridy = 6;
		gBC.insets = new Insets(10, 0, 0, 0);
		graveLabel.setVisible(false);
		super.add(graveLabel, gBC);
		
		//create the fifth cell, containing the checkbox for ,
		commaBox = new JCheckBox(",");
		gBC.gridheight = 1;
		gBC.gridx = 8;
		gBC.gridy = 0;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(commaBox, gBC);
		
		//create the sixth cell, containing the number of ,
		int commaCount = 0;
		for(char letter : allCharList)
		{
			if(letter == ',')
				commaCount++;
		}
		commaLabel = new JLabel(String.valueOf(commaCount));
		gBC.gridheight = 1;
		gBC.gridx = 10;
		gBC.gridy = 0;
		gBC.insets = new Insets(10, 0, 0, 0);
		commaLabel.setVisible(false);
		super.add(commaLabel, gBC);
		
		//create the second grid of the GUI, which contain check boxes for B, ~, and <
		
		//create the first cell, containing the checkbox for B
		bBox = new JCheckBox("B");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 1;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(bBox, gBC);
		
		//create the second cell, containing the number of B
		int bCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'b' || letter == 'B')
				bCount++;
		}
		bLabel = new JLabel(String.valueOf(bCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 1;
		gBC.insets = new Insets(10, 0, 0, 0);
		bLabel.setVisible(false);
		super.add(bLabel, gBC);
		
		//create the third cell, containing the checkbox for ~
		tildaBox = new JCheckBox("~");
		gBC.gridheight = 1;
		gBC.gridx = 8;
		gBC.gridy = 8;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(tildaBox, gBC);
		
		//create the fourth cell, containing the number of ~
		int tildaCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '~')
				tildaCount++;
		}
		tildaLabel = new JLabel(String.valueOf(tildaCount));
		gBC.gridheight = 1;
		gBC.gridx = 10;
		gBC.gridy = 8;
		gBC.insets = new Insets(10, 0, 0, 0);
		tildaLabel.setVisible(false);
		super.add(tildaLabel, gBC);
		
		//create the fifth cell, containing the checkbox for <
		lessThanBox = new JCheckBox("<");
		gBC.gridheight = 1;
		gBC.gridx = 8;
		gBC.gridy = 1;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(lessThanBox, gBC);
		
		//create the sixth cell, containing the number of <
		int lessThanCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '<')
				lessThanCount++;
		}
		lessThanLabel = new JLabel(String.valueOf(lessThanCount));
		gBC.gridheight = 1;
		gBC.gridx = 10;
		gBC.gridy = 1;
		gBC.insets = new Insets(10, 0, 0, 0);
		lessThanLabel.setVisible(false);
		super.add(lessThanLabel, gBC);
		
		//create the third grid of the GUI, which contain check boxes for C, !, and .
		
		//create the first cell, containing the checkbox for C
		cBox = new JCheckBox("C");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 2;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(cBox, gBC);
		
		//create the second cell, containing the number of C
		int cCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'c' || letter == 'C')
				cCount++;
		}
		cLabel = new JLabel(String.valueOf(cCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 2;
		gBC.insets = new Insets(10, 0, 0, 0);
		cLabel.setVisible(false);
		super.add(cLabel, gBC);
		
		//create the third cell, containing the checkbox for !
		exclamationBox = new JCheckBox("!");
		gBC.gridheight = 1;
		gBC.gridx = 8;
		gBC.gridy = 11;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(exclamationBox, gBC);
		
		//create the fourth cell, containing the number of !
		int exclamationCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '!')
				exclamationCount++;
		}
		exclamationLabel = new JLabel(String.valueOf(exclamationCount));
		gBC.gridheight = 1;
		gBC.gridx = 10;
		gBC.gridy = 11;
		gBC.insets = new Insets(10, 0, 0, 0);
		exclamationLabel.setVisible(false);
		super.add(exclamationLabel, gBC);
		
		//create the fifth cell, containing the checkbox for .
		periodBox = new JCheckBox(".");
		gBC.gridheight = 1;
		gBC.gridx = 8;
		gBC.gridy = 2;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(periodBox, gBC);
		
		//create the sixth cell, containing the number of .
		int periodCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '.')
				periodCount++;
		}
		periodLabel = new JLabel(String.valueOf(periodCount));
		gBC.gridheight = 1;
		gBC.gridx = 10;
		gBC.gridy = 2;
		gBC.insets = new Insets(10, 0, 0, 0);
		periodLabel.setVisible(false);
		super.add(periodLabel, gBC);
		
		//create the fourth grid of the GUI, which contain check boxes for D, @, and >
		
		//create the first cell, containing the checkbox for D
		dBox = new JCheckBox("D");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 3;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(dBox, gBC);
		
		//create the second cell, containing the number of D
		int dCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'd' || letter == 'D')
				dCount++;
		}
		dLabel = new JLabel(String.valueOf(dCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 3;
		gBC.insets = new Insets(10, 0, 0, 0);
		dLabel.setVisible(false);
		super.add(dLabel, gBC);
		
		//create the third cell, containing the checkbox for @
		atBox = new JCheckBox("@");
		gBC.gridheight = 1;
		gBC.gridx = 8;
		gBC.gridy = 13;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(atBox, gBC);
		
		//create the fourth cell, containing the number of @
		int atCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '@')
				atCount++;
		}
		atLabel = new JLabel(String.valueOf(atCount));
		gBC.gridheight = 1;
		gBC.gridx = 10;
		gBC.gridy = 13;
		gBC.insets = new Insets(10, 0, 0, 0);
		atLabel.setVisible(false);
		super.add(atLabel, gBC);
		
		//create the fifth cell, containing the checkbox for >
		greaterThanBox = new JCheckBox(">");
		gBC.gridheight = 1;
		gBC.gridx = 8;
		gBC.gridy = 3;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(greaterThanBox, gBC);
		
		//create the sixth cell, containing the number of >
		int greaterThanCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '>')
				greaterThanCount++;
		}
		greaterThanLabel = new JLabel(String.valueOf(greaterThanCount));
		gBC.gridheight = 1;
		gBC.gridx = 10;
		gBC.gridy = 3;
		gBC.insets = new Insets(10, 0, 0, 0);
		greaterThanLabel.setVisible(false);
		super.add(greaterThanLabel, gBC);
		
		//create the fifth grid of the GUI, which contain check boxes for E, #, and /
		
		//create the first cell, containing the checkbox for E
		eBox = new JCheckBox("E");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 4;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(eBox, gBC);
		
		//create the second cell, containing the number for E
		int eCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'e' || letter == 'E')
				eCount++;
		}
		eLabel = new JLabel(String.valueOf(eCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 4;
		gBC.insets = new Insets(10, 0, 0, 0);
		eLabel.setVisible(false);
		super.add(eLabel, gBC);
		
		//create the third cell, containing the checkbox for #
		poundBox = new JCheckBox("#");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 4;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(poundBox, gBC);
		
		//create the fourth cell, containing the number of #
		int poundCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '#')
				poundCount++;
		}
		poundLabel = new JLabel(String.valueOf(poundCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 4;
		gBC.insets = new Insets(10, 0, 0, 0);
		poundLabel.setVisible(false);
		super.add(poundLabel, gBC);
		
		//create the fifth cell, containing the checkbox for /
		forwardSlashBox = new JCheckBox("/");
		gBC.gridheight = 1;
		gBC.gridx = 8;
		gBC.gridy = 4;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(forwardSlashBox, gBC);
		
		//create the sixth cell, containing the number of /
		int forwardSlashCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '/')
				forwardSlashCount++;
		}
		forwardSlashLabel = new JLabel(String.valueOf(forwardSlashCount));
		gBC.gridheight = 1;
		gBC.gridx = 10;
		gBC.gridy = 4;
		gBC.insets = new Insets(10, 0, 0, 0);
		forwardSlashLabel.setVisible(false);
		super.add(forwardSlashLabel, gBC);
		
		//create the sixth grid of the GUI, which contain check boxes for F, $, and ?
		
		//create the first cell, containing the checkbox for F
		fBox = new JCheckBox("F");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 5;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(fBox, gBC);
		
		//create the second cell, containing the number of F
		int fCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'f' || letter == 'F')
				fCount++;
		}
		fLabel = new JLabel(String.valueOf(fCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 5;
		gBC.insets = new Insets(10, 0, 0, 0);
		fLabel.setVisible(false);
		super.add(fLabel, gBC);
		
		//create the third cell, containing the checkbox for $
		dollarBox = new JCheckBox("$");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 5;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(dollarBox, gBC);
		
		//create the fourth cell, containing the number of $
		int dollarCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '$')
				dollarCount++;
		}
		dollarLabel = new JLabel(String.valueOf(dollarCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 5;
		gBC.insets = new Insets(10, 0, 0, 0);
		dollarLabel.setVisible(false);
		super.add(dollarLabel, gBC);
		
		//create the fifth cell, containing the checkbox for ?
		questionBox = new JCheckBox("?");
		gBC.gridheight = 1;
		gBC.gridx = 8;
		gBC.gridy = 5;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(questionBox, gBC);
		
		//create the sixth cell, containing the number of ?
		int questionCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '?')
				questionCount++;
		}
		questionLabel = new JLabel(String.valueOf(questionCount));
		gBC.gridheight = 1;
		gBC.gridx = 10;
		gBC.gridy = 5;
		gBC.insets = new Insets(10, 0, 0, 0);
		questionLabel.setVisible(false);
		super.add(questionLabel, gBC);
		
		//create the 7th grid of the GUI, which contain check boxes for G and %
		
		//create the first cell, containing the checkbox for G
		gBox = new JCheckBox("G");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 6;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(gBox, gBC);
		
		//create the second cell, containing the number of G
		int gCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'g' || letter == 'G')
				gCount++;
		}
		gLabel = new JLabel(String.valueOf(gCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 6;
		gBC.insets = new Insets(10, 0, 0, 0);
		gLabel.setVisible(false);
		super.add(gLabel, gBC);
		
		//create the third cell, containing the checkbox for %
		divisionBox = new JCheckBox("%");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 6;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(divisionBox, gBC);
		
		//create the fourth cell, containing the number of %
		int divisionCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '%')
				divisionCount++;
		}
		divisionLabel = new JLabel(String.valueOf(divisionCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 6;
		gBC.insets = new Insets(10, 0, 0, 0);
		divisionLabel.setVisible(false);
		super.add(divisionLabel, gBC);
		
		//create the 8th grid of the GUI, which contain check boxes for H and ^
		
		//create the first cell, containing the checkbox for H
		hBox = new JCheckBox("H");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 7;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(hBox, gBC);
		
		//create the second cell, containing the number of H
		int hCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'h' || letter == 'H')
				hCount++;
		}
		hLabel = new JLabel(String.valueOf(hCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 7;
		gBC.insets = new Insets(10, 0, 0, 0);
		hLabel.setVisible(false);
		super.add(hLabel, gBC);
		
		//create the third cell, containing the checkbox for ^
		caratBox = new JCheckBox("^");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 7;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(caratBox, gBC);
		
		//create the fourth cell, containing the number of ^
		int caratCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '^')
				caratCount++;
		}
		caratLabel = new JLabel(String.valueOf(caratCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 7;
		gBC.insets = new Insets(10, 0, 0, 0);
		caratLabel.setVisible(false);
		super.add(caratLabel, gBC);
		
		//create the 9th grid of the GUI, which contain check boxes for I and &
		
		//create the first cell, containing the checkbox for I
		iBox = new JCheckBox("I");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 8;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(iBox, gBC);
		
		//create the second cell, containing the number of I
		int iCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'i' || letter == 'I')
				iCount++;
		}
		iLabel = new JLabel(String.valueOf(iCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 8;
		gBC.insets = new Insets(10, 0, 0, 0);
		iLabel.setVisible(false);
		super.add(iLabel, gBC);
		
		//create the third cell, containing the checkbox for &
		andBox = new JCheckBox("&");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 8;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(andBox, gBC);
		
		//create the fourth cell, containing the number of &
		int andCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '&')
				andCount++;
		}
		andLabel = new JLabel(String.valueOf(andCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 8;
		gBC.insets = new Insets(10, 0, 0, 0);
		andLabel.setVisible(false);
		super.add(andLabel, gBC);
		
		//create the 10th grid of the GUI, which contain check boxes for J and *
		
		//create the first cell, containing the checkbox for J
		jBox = new JCheckBox("J");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 9;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(jBox, gBC);
		
		//create the second cell, containing the number of J
		int jCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'j' || letter == 'J')
				jCount++;
		}
		jLabel = new JLabel(String.valueOf(jCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 9;
		gBC.insets = new Insets(10, 0, 0, 0);
		jLabel.setVisible(false);
		super.add(jLabel, gBC);
		
		//create the third cell, containing the checkbox for *
		asteriskBox = new JCheckBox("*");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 9;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(asteriskBox, gBC);
		
		//create the fourth cell, containing the number of *
		int asteriskCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '*')
				asteriskCount++;
		}
		asteriskLabel = new JLabel(String.valueOf(asteriskCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 9;
		gBC.insets = new Insets(10, 0, 0, 0);
		asteriskLabel.setVisible(false);
		super.add(asteriskLabel, gBC);
		
		//create the 11th grid of the GUI, which contain check boxes for K and (
		
		//create the first cell, containing the checkbox for K
		kBox = new JCheckBox("K");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 10;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(kBox, gBC);
		
		//create the second cell, containing the number of K
		int kCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'k' || letter == 'K')
				kCount++;
		}
		kLabel = new JLabel(String.valueOf(kCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 10;
		gBC.insets = new Insets(10, 0, 0, 0);
		kLabel.setVisible(false);
		super.add(kLabel, gBC);
		
		//create the third cell, containing the checkbox for (
		openPBox = new JCheckBox("(");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 10;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(openPBox, gBC);
		
		//create the fourth cell, containing the number of (
		int openPCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '(')
				openPCount++;
		}
		openPLabel = new JLabel(String.valueOf(openPCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 10;
		gBC.insets = new Insets(10, 0, 0, 0);
		openPLabel.setVisible(false);
		super.add(openPLabel, gBC);
		
		//create the 12th grid of the GUI, which contain check boxes for L and )
		
		//create the first cell, containing the checkbox for L
		lBox = new JCheckBox("L");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 11;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(lBox, gBC);
		
		//create the second cell, containing the number of L
		int lCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'l' || letter == 'L')
				lCount++;
		}
		lLabel = new JLabel(String.valueOf(lCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 11;
		gBC.insets = new Insets(10, 0, 0, 0);
		lLabel.setVisible(false);
		super.add(lLabel, gBC);
		
		//create the third cell, containing the checkbox for )
		closePBox = new JCheckBox(")");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 11;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(closePBox, gBC);
		
		//create the fourth cell, containing the number of )
		int closePCount = 0;
		for(char letter : allCharList)
		{
			if(letter == ')')
				closePCount++;
		}
		closePLabel = new JLabel(String.valueOf(closePCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 11;
		gBC.insets = new Insets(10, 0, 0, 0);
		closePLabel.setVisible(false);
		super.add(closePLabel, gBC);
		
		//create the 13th grid of the GUI, which contain check boxes for M and -
		
		//create the first cell, containing the checkbox for M
		mBox = new JCheckBox("M");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 12;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(mBox, gBC);
		
		//create the second cell, containing the number of M
		int mCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'm' || letter == 'M')
				mCount++;
		}
		mLabel = new JLabel(String.valueOf(mCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 12;
		gBC.insets = new Insets(10, 0, 0, 0);
		mLabel.setVisible(false);
		super.add(mLabel, gBC);
		
		//create the third cell, containing the checkbox for -
		dashBox = new JCheckBox("-");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 12;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(dashBox, gBC);
		
		//create the fourth cell, containing the number of -
		int dashCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '-')
				dashCount++;
		}
		dashLabel = new JLabel(String.valueOf(dashCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 12;
		gBC.insets = new Insets(10, 0, 0, 0);
		dashLabel.setVisible(false);
		super.add(dashLabel, gBC);
		
		//create the 14th grid of the GUI, which contain check boxes for N and _
		
		//create the first cell, containing the checkbox for N
		nBox = new JCheckBox("N");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 13;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(nBox, gBC);
		
		//create the second cell, containing the number of N
		int nCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'n' || letter == 'N')
				nCount++;
		}
		nLabel = new JLabel(String.valueOf(nCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 13;
		gBC.insets = new Insets(10, 0, 0, 0);
		nLabel.setVisible(false);
		super.add(nLabel, gBC);
		
		//create the third cell, containing the checkbox for _
		underBox = new JCheckBox("_");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 13;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(underBox, gBC);
		
		//create the fourth cell, containing the number of _
		int underCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '_')
				underCount++;
		}
		underLabel = new JLabel(String.valueOf(underCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 13;
		gBC.insets = new Insets(10, 0, 0, 0);
		underLabel.setVisible(false);
		super.add(underLabel, gBC);
		
		//create the 15th grid of the GUI, which contain check boxes for O and +
		
		//create the first cell, containing the checkbox for O
		oBox = new JCheckBox("O");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 14;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(oBox, gBC);
		
		//create the second cell, containing the number of O
		int oCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'o' || letter == 'O')
				oCount++;
		}
		oLabel = new JLabel(String.valueOf(oCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 14;
		gBC.insets = new Insets(10, 0, 0, 0);
		oLabel.setVisible(false);
		super.add(oLabel, gBC);
		
		//create the third cell, containing the checkbox for +
		plusBox = new JCheckBox("+");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 14;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(plusBox, gBC);
		
		//create the fourth cell, containing the number of +
		int plusCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '+')
				plusCount++;
		}
		plusLabel = new JLabel(String.valueOf(plusCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 14;
		gBC.insets = new Insets(10, 0, 0, 0);
		plusLabel.setVisible(false);
		super.add(plusLabel, gBC);
		
		//create the 16th grid of the GUI, which contain check boxes for P and =
		
		//create the first cell, containing the checkbox for P
		pBox = new JCheckBox("P");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 15;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(pBox, gBC);
		
		//create the second cell, containing the number of P
		int pCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'p' || letter == 'P')
				pCount++;
		}
		pLabel = new JLabel(String.valueOf(pCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 15;
		gBC.insets = new Insets(10, 0, 0, 0);
		pLabel.setVisible(false);
		super.add(pLabel, gBC);
		
		//create the third cell, containing the checkbox for =
		equalBox = new JCheckBox("=");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 15;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(equalBox, gBC);
		
		//create the fourth cell, containing the number of =
		int equalCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '=')
				equalCount++;
		}
		equalLabel = new JLabel(String.valueOf(equalCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 15;
		gBC.insets = new Insets(10, 0, 0, 0);
		equalLabel.setVisible(false);
		super.add(equalLabel, gBC);
		
		//create the 17th grid of the GUI, which contain check boxes for Q and [
		
		//create the first cell, containing the checkbox for Q
		qBox = new JCheckBox("Q");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 16;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(qBox, gBC);
		
		//create the second cell, containing the number of Q
		int qCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'q' || letter == 'Q')
				qCount++;
		}
		qLabel = new JLabel(String.valueOf(qCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 16;
		gBC.insets = new Insets(10, 0, 0, 0);
		qLabel.setVisible(false);
		super.add(qLabel, gBC);
		
		//create the third cell, containing the checkbox for [
		openBBox = new JCheckBox("[");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 16;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(openBBox, gBC);
		
		//create the fourth cell, containing the number of [
		int openBCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '[')
				openBCount++;
		}
		openBLabel = new JLabel(String.valueOf(openBCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 16;
		gBC.insets = new Insets(10, 0, 0, 0);
		openBLabel.setVisible(false);
		super.add(openBLabel, gBC);
		
		//create the 18th grid of the GUI, which contain check boxes for R and {
		
		//create the first cell, containing the checkbox for R
		rBox = new JCheckBox("R");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 17;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(rBox, gBC);
		
		//create the second cell, containing the number of R
		int rCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'r' || letter == 'R')
				rCount++;
		}
		rLabel = new JLabel(String.valueOf(rCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 17;
		gBC.insets = new Insets(10, 0, 0, 0);
		rLabel.setVisible(false);
		super.add(rLabel, gBC);
		
		//create the third cell, containing the checkbox for {
		openCBBox = new JCheckBox("{");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 17;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(openCBBox, gBC);
		
		//create the fourth cell, containing the number of {
		int openCBCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '{')
				openCBCount++;
		}
		openCBLabel = new JLabel(String.valueOf(openCBCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 17;
		gBC.insets = new Insets(10, 0, 0, 0);
		openCBLabel.setVisible(false);
		super.add(openCBLabel, gBC);
		
		//create the 19th grid of the GUI, which contain check boxes for S and ]
		
		//create the first cell, containing the checkbox for S
		sBox = new JCheckBox("S");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 18;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(sBox, gBC);
		
		//create the second cell, containing the number of S
		int sCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 's' || letter == 'S')
				sCount++;
		}
		sLabel = new JLabel(String.valueOf(sCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 18;
		gBC.insets = new Insets(10, 0, 0, 0);
		sLabel.setVisible(false);
		super.add(sLabel, gBC);
		
		//create the third cell, containing the checkbox for ]
		closeBBox = new JCheckBox("]");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 18;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(closeBBox, gBC);
		
		//create the fourth cell, containing the number of ]
		int closeBCount = 0;
		for(char letter : allCharList)
		{
			if(letter == ']')
				closeBCount++;
		}
		closeBLabel = new JLabel(String.valueOf(closeBCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 18;
		gBC.insets = new Insets(10, 0, 0, 0);
		closeBLabel.setVisible(false);
		super.add(closeBLabel, gBC);
		
		//create the 20th grid of the GUI, which contain check boxes for T and }
		
		//create the first cell, containing the checkbox for T
		tBox = new JCheckBox("T");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 19;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(tBox, gBC);
		
		//create the second cell, containing the number of T
		int tCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 't' || letter == 'T')
				tCount++;
		}
		tLabel = new JLabel(String.valueOf(tCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 19;
		gBC.insets = new Insets(10, 0, 0, 0);
		tLabel.setVisible(false);
		super.add(tLabel, gBC);
		
		//create the third cell, containing the checkbox for }
		closeCBBox = new JCheckBox("}");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 19;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(closeCBBox, gBC);
		
		//create the fourth cell, containing the number of }
		int closeCBCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '}')
				closeCBCount++;
		}
		closeCBLabel = new JLabel(String.valueOf(closeCBCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 19;
		gBC.insets = new Insets(10, 0, 0, 0);
		closeCBLabel.setVisible(false);
		super.add(closeCBLabel, gBC);
		
		//create the 21st grid of the GUI, which contain check boxes for U and |
		
		//create the first cell, containing the checkbox for U
		uBox = new JCheckBox("U");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 20;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(uBox, gBC);
		
		//create the second cell, containing the number of U
		int uCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'u' || letter == 'U')
				uCount++;
		}
		uLabel = new JLabel(String.valueOf(uCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 20;
		gBC.insets = new Insets(10, 0, 0, 0);
		uLabel.setVisible(false);
		super.add(uLabel, gBC);
		
		//create the third cell, containing the checkbox for |
		pipeBox = new JCheckBox("|");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 20;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(pipeBox, gBC);
		
		//create the fourth cell, containing the number of |
		int pipeCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '|')
				pipeCount++;
		}
		pipeLabel = new JLabel(String.valueOf(pipeCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 20;
		gBC.insets = new Insets(10, 0, 0, 0);
		pipeLabel.setVisible(false);
		super.add(pipeLabel, gBC);
		
		//create the 22nd grid of the GUI, which contain check boxes for V and \
		
		//create the first cell, containing the checkbox for V
		vBox = new JCheckBox("V");
		gBC.gridheight = 1;
		gBC.gridx = 0;
		gBC.gridy = 21;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(vBox, gBC);
		
		//create the second cell, containing the number of V
		int vCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'v' || letter == 'V')
				vCount++;
		}
		vLabel = new JLabel(String.valueOf(vCount));
		gBC.gridheight = 1;
		gBC.gridx = 2;
		gBC.gridy = 21;
		gBC.insets = new Insets(10, 0, 0, 0);
		vLabel.setVisible(false);
		super.add(vLabel, gBC);
		
		//create the third cell, containing the checkbox for \
		backSlashBox = new JCheckBox("\\");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 21;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(backSlashBox, gBC);
		
		//create the fourth cell, containing the number of \
		int backSlashCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '\\')
				backSlashCount++;
		}
		backSlashLabel = new JLabel(String.valueOf(backSlashCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 21;
		gBC.insets = new Insets(10, 0, 0, 0);
		backSlashLabel.setVisible(false);
		super.add(backSlashLabel, gBC);
		
		//create the 23nd grid of the GUI, which contain check boxes for W and ;
		
		//create the first cell, containing the checkbox for W
		wBox = new JCheckBox("W");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 0;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(wBox, gBC);
		
		//create the second cell, containing the number of W
		int wCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'w' || letter == 'W')
				wCount++;
		}
		wLabel = new JLabel(String.valueOf(wCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 0;
		gBC.insets = new Insets(10, 0, 0, 0);
		wLabel.setVisible(false);
		super.add(wLabel, gBC);
		
		//create the third cell, containing the checkbox for ;
		semiCBox = new JCheckBox(";");
		gBC.gridheight = 1;
		gBC.gridx = 8;
		gBC.gridy = 12;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(semiCBox, gBC);
		
		//create the fourth cell, containing the number of ;
		int semiCCount = 0;
		for(char letter : allCharList)
		{
			if(letter == ';')
				semiCCount++;
		}
		semiCLabel = new JLabel(String.valueOf(semiCCount));
		gBC.gridheight = 1;
		gBC.gridx = 10;
		gBC.gridy = 12;
		gBC.insets = new Insets(10, 0, 0, 0);
		semiCLabel.setVisible(false);
		super.add(semiCLabel, gBC);
		
		//create the 24th grid of the GUI, which contain check boxes for X and :
		
		//create the first cell, containing the checkbox for X
		xBox = new JCheckBox("X");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 1;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(xBox, gBC);
		
		//create the second cell, containing the number of X
		int xCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'x' || letter == 'X')
				xCount++;
		}
		xLabel = new JLabel(String.valueOf(xCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 1;
		gBC.insets = new Insets(10, 0, 0, 0);
		xLabel.setVisible(false);
		super.add(xLabel, gBC);
		
		//create the third cell, containing the checkbox for :
		colonBox = new JCheckBox(":");
		gBC.gridheight = 1;
		gBC.gridx = 8;
		gBC.gridy = 10;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(colonBox, gBC);
		
		//create the fourth cell, containing the number of :
		int colonCount = 0;
		for(char letter : allCharList)
		{
			if(letter == ':')
				colonCount++;
		}
		colonLabel = new JLabel(String.valueOf(colonCount));
		gBC.gridheight = 1;
		gBC.gridx = 10;
		gBC.gridy = 10;
		gBC.insets = new Insets(10, 0, 0, 0);
		colonLabel.setVisible(false);
		super.add(colonLabel, gBC);
		
		//create the 25th grid of the GUI, which contain check boxes for Y and '
		
		//create the first cell, containing the checkbox for Y
		yBox = new JCheckBox("Y");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 2;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(yBox, gBC);
		
		//create the second cell, containing the number of Y
		int yCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'y' || letter == 'Y')
				yCount++;
		}
		yLabel = new JLabel(String.valueOf(yCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 2;
		gBC.insets = new Insets(10, 0, 0, 0);
		yLabel.setVisible(false);
		super.add(yLabel, gBC);
		
		//create the third cell, containing the checkbox for '
		apostBox = new JCheckBox("'");
		gBC.gridheight = 1;
		gBC.gridx = 8;
		gBC.gridy = 9;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(apostBox, gBC);
		
		//create the fourth cell, containing the number of '
		int apostCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '\'')
				apostCount++;
		}
		apostLabel = new JLabel(String.valueOf(apostCount));
		gBC.gridheight = 1;
		gBC.gridx = 10;
		gBC.gridy = 9;
		gBC.insets = new Insets(10, 0, 0, 0);
		apostLabel.setVisible(false);
		super.add(apostLabel, gBC);
		
		//create the 26th grid of the GUI, which contain check boxes for Z and "
		
		//create the first cell, containing the checkbox for Z
		zBox = new JCheckBox("Z");
		gBC.gridheight = 1;
		gBC.gridx = 4;
		gBC.gridy = 3;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(zBox, gBC);
		
		//create the second cell, containing the number of Z
		int zCount = 0;
		for(char letter : allCharList)
		{
			if(letter == 'z' || letter == 'Z')
				zCount++;
		}
		zLabel = new JLabel(String.valueOf(zCount));
		gBC.gridheight = 1;
		gBC.gridx = 6;
		gBC.gridy = 3;
		gBC.insets = new Insets(10, 0, 0, 0);
		zLabel.setVisible(false);
		super.add(zLabel, gBC);
		
		//create the third cell, containing the checkbox for "
		quoteBox = new JCheckBox("\"");
		gBC.gridheight = 1;
		gBC.gridx = 8;
		gBC.gridy = 7;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(quoteBox, gBC);
		
		//create the fourth cell, containing the number of "
		int quoteCount = 0;
		for(char letter : allCharList)
		{
			if(letter == '"')
				quoteCount++;
		}
		quoteLabel = new JLabel(String.valueOf(quoteCount));
		gBC.gridheight = 1;
		gBC.gridx = 10;
		gBC.gridy = 7;
		gBC.insets = new Insets(10, 0, 0, 0);
		quoteLabel.setVisible(false);
		super.add(quoteLabel, gBC);
		 
		//create the 27th grid of the GUI, which contain the OK, Reset,
		//and Cancel buttons along with the character counter
		
		//create the handlers for the buttons
        okButtonHandler handler = new okButtonHandler();
        resetButtonHandler handler1 = new resetButtonHandler();
        cancelButtonHandler handler2 = new cancelButtonHandler();
        
        //create the first cell, which contains the OK button
        JButton okButton = new JButton("OK");
        gBC.gridheight = 1;
        gBC.gridx = 0;
        gBC.gridy = 26;
        gBC.insets = new Insets(10, 10, 0, 0);
        okButton.addActionListener(handler);
        super.add(okButton, gBC);
        
        //create the second cell, which contains the Reset button
        JButton resetButton = new JButton("Reset");
        gBC.gridheight = 1;
        gBC.gridx = 2;
        gBC.gridy = 26;
        gBC.insets = new Insets(10, 20, 0, 0);
        resetButton.addActionListener(handler1);
        super.add(resetButton, gBC);
        
        //create the third cell, which contains the Cancel button
        JButton cancelButton = new JButton("Cancel");
        gBC.gridheight = 1;
        gBC.gridx = 6;
        gBC.gridy = 26;
        gBC.insets = new Insets(10, 20, 0, 0);
        cancelButton.addActionListener(handler2);
        super.add(cancelButton, gBC);
        
        
		//create the fourth cell, containing text for the character counter
		allCharLabel = new JLabel("Character count with white spaces : ");
		gBC.gridheight = 1;
		gBC.gridx = 12; 
		gBC.gridy = 26;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(allCharLabel, gBC);
		
		//create the fifth cell, containing the number of all character from the file
        allCharNumber = new JLabel(String.valueOf(countChars));
        gBC.gridheight = 1;
        gBC.gridx = 14; 
        gBC.gridy = 26;
        gBC.insets = new Insets(10, 0, 0, 0);
        super.add(allCharNumber, gBC);
        
        //create the 28th grid of the GUI, which is the characters without whitespace counter
		
		// create the first cell, containing text for the character counter
		noSpaceLabel = new JLabel("Character count without white spaces : ");
		gBC.gridheight = 1;
		gBC.gridx = 12;
		gBC.gridy = 27;
		gBC.insets = new Insets(10, 10, 0, 0);
		super.add(noSpaceLabel, gBC);

		// create the second cell, containing the number of all character from
		// the file
		noSpaceNumber = new JLabel(String.valueOf(countNoSpace));
		gBC.gridheight = 1;
		gBC.gridx = 14;
		gBC.gridy = 27;
		gBC.insets = new Insets(10, 0, 0, 0);
		super.add(noSpaceNumber, gBC);
		
		//TODO : add event listeners for buttons
	}
	
	private class okButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			//check to see which checkboxes are selected and make selected ones visible
			if(aBox.isSelected())
			{
				aLabel.setVisible(true);
			}
			if(bBox.isSelected())
			{
				bLabel.setVisible(true);
			}
			if(cBox.isSelected())
			{
				cLabel.setVisible(true);
			}
			if(dBox.isSelected())
			{
				dLabel.setVisible(true);
			}
			if(eBox.isSelected())
			{
				eLabel.setVisible(true);
			}
			if(fBox.isSelected())
			{
				fLabel.setVisible(true);
			}
			if(gBox.isSelected())
			{
				gLabel.setVisible(true);
			}
			if(hBox.isSelected())
			{
				hLabel.setVisible(true);
			}
			if(iBox.isSelected())
			{
				iLabel.setVisible(true);
			}
			if(jBox.isSelected())
			{
				jLabel.setVisible(true);
			}
			if(kBox.isSelected())
			{
				kLabel.setVisible(true);
			}
			if(lBox.isSelected())
			{
				lLabel.setVisible(true);
			}
			if(mBox.isSelected())
			{
				mLabel.setVisible(true);
			}
			if(nBox.isSelected())
			{
				nLabel.setVisible(true);
			}
			if(oBox.isSelected())
			{
				oLabel.setVisible(true);
			}
			if(pBox.isSelected())
			{
				pLabel.setVisible(true);
			}
			if(qBox.isSelected())
			{
				qLabel.setVisible(true);
			}
			if(rBox.isSelected())
			{
				rLabel.setVisible(true);
			}
			if(sBox.isSelected())
			{
				sLabel.setVisible(true);
			}
			if(tBox.isSelected())
			{
				tLabel.setVisible(true);
			}
			if(uBox.isSelected())
			{
				uLabel.setVisible(true);
			}
			if(vBox.isSelected())
			{
				vLabel.setVisible(true);
			}
			if(wBox.isSelected())
			{
				wLabel.setVisible(true);
			}
			if(xBox.isSelected())
			{
				xLabel.setVisible(true);
			}
			if(yBox.isSelected())
			{
				yLabel.setVisible(true);
			}
			if(zBox.isSelected())
			{
				zLabel.setVisible(true);
			}
			if(poundBox.isSelected())
			{
				poundLabel.setVisible(true);
			}
			if(dollarBox.isSelected())
			{
				dollarLabel.setVisible(true);
			}
			if(divisionBox.isSelected())
			{
				divisionLabel.setVisible(true);
			}
			if(caratBox.isSelected())
			{
				caratLabel.setVisible(true);
			}
			if(andBox.isSelected())
			{
				andLabel.setVisible(true);
			}
			if(asteriskBox.isSelected())
			{
				asteriskLabel.setVisible(true);
			}
			if(openPBox.isSelected())
			{
				openPLabel.setVisible(true);
			}
			if(closePBox.isSelected())
			{
				closePLabel.setVisible(true);
			}
			if(dashBox.isSelected())
			{
				dashLabel.setVisible(true);
			}
			if(underBox.isSelected())
			{
				underLabel.setVisible(true);
			}
			if(plusBox.isSelected())
			{
				plusLabel.setVisible(true);
			}
			if(equalBox.isSelected())
			{
				equalLabel.setVisible(true);
			}
			if(openBBox.isSelected())
			{
				openBLabel.setVisible(true);
			}
			if(openCBBox.isSelected())
			{
				openCBLabel.setVisible(true);
			}
			if(closeBBox.isSelected())
			{
				closeBLabel.setVisible(true);
			}
			if(closeCBBox.isSelected())
			{
				closeCBLabel.setVisible(true);
			}
			if(pipeBox.isSelected())
			{
				pipeLabel.setVisible(true);
			}
			if(backSlashBox.isSelected())
			{
				backSlashLabel.setVisible(true);
			}
			if(commaBox.isSelected())
			{
				commaLabel.setVisible(true);
			}
			if(lessThanBox.isSelected())
			{
				lessThanLabel.setVisible(true);
			}
			if(periodBox.isSelected())
			{
				periodLabel.setVisible(true);
			}
			if(greaterThanBox.isSelected())
			{
				greaterThanLabel.setVisible(true);
			}
			if(forwardSlashBox.isSelected())
			{
				forwardSlashLabel.setVisible(true);
			}
			if(questionBox.isSelected())
			{
				questionLabel.setVisible(true);
			}
			if(graveBox.isSelected())
			{
				graveLabel.setVisible(true);
			}
			if(quoteBox.isSelected())
			{
				quoteLabel.setVisible(true);
			}
			if(tildaBox.isSelected())
			{
				tildaLabel.setVisible(true);
			}
			if(apostBox.isSelected())
			{
				apostLabel.setVisible(true);
			}
			if(colonBox.isSelected())
			{
				colonLabel.setVisible(true);
			}
			if(exclamationBox.isSelected())
			{
				exclamationLabel.setVisible(true);
			}
			if(semiCBox.isSelected())
			{
				semiCLabel.setVisible(true);
			}
			if(atBox.isSelected())
			{
				atLabel.setVisible(true);
			}
			
		}
	}
	
	//create the class for the cancelButton Handler
    private class cancelButtonHandler implements ActionListener
    {
    	
    	public void actionPerformed(ActionEvent event)
    	{
    		System.exit(0);
    	}
    }
    
    //create the class for the resetButton Handler
    private class resetButtonHandler implements ActionListener
    {
    	public void actionPerformed(ActionEvent event)
    	{
    		aBox.setSelected(false);
    		aLabel.setVisible(false);
    		bBox.setSelected(false);
    		bLabel.setVisible(false);
    		cBox.setSelected(false);
    		cLabel.setVisible(false);
    		dBox.setSelected(false);
    		dLabel.setVisible(false);
    		eBox.setSelected(false);
    		eLabel.setVisible(false);
    		fBox.setSelected(false);
    		fLabel.setVisible(false);
    		gBox.setSelected(false);
    		gLabel.setVisible(false);
    		hBox.setSelected(false);
    		hLabel.setVisible(false);
    		iBox.setSelected(false);
    		iLabel.setVisible(false);
    		jBox.setSelected(false);
    		jLabel.setVisible(false);
    		kBox.setSelected(false);
    		kLabel.setVisible(false);
    		lBox.setSelected(false);
    		lLabel.setVisible(false);
    		mBox.setSelected(false);
    		mLabel.setVisible(false);
    		nBox.setSelected(false);
    		nLabel.setVisible(false);
    		oBox.setSelected(false);
    		oLabel.setVisible(false);
    		pBox.setSelected(false);
    		pLabel.setVisible(false);
    		qBox.setSelected(false);
    		qLabel.setVisible(false);
    		rBox.setSelected(false);
    		rLabel.setVisible(false);
    		sBox.setSelected(false);
    		sLabel.setVisible(false);
    		tBox.setSelected(false);
    		tLabel.setVisible(false);
    		uBox.setSelected(false);
    		uLabel.setVisible(false);
    		vBox.setSelected(false);
    		vLabel.setVisible(false);
    		wBox.setSelected(false);
    		wLabel.setVisible(false);
    		xBox.setSelected(false);
    		xLabel.setVisible(false);
    		yBox.setSelected(false);
    		yLabel.setVisible(false);
    		zBox.setSelected(false);
    		zLabel.setVisible(false);
    		poundBox.setSelected(false);
    		poundLabel.setVisible(false);
    		dollarBox.setSelected(false);
    		dollarLabel.setVisible(false);
    		divisionBox.setSelected(false);
    		divisionLabel.setVisible(false);
    		caratBox.setSelected(false);
    		caratLabel.setVisible(false);
    		andBox.setSelected(false);
    		andLabel.setVisible(false);
    		asteriskBox.setSelected(false);
    		asteriskLabel.setVisible(false);
    		openPBox.setSelected(false);
    		openPLabel.setVisible(false);
    		closePBox.setSelected(false);
    		closePLabel.setVisible(false);
    		dashBox.setSelected(false);
    		dashLabel.setVisible(false);
    		underBox.setSelected(false);
    		underLabel.setVisible(false);
    		plusBox.setSelected(false);
    		plusLabel.setVisible(false);
    		equalBox.setSelected(false);
    		equalLabel.setVisible(false);
    		openBBox.setSelected(false);
    		openBLabel.setVisible(false);
    		openCBBox.setSelected(false);
    		openCBLabel.setVisible(false);
    		closeBBox.setSelected(false);
    		closeBLabel.setVisible(false);
    		closeCBBox.setSelected(false);
    		closeCBLabel.setVisible(false);
    		pipeBox.setSelected(false);
    		pipeLabel.setVisible(false);
    		backSlashBox.setSelected(false);
    		backSlashLabel.setVisible(false);
    		commaBox.setSelected(false);
    		commaLabel.setVisible(false);
    		lessThanBox.setSelected(false);
    		lessThanLabel.setVisible(false);
    		periodBox.setSelected(false);
    		periodLabel.setVisible(false);
    		greaterThanBox.setSelected(false);
    		greaterThanLabel.setVisible(false);
    		forwardSlashBox.setSelected(false);
    		forwardSlashLabel.setVisible(false);
    		questionBox.setSelected(false);
    		questionLabel.setVisible(false);
    		graveBox.setSelected(false);
    		graveLabel.setVisible(false);
    		quoteBox.setSelected(false);
    		quoteLabel.setVisible(false);
    		tildaBox.setSelected(false);
    		tildaLabel.setVisible(false);
    		apostBox.setSelected(false);
    		apostLabel.setVisible(false);
    		colonBox.setSelected(false);
    		colonLabel.setVisible(false);
    		exclamationBox.setSelected(false);
    		exclamationLabel.setVisible(false);
    		semiCBox.setSelected(false);
    		semiCLabel.setVisible(false);
    		atBox.setSelected(false);
    		atLabel.setVisible(false);
    	}
    }

}
