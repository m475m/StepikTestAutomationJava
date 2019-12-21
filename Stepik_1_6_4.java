import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Stepik_1_6_4 {

    @Test
    public void startWebdriver(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://suninjuly.github.io/simple_form_find_task.html");

        WebElement firstName = driver.findElement(By.tagName("input"));
        firstName.sendKeys("Ivan");

        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Petrov");

        WebElement city = driver.findElement(By.className("city"));
        city.sendKeys("Smolensk");

        WebElement country = driver.findElement(By.id("country"));
        country.sendKeys("Russia");

        WebElement button = driver.findElement(By.cssSelector("button.btn"));
        button.click();
    }

}
