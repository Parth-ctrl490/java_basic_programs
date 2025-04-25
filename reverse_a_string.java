//reverse a string
import java.util.*;
public class program17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String str=sc.nextLine();
        String reversed=reverseString(str);
        System.out.println("reverse is= "+reversed);
    }
    public static String reverseString(String str){
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }
}
