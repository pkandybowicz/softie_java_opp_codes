package _abstract.task1;

public class Rectangle extends Quadrangle {
    Rectangle(int a, int b) {
        this.sideA = this.sideC = a;
        this.sideB = this.sideD = b;
        this.height = b;
    }

    public int computeArea() {
        return this.sideA * this.sideB;
    }
}
