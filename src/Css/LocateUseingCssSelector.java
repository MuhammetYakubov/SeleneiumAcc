package Css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateUseingCssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // driver.manage().window().fullscreen();

        driver.get("https://amazon.com");

        WebElement serchButton = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        serchButton.sendKeys("wooden spoon"+ Keys.ENTER);

        if(driver.getTitle().contains("wooden spoon")){
            System.out.println("Title verification Passed");
        }else{
            System.out.println("Title verification Not Passed!!");
        }
    }
}
