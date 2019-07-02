package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringWith {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();
       // driver.manage().window().fullscreen();

        driver.get("http://google.com");

        WebElement googleSearh = driver.findElement(By.name("q"));

        googleSearh.sendKeys("BMW" + Keys.ENTER);


    }
}
