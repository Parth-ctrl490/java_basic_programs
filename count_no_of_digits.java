//count no.of digits
import java.util.*;
public class program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            if (num == 0) {
                System.out.println("1");
            } else
                num = num / 10;//remove last digt till it is empty
            count = count + 1;
        }
        System.out.println(count);
    }
    }
