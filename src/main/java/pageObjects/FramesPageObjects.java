package pageObjects;

import java.awt.geom.Ellipse2D.Double;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.base;
import testData.TestD;


public class FramesPageObjects extends base {

	TestD td = new TestD();
	
	   //Web element locator frame left
		@FindBy(xpath = "//frame[@name='left']")
		WebElement FrameLeft;
	
		//Web element locator frame middle
		@FindBy(xpath = "//frame[@name='middle']")
		WebElement MiddleFrame;
		
		//Web element locator right
		@FindBy(xpath = "//frame[@name='right']")
		WebElement RightFrame;
		
		//Web element locator element left
		@FindBy(xpath = "//*[@id='left3']")
		WebElement FrameLeftElement;

		//Web element locator element middle
		@FindBy(xpath = "//*[@id='middle3']")
		WebElement FrameMiddleElement;
				
		//Web element locator element right
		@FindBy(xpath = "//*[@id='right3']")
		WebElement FrameRightElement;
		
		public  FramesPageObjects() {
			PageFactory.initElements(driver, this);
		}
		
		public void FrameLeft() {
			driver.switchTo().frame(FrameLeft);
			System.out.println("The left frame element is " + FrameLeftElement.getText());
			driver.switchTo().defaultContent();
		}
		
		public void FrameMiddle() {
			driver.switchTo().frame(MiddleFrame);
			System.out.println("The middle frame element is " +FrameMiddleElement.getText());
			driver.switchTo().defaultContent();
		}
		public void FrameRight() {
			driver.switchTo().frame(RightFrame);
			System.out.println("The right frame element is " +FrameRightElement.getText());
			driver.switchTo().defaultContent();
		}
		
}



