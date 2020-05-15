package objects.task3;

public class Employee {
    String name;
    String lastName;
    String position;
    Double salary;
    Boolean retired;

    Boolean isRetired(){
        return retired;
    }

    void print() {
        System.out.println(String.format("Employer: %s %s", name, lastName));
        System.out.println(String.format("Position: %s", position));
        System.out.println(String.format("Salary: $%s", salary));
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Jan";
        emp1.lastName = "Kowalski";
        emp1.position = "Test developer";
        emp1.salary = 3941.21;

        Employee emp2 = new Employee();
        emp2.name = "Adam";
        emp2.lastName = "Nowak";
        emp2.position = "Java developer";
        emp2.salary = 4012.11;

//        emp1.isRetired()=true;
//        emp2.isRetired()=false;

        emp1.print();
        emp2.print();
    }
}
