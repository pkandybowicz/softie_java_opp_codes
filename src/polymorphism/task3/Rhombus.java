package polymorphism.task3;

public class Rhombus extends Quadrangle {

    Rhombus(int a, int height) {
        this.sideA = this.sideC =
                this.sideB = this.sideD = a;
        this.height = height;
    }

    int computeArea() {
        return this.sideA * this.height;
    }
}
