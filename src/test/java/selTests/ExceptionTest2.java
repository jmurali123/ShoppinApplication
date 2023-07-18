package selTests;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest2 {

    public static void main(String args[]) throws FileNotFoundException {
        FileReader f = new FileReader("C:\\Users\\Yashica\\bddscript.txt");
    }
}
