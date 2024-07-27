package FoxyLMS_User;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://162.240.148.130:3007/#/admin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("username")).sendKeys("admin");    //email address
		driver.findElement(By.name("password")).sendKeys("admin");    // password
		driver.findElement(By.xpath("//button[@type='submit']")).click();  //login
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();    //menu bar
		driver.findElement(By.xpath("//button[@class='css-kz4v6u']")).click();  //setting icon
		driver.findElement(By.xpath("//p[text()='Courses']")).click();   //courses
		driver.findElement(By.xpath("//button[@class='css-tlcndd']")).click();  //course details
		driver.findElement(By.xpath("//button[text()='Add Chapter']")).click();   //Add chapter button
		driver.findElement(By.xpath("//input[@placeholder='Add Chapter']")).sendKeys("Chapter 8");
		driver.findElement(By.xpath("//button[@class='chakra-button css-t84yfq']")).click();
		//driver.findElement(By.xpath("//input[@name='file_title']")).sendKeys("Core java");
		//driver.findElement(By.xpath("//input[@type='file']")).click();
		driver.findElement(By.xpath("//p[text()='Courses']")).click();
		driver.findElement(By.xpath("//button[text()=' Add Course  ']")).click();      //add course
		driver.findElement(By.xpath("//input[@name='courseimg']")).sendKeys("C:\\Users\\HP\\Pictures\\Saved Pictures");    //image
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Geography");     //title
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/form/div[3]/textarea")).sendKeys("Earth");  //description
		WebElement element=driver.findElement(By.xpath("//select[@name='industry']"));         //drop down
		Select dropdown =new Select(element);
		dropdown.selectByVisibleText("Pharma");           //choose option
		driver.findElement(By.xpath("//button[text()='Add Course']")).click();      //add course submit button
		driver.findElement(By.xpath("//button[@class='chakra-modal__close-btn css-1ik4h6n']")).click();    //cross button
		driver.findElement(By.xpath("//button[text()='Edit']")).click();        //edit course
    	driver.findElement(By.id("field-:rr:")).sendKeys("C:\\\\Users\\\\HP\\\\Pictures\\\\Saved Pictures");       //choose file
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("History");                         //title
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/form/div[3]/textarea")).sendKeys("Educational");     //description
		WebElement e=driver.findElement(By.xpath("//select[@name='industry']"));         //drop down
		Select dd =new Select(e);
		dd.selectByVisibleText("Health");
		driver.findElement(By.xpath("//button[@typt='submit']")).click();         //edit button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//p[text()='Courses']")).click();
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		driver.findElement(By.xpath("//p[text()='Quizzes']")).click();
		driver.findElement(By.xpath("//button[text()='Add Quiz']")).click();
		driver.findElement(By.name("title")).sendKeys("Transportation");
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/form/div[2]/div/textarea")).sendKeys("bridge engineering");
		driver.findElement(By.name("duration")).sendKeys("120 mins");
		WebElement el=driver.findElement(By.xpath("//select[@name='chapter_id']"));         //dropdown
		Select drpdn =new Select(el);
		drpdn.selectByVisibleText("Chapters 1");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div/div/div[1]/button[2]")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@name='quiz_id']"));         //dropdown
		Select drpd =new Select(ele);
		drpd.selectByVisibleText("civil engineering");         
		driver.findElement(By.name("question")).sendKeys("What is a bridge");       //question
		driver.findElement(By.xpath("//button[text()='Add option']")).click();         //add option button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/form/div[3]/div[1]/input")).sendKeys("Bridge");   //option
		WebElement elem=driver.findElement(By.xpath("//select[@name='correct_option']"));         // options dropdown
		Select drpdon =new Select(elem);
		drpdon.selectByVisibleText("jh");
		driver.findElement(By.name("marks")).sendKeys("4");                    //marks
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[text()='Question']")).click();
		driver.findElement(By.xpath("//p[text()='Comments']")).click();
		driver.findElement(By.xpath("//p[text()='Logout']")).click();
		driver.close();
		

	}

}
