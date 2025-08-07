package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
   
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class marath2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopan\\Downloads\\chromedriver-win64\\chromedriver.exe");
               
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(options); 
        
        driver.get("https://www.tatacliq.com/");
        driver.manage().window().maximize(); 
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("moe-dontallow_button")).click();
        driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]")).click();
        driver.findElement(By.xpath("//div[contains(@aria-label,'Watches & Accessories')]")).click();
        driver.findElement(By.xpath("//div[@class='DesktopHeader__brandsDetails']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>windowHandles1=new ArrayList<>(windowHandles);
		
		driver.switchTo().window(windowHandles1.get(windowHandles1.size()-1));
		
		
		WebElement sortBy = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select select=new Select(sortBy);
		
		select.selectByVisibleText("New Arrivals");
		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilName'])[1]")).click();
		Thread.sleep(2000);
		
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		
		
		for(WebElement price :prices) {
			System.out.println(price.getText());
		}
		
		Thread.sleep(1000);
		
		String product1 = prices.get(0).getText();
		System.out.println("The price of the first product is "+product1);
		
        driver.findElement(By.xpath("(//a[@aria-label='Casio'])[1]")).click();
		
		Set<String> allAddr = driver.getWindowHandles();
		System.out.println("Address of all window :"+allAddr);

		List<String> address = new ArrayList<String>(allAddr);

		
		System.out.println("Title before switching is: " + driver.getTitle());

		driver.switchTo().window(address.get(address.size()-1));

		System.out.println("Title after switching is: " + driver.getTitle());
		
		String price1Full = driver.findElement(By.xpath("//h3[contains(text(),'MRP:')]")).getText(); // MRP: ₹3995
		System.out.println("MRP full text: " + price1Full);

		// Extract price part only
		String price1 = price1Full.replaceAll("[^₹0-9]", "");  // ₹3995
		String product1Clean = product1.replaceAll("[^₹0-9]", ""); // ₹3995

		if(product1Clean.equals(price1)) {
		    System.out.println("Price matches.");
		} else {
		    System.out.println("Price mismatch.");
		}

		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String count=driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Product count is "+count);
		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("CartPage__pageCenter")));
		
		File src =  driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/cartpage.png");
		FileUtils.copyFile(src, dest);

		System.out.println("Screenshot of product page taken.");
		
		driver.close();
		driver.switchTo().window(address.get(0));
		driver.quit();
			
		}
		
	}




