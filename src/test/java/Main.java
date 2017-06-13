import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.support.ui.Select;

/**
 * Created by User on 13.06.2017.
 */

public class Main {
    public static WebDriver driver;

    @Before
    public void setUp() {
        String exePath = "C:\\Users\\User\\Documents\\Eclipse Files\\Libraries\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

    }

    @Test
    public void testIt() {

        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("http://trivago.co.uk");

        // get to the page and search
        WebElement searchBox = driver.findElement(By.xpath(".//*[@id='js-fullscreen-hero']/div/form/div[1]/div[2]/div/div[1]/input[3]"));
       // searchBox.sendKeys("Hamburg");


        Actions actions = new Actions(driver);

        actions.click(searchBox).perform();



            // WebElement searchButton = driver.findElement(By.xpath(".//*[@id='js-fullscreen-hero']/div/form/div[1]/div[2]/div/div[2]/button"));

//        Select sel = new Select(driver.findElement(By.xpath(".//*[@id='js-fullscreen-hero']/div/form/div[1]/div[2]/div/div[1]/input[3]")));


            //  sel.selectByVisibleText("Hamburg");

            // searchButton.click();


//import org.openqa.selenium.support.ui.Select;


            // Work with calendars
            //  WebElement calendarFrom = driver.findElement(By.xpath(".//*[@id='js-fullscreen-hero']/div/form[1]/div[1]/div[3]/div/div[1]/button"));
            //  calendarFrom.sendKeys("09252013");
            //  calendarFrom.click();
            //  WebElement CalendarTo = driver.findElement(By.xpath("html/body/div[3]/div/section/div/form[1]/div[1]/div[3]/div/div[2]/button"));

            //     CalendarFrom.click();

            //      CalendarTo.click();
            // Select from date
            // driver.findElement(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div/form[1]/div[2]/div[2]/div/table/tbody/tr[3]/td[1]/time")).click();

            // select to date
            // driver.findElement(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div/form[1]/div[2]/div[2]/div/table/tbody/tr[4]/td[1]/time")).click();

            //close calendar
            // driver.findElement(By.xpath("//*[@id=\"js-fullscreen-hero\"]/div/form[1]/div[2]/div[1]/button/span[1]")).click();


            // WebElement dateFrom = driver.findElement(By.xpath(""));
            // WebElement dateTo = driver.findElement(By.xpath(""));



/*
        List<WebElement> lst = driver.findElements(By.xpath(".//*[@id='js-fullscreen-hero']/div/form/div[1]/div[2]/div/div[1]/input[3]"));
        for (WebElement webElement : lst) {
            if (webElement.getText().equalsIgnoreCase("Hamburg"))
                webElement.click();
        }

*/


        }


    /*
        @After
        public void tearDown(){
            driver.quit();
        }
    */


        //METHOD FOR AUTOSELECT
        @Test
        public void test() {


WebDriver driver=new ChromeDriver();


driver.get("http://www.naukri.com");

// Type something on Skill textbox
driver.findElement(By.id("qp")).sendKeys("test");

// Create object on Actions class
Actions builder=new Actions(driver);

// find the element which we want to Select from auto suggestion
WebElement ele=driver.findElement(By.xpath(".//*[@id='autosuggest']/ul/li[2]/a"));

// use Mouse hover action for that element
builder.moveToElement(ele).build().perform();


// finally click on that element
builder.click(ele).build().perform();
}


}
