//perfect number
import java.util.*;
public class program11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int sum=0;
        //find divisors
        if(num<=0) {
            System.out.println("divisor is=0  and not a perfect number");
            sc.close();
            return;
        }
            for (int i = 1; i < Math.abs(num); i++){
            if(num%i==0){
                System.out.println("divisor is="+i);
                //sum it
                sum+=i;
            }}

            System.out.println("sum is=" + sum);
            if(sum==num){
                System.out.println("perfect number");

            }
            else {
                System.out.println("not");
            }
    }}
