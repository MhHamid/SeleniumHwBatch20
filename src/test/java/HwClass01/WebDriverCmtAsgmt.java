package HwClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCmtAsgmt {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //maximize the screen
        driver.manage().window().maximize();
        //goto google.com
        driver.get("http://www.google.com/");

        String title=driver.getTitle();
        // printing the page title
        System.out.println("This is the page title:"+title);

        driver.get("http://www.syntaxprojects.com/");

         String syntaxTitle=driver.getTitle();
        System.out.println("This is the page title:"+syntaxTitle);

        //go back to google.com
        driver.navigate().to("http://www.google.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();



    }
}
