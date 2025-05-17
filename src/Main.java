import java.util.Locale;
import java.util.Scanner;
public class Main {
     int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    static void change(int h){
         h=52;
    }
    static void change2(int[] arr){
         arr[0]=43;
    }
    static void foo(){
        System.out.println("good morning");
    }
    static void foo(int k){//parameters
        System.out.println("good morning " + k +" bro!");
    }
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        int num1=6;
        int num2=7;
        int num3=5;
        int sum=num1+num2+num3;
        System.out.println(sum);
         String str="Harry";
         System.out.println(str);
        //System.out.println("taking input from user");
       // Scanner sc = new Scanner(System.in);
        //System.out.println("Enter num 1 : ");
        //int a = sc.nextInt();
        //System.out.println("Enter num 2 : ");
        //int b = sc.nextInt();
       // int sum1 = a + b;
        //System.out.println("The sum of these number is : ");
       // System.out.println(sum1);
        //boolean b1 = sc.hasNextInt();
        //System.out.println(b1);

       // System.out.println("What is your name");
        //String name = sc.next();
        //System.out.println("Hello" + name + "have a good day");

        //int p=4;
        //int q = 9;
        //q += 3;
        //System.out.println(q);
        //System.out.println(6==6);
        //str.hashcode()--memory address
        //str.substring(7,12)-from string to create subdtring
        String name = new String("Ramisa");
        int value = name.length();
        String lstring = name.toLowerCase();
        String ustring = name.toUpperCase();
        System.out.println(name);
        System.out.println(value);
        System.out.println(lstring);
        System.out.println(ustring);
        String nonTrimmedString = "    ramisaaaa    ";
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));

        System.out.println(name.replace('s','a'));
        System.out.println(name.replace("isa","asi"));
        System.out.println(name.startsWith("Ram"));
        System.out.println(name.charAt(2));
        System.out.println(name.equals("Ramisa"));
        System.out.println(name.equalsIgnoreCase("ramisa"));
        int i=1;
        while (i<=3){
            System.out.println(i);
            i++;



        }
        int b=0;
        do{
            System.out.println(b);
            b++;
        }while(b<0);
        for(int k=0;k<7;k++){
            if(k==5){
                continue;
            }
            System.out.println(k);
            System.out.println("ramisa the great");

        }
        int [] arr = {1,2,3,4,5,6,8,9};
        System.out.println(arr.length);
        int [][] flats;
        flats = new int [2][3];

        flats[0][0]=2;
        flats[0][1]=3;
        flats[0][2]=4;
        flats[1][0]=5;
        flats[1][1]=6;
        flats[1][2]=7;
        for(int k=0;k<flats.length;k++){
            for(int j=0;j<flats[k].length;j++){
                System.out.print(flats[k][j]);
                System.out.print(" ");

            }
            System.out.println("");
        }
//methods
      int u=5;
        int v=7;
        int w;
        Main obj = new Main();
        w=obj.logic(u,v);
        System.out.println(w);

        //case:1  changing the integer
        int g=98;
       change(g);
        System.out.println("the value after running change is: "+g);

        //case:2 changing the array
        int [] marks={98,99,97,96,95};
        change2(marks);
        System.out.println("the value after running change is: "+marks[0]);
//methods overloading

foo();
foo(500);//arguments
        //arguments are actual




    }
}