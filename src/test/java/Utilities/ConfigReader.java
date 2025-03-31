package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import DriverManager.Driver_SetUp;

public class ConfigReader {

    private static Properties properties = new Properties();
    
    // Load configuration from properties file
    public static void loadConfig() throws IOException {
        InputStream inputStream = ConfigReader.class.getClassLoader().getResourceAsStream("Config/config.properties");
        if (inputStream == null) {
            throw new IOException("Config file not found in classpath");
        }
        properties.load(inputStream);
    }

    // Browser type for cross-browser testing
    public static String getBrowserType() {
        return properties.getProperty("browser", "chrome").toLowerCase();
    }

    // Get base URL
    public static String getUrl() {
        return properties.getProperty("url");
    }

    public static String getUserName() {
        return properties.getProperty("username");
    }

    public static String getPassword() {
        return properties.getProperty("password");
    }

    // Additional URLs for different modules
    public static String geturlTimeComplexity() {
        return properties.getProperty("urlTimeComplexity");
    }

    public static String geturlDataStructuresIntroduction() {
        return properties.getProperty("urlDataStructuresIntroduction");
    }

    public static String geturlPracticeQnsDSIntroPage() {
        return properties.getProperty("urlDataStructuresIntroPracticeQns");
    }

 
   

   
    public static String getUrlHome() {
        return properties.getProperty("urlHome");
    }

    public static String getUrlLinkedList() {
        return properties.getProperty("urlLinkedList");
    }

    public static String getUrlArray() {
        return properties.getProperty("urlArray");
    }

    // Method to initialize WebDriver from config
    public static void initializeDriverFromConfig() throws Exception {
        loadConfig();
        String browser = getBrowserType();
        Driver_SetUp.initializeBrowser(browser);
    }

    // Load properties manually
    public static Properties initializeProp() {
        Properties prop = new Properties();
        File profile = new File(System.getProperty("user.dir") + "/src/test/resources/Config/config.properties");

        try (FileInputStream fis = new FileInputStream(profile)) {
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}

