package cross_browser_execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_07 {
	@Test(groups = "beauty")
	public void launch_Lakme() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lakmeindia.com/");
		Reporter.log("From Lakme",true);
		Thread.sleep(4000);
		driver.quit();
	}

}
