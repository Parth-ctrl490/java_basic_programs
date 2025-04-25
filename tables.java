//tables
import java.util.*;
public class program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int result=0;
        for(int i=1;i<=10;i++){
            result=num*i;
            System.out.println(num+"X"+i+"="+result);
        }

    }}

