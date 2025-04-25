//matrix multiplication
import java.util.*;
public class program21 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //input dimensions of matrix A
        System.out.println("enter a rows for matrix A");
        int rowA=sc.nextInt();
        System.out.println("enter a column for matrix A");
        int colA=sc.nextInt();

        //input dimensions of matrix B
        System.out.println("enter a rows for matrix B");
        int rowB=sc.nextInt();
        System.out.println("enter a column for matrix B");
        int colB=sc.nextInt();

        //exception
        if(colA!=rowB){
            System.out.println("invalid matrix as col of A is not equal to rows of B");
            return;
        }
        //Input Matrix A
        System.out.println("enter elements for A");
        int[][] A=new int[rowA][colA];
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colA;j++){
                A[i][j]=sc.nextInt();
            }
        }
        //Input Matrix B
        System.out.println("enter elements for B");
        int[][] B=new int[rowB][colB];
        for(int i=0;i<rowB;i++){
            for(int j=0;j<colB;j++){
                B[i][j]=sc.nextInt();
            }
        }
        //result
        int[][] result=new int[rowA][colB];

        //multiplication logic
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colB;j++){
                for(int k=0;k<colA;k++){
                    result[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        System.out.println("resultant matrix");
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colB;j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
            }

    }
}
