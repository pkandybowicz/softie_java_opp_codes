package polymorphism.task1;

public class Rectangle extends Quadrangle {
    Rectangle(int a, int b) {
        this.sideA = this.sideC = a;
        this.sideB = this.sideD = b;
    }

    int computeArea() {
        return this.sideA * this.sideB;
    }
}
