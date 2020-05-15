package constructors.task3;

public class Rectangle {
    int a;
    int b;

    public Rectangle(int a) {
        this.a = a;
        this.b = a;
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getArea(){
        return this.a * this.b;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle.getArea());

        Rectangle square = new Rectangle(4);
        System.out.println(square.getArea());
    }
}
