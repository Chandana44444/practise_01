package parallel_execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_04 {
	@Test(groups = "shopping")
	public void launch_Amazon() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Reporter.log("From Amazon",true);
		Thread.sleep(4000);
		driver.quit();
	}

}
