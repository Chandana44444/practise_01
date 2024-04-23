package dataprovider_concept;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_01 {
	@DataProvider(name="test-01",parallel = true)
public static String[][] m() throws EncryptedDocumentException, IOException {
	File file=new File("./extrenaldata/excel.xlsx");
	FileInputStream fis=new FileInputStream(file);
	
	Workbook wb = WorkbookFactory.create(fis);
	int row = wb.getSheet("Sheet1").getPhysicalNumberOfRows();
	int cell = wb.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells()-1;
	
	String[][] arr=new String[row][cell];
	
	for(int i=0;i<row;i++) {
		for(int j=0;j<cell;j++) {
			arr[i][j]=wb.getSheet("Sheet1").getRow(i).getCell(j+1).toString();
		}
	}
	
	return arr;
}
	
	
@Test(dataProvider = "test-01")
public void login(String arr[]) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys(arr[0]);
	driver.findElement(By.id("Password")).sendKeys(arr[1]);
	Thread.sleep(2000);
	driver.quit();
}
	
}

