package HwClass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserAsgmt {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.syntaxprojects.com/");
        //maximize the screen
        driver.manage().window().maximize();

        //    Printing  the current URL

        String CurrentURL=driver.getCurrentUrl();
        System.out.println("This is the current Url:" +CurrentURL);

        //     Printing the current title
        String title =driver.getTitle();
        System.out.println("This is the current title:"+title);
        driver.quit();


    }
}
