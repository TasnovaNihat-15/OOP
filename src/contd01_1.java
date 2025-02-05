import java.util.Scanner;
public class contd01_1 {
    public static void main(String[] args) {
        System.out.println("taking input from user");
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter num  : ");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("negative number");
        }
        if(a%2==0){
            System.out.println("the number is an even number");
        }
        else{
            System.out.println("the number is an odd number");
        }
    }
}
