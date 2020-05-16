package _interface.task1;

public class Square implements Quadrangle {
    int sideA;

    Square(int a) {
        this.sideA = a;
    }

    @Override
    public int computePerimeter() {
        return this.sideA ^ 2;
    }

    @Override
    public int computeArea() {
        return this.sideA * 4;
    }
}
