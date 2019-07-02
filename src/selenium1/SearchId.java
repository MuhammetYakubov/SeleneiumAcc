package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchId {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();
       // driver.manage().window().fullscreen();

        driver.get("https://ETSY.com");

        driver.findElement(By.id("search-query")).sendKeys("wooden spoon"+ Keys.ENTER);

        if(driver.getTitle().contains("Wooden spoon")){
            System.out.println("good");
        }else{
            System.out.println("bad");
        }
    }
}
