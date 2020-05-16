package _abstract.task1;

public class Trapezoid extends Quadrangle {

    Trapezoid(int a, int b, int c, int d, int height) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        this.sideD = d;
        this.height = height;
    }

    public int computeArea() {
        return ((this.sideA + this.sideB) / 2) * this.height;
    }
}
