package practiceProblem02;

public class problem02_3 {
    public static void main(String[] args) {
        int sum1=0;
        for(int i=2;i<=20;i=i+2){
            sum1 +=i;
        }
        System.out.println("sum1 is "+sum1);
        int sum2=0;
        for(int j=1;j<20;j=j+2){
            sum2 +=j;
        }
        System.out.println("sum2 is "+sum2);
    }
}
