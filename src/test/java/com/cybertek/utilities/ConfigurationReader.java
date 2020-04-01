package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;
    static{
        try {
            //reading file from configuration.properties page(in java)
            FileInputStream fileInput=new FileInputStream("configuration.properties");
            //init obj
            properties=new Properties();
            //loads content of the file the properties obj
            properties.load(fileInput);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

    } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String getProperty(String key){
        return properties.getProperty(key);
}}
