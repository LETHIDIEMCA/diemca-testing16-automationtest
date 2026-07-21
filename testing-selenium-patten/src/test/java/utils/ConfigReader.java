package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private  static  final Properties PROPERTIES = loadProperties();
    public  static Properties loadProperties (){
        Properties properties = new Properties();

        try (InputStream inputStream=
                ConfigReader.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (inputStream == null){
                throw new Exception("File not found");
            }
            properties.load(inputStream);
        }catch (Exception e){
            throw  new RuntimeException(" Error reading properties file" , e);
        }
        return  properties;

        // define function de get value tu config properties


            }
    public static  String get (String key) {
        String value = PROPERTIES.getProperty(key);
        if (value == null) {
            throw new RuntimeException(" Key note found: " + key);
        }
        return  value.trim();
    }
//    public  static  int getInt ( String key){
//        return Integer.parseInt
    //}//
}
