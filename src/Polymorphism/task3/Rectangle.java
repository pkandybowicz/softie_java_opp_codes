package Polymorphism.task3;

public class Rectangle extends Quadrangle {
    Rectangle(int a, int b) {
        this.sideA = this.sideC = a;
        this.sideB = this.sideD = b;
        this.height = b;
    }

    int computeArea() {
        return this.sideA * this.sideB;
    }
}
