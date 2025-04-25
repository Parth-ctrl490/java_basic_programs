//sum of digits
import java.util.*;
public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum=0;
        while(num!=0) {
            int dig = num % 10;//find last digit
            sum=sum+dig;//sum it
            num=num/10;//remove that digit
        }
        System.out.println("sum is:"+sum);
    }}
