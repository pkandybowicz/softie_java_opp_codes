package _interface.task1;

public interface Quadrangle {
    public int computePerimeter();

    public int computeArea();

    public default void printShapeType() {
        System.out.println(this.getClass());
    }

    public static void printQuadrangleInfo() {
        System.out.println("Quadrangle is a polygon with" +
          " four edges (or sides) and four vertices or corners");
    }
}
