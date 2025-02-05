package practiceProblem01.contd;
import java.util.Scanner;
public class contd01_2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a=sc.nextInt();
        String grade=null;
        switch (a/10){
            //for>=90
            case 10:
                grade ="A+";
                // for >= 80 and <90
            case 9:
                grade = "A";
                break;
            // for >= 70 and <80
            case 8:
                grade = "A-";
                break;
            // for >= 60 and <70
            case 7:
                grade = "B";
                break;
            // for >= 50 and <60
            case 6:
                grade = "C+";
                break;
            // for < 50
            default:
                grade = "F";
                break;
        }
        System.out.println("Grade: " + grade);
        }

    }

