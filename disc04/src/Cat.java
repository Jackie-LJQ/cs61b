public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
        this.noise = "Meow!";
    }
    @Override
    public void greet() {
        System.out.println("Cat " + name + " says:" + makeNoise());
    }

    public static void main(String[] args) {
        Animal c = new Cat("a", 7);
        c.greet();
    }
}
