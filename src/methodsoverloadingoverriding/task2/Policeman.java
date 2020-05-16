package methodsoverloadingoverriding.task2;

public class Policeman extends Employee {
    public Policeman(int age, int yearOfWork, char sex) {
        super(age, yearOfWork, sex);
    }

    @Override
    public boolean canRetire() {
        if (yearOfWork >= 25 && age>=55)
            return true;
        else
            return false;
    }
}
