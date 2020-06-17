public class ArrayDeque<T> {
    private int size;
    private int first;
    private int last;
    private T[] array;

    public ArrayDeque() {
        size = 0;
        array = (T[]) new Object[8];
        first = 0;
        last = 1;
    }

    private int plusOne(int x) {
        return (x + 1) % array.length;
    }

    private int minusOne(int x) {
        return (x - 1 + array.length) % array.length;
    }

    private void resize(int capacity) {
        T[] a = (T[]) new Object[capacity];
        int curr = plusOne(first);
        for (int i = 0; i < size; i++) {
            a[i] = array[curr];
            curr = plusOne(curr);
        }
        array = a;
        first = capacity - 1;
        last = size;
    }

    public void addFirst(T item) {
        array[first] = item;
        first = minusOne(first);
        size++;
        if (size == array.length) {
            resize(size * 2);
        }
    }

    public void addLast(T item) {
        array[last] = item;
        last = plusOne(last);
        size++;
        if (size == array.length) {
            resize(size * 2);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        if (this.isEmpty()) {
            return;
        }
        int f = plusOne(first);
        while (f != last) {
            System.out.print(array[f] + " ");
            f = plusOne(f);
        }
        System.out.println();
    }

    public T removeFirst() {
        if (size == 0) {
            return null;
        }
        first = plusOne(first);
        T res = array[first];
        size--;
        if (array.length >= 16 && size < array.length / 4) {
            resize(array.length / 2);
        }
        return res;
    }

    public T removeLast() {
        if (size == 0) {
            return null;
        }
        last = minusOne(last);
        T res = array[last];
        size--;
        if (array.length >= 16 && size < array.length / 4) {
            resize(array.length / 2);
        }
        return res;
    }

    public T get(int index) {
        if (index >= size) {
            return null;
        }
        index = (plusOne(first) + index) % array.length;
        return array[index];
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> x = new ArrayDeque<Integer>();
        x.addFirst(3);
        x.addFirst(4);
        x.addLast(5);
        x.printDeque();
        x.removeLast();
        x.printDeque();
        x.removeFirst();
        x.removeLast();
        x.removeFirst();
    }

}


