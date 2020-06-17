public class RotatingSLList<T> extends SLList<T> {

    public void rotateRight() {
        T x = removeLast();
        addFist(x);
    }

    public static void main(String args[]) {
        int[] x = new int[]{1,1,2,3,4};
        RotatingSLList<Integer> rlist = new RotatingSLList();
        for (int i : x) {
            rlist.addLast(i);
        }
        rlist.print();
        rlist.rotateRight();
        rlist.print();
    }
}
