package practiceProblem_8a;

public class ContractEmployee extends Employee {
    private String projectName;
    private double contractAmount;


    public ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public double getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(double contractAmount) {
        this.contractAmount = contractAmount;
    }


    @Override
    public double calculatePay() {
        return contractAmount;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmployee Type: Contract" +
                "\nProject Name: " + projectName +
                "\nContract Amount: $" + String.format("%.2f", contractAmount);
    }
}

