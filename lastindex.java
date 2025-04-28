//find the target element along with its occurence and push it to the last index
import java.util.*;
public class array{
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

       int[] result=new int[num];
        int index=0;

        for(int i=0;i<num;i++){
            if(arr[i]!=target){
                result[index++]=arr[i];
        }}
        while(index<num){
            result[index++]=target;
        }
        System.out.println("result is");
        System.out.println(Arrays.toString(result));
        sc.close();
    }}


