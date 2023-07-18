package javaUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

    public static void main(String args[]){

        try {
            FileReader f= new FileReader("C:\\Users\\Yashica\\Desktop\\Testfile.txt");
            BufferedReader br= new BufferedReader(f,1024);
            String str;
            while ((str=br.readLine())!=null) {

                        System.out.println(str);
              //key url  value Rajesh
                //key password value 12345

            }
            //Map (keys - values)
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
