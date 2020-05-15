package inheritance.task1;

public class Run {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.meow();
        cat.eat();
//        cat.bark();

        Dog dog = (Dog) new Animal();
        dog.eat();
        dog.bark();
//        dog.meow();

        Animal puppy = new Dog();
        puppy.eat();
//        puppy.bark();
    }
}
