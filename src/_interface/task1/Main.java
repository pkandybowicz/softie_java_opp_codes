package _interface.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Quadrangle square = new Square(5);
        Quadrangle retangle = new Rectangle(5, 4);
        Quadrangle rhombus = new Rhombus(4, 3);
        Quadrangle trapezoid = new Trapezoid(29, 13, 17, 17, 15);
        List<Quadrangle> list = new ArrayList<>();
        list.add(square);
        list.add(retangle);
        list.add(rhombus);
        list.add(trapezoid);
        for (Quadrangle shape : list) {
            shape.printShapeType();
            System.out.println(shape.computePerimeter());
            System.out.println(shape.computeArea());
            Quadrangle.printQuadrangleInfo();
        }
    }
}
