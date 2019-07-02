package XPath;

/*
http://practice.cybertekschool.com/forgot_password
Locate every single webelement on this page using xpath.
Make sure they are all displayed.



 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekPractice {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // driver.manage().window().fullscreen();

        driver.get("http://practice.cybertekschool.com/forgot_password");

// //element[@attribute='value']


        if (driver.findElement(By.xpath("//a[@class='nav-link']")).isDisplayed() && driver.findElement(By.xpath("//a[@class='nav-link']")).getText().equals("Home"))  {
            System.out.println("Home button is displayed");
        } else {
            System.out.println("Home button is NOT displayed");
        }
///////////////////////
        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//div[@class='example']/h2"));
                String forgotPasswordHeaderText = forgotPasswordHeader.getText();

        if(forgotPasswordHeader.isDisplayed() && forgotPasswordHeaderText.equals("Forgot Password")){
            System.out.println("Forgot password header verification passed!");
        }else{
            System.out.println("Forgot password header verification failed!");
        }


        /////////////////////////

        if (driver.findElement(By.xpath("//label[@for='email']")).isDisplayed() && driver.findElement(By.xpath("//label[@for='email']")).getText().equals("E-mail")) {
            System.out.println("E-mail label is displayed");
        } else {
            System.out.println("E-mail label is displayed");
        }

////////////////////////////////////////////


        if(driver.findElement(By.xpath("//input[@type='text']")).isDisplayed()){
            System.out.println("Input email box is displayed");
        }else{
            System.out.println("Input email box is NOT displayed");
        }




        ///////////////////////////////////
        if (driver.findElement(By.xpath("//button[@id='form_submit']")).isDisplayed() && driver.findElement(By.xpath("//button[@id='form_submit']")).getText().equals("Retrieve password")) {
            System.out.println("Retrieve password button is displayed");
        } else {
            System.out.println("Retrieve password button is NOT displayed");
        }
//////////////////////////////////////////////////

        if (driver.findElement(By.xpath("//div[@style='text-align: center;']")).isDisplayed()) {
            System.out.println("Cybertek School button is displayed");
        } else {
            System.out.println("Cybertek School button is NOT displayed");
        }



        driver.close();
    }
}