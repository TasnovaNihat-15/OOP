package practiceProblem_8a;

public abstract class Employee {
    protected String name;
    protected int id;
    protected String department;


    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public abstract double calculatePay();

    @Override
    public String toString() {
        return "Employee ID: " + id +
                "\nName: " + name +
                "\nDepartment: " + department;
    }
}
