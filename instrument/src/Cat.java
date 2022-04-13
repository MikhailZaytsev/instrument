public class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println("Kot-kot-kot");
        System.out.println("Я " + name + " мне " + age + " лет. Мяу!");
    }
}
