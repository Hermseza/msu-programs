/**
 * Filename		: JobType.java
 * Purpose		: To create a class that accepts input and draws to frame.
 * Author		: Zackary Hermsen
 * School		: McNeese State University
 * email		: hermseza@gmail.com
 * Instructor	: Dr. Kussmann
 * Due Date		: 10/08/2015
 * Compiler		: Eclipse
 * Executable	: BusinessViewer.jar
 * History		: Z.A.H : 10/08/2015 : Program Genesis 
 */


package businessPackage;

public enum JobType 
{
	//enum constants
	Employee("Employee"),
	Manager("Manager"),
	Executive("Executive");
	
	//instance fields
	private final String jobType;

	
	//enum constructor
	JobType(String jobType)
	{
		this.jobType = jobType;
	}
	
	//accessor methods
	public String getjobType()
	{
		return jobType;
	}
}
