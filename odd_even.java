//even and odd using user input
import java.util.*;//import all packages
public class program1 {//class
    public static void main(String[] args){//main function
        Scanner sc=new Scanner(System.in);//object creation
        System.out.println("Enter a no");//enter no.
        int num=sc.nextInt();//input
        while(num>0){//if number is positive
            if(num%2==0){
                System.out.println("the number is even");
                break;
            }
        else{
            System.out.println("the number is odd");
            break;
            }
        }
    }
}
