//divisor of a number
import java.util.*;
public class program10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("divisor is=0");
            return;
        }
        for(int i=1;i<=Math.abs(num);i++){
            if(num%i==0){
                System.out.println("divisor is="+i);
            }

        }
    }
}
