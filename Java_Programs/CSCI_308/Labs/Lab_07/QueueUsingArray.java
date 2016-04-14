//	AUTHOR	:  Zackary Hermsen
//  DATE	:  04/07/16
//  File	:  QueueUsingArray.java
//  Course	:  Csci 308, Section A
//  Purpose	:  To create a queue object and all of its functions,
//					and implement them in main


package lab7Package;

public class QueueUsingArray 
{

	protected int N; //actual capacity of the queue
	public static final int CAPACITY = 1000; //maximum size of the array
	protected int Q[];	//the array used for the queue
	protected int F = 0;	//the location of the front of the queue in the array
	protected int R = 0;	//the location of the rear of the queue in the array
	protected int size = 0;	//the size of the array
	
	//default constructor
	public QueueUsingArray()
	{
		this(CAPACITY);
		N = CAPACITY;
		Q = new int[N];
	}
	
	//constructor with a user input
	public QueueUsingArray(int cap)
	{
		N = cap;
		Q = new int[N];
	}
	
	//check to see if the queue is empty
	public boolean isEmpty()
	{
		return(F == R);
	}
	
	//gets the first element
	public int front()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return -10000;
		}
		return Q[F];
	}
	
	//delete an element from the queue
	public int dequeue()
	{
		int temp;
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return -10000;
		}
		temp = Q[F];
		F = (F + 1) % N;
		size--;
		return temp;
	}
	
	//add an element to the queue
	public void enqueue(int e)
	{
		if(size == N - 1)
		{
			System.out.println("Queue is full");
		}
		else
		{
			Q[R] = e;
			R = (R + 1) % N;
			size++;
		}
	}
	
	//displays the contents of the queue
	public void display()
	{
		System.out.println("Displaying the contents of the Queue....");
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}
		for(int i = F; i <= R - 1; i = (i + 1) % N)
		{
			System.out.print(Q[i] + " ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//int o; //o for output
		
		//create a new queue object
		QueueUsingArray A = new QueueUsingArray(10);
		//display the contents of the queue
		A.display();
		//add an element to the queue and display the contents of the queue
		A.enqueue(7);	 A.display();
		//remove an element from the queue and display the contents of the queue
		A.dequeue(); 	 A.display();
		//add an element to the queue and display the contents of the queue
		A.enqueue(9);	 A.display();
		//add an element to the queue and display the contents of the queue
		A.enqueue(19);	 A.display();
		//add an element to the queue and display the contents of the queue
		A.enqueue(29);	 A.display();
		//add an element to the queue and display the contents of the queue
		A.enqueue(39);	 A.display();
		System.out.println("\n\n");
	}
}
