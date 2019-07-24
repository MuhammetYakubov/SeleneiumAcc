package SmokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium1.CD;

import java.util.concurrent.TimeUnit;

public class CreatingVenderBills {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // driver.manage().window().fullscreen();

//LOGIN TO WEBSITE

        driver.get("http://54.148.96.210/web/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement Email = driver.findElement(By.id("login"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement Password = driver.findElement(By.id("password"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Email.sendKeys("Lunch_InvoicingManager3@info.com");
        Thread.sleep(1500);

        Password.sendKeys("LD686gfX24");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//Verify if website is diplayed at the same page
        System.out.println("Right website is displayed: " + CD.passOrFail(driver.getCurrentUrl().equals("http://54.148.96.210/web?")));
        Thread.sleep(2000);

//User clicks Invoicing tab
        driver.findElement(By.xpath("//a[@href='/web#menu_id=199&action=']/span[1]")).click();
        Thread.sleep(2000);

//Verify if Invoicing tab displayed
        System.out.println("Invoicing tab displayed: " + CD.passOrFail(driver.findElement(By.linkText("Invoicing")).getAttribute("href").contains("/web#menu_id=199&action=")));

        driver.findElement(By.xpath("//a[@href='/web#menu_id=205&action=']/span[1]")).click();
        Thread.sleep(2000);

//User clicks Vendor Bills
        driver.findElement(By.xpath("//a[@href='/web#menu_id=241&action=321']")).click();
        Thread.sleep(2000);

//Verify if Vendor Bills tab displayed
        System.out.println("Vendor Bills tab displayed: "+ CD.passOrFail(driver.findElement(By.linkText("Vendor Bills")).getText().contains("Vendor Bills")));

//User clicks Create button
        driver.findElement(By.xpath("//div[@class='o_list_buttons']/button[1]")).click();
        Thread.sleep(3000);

//Verify if Create window is displayed
        System.out.println("Create list is opened: " + CD.passOrFail(driver.findElement(By.xpath("//ol[@class='breadcrumb']")).getText().equals("Vendor BillsNew")));
        Thread.sleep(4000);


        driver.findElement(By.xpath("(//input[@class='o_input ui-autocomplete-input'])[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[.='&*&*)_(, 7854422']")).click();
        Thread.sleep(3000);

//Checking entered Vendor name
        System.out.println("Vendor name is entered: "+ CD.passOrFail(driver.findElement(By.xpath("(//input[@class='o_input ui-autocomplete-input'])[1]")).getAttribute("value").equals("&*&*)_(, 7854422")));
       // System.out.println("Vendor name is entered: "+ driver.findElement(By.xpath("//li[.='&*&*)_(, 7854422']")).getAttribute("value"));

        driver.findElement(By.xpath("//input[@name='reference']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='reference']")).sendKeys("&*&*)_( (copy), James");
        Thread.sleep(3000);

//Checking entered Vendor Reference
        System.out.println("Vendor Reference is entered: "+ CD.passOrFail(driver.findElement(By.xpath("//input[@name='reference']")).getAttribute("value").contains("&*&*)_( (copy), James")));
        //(//div[@class='o_input_dropdown'])[2]

        WebElement VendorReference = driver.findElement(By.xpath("(//input[@type='text'])[7]"));

        Thread.sleep(1000);
        VendorReference.sendKeys("qwerty");
        Thread.sleep(1000);

//Checking entered Add Purchase order
        System.out.println("Add Purchase order is entered: "+ CD.passOrFail(VendorReference.getAttribute("value").contains("qwerty")));

        driver.findElement(By.xpath("//input[@name='date_invoice']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='date_invoice']")).sendKeys("07/01/2019");
        Thread.sleep(3000);

//Checking entered Bill date
        System.out.println("Bill date is entered: "+ CD.passOrFail(driver.findElement(By.xpath("//input[@name='date_invoice']")).getAttribute("value").equals("07/01/2019")));

        driver.findElement(By.xpath("//div[@class='o_form_sheet']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@class='o_datepicker_input o_input'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@class='o_datepicker_input o_input'])[2]")).sendKeys("07/27/2019");
        Thread.sleep(3000);

//Checking entered Due date
        System.out.println("Due date is entered: "+ CD.passOrFail(driver.findElement(By.xpath("(//input[@class='o_datepicker_input o_input'])[2]")).getAttribute("value").equals("07/27/2019")));

        driver.findElement(By.xpath("//td[@colspan='8']/a[@href='#']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@name='product_id']/div[@class='o_input_dropdown']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[.='[13] Ice Cream']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@class='o_form_sheet']")).click();
        Thread.sleep(1000);


//Checking product
        System.out.println("Entered prodouct: "+ CD.passOrFail(driver.findElement(By.xpath("//td[@class='o_data_cell']")).getText().equals("[13] Ice Cream")));

        driver.findElement(By.xpath("//td[@class='o_data_cell o_many2many_tags_cell']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@name='invoice_line_tax_ids']/div[@class='o_field_widget o_field_many2one']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[.='Air Tax']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='o_form_sheet']")).click();
        Thread.sleep(1000);

//Checking Taxes are selected
        System.out.println("Taxes are selected: "+ CD.passOrFail(driver.findElement(By.xpath("//td[@class='o_data_cell o_many2many_tags_cell']")).getText().contains("Air Tax")));

//User clicks Safe button
        driver.findElement(By.xpath("//button[@accesskey='s']")).click();

//Verify if Vendor bills are succesfully created
        System.out.println(driver.findElement(By.xpath("//ol[@class='breadcrumb']")).getText());
        System.out.println("Vendor bills are succesfully created: "+CD.passOrFail(driver.findElement(By.xpath("//ol[@class='breadcrumb']")).getText().equals("Vendor BillsNew")));


////li[.='&*&*)_(, 7854422']
//        //a is linkText


        //wdriver.close();
    }
}
