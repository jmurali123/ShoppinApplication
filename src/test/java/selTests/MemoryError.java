package selTests;

import java.util.ArrayList;
import java.util.List;

public class MemoryError {

    public static void main(String args[]){
       List<Integer> lst= new ArrayList<Integer>();
        while(true){
            lst.add(10);
        }

     //   System.out.println(lst);
    }
}
