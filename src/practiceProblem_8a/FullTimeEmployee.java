package practiceProblem_8a;
public class FullTimeEmployee extends Employee {
    private double fixedSalary;


    public FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }


    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }


    @Override
    public double calculatePay() {
        return fixedSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmployee Type: Full Time" +
                "\nFixed Salary: $" + String.format("%.2f", fixedSalary);
    }
}

