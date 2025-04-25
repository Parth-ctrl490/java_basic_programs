//no. of vowels and consonants
import java.util.*;//import all packages
public class program12 {//class
    public static void main(String[] args) {//main function
        Scanner sc = new Scanner(System.in);//object creation
        System.out.println("Enter a no");//enter no.
        String str = sc.nextLine();//input
      int  length=str.length();
      int count1=0;
      int count2=0;

      //for counting vowels
        for(int i=0;i<length;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
                count1+=i;
            }
            else{
                count2+=i;
            }
        }
        System.out.println("vowels are="+count1);
        System.out.println("vowels are="+count2);
    }
}
