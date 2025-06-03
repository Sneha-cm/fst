import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        try {
          
            driver.get("https://training-support.net");

            System.out.println("Home Page Title: " + driver.getTitle());

            driver.findElement(By.xpath("//a[@id='about-link']")).click();

            System.out.println("About Us Page Title: " + driver.getTitle());
        } finally {

            driver.quit();
        }
    }
}
