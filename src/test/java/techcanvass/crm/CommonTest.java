package techcanvass.crm;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonTest {

	@Test
	public void testMainTest() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://crm.techcanvass.co.in/");

		WebElement takeATestButton = driver
				.findElement(By.xpath("//div[@class='item item_3 active']/a[contains(text(),'Take')]"));

		Assert.assertTrue("Test failed as comparison fails", takeATestButton.getText().trim().contains("test"));
	}

}
