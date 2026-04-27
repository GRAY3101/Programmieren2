package person;

public class Employee extends Person {
    private final String department;

    public Employee(String id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    @Override
    public String getRole() {
        return "person.Employee";
    }

    public String getDepartment() {
        return department;
    }
}
