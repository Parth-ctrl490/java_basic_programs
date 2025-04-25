//reverse a number
import java.util.*;
public class program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int rev=0;
        while(num>0){
            //find last digit
            int lastdig=num%10;
            //add last digit to number
            rev=rev*10+lastdig;
            //remove last digit
            num=num/10;
        }
        System.out.println("reverse number is"+rev);
    }
}
