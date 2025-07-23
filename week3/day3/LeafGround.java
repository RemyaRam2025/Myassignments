package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;



public class LeafGround {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gopan\\Downloads\\chromedriver-win64\\chromedriver.exe");
        //WebDriver driver =  new ChromeDriver();
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(options); 
        
        driver.get("https://leafground.com/button.xhtml");
        driver.manage().window().maximize();  
        
        //click the button
        driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
        
        //get title of page
        String title = driver.getTitle();
        System.out.println("The title of the page is "+title);
        
        //navigate back
        driver.navigate().back();
        
        //check if button is enabled
        boolean enabled = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
        if(enabled)
        	System.out.println("The button 'Confirm if the button is disabled' is enabled ");
        else
        	System.out.println("The button 'Confirm if the button is disabled' is disabled");
        
        //find location of button
        Point location = driver.findElement(By.xpath("//span[contains(@class, 'ui-button-text') and text()='Click']")).getLocation();
        System.out.println("Button Submit - X position "+location.getX());
        System.out.println("Button Submit - Y position "+location.getY());
        
        //height and width of button
        WebElement button = driver.findElement(By.xpath("(//span[contains(@class, 'ui-button-text') and text()='Submit'])[2]"));
        Dimension size = button.getSize();

        System.out.println("Button 'Find the height and width of this button' - width: " + size.getWidth());
        System.out.println("Button 'Find the height and width of this button' - height: " + size.getHeight());
        driver.close();
        

	}
}
