package _interface.task1;

public class Rhombus implements Quadrangle {
    int sideA;
    int height;

    Rhombus(int a, int h) {
        this.sideA = a;
        this.height = h;
    }

    @Override
    public int computePerimeter() {
        return 4 * this.sideA;
    }

    @Override
    public int computeArea() {
        return this.sideA * this.height;
    }
}
