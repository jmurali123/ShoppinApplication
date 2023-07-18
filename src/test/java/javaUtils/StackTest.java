package javaUtils;

import java.util.Stack;

public class StackTest {

    public static void main(String args[]){
        Stack<Integer> s= new Stack<Integer>();
        s.push(11);
        s.push(12);
        s.push(13);
        Integer ipop=s.pop();
        System.out.println("Popped element is" +ipop);

        Integer ipeek=s.peek();
        System.out.println("top element is "+ipeek);

        int pos=s.search(12);
        System.out.println("Element is at "+pos);
        int pos1=s.search(11);
        System.out.println("Element is at "+pos1);
        System.out.println(s.get(0));
        
    }


}
