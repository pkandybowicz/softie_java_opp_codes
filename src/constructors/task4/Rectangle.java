package constructors.task4;

public class Rectangle {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(int a) {
        this(a,a);
    }

    public int getArea(){
        return this.a * this.b;
    }

    public static void main(String[] args) {

//        System.out.println(rectangle.getArea());
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle.getArea());

//        System.out.println(square.getArea());
        Rectangle square = new Rectangle(4);
        System.out.println(square.getArea());
    }
}
