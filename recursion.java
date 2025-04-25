//recursion count no. of digits
import java.util.*;
public class program14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int result=count(num);
        System.out.println("result is="+result);
    }
    public static int count(int no){
        int count=0;
        while(no!=0){
            if(no==0){
                return 1;
            }
            else{
                no=no/10;
                  count++;
            }
        }
        return count;

    }
}
