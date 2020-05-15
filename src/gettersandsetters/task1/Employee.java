package gettersandsetters.task1;

public class Employee {
    private String name;
    private String lastName;
    private String position;
    private Double salary;
    private Boolean retired;

    public Employee() {
        this.name = "Jan";
        this.lastName = "Kowalski";
        this.position = "QA Tester";
        this.salary = 9499.99;
        this.retired = false;
    }

    Boolean isRetired(){
        return retired;
    }

    public Employee(String name, String lastName, String position, Double salary, Boolean retired) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.retired = retired;
    }

    void displayEmployeeInfo() {
        System.out.println(String.format("Employer: %s %s", name, lastName));
        System.out.println(String.format("Position: %s", position));
        System.out.println(String.format("Salary: $%s", salary));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getRetired() {
        return retired;
    }

    public void setRetired(Boolean retired) {
        this.retired = retired;
    }
}
