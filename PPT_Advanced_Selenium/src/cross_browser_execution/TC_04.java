package cross_browser_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_04 {
	@Test
	@Parameters( "bname")

	public void launch_Amazon(String browsername) throws InterruptedException {
		WebDriver driver = null;
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("invalid browser name");
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Reporter.log("From Amazon", true);
		Thread.sleep(4000);
		driver.quit();
	}

}
