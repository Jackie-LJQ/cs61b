public class Dog implements OurCompare {
    int size;
    String name;
    public Dog(int s, String n) {
        size = s;
        name = n;
    }
    public void bark() {
        System.out.println("Woof, I am " + name);
    }

    @Override
    public int CompareTo(Object b) {
        Dog g = (Dog) b;
        return this.size - g.size;
    }

}
