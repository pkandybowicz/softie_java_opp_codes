package Polymorphism.task1;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square.computePerimeter());
        System.out.println(square.computeArea());

        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println(rectangle.computePerimeter());
        System.out.println(rectangle.computeArea());

        square.printInfo();
        rectangle.printInfo();
    }
}

