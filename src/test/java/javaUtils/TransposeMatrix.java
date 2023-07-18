package javaUtils;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter rows and columns");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int arr[][]=new int[r][c];

        System.out.println("Enter elements of the matrix");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter value for arr["+i+"]["+j+"]");
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Transpose of the matrix");

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(arr[j][i]+ " ");
            }
            System.out.print("\n");
        }
    }
}
