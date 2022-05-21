import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class testQaSoCalVictoria extends BaseTest {
    @Test
    public void itemInCard() throws InterruptedException {

        getDriver().get("https://www.saucedemo.com/");

        getDriver().findElement(By.id("user-name")).sendKeys("standard_user");;
        getDriver().findElement(By.id("password")).sendKeys("secret_sauce");;
        getDriver().findElement(By.id("login-button")).click();

        getDriver().findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        getDriver().findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();

        Assert.assertTrue(getDriver().getCurrentUrl().contains("https://www.saucedemo.com/cart.html"));

        getDriver().quit();
    }
}
