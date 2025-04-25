//armstrong number
import java.util.*;
public class program9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int og=num;
        //count no. of digits
        int count=0;
        while(num!=0){
            num=num/10;
            count=count+1;
        }
                num=og;//reset the number
        //sum it
        int sum=0;
        while(num!=0){
            int dig=num%10;//find last digit;
            sum+=Math.pow(dig,count);
            num=num/10;//remove last digit
        }
        System.out.println("sum is="+sum);
        if(sum==og){
            System.out.println("armstrong number");

        }
        else{
            System.out.println("not armstrong number");
        }
    }
}
