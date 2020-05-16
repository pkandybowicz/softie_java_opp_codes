package methodsoverloadingoverriding.task2;

public class Main {
    public static void main(String[] args) {
        Employee kasjerka = new Employee(59, 30, 'k');
        System.out.println(kasjerka.canRetire());

        Miner gornik = new Miner(45, 26, 'm');
        System.out.println(gornik.canRetire());

        Policeman policjant = new Policeman(45, 26, 'm');
        System.out.println(policjant.canRetire());

    }
}
