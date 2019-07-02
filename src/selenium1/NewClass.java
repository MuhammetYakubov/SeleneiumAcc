package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NewClass {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://google.com");

        driver.navigate().back();
        //Thread.sleep(2000);

        driver.navigate().forward();

        driver.navigate().refresh();

        System.out.println(driver.getTitle());

        driver.getCurrentUrl();

        //System.out.println(driver.getPageSource());
        driver.close();
        //pkill -9 Google Chrome - for terminal



    }
    }

