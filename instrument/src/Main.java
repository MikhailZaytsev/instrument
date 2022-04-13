public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 5);
        for (int i = 0; i < cat.age; i++) {
            cat.meow();
        }
    }
}
