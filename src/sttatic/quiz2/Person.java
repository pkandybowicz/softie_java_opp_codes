package sttatic.quiz2;

public class Person {
    static int x;
    int y;
    String name;

    Person() {
        x++;
        y++;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        new Person();
        System.out.println(person1.x);
        System.out.println(person1.y);
    }
}
