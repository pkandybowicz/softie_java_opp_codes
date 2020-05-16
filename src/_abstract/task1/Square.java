package _abstract.task1;

public class Square extends Quadrangle {
    Square(int a) {
        this.sideA = this.sideB =
                this.sideC = this.sideD = this.height = a;
    }

    public int computeArea() {
        return this.sideA * this.sideA;
    }
}

