package Assignment3;
import java.util.Arrays;
public class Deque {
   private  int[] DequeArray;
   private int Size;
   private int Left;
   private int Right;
   private int MaxSize;
   private int NItem;
   private int item;

	public Deque (int Size) {
		MaxSize = Size;
		DequeArray = new int [MaxSize];
		Left = MaxSize-1;
		Right = -1;
		NItem = 0;
	}

    public void insertRight(int item) {
    	if (! isFull()) {
    		if( Right == MaxSize -1) {
    			Right = -1;
    	}
           DequeArray[++Right] =item;
           NItem ++;
    	}
    }
    public void insertLeft(int item) {
     if (Left ==0 ) {
    	 Left = MaxSize;
     }
    	DequeArray[-- Left]= item;
    	NItem ++;
    }
    
    public int removeRight() {
        int item = DequeArray[Right --];
        
        if (Right == -1) {
        	Right = MaxSize -1;
        }
        NItem--;
        return item;
    }
   
    
    public int removeLeft() {
        int item = DequeArray [Left++];
        
        if (Left == MaxSize) {
        	Left = 1;
        }
         
        NItem --;
        return item;	
    }
    
    public int peekLeft() {
      return DequeArray[Left];

    }
    
    public int peekRight() {
    	return DequeArray[Right];
    }

    public boolean isEmpty() {
    	return NItem == 0;
    }

    public boolean isFull() {
    	return NItem == MaxSize;
    }
    
  
    public String toString() { 
        String ret = Arrays.toString(DequeArray);
        ret += "\nleft = " + Left;
        ret += "\nright = " + Right;
        
        return ret;
    }
}