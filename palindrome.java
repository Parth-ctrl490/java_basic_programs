//palindrome
//reverse a number and if it is same as origianl than fine else it is not palindrome
import java.util.*;
public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int og=num;
        int rev=0;
while(num!=0){
    //find the last digit
    int lastdig=num%10;
    //add it to main digit
    rev=rev*10+lastdig;
    //remove the last digit from it
    num=num/10;}
    if(og==rev){
        System.out.println("the number is palindrome");
    }
    else{
        System.out.println("not palindrome");
    }
    }
}
