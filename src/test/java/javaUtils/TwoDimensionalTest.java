package javaUtils;

public class TwoDimensionalTest {

    public static void main(String args[]){
        int marks[][]={{50,60,55,67,70},
                {62,65,70,70,81},
                {72,66,77,80,69}};

        int marks1[][]= new int[][]{{50,60,55,67,70},
                {62,65,70,70,81},
                {72,66,77,80,69}};
        System.out.println("columns" +marks[0].length);
        System.out.println("rows" +marks.length);

        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
