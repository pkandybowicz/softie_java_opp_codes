package sttatic.task4;

public class Person {

    int instanceCounter = 0;
    static int staticInstanceCounter = 0;

    public Person(){
        instanceCounter ++;
        staticInstanceCounter ++;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();

        System.out.println(p4.instanceCounter);
        System.out.println(Person.staticInstanceCounter);
    }
}
