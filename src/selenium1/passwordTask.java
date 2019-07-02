package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class passwordTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // driver.manage().window().fullscreen();

        driver.get("https://the-internet.herokuapp.com/forgot_password");
        driver.findElement(By.id("email")).sendKeys("muhammet@mail.com");
        driver.findElement(By.id("form_submit")).click();

        if(driver.getCurrentUrl().contains("email_sent")){
            System.out.println("link passed");
        }else{
            System.out.println("link didnt pass");
        }

    }
}
