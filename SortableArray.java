package Assignment3;
public class SortableArray {
	private long [] Array;
    private int NElems;

    public SortableArray(int max) 
    {
		Array = new long[max]; 
		NElems = 0; 
	}

	public void insert(long value) 
	{
		Array[NElems] = value; 
		NElems++; 
	}
	public int size() {
		return NElems;
	}
	public long get(int index) {
		return Array[index];
	}

	public void Display() 
	{
		System.out.print("A= ");
		for (int j = 0; j < NElems; j++) 
			System.out.print(Array[j] + " "); 
		System.out.println("");
	}
	
	public void quickSort() {
		ReQuickMedian(0, NElems - 1, NElems / 2);
	
	}
	
public float QuickMedian() {
    if (NElems % 2 == 1) {
        
        return ReQuickMedian(0, NElems - 1, NElems / 2);
    } else {
        
        float Median1 = ReQuickMedian(0, NElems - 1, NElems / 2 - 1);
        float Median2 = ReQuickMedian(0, NElems - 1, NElems / 2);
        return (Median1 + Median2) / 2;
    }
}

private float ReQuickMedian(int head, int tail, int SomeIndex) {
    int pivotIndex = Partition(head, tail);

    if (pivotIndex == SomeIndex) {
        return Array[pivotIndex];
    } else if (pivotIndex < SomeIndex) {
        return ReQuickMedian(pivotIndex + 1, tail, SomeIndex);
    } else {
        return ReQuickMedian(head, pivotIndex - 1, SomeIndex);
    }
}

private int Partition(int head, int tail) {
    long pivot = Array[tail];
    int rightPtr = tail - 1;
    int leftPtr = head;

    while (leftPtr <= rightPtr) {
        if (Array[leftPtr] <= pivot) {
            leftPtr++;
        } else if (Array[rightPtr] > pivot) {
            rightPtr--;
        } else {
            swap(leftPtr, rightPtr);
            leftPtr++;
            rightPtr--;
        }
    }
    
    swap(leftPtr, tail);
    return leftPtr;
}

private void swap(int dex1, int dex2) {
    long temp = Array[dex1];
    Array[dex1] = Array[dex2];
    Array[dex2] = temp;
}
}
