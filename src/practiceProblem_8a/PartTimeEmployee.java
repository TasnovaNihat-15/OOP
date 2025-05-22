package practiceProblem_8a;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;


    public PartTimeEmployee(String name, int id, String department, double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmployee Type: Part Time" +
                "\nHourly Rate: $" + String.format("%.2f", hourlyRate) +
                "\nHours Worked: " + hoursWorked;
    }
}
