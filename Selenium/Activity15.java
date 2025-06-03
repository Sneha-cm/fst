import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity15 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/dynamic-attributes");
        System.out.println("Page title is: " + driver.getTitle());

        driver.findElement(By.xpath("//input[@placeholder='Full name']")).sendKeys("shillu");
        driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("shillu@gmail.com");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("11/10/2002");
        driver.findElement(By.xpath("//textarea")).sendKeys("information.");

        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        System.out.println("Success message: " + message.getText());

        driver.quit();
    }
}