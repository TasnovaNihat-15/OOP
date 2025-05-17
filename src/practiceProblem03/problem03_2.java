package practiceProblem03;

import java.util.Scanner;

public class problem03_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's letter grade : ");
        double grade = sc.nextDouble();


        String completed = sc.next();

        if (completed.equalsIgnoreCase("yes")) {
            if (grade >= 3.5) {
                System.out.println("Give Medal");
            } else {
                System.out.println("No medal. Grade not sufficient.");
            }
        }
        else {
            System.out.println("No medal. Semester not completed.");
        }
    }
}

