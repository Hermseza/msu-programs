//	AUTHOR	:  Zackary Hermsen
//  DATE	:  03/16/16
//  File	:  StackUsingArray.java
//  Course	:  Csci 308, Section A
//  Purpose	:  To create a stack object and all of its functions,
//					and implement them in main


package stackPackage;

public class StackUsingArray 
{
	//instance variables
	protected int capacity;	//capacity used when defined by the user in the constructor
	public static final int CAPACITY = 1000; //default capacity
	protected int s[]; //actual array of the stack
	protected int top = -1; //the location of the top element in the stack

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//output value
		//int o;
		//create a new stack object
		StackUsingArray A = new StackUsingArray(10);
		//display the contents of the stack
		A.display();
		//push 7 to the stack and display contents
		A.push(7); 
		A.display();
		//pop the top element of the stack and display contents
		A.pop(); 
		A.display();
		//push 9 to the stack and display contents
		A.push(9); 
		A.display();
		//push 19 to the stack and display contents
		A.push(19); 
		A.display();
		//push 29 to the stack and display contents
		A.push(29); 
		A.display();
		//push 39 to the stack and display contents
		A.push(39); 
		A.display();
		//pop the top element of the stack and display contents
		A.pop(); 
		A.display();
		System.out.println("\n\n");

	}
	
	//display the size of the stack
	public int size()
	{
		return(top + 1);
	}
	
	//check to see if stack is empty
	public boolean isEmpty()
	{
		return(top < 0);
	}
	
	//check to see if stack is full
	public boolean isFull()
	{
		return(top > capacity - 1);
	}
	
	//push an element onto the stack
	public void push(int element)
	{
		if(size() == capacity)
			System.out.println("Stack is full");
		else
		{
			top++;
			s[top] = element;
		}
	}
	
	//default constructor
	public StackUsingArray()
	{
		this(CAPACITY);
	}

	//constructor with an argument entered by user
	public StackUsingArray(int cap)
	{
		capacity = cap;
		s = new int[capacity];
	}
	
	//display the top of the stack
	public int top()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
			return s[top];
	}
	
	//pop the top element out of the stack
	public int pop()
	{
		int element;
		if(isEmpty())
			System.out.println("Stack is empty");
		element = s[top];
		top--;
		return element;
	}
	
	//display the contents of the stack
	public void display()
	{
		System.out.println("\n\nDisplaying contents of stack:\n");
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return;
		}
		for(int i = 0; i <= top; i++)
			System.out.println(s[i] + " ");
	}
}
