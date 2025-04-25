//fib series
import java.util.*;
public class program4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<num;i++) {
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
            next = a;

        }
    }
}



//We want to print:
//        0 1 1 2 3 5 8 13 ...
//This is called the Fibonacci Series.
//
//        🚶‍♂️Step-by-step Example with Story:
//Assume:
//
//a = 0 (first person)
//
//b = 1 (second person)
//
//They both are standing in line.
//
//Now we want to print 5 numbers like this:
//
//        🧩 Code:
//java
//        Copy
//Edit
//        int a = 0, b = 1;
//
//for (int i = 1; i <= n; i++) {
//        System.out.print(a + " ");
//int next = a + b;
//a = b;
//b = next;
//}
//        📖 Dry Run (n = 5):
//
//Step	a	b	next = a + b	Printed
//1	0	1	1	0
//      2	1	1	2	1
//      3	1	2	3	1
//      4	2	3	5	2
//      5	3	5	8	3
//        🎯 What is happening?
//First print a (which is 0)
//
//Then calculate next = a + b → (0 + 1 = 1)
//
//Move values:
//
//a = b → now a becomes 1
//
//b = next → now b becomes 1
//
//Repeat this process!
//
//        🧠 Final Output for n = 5:
//Copy
//        Edit
//0 1 1 2 3
