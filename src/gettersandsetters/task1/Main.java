package gettersandsetters.task1;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.displayEmployeeInfo();

        emp1.setName("Adam");
        emp1.setLastName("Nowak");
        emp1.setPosition("Developer");
        emp1.setRetired(false);
        emp1.setSalary(1221.12);

        emp1.displayEmployeeInfo();
    }
}
