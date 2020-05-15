package constructors.task1;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Jan", "Kowalski", "Test developer", 3941.21, true);

        Employee emp2 = new Employee("Adam", "Nowak", "Java developer", 4012.11, false);

        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
    }
}
