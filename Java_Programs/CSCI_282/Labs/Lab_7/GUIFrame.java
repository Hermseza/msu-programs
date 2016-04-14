/**
 * Filename		: GUIFrame.java
 * Purpose		: To create a class that creates a GUI Frame with assorted components that
 * 					perform an action when selected.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Ms. Kussmann
 * Due Date		: 11/5/2015
 * Compiler		: Eclipse
 * Executable	: GUIFrameViewer.jar
 * History		: Z.A.H : 10/23/2015 : Program Genesis
 * 				: Z.A.H : 10/30/2015 : added event handlers for action listeners
 */


package gUIFramePackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class GUIFrame extends GUIFrameViewer
{
	//declare all the instance variables
	private final JLabel imageLabel;
	private final JLabel textLabel;
	private final JLabel codeLabel;
	private final JComboBox<String> colorBox;
	private final JCheckBox imageBox;
	private final JCheckBox textBox;
	private final JCheckBox codeBox;
	private final JRadioButton smallButton;
	private final JRadioButton mediumButton;
	private final JRadioButton largeButton;
	private final ButtonGroup radioGroup;
	
	//create the frame
	public GUIFrame()
	{
		//create the grid bag layout and set constraints
        super.setLayout(new GridBagLayout()); 
        GridBagConstraints gBC = new GridBagConstraints(); 
        gBC.fill = GridBagConstraints.HORIZONTAL;
        
		//set the title of the frame to "order"
		super.setTitle("orders");
		
		//create the first grid of the GUI, which has an image, text, and code
		
		//create the first cell, containing the icon
		ImageIcon image = new ImageIcon("icon.png");
		imageLabel = new JLabel(image);
		imageLabel.setToolTipText("This is an image.");
		gBC.gridheight = 2;
        gBC.gridx = 0; 
        gBC.gridy = 0;
        gBC.ipadx = 50;
        gBC.insets = new Insets(100, 50, 0, 0);
        super.add(imageLabel, gBC); 
        
        //create the second cell, containing the text field
        textLabel = new JLabel("This is some text.");
        textLabel.setToolTipText("This is a text label.");
        gBC.gridheight = 2;
        gBC.fill = GridBagConstraints.BOTH;
        gBC.gridx = 3; 
        gBC.gridy = 0;
        gBC.insets = new Insets(100, 0, 0, 0);
        super.add(textLabel, gBC);
        
        //create the third cell, containing the code text field
        codeLabel = new JLabel("System.out.println(\"Hello World!\");");
        codeLabel.setToolTipText("This is a code label.");
        gBC.gridheight = 2;
        gBC.fill = GridBagConstraints.BOTH;
        gBC.gridx = 6; 
        gBC.gridy = 0;
        gBC.insets = new Insets(100, 0, 0, 50);
        super.add(codeLabel, gBC);
 
        
        //create the second row, which only contains a List Box
        
        colorBox = new JComboBox<String>(new String[]{"Red", "Green", "Blue"});
        gBC.gridheight = 1;
        gBC.gridx = 3;
        gBC.gridy = 4;
        super.add(colorBox, gBC);
        
        //create the third row, which contains three check boxes
        
        //create the first text box for "images"
        imageBox = new JCheckBox("Image");
        gBC.gridheight = 1;
        gBC.gridx = 0;
        gBC.gridy = 6;
        gBC.insets = new Insets(100, 50, 0, 0);
        super.add(imageBox, gBC);
        
        //create the second text box for "text"
        textBox = new JCheckBox("Text");
        gBC.gridheight = 1;
        gBC.gridx = 3;
        gBC.gridy = 6;
        gBC.insets = new Insets(100, 0, 0, 0);
        super.add(textBox, gBC);
        
        //create the third text box for "code"
        codeBox = new JCheckBox("Code");
        gBC.gridheight = 1;
        gBC.gridx = 6;
        gBC.gridy = 6;
        super.add(codeBox, gBC);
        
        //create the fourth row, which contains three radio buttons
        radioGroup = new ButtonGroup();
        
        //create the first button for "small" and the corresponding font object
        smallButton = new JRadioButton("Small");
        radioGroup.add(smallButton);
        gBC.gridheight = 1;
        gBC.gridx = 0;
        gBC.gridy = 8;
        gBC.insets = new Insets(100, 50, 0, 0);
        super.add(smallButton, gBC);
        
        //create the second button for "medium"
        mediumButton = new JRadioButton("Medium");
        radioGroup.add(mediumButton);
        gBC.gridheight = 1;
        gBC.gridx = 3;
        gBC.gridy = 8;
        gBC.insets = new Insets(100, 0, 0, 0);
        super.add(mediumButton, gBC);
        
        //create the third button for "large"
        largeButton = new JRadioButton("Large");
        radioGroup.add(largeButton);
        gBC.gridheight = 1;
        gBC.gridx = 6;
        gBC.gridy = 8;
        super.add(largeButton, gBC);
        
        //create the fifth row, which contains two buttons
        okButtonHandler handler = new okButtonHandler();
        cancelButtonHandler handler1 = new cancelButtonHandler();
        
        //create the first button for "OK"
        JButton okButton = new JButton("OK");
        gBC.gridheight = 1;
        gBC.gridx = 2;
        gBC.gridy = 10;
        gBC.insets = new Insets(100, 0, 20, 0);
        okButton.addActionListener(handler);
        super.add(okButton, gBC);
        
        //create the second button for "Cancel"
        JButton cancelButton = new JButton("Cancel");
        gBC.gridheight = 1;
        gBC.gridx = 4;
        gBC.gridy = 10;
        cancelButton.addActionListener(handler1);
        super.add(cancelButton, gBC);
	}
	
	//create the class for the okButton Handler
	
    private class okButtonHandler implements ActionListener
    {
    	
    	public void actionPerformed(ActionEvent event)
    	{
    		
    		//check to see which combobox option is chosen and apply it
    		
			if(colorBox.getSelectedIndex() == 0)
			{
				textLabel.setForeground(Color.RED);
				codeLabel.setForeground(Color.RED);
			}
			else if(colorBox.getSelectedIndex() == 1)
			{
				textLabel.setForeground(Color.GREEN);
				codeLabel.setForeground(Color.GREEN);
			}
			else if(colorBox.getSelectedIndex() == 2)
			{
				textLabel.setForeground(Color.BLUE);
				codeLabel.setForeground(Color.BLUE);
			}
			
    		//check to see if a radio button is pressed, then apply it
			
    		if(smallButton.isSelected())
    		{
    			textLabel.setFont(new Font("Serif", Font.PLAIN, 10));
    			codeLabel.setFont(new Font("Serif", Font.PLAIN, 10));
    		}
    		else if(mediumButton.isSelected())
    		{
    			textLabel.setFont(new Font("Serif", Font.PLAIN, 14));
    			codeLabel.setFont(new Font("Serif", Font.PLAIN, 14));
    		}
    		else if(largeButton.isSelected())
    		{
    			textLabel.setFont(new Font("Serif", Font.PLAIN, 18));
    			codeLabel.setFont(new Font("Serif", Font.PLAIN, 18));
    		}
    		
    		//check to see if a text box is pressed, then apply it
    		
    		if(imageBox.isSelected() && textBox.isSelected() && codeBox.isSelected())
			{
				imageLabel.setVisible(true);
				textLabel.setVisible(true);
				codeLabel.setVisible(true);
			}
			else if(imageBox.isSelected() && textBox.isSelected())
			{
				imageLabel.setVisible(true);
				textLabel.setVisible(true);
				codeLabel.setVisible(false);
			}
			else if(imageBox.isSelected() && codeBox.isSelected())
			{
				imageLabel.setVisible(true);
				textLabel.setVisible(false);
				codeLabel.setVisible(true);
			}
			else if(textBox.isSelected() && codeBox.isSelected())
			{
				imageLabel.setVisible(false);
				textLabel.setVisible(true);
				codeLabel.setVisible(true);
			}
			else if(imageBox.isSelected())
			{
				imageLabel.setVisible(true);
				textLabel.setVisible(false);
				codeLabel.setVisible(false);
			}
			else if(textBox.isSelected())
			{
				imageLabel.setVisible(false);
				textLabel.setVisible(true);
				codeLabel.setVisible(false);
			}
			else if(codeBox.isSelected())
			{
				imageLabel.setVisible(false);
				textLabel.setVisible(false);
				codeLabel.setVisible(true);
			}
			else
			{
				imageLabel.setVisible(true);
				textLabel.setVisible(true);
				codeLabel.setVisible(true);
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
    		

}
