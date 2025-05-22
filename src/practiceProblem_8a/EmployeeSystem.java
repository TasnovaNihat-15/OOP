package practiceProblem_8a;
public class EmployeeSystem {
    public static void main(String[] args) {

        FullTimeEmployee fte = new FullTimeEmployee("John Smith", 1001, "Engineering", 5000.00);
        PartTimeEmployee pte = new PartTimeEmployee("Jane Doe", 2001, "Marketing", 25.00, 80);
        ContractEmployee ce = new ContractEmployee("Mike Johnson", 3001, "IT", "Database Migration", 15000.00);


        Employee[] employees = {fte, pte, ce};


        System.out.println("===== EMPLOYEE MANAGEMENT SYSTEM =====\n");

        for (Employee emp : employees) {
            System.out.println(emp);
            System.out.println("Pay: $" + String.format("%.2f", emp.calculatePay()));
            System.out.println("------------------------------------");
        }


        double totalPayroll = 0;
        for (Employee emp : employees) {
            totalPayroll += emp.calculatePay();
        }

        System.out.println("\nTotal Payroll: $" + String.format("%.2f", totalPayroll));
    }
}


