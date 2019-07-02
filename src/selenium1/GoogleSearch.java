package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://google.com");

       // driver.findElement(By.name("q")).sendKeys("apple");
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);
        //Thread.sleep(2000);

        //driver.findElement(By.name("btnK")).click();

        if (driver.getTitle().startsWith("apple")) {
            System.out.println("you are right");
        } else {
            System.out.println("sorry bro");
        }
//



    }
}
