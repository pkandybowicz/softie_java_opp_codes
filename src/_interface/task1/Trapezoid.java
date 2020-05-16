package _interface.task1;

public class Trapezoid implements Quadrangle {
    int sideA;
    int sideB;
    int sideC;
    int sideD;
    int height;

    Trapezoid(int a, int b, int c, int d, int h) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        this.sideD = d;
        this.height = h;
    }

    @Override
    public int computePerimeter() {
        return this.sideA + this.sideB + this.sideC + this.sideD;
    }

    @Override
    public int computeArea() {
        return (this.sideA + this.sideB) / 2 * this.height;
    }
}
