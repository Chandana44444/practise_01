package cross_browser_execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_06 {
	@Test(groups = "shopping")
	public void launch_Flipkart() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Reporter.log("From Flipkart",true);
		Thread.sleep(4000);
		driver.quit();
	}

}
