//linear search
import java.util.*;
public class random{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target");
        int target=sc.nextInt();
        System.out.println("enter the size of array");
        int num = sc.nextInt();
        int[] arr = new int[num];//
        System.out.println("enter the elements of array");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();//fill the elements
        }
          boolean found=false;
        for(int j=0;j<num;j++) {
            if (arr[j] == target) {
                System.out.println("found at " + j);//arr[j]
                found = true;
                break;
            }
            if(!found){
                System.out.println("target no found");
            }
        }
    sc.close();
    }}
