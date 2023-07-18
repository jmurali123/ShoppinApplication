package javaUtils;

public class WrapperTest {

    public static void main(String args[]){
      //  Character obj=Character.valueOf('A');
        char ch='a';
      //  Character.isDigit(ch);
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.isSpaceChar(ch));
        System.out.println(Character.isAlphabetic(ch));

       Character obj=ch;
       char ch1=obj.charValue();
       System.out.println(ch1);

       //"Se$l#enium "  // mu$i#neleS  //  I am not string=> g ni rts tonmaI

//    converting string to Byte wrapper
        String s="20";
       byte by=Byte.parseByte(s);
       Byte B1=by;
       byte b1=20;
       // converting primitive to Wrapper
       Byte B2=Byte.valueOf(b1);
       Byte B3=30;
       // converting wrapper obj to primitive
       byte b2=B3.byteValue();
       System.out.println(B1.compareTo(B2));

       // Integer  // converts the string to primitive value
        int I= Integer.parseInt("30");

        //coverting primitive to Wrapper
        Integer I1=Integer.valueOf(I);
        Integer I2=I;
        //converting
        //converting wrapper to primitive
        int ip1= I1.intValue();

       System.out.println("Binary format of 40 "+ Integer.toBinaryString(40));
       System.out.println("Hex format of 40 "+ Integer.toHexString(40));
       System.out.println("Oct format of 40 "+ Integer.toOctalString(40));
        System.out.println("String format of 40 "+ Integer.toString(40));

      //parseLong - long equivalent of the string
      //longValue

        System.out.println("POW" +Math.pow(5,3));
        System.out.println("Sqt" +Math.sqrt(25));
        System.out.println("Absolulte value" +Math.abs(-4.55));
        System.out.println("floor value" +Math.floor(4.5));
        System.out.println("ceil value" +Math.ceil(4.5));
        System.out.println("random value" +Math.random()); // imp

        double d=10*Math.random();
        int ran=(int)d;
        int ran2=ran%6;
        System.out.println("My random val"+ran2);
        int random_int = (int)Math.floor(Math.random() * (6 - 1 + 1) + 1);
        System.out.println(random_int);

    }
}
