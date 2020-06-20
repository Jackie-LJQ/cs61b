public class DogLauncher {
    public static void main(String[] args) {
//        Dog a = new Dog(3, "a");
//        Dog b = new Dog(4, "b");
//        Dog c = new Dog(5, "c");
//        Dog[] dogs = {a,b,c};
//        Dog maxdog = (Dog) Maximizer.max(dogs);
//        maxdog.bark();
        Dog2 a = new Dog2(3, "a");
        Dog2 b = new Dog2(4, "z");
        Dog2 c = new Dog2(5, "c");
        Dog2[] dogs = {a,b,c};
        Dog2 maxdog = (Dog2) Maximizer.max(dogs);
        maxdog.bark();
    }
}
