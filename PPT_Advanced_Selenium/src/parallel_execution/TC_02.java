package parallel_execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_02 {
	@Test(groups = "mobile")
	public void launch_Vivo_01() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vivo.com/in/");
		Reporter.log("From Vivo",true);
		Thread.sleep(4000);
		driver.quit();
	}
	@Test(groups = "mobile")
	public void launch_Vivo_02() throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vivo.com/in/");
		Reporter.log("From Vivo",true);
		Thread.sleep(4000);
		driver.quit();
	}


}
