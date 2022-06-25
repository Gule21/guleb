package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingUtil {

    //class level variables - we can access anywhere in the project
    public String url;
    public String userName;
    public String password;

    public void readPropertiesFile() throws IOException {
        FileReader fileReader = new FileReader("configuration.properties"); //java class read file, any kind of file, it will read file whatever u give
        Properties properties = new Properties(); // java has properties class - we need to create properties object to read file
        properties.load(fileReader); // my properties will have entry data that i have read form fileReader

        url = properties.getProperty("Url");
        userName = properties.getProperty("username");
        password = properties.getProperty("password");

    }
}
