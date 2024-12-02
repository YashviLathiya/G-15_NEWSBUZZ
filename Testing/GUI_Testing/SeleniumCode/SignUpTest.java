// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SignUpTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void signUp() {
    driver.get("https://normal-frontend.onrender.com/");
    driver.manage().window().setSize(new Dimension(1410, 799));
    driver.findElement(By.cssSelector(".MuiButton-fullWidth")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("saumya_vasa");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("svasva3084@gmail.com");
    driver.findElement(By.id("password")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiButton-fullWidth"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("password")).sendKeys("12345678");
    driver.findElement(By.cssSelector(".MuiButton-fullWidth")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiSvgIcon-colorSuccess:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".MuiSvgIcon-colorSuccess:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".MuiInputBase-adornedEnd")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiButton-fullWidth"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("password")).sendKeys("Vasask3aug");
    driver.findElement(By.cssSelector(".MuiButton-fullWidth")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("password")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiButton-fullWidth"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("password")).sendKeys("Vasask@3aug");
    driver.findElement(By.cssSelector(".MuiButton-fullWidth")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".css-1sqiiv1"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("Code-0")).click();
    driver.findElement(By.id("Code-0")).sendKeys("3");
    driver.findElement(By.id("Code-1")).sendKeys("1");
    driver.findElement(By.id("Code-2")).sendKeys("5");
    driver.findElement(By.id("Code-3")).sendKeys("3");
    driver.findElement(By.id("Code-4")).sendKeys("1");
    {
      WebElement element = driver.findElement(By.cssSelector(".css-19q2l3q"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("Code-5")).sendKeys("8");
    driver.findElement(By.cssSelector(".css-19q2l3q")).click();
    driver.findElement(By.cssSelector(".css-19q2l3q")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(9) > .MuiButtonBase-root"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(10) > .MuiButtonBase-root"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.linkText("Home"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}
