package Polymorphism.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(2, 3);
        Rhombus rhombus = new Rhombus(3,2);
        Trapezoid trapezoid = new Trapezoid(12,18,13,14,11);

        List<Quadrangle> list = new ArrayList<>();
        list.add(square);
        list.add(rectangle);
        list.add(rhombus);
        list.add(trapezoid);

        for (Quadrangle shape : list) {
            shape.printInfo();
            System.out.println(shape.computePerimeter());
        }

    }
}

