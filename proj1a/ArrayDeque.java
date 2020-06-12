import java.io.*;
import java.util.*;
public class ArrayDeque <T> {
    private int size;
    public T[] queue;
    public ArrayDeque(){
        size = 0;
        queue = (T[]) new Object[3];
    }

    public void addFirst(T item){
        if (size<queue.length)
            System.arraycopy(queue, 0, queue, 1, size);
        else {
            T[] temp = (T[]) new Object[size+1];
            System.arraycopy(queue, 0, temp, 1, size);
            queue = temp;
        }
        queue[0] = item;
        size++;
    }

    public void addLast(T item){
        if (size>=queue.length) {
            T[] temp = (T[]) new Object[size+1];
            System.arraycopy(queue,0,temp,0,size);
            queue = temp;
        }
        queue[size] = item;
        size++;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public void printDeque(){
        for (int i=0; i<size; i++){
            System.out.print(queue[i]+" ");
        }
    }

    public T removeFirst(){
        T res = queue[0];
        System.arraycopy(queue,1,queue,0,size-1);
        size--;
        return res;
    }

    public T removeLast(){
        size--;
        return queue[size];
    }

    public T get(int index){
        return queue[index-1];
    }



//    public static void main(String[] args){
//        ArrayDeque x = new ArrayDeque<Integer>();
//        x.addFirst(3);
//        x.addFirst(4);
//        x.addLast(6);
//        x.addLast(8);
//        x.addFirst(4);
//        x.removeFirst();
//        x.printDeque();
//        System.out.println(x.get(2));
//        System.out.println(x.size());
//        System.out.println(x.isEmpty());
//    }
}
