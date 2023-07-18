package javaUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling1 {

    public static void main(String args[]){
        FileInputStream f = null;
        int i;
        try {
             f = new FileInputStream("C:\\Users\\Yashica\\Desktop\\Testfile.txt");
            //int i=f.read();
           // f.read()
            
            while ((i=f.read())!=-1){
                System.out.println((char)i);
            }
           
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                f.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
