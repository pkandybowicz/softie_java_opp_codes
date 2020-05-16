package polymorphism.task3;

public class Square extends Quadrangle {
    Square(int a) {
        this.sideA = this.sideB =
                this.sideC = this.sideD = this.height = a;
    }

    int computeArea() {
        return this.sideA * this.sideA;
    }
}

