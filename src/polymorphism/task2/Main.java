package polymorphism.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Square square1 = new Square(5);
        Square square2 = new Square(3);
        Rectangle rectangle1 = new Rectangle(2, 3);
        Rectangle rectangle2 = new Rectangle(3, 7);

        List<Quadrangle> list = new ArrayList<>();
        list.add(square1);
        list.add(square2);
        list.add(rectangle1);
        list.add(rectangle2);

        for (Quadrangle shape : list) {
            shape.printInfo();
            System.out.println(shape.computePerimeter());
        }

    }
}

