package Assignment3;


public class Stack {
	private int maxSize;
	private Deque stackArray;
	private int top; 
	
	public Stack(int s) 
	{
		maxSize = s; 
		stackArray = new Deque(s); 
		top = -1; 
	}

	
	public void push(int j) 
	{
		stackArray.insertRight(j);
	}

	public int pop() 
	{
		return 	stackArray.removeRight(); 
				
	}

	public int peek() 
	{
		return stackArray.peekRight();
	}

	public boolean isEmpty() 
	{
		return (top == -1);
	}

	public boolean isFull() 
	{
	
		return stackArray.isFull();
	}
	
	
	public String toString() {
		String ret = "";
		
		for (int i = top; i >= 0; i--) {
			ret += stackArray[i] + " ";
		}
		ret += "\n";
		return ret;		
	}
}