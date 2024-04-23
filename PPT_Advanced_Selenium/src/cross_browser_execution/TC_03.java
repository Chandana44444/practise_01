package cross_browser_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_03 {
	@Test
	@Parameters( "bname")
	public void launch_Oppo(String browsername) throws InterruptedException {
		WebDriver driver = null ;
		switch(browsername.toLowerCase()) {
		case "chrome":{
			driver=new ChromeDriver();
		}
		break;
		case "edge":{
			driver=new EdgeDriver();
		}
		break;
		case "firefox":{
			driver=new FirefoxDriver();
		}
		break;
		default:System.out.println("invalid browser name");
		}
		driver.manage().window().maximize();
		driver.get("https://www.oppo.com/in/");
		Reporter.log("From Oppo", true);
		Thread.sleep(4000);
		driver.quit();
	}

}
