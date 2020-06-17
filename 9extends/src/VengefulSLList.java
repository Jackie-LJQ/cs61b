public class VengefulSLList<T> extends SLList<T> {
    SLList deleted;
    public VengefulSLList() {
        deleted = new SLList();
    }


    @Override
    public T removeLast() {
        T x = super.removeLast();
        deleted.addLast(x);
        return x;
    }

    @Override
    public T removeFirst() {
        T x = super.removeFirst();
        deleted.addLast(x);
        return x;
    }

    public static void main(String[] args) {
        VengefulSLList x = new VengefulSLList();
        x.addFist(2);
        x.addFist(1);
        x.addLast(3);
        x.removeLast();
        x.removeFirst();
        x.deleted.print();
    }
}
