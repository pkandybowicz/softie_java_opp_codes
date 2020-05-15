package objects.task1;

public class Employee {

    String name;
    String lastName;
    String position;
    Double salary;

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Jan";
        emp1.lastName = "Kowalski";
        emp1.position = "Test developer";
        emp1.salary = 3941.21;
        System.out.println(String.format("Employer: %s %s", emp1.name, emp1.lastName));
        System.out.println(String.format("Position: %s", emp1.position));
        System.out.println(String.format("Salary: $%s", emp1.salary));
    }
}
