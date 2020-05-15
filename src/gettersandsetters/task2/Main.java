package gettersandsetters.task2;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName(" adam ");
        emp1.setLastName(" nowak ");
        emp1.displayEmployeeInfo();

        Employee emp2 = new Employee();
        emp2.setName(" marie ");
        emp2.displayEmployeeInfo();

        Employee emp3 = new Employee();
        emp3.setName("    kat ");
        emp3.displayEmployeeInfo();
    }
}
