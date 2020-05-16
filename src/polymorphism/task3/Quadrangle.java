package polymorphism.task3;

public class Quadrangle {
    int sideA;
    int sideB;
    int sideC;
    int sideD;
    int height;

    public int computePerimeter() {
        return this.sideA + this.sideB + this.sideC + this.sideD;
    }

    public void printInfo() {
        System.out.println(String.format("Sides a:%d, b:%d, c:%d, d:%d",
                this.sideA, this.sideB, this.sideC, this.sideD));
        System.out.println("Height: " + this.height);
    }
}