package com.OHRMS.testcasescripts;

import org.testng.annotations.Test;

import com.mongodb.operation.DropUserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SampleTest {
	WebDriver driver;
	
  @Test
  public void f() {
	  System.out.println("this is f method");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\SELENIUM SOFTWARES 2017\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.navigate().to("http://www.fb.com");
 driver.manage().window().maximize();
  }

}
