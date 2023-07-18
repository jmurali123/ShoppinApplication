package javaUtils;

import utils.PropertyUtils;

import java.util.Properties;

public class PropertyRead {
   static Properties properties;
    public static void main(String args[]){
        properties=PropertyUtils.propertyLoader("src/main/resources/production.properties");
       String str= properties.getProperty("name");
//       System.out.println(str);
//        String str1="url=Rajesh";
//        String url= str.split(str1)[1];

    }
}
