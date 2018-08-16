package techcanvass.crm;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CommonTest {

	@Test
	public void testMainTest() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		// Created a driver instance. Which will drive chorome browser in my script
		driver.get("http://crm.techcanvass.co.in/");
		driver.findElement(By.id("btnlogin")).click();
		// Assignment --> Maximize browser, enter username, enter pass, click login,
		// close browser
		driver.manage().window().maximize();
		driver.findElement(By.id("txtuname")).sendKeys("techcanvassuser@techcanvass.co.in");
		driver.findElement(By.id("txtpwd")).sendKeys("user1234");
		WebElement checkBox = driver.findElement(By.id("chkstaysignedin"));
		boolean condition = checkBox.isSelected();
		// we are testing if check box is already selected
		// if it is already checked, condition=true
		// if it is unchecked condition=false
		if (condition == true) { // if (true == true)
			System.out.println("Check box is already checked. Unlclick & Click on this check box");
			checkBox.click();
			checkBox.click();
		} else { // if (false)
			System.out.println("Check box is not checked. Performing click operation with selenium script");
			checkBox.click();
		}
		WebElement roleDropDown = driver.findElement(By.id("ddlloginuser"));
		// For drop down in selenium we use Select class
		Select sel = new Select(roleDropDown);
		// drop down operations using sel instance
		// sel.selectByIndex(1);
		// indexes in java start from 0
		// sel.selectByValue("1");
		// This is value attribute
		sel.selectByVisibleText("Student");
		driver.findElement(By.id("loginbtn")).click();
	}

}
