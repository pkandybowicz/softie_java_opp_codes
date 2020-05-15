package sttatic.task1;

public class Person {
    static String name = "Adam";

    static void sayHello() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person.sayHello();
    }
}
