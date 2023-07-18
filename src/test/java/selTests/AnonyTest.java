package selTests;

interface Test1{
    void display();
}

public class AnonyTest {
    public static void main(String args[]){
      Test1 t=new Test1(){
          public void display(){
              System.out.println("I am from anonymous class");
          }
      } ;

      t.display();
    }
}
//
//class Testcompiler implements Test1{
//    public void display(){
//        System.out.println("I am from anonymous class");
//    }
//}