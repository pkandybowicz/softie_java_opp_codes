package _static.quiz1;

public class StaticQuiz {
    static int x = 6;

    StaticQuiz() {
        x++;
    }

    void printX() {
        System.out.print("x is equal: " + x);
    }

    public static void main(String[] args) {
        StaticQuiz mc1, mc2, mc3;
        StaticQuiz mc5 = new StaticQuiz();
        StaticQuiz mc4 = new StaticQuiz();
        StaticQuiz mc6 = new StaticQuiz();
        mc6.printX();
    }
}
