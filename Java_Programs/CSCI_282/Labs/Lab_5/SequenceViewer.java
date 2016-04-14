/**
 * Filename		: SequenceViewer.java
 * Purpose		: To create a class that creates an sequence and methods to create 
 * 					new sequences from the original.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 10/08/2015
 * Compiler		: Eclipse
 * Executable	: SequenceViewer.jar
 * History		: Z.A.H : 10/06/2015 : Program Genesis 
 * 				: Z.A.H : 10/07/2015 : Added the SequenceComponent class to draw the arrays
 * 						to a frame instead of printing on the console. 
 */


package arrayListPackage;

import java.util.ArrayList;
import java.util.Collections;

public class Sequence 
{
	//instance field
    private ArrayList <Integer> values;
    private int i;
    private int j;
    
    //constructor to assign values to the array list
    public Sequence() 
    {
    	values = new ArrayList<Integer>(); 
    }
    
    //a method to add elements to the array list
    public void add(int n) 
    { 
    	values.add(n); 
    }
    
    //a method to convert the elements of the array list to a string
    public String toString() 
    { 
    	return values.toString(); 
    }
    
	public Integer get(int i) 
	{
		return values.get(i);
	}

    //a method to create a new list by appending the new sequence to the old one
    public Sequence append(Sequence other)
    {
    	Sequence appended = new Sequence();
    	
    	for(i = 0; i < values.size(); i++)
    	{
    		appended.add(values.get(i));
    	}
    	for(j = 0; j < other.values.size(); j++)
    	{
    		appended.add(other.get(j));
    	}
    	return appended;
    }
    
    //a method to merge two sequences in an alternating pattern
    public Sequence merge(Sequence other)
    {
    	Sequence merged = new Sequence();
    	
    	for(i = 0; i < values.size(); i++)
    	{
    		merged.add(values.get(i));
    		merged.add(other.get(i));
    	}
    	//append the rest of other if b > a to merged
    	if(other.values.size() > values.size())
    	{
    		j = 0;
    		while(j < (other.values.size() - values.size()))
    		{
    			merged.add(other.get(j+values.size()));
    			j++;
    		}
    	}
    	return merged;
    }
    
    //a method to merge two sorted sequences
    public Sequence mergeSorted(Sequence other)
    {
    	Sequence mergeSorted = new Sequence();

    	mergeSorted.values.addAll(values);
    	mergeSorted.values.addAll(other.values);
    	Collections.sort(mergeSorted.values);

    	return mergeSorted;
    }
}
