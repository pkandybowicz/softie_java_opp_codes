package inheritance.task2;

public class Person extends Animal {
    void sayHello() {
        System.out.println("Hi I am a person");
    }

    static void sayWow() {
        System.out.println("Wow! static method in Person class");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Animal p2 = new Animal();
        Animal p3 = new Person();
        p1.sayHello();
        p2.sayHello();
        p3.sayHello();
        p1.sayWow();
        p2.sayWow();
        p3.sayWow();
    }
}