package _abstract.task1;

public class Rhombus extends Quadrangle {

    Rhombus(int a, int height) {
        this.sideA = this.sideC =
                this.sideB = this.sideD = a;
        this.height = height;
    }

    public int computeArea() {
        return this.sideA * this.height;
    }
}
