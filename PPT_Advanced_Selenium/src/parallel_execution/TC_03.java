package parallel_execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_03 {
	@Test(groups = "mobile")
	public void launch_Oppo() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oppo.com/in/");
		Reporter.log("From Oppo",true);
		Thread.sleep(4000);
		driver.quit();
	}

}
