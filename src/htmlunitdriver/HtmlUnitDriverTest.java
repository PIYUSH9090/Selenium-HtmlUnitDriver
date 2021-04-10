package  htmlunitdriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;	
public class HtmlUnitDriverTest {				
	public static void main(String[] args) {
         // Creating a new instance of the HTML unit driver
                      
			HtmlUnitDriver driver = new HtmlUnitDriver();
			
           	// Navigate to Google		
            driver.get("https://www.youtube.com/");					
          
            // This code will print the page title		
            System.out.println("Title is: " + driver.getTitle());		
                    
            driver.quit();			
         }		
}