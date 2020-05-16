package _abstract.task1;

public abstract class Quadrangle {
    int sideA;
    int sideB;
    int sideC;
    int sideD;
    int height;

    abstract public int computeArea();

    public int computePerimeter() {
        return this.sideA + this.sideB + this.sideC + this.sideD;
    }

    public void printInfo() {
        System.out.println(String.format("Sides a:%d, b:%d, c:%d, d:%d",
                this.sideA, this.sideB, this.sideC, this.sideD));
        System.out.println("Height: " + this.height);
    }
}
