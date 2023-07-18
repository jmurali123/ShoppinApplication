package javaUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String args[]) throws IOException {
        FileReader f=new FileReader("C:\\Users\\Yashica\\Desktop\\Testfile.txt");
        int i;
        while ((i=f.read())!=-1){
            System.out.println((char)i);

        }
        f.close();
    }
}
