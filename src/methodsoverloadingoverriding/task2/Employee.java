package methodsoverloadingoverriding.task2;

public class Employee {
    int age;
    protected int yearOfWork;
    protected char sex;

    public Employee(int age, int yearOfWork, char sex) {
        this.age = age;
        this.yearOfWork = yearOfWork;
        this.sex = sex;
    }

    public boolean canRetire(){
        if (sex == 'k' && yearOfWork >= 20 && age>60)
            return true;
        else if (sex == 'm' && yearOfWork > 25 && age > 65)
            return true;
        else
            return false;
    }
}
