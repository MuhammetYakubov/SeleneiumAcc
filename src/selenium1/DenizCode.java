package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DenizCode {
    public static void main(String[] args) throws InterruptedException {

        String[] cybertek = {"PHONE NUMBER, PHONE NUMBER"};


        String[] messages = {"BLAH BLAH"};

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "/Users/egemendenizbahar/Documents/Selenium dependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://voice.google.com/messages");

        driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("BLAHBLAH@gmail.com" + Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("gmailpassword" + Keys.ENTER);
        Thread.sleep(3000);
        driver.get("https://voice.google.com/u/0/messages");
        Thread.sleep(1000);


        for (int i = 0; i < messages.length; i++) {
            for (int j = 0; j < cybertek.length; j++) {
                driver.get("https://voice.google.com/u/0/messages");
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("div[class='gmat-subhead-2 grey-900']")).click();
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("input[id='input_0']")).sendKeys(cybertek[j] + Keys.ENTER);
                Thread.sleep(2000);
                driver.findElement(By.cssSelector("textarea[id='input_1']")).sendKeys(messages[i] + Keys.ENTER);
                Thread.sleep(2000);
            }
        }
        driver.close();
    }
}
