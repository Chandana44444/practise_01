package cross_browser_execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_09 {
	@Test(groups = "beauty")
	public void launch_Mamaearth() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mamaearth.in/");
		Reporter.log("From MamaEarth",true);
		Thread.sleep(4000);
		driver.quit();
	}

}
