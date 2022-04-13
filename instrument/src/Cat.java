public class Cat {
    String name;
    int age;
    double tailLength = 4.5;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println("Я " + name + " мне " + age + " лет. Мяу! Мой хвост " + tailLength + " м" );
    }
}
