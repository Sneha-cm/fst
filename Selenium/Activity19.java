import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Loaded page: " + driver.getTitle());

        By buttonLocator = By.id("confirmation");
        driver.findElement(buttonLocator).click();

        Alert popup = driver.switchTo().alert();
        System.out.println("Alert says: " + popup.getText());
        popup.dismiss();  
        String feedback = driver.findElement(By.id("result")).getText();
        System.out.println("Response displayed: " + feedback);
        driver.close();
    }
}
