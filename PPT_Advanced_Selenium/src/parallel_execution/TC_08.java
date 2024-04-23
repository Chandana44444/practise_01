package parallel_execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_08 {
	@Test(groups = "beauty")
	public void launch_Wow() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.buywow.in/");
		Reporter.log("From Wow",true);
		Thread.sleep(4000);
		driver.quit();
	}

}
