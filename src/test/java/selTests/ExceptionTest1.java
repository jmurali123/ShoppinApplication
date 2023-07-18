package selTests;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        try {

            System.out.println("Enter the first number/n");
            int a = s.nextInt();
            System.out.println("Enter the second number/n");
            int b = s.nextInt();

            int result = a / b;
            System.out.println(result);
        }
        catch(InputMismatchException mismatchexp){
            System.out.println("Please enter valid input");
        }
        catch(ArithmeticException arexp){
            System.out.println("Enter non-zero value");
        }


        //optional
        finally {
            s.close();
        }


    }

}
