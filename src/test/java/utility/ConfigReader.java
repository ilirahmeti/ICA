package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private String url;
    private String driverLocation;
    private String run_test;
    private String browser;
    private String platform;
    private String version;

   public ConfigReader() {
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("config.properties");
            prop.load(input);
            this.url = prop.getProperty("url");
            this.driverLocation = prop.getProperty("driver_location");
            this.run_test = prop.getProperty("run_test");
            this.browser = prop.getProperty("browser");
            this.platform = prop.getProperty("platform");
            this.version = prop.getProperty("version");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getUrl() {
        return url;
    }

    public String getDriverLocation() {
        return driverLocation;
    }

    public String getRun_test() {
        return run_test;
    }

    public String getBrowser() {
        return browser;
    }

    public String getPlatform() {
        return platform;
    }

    public String getVersion() {
        return version;
    }
}
