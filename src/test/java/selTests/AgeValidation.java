package selTests;

public class AgeValidation {

    public static void validate(int age)  {
        if(age<18){

                throw new InvalidCustException("Invalid age");

        }
        else{
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args){
        validate(15);
    }
}
