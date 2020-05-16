package _interface.task1;

public class Rectangle implements Quadrangle {
    int sideA;
    int sideB;

    Rectangle(int a, int b) {
        this.sideA = a;
        this.sideB = b;
    }

    @Override
    public int computePerimeter() {
        return 2 * this.sideA + 2 * this.sideB;
    }

    @Override
    public int computeArea() {
        return this.sideA * this.sideB;
    }
}
