import java.util.Arrays;
import java.util.NoSuchElementException;

public class MaxHeap {
    private int[] Array;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.Array = new int[capacity];
        this.size = 0;
    }

    private int getLeftChildIndex(int ParentIndex) {
        return 2 * ParentIndex + 1;
    }

    private int getRightChildIndex(int ParentIndex) {
        return 2 * ParentIndex + 1;
    }

    private int getParentIndex(int ChildIndex) {
        return (ChildIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent (int index) {
        return getParentIndex(index) >= 0;
    }

    private int LeftChild(int ParentIndex) {
        return Array[getLeftChildIndex(ParentIndex)];
    }

    private int RightChild(int ParentIndex) {
        return Array[getRightChildIndex(ParentIndex)];
    }

    private int Parent(int ChildIndex) {
        return Array[getParentIndex(ChildIndex)];
    }

    private void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && Parent(index) < Array[index]) {
            int temp = Parent(index);
            Array[getParentIndex(index)] = Array[index];
            Array[index] = temp;
            index = getParentIndex(index);
        }
    }

    public void insert(int item) {
        if (size == capacity) {
            Array = Arrays.copyOf(Array, 2 * capacity);
            capacity = capacity * 2;
        }
        Array[size] = item;
        size++;
        heapifyUp();
    }

    public int Pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int res = Array[0];
        Array[0] = Array[size-1];
        size--;
        heapifyDown();
        return res;
    }
    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int largerChildindex = getLeftChildIndex(index);
            if (hasRightChild(index) && RightChild(index) > LeftChild(index)) {
                largerChildindex = getRightChildIndex(index);
            }
            if (Array[index] < Array[largerChildindex]) {
                int temp = Array[index];
                Array[index] = Array[largerChildindex];
                Array[largerChildindex] = temp;
                index = largerChildindex;
            }
            else {
                break;
            }
        }
    }

    public int peek() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        return Array[0];
    }

    public static void main(String[] args) {
        MaxHeap h = new MaxHeap(2);
        h.insert(8);
        h.insert(9);
        h.insert(4);
        System.out.println(h.Pop());
        h.Pop();
        h.insert(7);
        System.out.println(h.Pop());
        System.out.println(h.Pop());
//        h.Pop();
    }


}
