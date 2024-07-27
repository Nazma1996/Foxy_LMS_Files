package FoxyLMS_User;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserAccountLMS {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://162.240.148.130:3007");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("field-:r0:")).sendKeys("priya@mailinator.com");    //email address
			driver.findElement(By.id("field-:r1:")).sendKeys("nazma");    // password
			WebElement btn=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[1]/form/div/div[2]/button"));  //login button
			btn.click();
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[1]/div/input")).sendKeys("anything");  // search bar
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[1]/div/div[2]")).click(); //cross button
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[1]/div[2]/p")).click(); //categories
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div/div/button/div/div[2]/p[1]")).click();     //category list
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div/div/button/div/div[2]/p[1]")).click();   //category list
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/div[3]/p")).click();  //My course
			driver.findElement(By.className("css-3zaah6")).click();   //course details
			Thread.sleep(2000);
			WebElement bttn=driver.findElement(By.xpath("//button[@type='button']"));          //Menu bar button
			bttn.click();
			driver.findElement(By.xpath("//button[@class='css-kz4v6u']")).click();             //Setting icon
			driver.findElement(By.name("name")).sendKeys("Radhika");                              //Name
			driver.findElement(By.name("address")).sendKeys("Pune");                                 //Address
		    driver.findElement(By.xpath("//button[@type='submit']")).click();                    //Save
		    Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Security']")).click();                                  //Security
			driver.findElement(By.name("current_pass")).sendKeys("nazma");                                         // Current password
			driver.findElement(By.name("change_pass")).sendKeys("muskan");                                         //new password
			driver.findElement(By.name("rechange_pass")).sendKeys("muskan");                                          //retype password
			//driver.findElement(By.xpath("//button[@type='submit']")).click();                    //save
			driver.findElement(By.xpath("//button[text()='Financial']")).click();                                     //Financial
			WebElement element=driver.findElement(By.xpath("//select[@class='chakra-select css-1a3b7zo']"));
			Select dropdown =new Select(element);
			dropdown.selectByVisibleText("Bank of India");
			//driver.findElement(By.xpath("//input[@id='field-:r22:']")).sendKeys("yh7869") ;                          //IFSC code
			driver.findElement(By.xpath("//input[@type='number']")).sendKeys("6789876440");                     //account number
			driver.findElement(By.xpath("//button[@type='button']")).click();   //camera
			driver.findElement(By.xpath("//button[@type='button']")).click();   //upload
			driver.findElement(By.xpath("//button[@type='button']")).click();          //certificate and document
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div[2]/div[3]/div[3]/div[6]/input")).sendKeys("Pune");                //address
			driver.findElement(By.xpath("//button[@type='button']")).click();     //save
			driver.findElement(By.xpath("//p[text()='Dashboard']")).click();               //dashboard
			driver.findElement(By.xpath("//p[@class='chakra-text css-m5ypl5']")).click();  //Courses
			//driver.findElement(By.xpath("button[@class='css-1200a3a']")).click(); //quizes
			driver.findElement(By.xpath("//p[@class='chakra-text css-m5ypl5']")).click();  // Comments
			driver.findElement(By.xpath("//p[text()='LogOut']")).click();   //log out
			driver.quit();
		
			


	}

}
