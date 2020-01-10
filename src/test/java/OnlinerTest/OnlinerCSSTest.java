package OnlinerTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class OnlinerCSSTest {

    /*
    .class +/1
    .class1.class2 +/2
    .class1 .class2 +/3
    #id -/4
    * +/5
    element -
    element.class +/6
    element,element +/7
    element element +/8
    element>element +/9
    element+element -
    element1~element2 -
    [attribute] +/10
    [attribute=value] +/11
    [attribute~=value] +/12
    [attribute|=value] +/13
    [attribute^=value] +/14
    [attribute$=value] -
    [attribute*=value] +/15
     */

    @Test
    public void verifyOnlinerUsingCSS() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://catalog.onliner.by/");
        driver.manage().window().maximize();

        WebElement webElement1 = driver.findElement(By.cssSelector(".b-top-navigation-huawei"));
        webElement1.click();

        driver.navigate().back();

        List<WebElement> webElements2 = driver.findElements(By.cssSelector(".catalog-bar__link.catalog-bar__link_strong"));
        webElements2.get(3).click();

        driver.navigate().back();

        List<WebElement> webElements3 = driver.findElements(By.cssSelector(".catalog-bar__item .catalog-bar__link.catalog-bar__link_strong"));
        webElements3.get(2).click();

        driver.navigate().back();

//        WebElement webElement4 = driver.findElement(By.cssSelector("[id=fast-search]"));
//        webElement4.sendKeys(Keys.ENTER);
//        webElement4.sendKeys("123");
//
//        driver.navigate().back();

        List<WebElement> webElements5 = driver.findElements(By.cssSelector("*.catalog-bar__item"));
        webElements5.get(4).click();

        driver.navigate().back();

        WebElement webElement6 = driver.findElement(By.cssSelector("a.b-top-navigation-informers__link"));
        webElement6.click();

        driver.navigate().back();

        List<WebElement> webElements7 = driver.findElements(By.cssSelector("lu, li"));
        webElements7.get(125).click();

        driver.navigate().back();

        List<WebElement> webElements8 = driver.findElements(By.cssSelector("li a.b-main-navigation__link"));
        webElements8.get(1).click();

        driver.navigate().back();

        List<WebElement> webElements9 = driver.findElements(By.cssSelector("li > a.b-main-navigation__link"));
        webElements9.get(4).click();

        driver.navigate().back();

        List<WebElement> webElements10 = driver.findElements(By.cssSelector("[title]"));
        webElements10.get(4).click();

        driver.navigate().back();

        WebElement webElement11 = driver.findElement(By.cssSelector("[id=weather-informer]"));
        webElement11.click();

        driver.navigate().back();

        WebElement webElement12 = driver.findElement(By.cssSelector("[id~=weather-informer]"));
        webElement12.click();

        driver.navigate().back();

        WebElement webElement13 = driver.findElement(By.cssSelector("[id|=weather]"));
        webElement13.click();

        driver.navigate().back();

        WebElement webElement14 = driver.findElement(By.cssSelector("[id^=w]"));
        webElement14.click();

        driver.navigate().back();

        WebElement webElement15 = driver.findElement(By.cssSelector("[id*=th]"));
        webElement15.click();

        driver.quit();
    }
}
