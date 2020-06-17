public interface List<T> {
    public T get(int i);
    public void addLast(T x);
    public int size();

    default public void print() {
        System.out.println("print default print");
        for (int i = 0; i < size(); i++) {
            T x = get(i);
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        List<String> someList = new AList<String>();
        List<String> someList = new AList<String>();
        someList.addLast("elk");
        someList.addLast("jack");
        someList.print();
    }
}
