/**
 * Filename		: Temperature.java
 * Purpose		: To create a program that creates a JFrame to make a temperature constructor
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 09/24/2015
 * Compiler		: Eclipse
 * Executable	: TempViewer.jar
 * History		: Z.A.H : 09/22/2015 : Program Genesis  
 */

package tempPackage;

import javax.swing.JComponent;


public class Temperature extends JComponent
{
	//instance variables
	private double temp;
	private int type;
	
	//assessor methods
	
	//for the temp variable
	public void setTemp(double temp)
	{
		//stores the temperature
		this.temp = temp;
	}
	
	public double getTemp()
	{
		//returns the value of temp
		return temp;
	}
	
	//for the type variable
	public void setType(int type)
	{
		//stores the type
		this.type = type;
	}
	
	public int getType()
	{
		//returns the value of type
		return type;
	}
	
	//constructor
	public Temperature(int type, double temp)
	{
		this.temp = temp;
		this.type = type;
	}

	//converts the temperature from Fahrenheit to Celsius
	public double toCelsius()
	{
		double toCelsius = (((temp - 32) * 5) / 9);
		return toCelsius;
	}
	
	//converts the temperature from Celsius to Fahrenheit
	public double toFarenheit()
	{
		double toFarenheit = (((temp * 9) / 5) + 32);
		return toFarenheit;
	}

}
