package _static.task2;

public class Person {
    public static String name = "Adam";

    static void sayHello() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Adam";
        p2.name = "Jan";

        System.out.println(p1.name);
        System.out.println(p2.name);

        Person.sayHello();
    }
}
