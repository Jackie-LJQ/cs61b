import java.util.Comparator;

public class Dog2 implements Comparable<Dog2> {
    String name;
    int size;
    public Dog2(int s, String n) {
        size = s;
        name = n;
    }

    public void bark() {
        System.out.println("Woof I am " + name);
    }


    @Override
    public int compareTo(Dog2 o) {
        return size - o.size;
    }

    private static class NameComparator implements Comparator<Dog2> {
        public int compare(Dog2 a, Dog2 b) {
            return a.name.compareTo(b.name);
        }
    }

    public static Comparator<Dog2> getNameComparator() {
        return new NameComparator();
    }




}
