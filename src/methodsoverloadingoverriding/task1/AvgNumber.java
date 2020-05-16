package methodsoverloadingoverriding.task1;

public class AvgNumber {
    static double calculateAvg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    static double calculateAvg(int a, int b, int c, int d) {
        return (a + b + c + d) / 4;
    }

    static double calculateAvg(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e) / 5;
    }

    public static void main(String[] args) {
        System.out.println(calculateAvg(1, 3, 5));
        System.out.println(calculateAvg(4, 3, 11, 12));
        System.out.println(calculateAvg(1, 2, 17, 8, 4));
    }
}