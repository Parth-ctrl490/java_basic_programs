//factorial
import java.util.*;
class program3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        long fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
            System.out.println("factorial is:"+fact);
        }

    }
}

//Initial:
//fact = 1
//
//        🔁 Loop Iterations:
//i = 1 → fact = 1 * 1 = 1
//
//i = 2 → fact = 1 * 2 = 2
//
//i = 3 → fact = 2 * 3 = 6
//
//i = 4 → fact = 6 * 4 = 24
//
//i = 5 → fact = 24 * 5 = 120
//
//Now loop ends, fact = 120 which is 5!
