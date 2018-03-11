package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://automationpractice.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1() throws Exception {
    driver.get(baseUrl + "/index.php?id_category=5&controller=category");
    driver.findElement(By.cssSelector("li.sfHoverForce.sfHover > a[title=\"T-shirts\"]")).click();
    driver.findElement(By.cssSelector("li.sfHoverForce.sfHover > a[title=\"T-shirts\"]")).click();
    driver.findElement(By.cssSelector("i.icon-eye-open")).click();
    driver.findElement(By.cssSelector("i.icon-eye-open")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | fancybox-frame1520763885019 | ]]
    new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("L");
    new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("L");
    driver.findElement(By.cssSelector("option[title=\"L\"]")).click();
    driver.findElement(By.name("Submit")).click();
    driver.findElement(By.name("Submit")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/span/span")).click();
    driver.findElement(By.cssSelector("img.replace-2x.img-responsive")).click();
    driver.findElement(By.cssSelector("img.replace-2x.img-responsive")).click();
    driver.findElement(By.name("Submit")).click();
    driver.findElement(By.name("Submit")).click();
    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span")).click();
    driver.findElement(By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/a/span")).click();
    driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
    driver.findElement(By.xpath("//div[@id='center_column']/p[2]/a/span")).click();
    driver.findElement(By.name("processAddress")).click();
    driver.findElement(By.name("processAddress")).click();
    driver.findElement(By.id("cgv")).click();
    driver.findElement(By.id("cgv")).click();
    driver.findElement(By.name("processCarrier")).click();
    driver.findElement(By.name("processCarrier")).click();
    driver.findElement(By.linkText("Pay by bank wire (order processing will be longer)")).click();
    driver.findElement(By.linkText("Pay by bank wire (order processing will be longer)")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    driver.findElement(By.linkText("Sign out")).click();
    driver.findElement(By.linkText("Sign out")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
