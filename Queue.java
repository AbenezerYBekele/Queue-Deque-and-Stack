
package Assignment3;

public class Queue {

	private int maxSize;
	private Deque queArray;
	private int front;
	private int rear; 
	private int nItems;
	private int item;
		
	public Queue(int s) 
	{
		maxSize = s;
		queArray = new Deque(maxSize);
		front = 0;
		rear = -1;
		nItems = 0;
	}


	public void enqueue(int item) 
	{
		
		queArray.insertRight(item);
	}
	 

	public int dequeue() 
	{
		return queArray.removeLeft();
	}
	 
	public int peek() 
	{
		return queArray.peekLeft();
		
	}

	public boolean isEmpty() 
	{
		return (nItems == 0);
	}

	public boolean isFull() 
	{
		return queArray.isFull();
	}

	
	public int size() 
	{
		return nItems;
	}
	
	public String toString() {
		String ret = "";
		
		for (int i = front; i != rear; i++) {
			if (i == maxSize) // deal with wraparound
				i -= maxSize;
			ret += queArray[i] + " ";
		}
		ret += queArray[rear] + "\n";
		return ret;		
	}
} 
