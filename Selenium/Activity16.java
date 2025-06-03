import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://training-support.net/webelements/selects");

        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        WebElement selectElement = driver.findElement(By.cssSelector("select.h-10"));
        Select dropdown = new Select(selectElement);

        dropdown.selectByVisibleText("Two");
        System.out.println("Second option: " + dropdown.getFirstSelectedOption().getText());

        dropdown.selectByIndex(3);
        System.out.println("Third option: " + dropdown.getFirstSelectedOption().getText());

        dropdown.selectByValue("four");
        System.out.println("Fourth option: " + dropdown.getFirstSelectedOption().getText());


        System.out.println("Options in the dropdown:");
        List<WebElement> options = dropdown.getOptions();
        for (WebElement opt : options) {
            System.out.println(opt.getText());
        }

        driver.quit();
    }
}
