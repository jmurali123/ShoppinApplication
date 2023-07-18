package selTests;

import org.apache.commons.lang3.ObjectUtils;

public class ExceptionTest3 {

    public static void main(String args[]){
        try{
            String str=null;
            System.out.println(str.length());
        }
        catch (NullPointerException ex){
            System.out.println("Null pointer occurred");
        }

    }
}
