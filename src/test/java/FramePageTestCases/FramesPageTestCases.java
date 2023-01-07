package FramePageTestCases;

import org.testng.annotations.Test;

import base.base;
import pageObjects.FramesPageObjects;
import testData.TestD;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class FramesPageTestCases extends base {
	
	FramesPageObjects frame;
	TestD td;
 
  @BeforeMethod
  public void beforeMethod() {
	  
	  openApplication();
		frame = new FramesPageObjects();
		td = new TestD();
  }

  @Test
  public void Frametestleft() {
	  frame.FrameLeft();
	  WebElement actuallefttitle=driver.findElement(By.xpath("//frame[@name='left']"));
	  actuallefttitle.getText();
	  Assert.assertEquals("Left Nested Page", td.expectedleftframetitle);
  }
  
  @Test
  public void Frametestmiddle() {
	  frame.FrameMiddle();
	  WebElement actualmiddlettitle=driver.findElement(By.xpath("//frame[@name='middle']"));
	  actualmiddlettitle.getText();
	  Assert.assertEquals("Middle Nested Page", td.expectedmiddletitle);
	  
  }
  
  @Test
  public void Frametestright() {
	  frame.FrameRight();
	  WebElement actualrighttitle=driver.findElement(By.xpath("//frame[@name='right']"));
	  actualrighttitle .getText();
	  Assert.assertEquals("Right Nested Page", td.expectedrighttitle);
  }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.quit();
  }

}
