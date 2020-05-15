package Polymorphism.task2;

public class Square extends Quadrangle {
    Square(int a) {
        this.sideA = this.sideB =
                this.sideC = this.sideD = a;
    }

    int computeArea() {
        return this.sideA * this.sideA;
    }
}

