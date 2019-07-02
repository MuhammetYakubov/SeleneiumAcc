package selenium1;
//PRACTICE#1
//        Go to : http://practice.cybertekschool.com/forgot_password
//        Enter email
//        Click “retrieve password” button
//        Make sure “Your e-mail's been sent!” message is displayed.
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class javaCybertekForgotPassword {
    public static void main(String[] args) {

        CD.SetChromeMethod("http://practice.cybertekschool.com/forgot_password");

        CD.driver.findElement(By.xpath("//input[@name='email']")).sendKeys("wdadcomadw@gmail.com"+ Keys.ENTER);
      //  System.out.println(CD.driver.findElement(By.id("content")));
                                               //.getText().equals("Your e-mail's been sent!");
        if(CD.driver.findElement(By.id("content")).getText().equals("Your e-mail's been sent!")){
            System.out.println("Verification is passed");
        }else {
            System.out.println("Good luck :-)");
        }
        CD.driver.close();
    }
}
