package cross_browser_execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_05 {
	@Test(groups = "shopping")
	public void launch_Meesho() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Reporter.log("From Meesho",true);
		Thread.sleep(4000);
		driver.quit();
	}

}
