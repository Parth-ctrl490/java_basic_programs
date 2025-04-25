//gcd
import java.util.*;
public class program16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a");
        int a=sc.nextInt();
        System.out.println("Enter number b");
        int b=sc.nextInt();
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println("gcd is="+gcd);
    }
}
