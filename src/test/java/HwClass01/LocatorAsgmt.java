package HwClass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAsgmt {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.syntaxprojects.com/locator-homework.php");

 //        Enter the full name
        WebElement fullName = driver.findElement(By.id("fullName"));
        fullName.sendKeys("abraca dabra");

//      enter email in the E-Mail Address text box without @
        WebElement email = driver.findElement(By.name("yourEmail"));
//        send the text in the E-mail Address filed
        email.sendKeys("raju123gmail.com");
        Thread.sleep(3000);

        WebElement ClientName = driver.findElement(By.name("ClientName"));
//        send the text in the client name text box
        ClientName.sendKeys("qwghjjkhvvh");
        Thread.sleep(3000);

        WebElement ClientID = driver.findElement(By.id("ClientId"));
//        send the text in the client name text box
        ClientID.sendKeys("1234567");
        Thread.sleep(3000);

        WebElement ClientFeedback = driver.findElement(By.id("Clientfeedback"));
//        send the text in the ClientFeedback text box
        ClientFeedback.sendKeys("kkkkhjjkhvvh");
        Thread.sleep(3000);

        WebElement ProjectName= driver.findElement(By.name("ProjectName"));
//        send the text in the Project Name  box
        ProjectName.sendKeys("gjvjvjvhjjkhvvh");
        Thread.sleep(3000);

        WebElement ProjectDeadlinTime = driver.findElement(By.name("ClientId"));
//        send the text in the client name filed
        ProjectDeadlinTime.sendKeys("12/12/2024");
        Thread.sleep(3000);


        WebElement CurrentAddress = driver.findElement(By.name("CurrentAddress"));
//        send the text in the current Address text box
        CurrentAddress.sendKeys("121 bay 29 st ");
        Thread.sleep(3000);

        WebElement PermanentAddress = driver.findElement(By.name("PermanentAddress"));
//        send the text in the Permanent Address text box
        PermanentAddress.sendKeys("123 ave c ");
        Thread.sleep(3000);

        // click on submit button
        WebElement btnSubmit=driver.findElement(By.name("btn-submit"));
        btnSubmit.click();
        Thread.sleep(3000);

        //Enter email in the E-Mail Address text filed
        WebElement email1= driver.findElement(By.id("yourEmail"));
//        send the text in the E-mail Address filed
        email1.sendKeys("raju123@gmail.com");
        Thread.sleep(3000);

        //click on click Here link
        WebElement clickHere=driver.findElement(By.linkText("#"));
        clickHere.click();
        Thread.sleep(2000);











    }
}
