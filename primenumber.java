//prime number
import java.util.*;
public class program2 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a no.");
    int num=sc.nextInt();
    int count=0;
   for(int i=1;i<=num;i++){
       if(num%i==0){
           count++;
       }}
   if(count==2){
       System.out.println("the number is prime");
   }
   else{
       System.out.println("the number is not prime");
   }
}
}

//
//Step-by-Step Explanation:
//Input: The program prompts the user to enter a number (num).
//
//Divisor Check: The for loop iterates from 1 to num and checks for each number i if it divides num without leaving a remainder (num % i == 0).
//
//Counting Divisors: The variable count is incremented every time a divisor is found (i.e., num is divisible by i).
//
//Prime Check: After the loop:
//
//If count == 2 (meaning the number has exactly two divisors: 1 and itself), the number is prime.
//
//Otherwise, the number is not prime.




//Short Dry Run for num = 7:
//Input: num = 7
//
//Initialization: count = 0
//
//Loop: Check divisors of 7 (1 to 7):
//
//        7 % 1 == 0 → count = 1
//
//        7 % 2 != 0 → No change
//
//7 % 3 != 0 → No change
//
//7 % 4 != 0 → No change
//
//7 % 5 != 0 → No change
//
//7 % 6 != 0 → No change
//
//7 % 7 == 0 → count = 2
//
//After loop: count = 2 → Prime
//
//Output: The number is prime
