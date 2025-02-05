package practiceProblem01.contd;
import java.util.Scanner;
public class contd01_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        char operation=sc.next().charAt(0);
        //int c=a+b;
        //int d=a-b;
        //int e=a*b;
        //int f=a/b;
        //System.out.println(c);
        //System.out.println(d);
        //System.out.println(e);
       // System.out.println(f);
        int result;
        if  (operation == '+') {
            result = a + b;
        }
        else if (operation == '-') {
            result = a - b;
        }
        else if (operation == '*') {
            result = a * b;
        }
        else if(operation == '/') {
            result=a/b;
        }
        else{
            System.out.println("invalid operation");
            return;
        }
        System.out.println(result);


    }
}
