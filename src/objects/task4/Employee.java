package objects.task4;

public class Employee {
    private String name;
    String lastName;
    String position;
    Double salary;
    Boolean retired;

    Boolean isRetired(){
        return retired;
    }

    void displayEmployeeInfo() {
        System.out.println(String.format("Employer: %s %s", name, lastName));
        System.out.println(String.format("Position: %s", position));
        System.out.println(String.format("Salary: $%s", salary));
    }

}
