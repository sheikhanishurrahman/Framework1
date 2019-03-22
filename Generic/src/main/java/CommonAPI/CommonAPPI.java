package CommonAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPPI {
    public WebDriver driver= null;
    @Parameters({"url"})
    @BeforeMethod
    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sheik\\IdeaProjects\\PracticeClass\\Generic\\Driver\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void closeUp(){
        driver.quit();
    }
    public void typeOnSearchBox(String locator ,String value){
        try {
            driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
        }
        catch (Exception e){
            System.out.println("Tried with Id, failed. Will try xpath");
        }
        try{
            driver.findElement(By.xpath(locator)).sendKeys(value,Keys.ENTER);
        }
        catch (Exception ex){
         System.out.println("xpath did not work here.");
        }
        try{
            driver.findElement(By.cssSelector(locator)).sendKeys(value,Keys.ENTER);
        }
        catch (Exception es){
            System.out.println("Css locator owrked ");
        }
    }
}
