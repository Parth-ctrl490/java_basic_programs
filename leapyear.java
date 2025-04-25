//leap year or not
import java.util.*;
public class program19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0 ) || ( year%400==0 )){
            System.out.println("leap year");
        }
        else{
            System.out.println("Not leap year");
        }
    }
}
