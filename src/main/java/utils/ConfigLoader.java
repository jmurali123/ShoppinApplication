package utils;

import constants.EnvType;

import java.util.Properties;

public class ConfigLoader {

    private final Properties properties;

    private static ConfigLoader configLoader;

    private ConfigLoader() {
        String env = System.getProperty("env", String.valueOf(EnvType.STAGE));
        switch (EnvType.valueOf(env)) {
            case PROD:
                properties = PropertyUtils.propertyLoader("src/test/resources/production.properties");
                break;
            case STAGE:
                properties = PropertyUtils.propertyLoader("src/test/resources/staging.properties");
                break;
            default:
                throw new RuntimeException("Invalid env");
        }
    }

        public static ConfigLoader getInstance(){
            if(configLoader==null){
                configLoader=new ConfigLoader();
            }
            return configLoader;
        }

        public String getUrl(){
            String propurl=properties.getProperty("baseUrl");
            return propurl;
        }
        public String getUsername() {
            String propuname = properties.getProperty("username");
            return propuname;
        }

        public String getPassword(){
            String propPassword= properties.getProperty("password");
            return propPassword;
        }

}
