package practiceProblem03;

import java.util.Scanner;

public class problem03_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales  achieved : ");
        double sales = sc.nextDouble();

        System.out.print("Enter attendance : ");
        int attendance = sc.nextInt();

        double bonus;

        if (sales >= 95) {
            if (attendance == 100) {
                bonus = 60;
            }
            else if (attendance >= 90) {
                bonus = 40;
            }
            else {
                bonus = 5;
            }
        }
        else if (sales >= 80) {
            if (attendance == 100) {
                bonus = 40;
            }
            else if (attendance >= 90) {
                bonus = 20;
            }
            else {
                bonus = 5;
            }
        }
        else {
            bonus = 5;
        }

        System.out.println("Bonus percentage: " + bonus + "%");
    }
}

