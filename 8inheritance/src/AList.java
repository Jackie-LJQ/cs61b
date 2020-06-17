public class AList<T> implements List<T> {
    int size;
    T[] array;

    public AList() {
        size = 0;
        array = (T[]) new Object[20];
    }

    private void resize(int capacity) {
        T[] a = (T[]) new Object[capacity];
        System.arraycopy(array, 0, a, 0, size);
        array = a;
    }

    @Override
    public void addLast(T item) {
        array[size] = item;
        size += 1;
        if (size == array.length) {
            resize(size * 2);
        }
    }

    public T getLast() {
        return array[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

//    @Override
    public T removeLast() {
        T x = getLast();
        array[size - 1] = null;
        size -= 1;
        return x;
    }



}

