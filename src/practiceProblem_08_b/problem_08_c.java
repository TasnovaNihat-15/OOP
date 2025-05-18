package practiceProblem_08_b;

import java.util.Scanner;

public class problem_08_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int n1 = 5;
        final int n2 = 5;

        double[][] gradePoints = new double[n1][n2];
        int[] credits = new int[n2];


        for (int i = 0; i < n2; i++) {
            System.out.print("Credit for Subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();
        }


        for (int i = 0; i < n1; i++) {
            System.out.println("Enter grade points for Student " + (i + 1) + ":");
            for (int j = 0; j < n2; j++) {
                System.out.print("Grade point for Subject " + (j + 1) + ": ");
                gradePoints[i][j] = sc.nextDouble();
            }
        }


        for (int i = 0; i < n1; i++) {
            double totalPoints = 0;
            int totalCredits = 0;

            for (int j = 0; j < n2; j++) {
                totalPoints += gradePoints[i][j] * credits[j];
                totalCredits += credits[j];
            }

            double cgpa = totalPoints / totalCredits;
            System.out.printf("Student %d CGPA: %.2f%n", (i + 1), cgpa);
        }
    }
}

