package methodsoverloadingoverriding.task2;

public class Miner extends Employee {

    public Miner(int age, int yearOfWork, char sex) {
        super(age, yearOfWork, sex);
    }

    @Override
    public boolean canRetire() {
        if (yearOfWork>25)
            return true;
        else
            return false;
    }
}
