package testCase;

import base.TestBase;
import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ManagerHomePage;
import pages.NewCustomerEntryPage;

import java.io.IOException;

public class lab13 extends TestBase {

    //    POM Example TEST - Share Github Link for this
    //    Step 1) Go to Guru99 Demo Site http://demo.guru99.com/V4/
    //    Step 2) In Login page check text "Guru99 Bank" is present
    //    Step 3) Login into application with given credentials(you need to enter your email in order to get credentials in advance)
    //User ID :	mngr417754
    //Password :mezUqes
    //    Step 4) Verify that the Home page contains text as "Manger Id: mngr417754"
    //    Step 5) Click on new customer button and verify you are in New Customer Entry Page
    //    Step 6) Fill the information for new customer
    //    Step 7) Verify new customer added sucessfully

    @Test  //test case can run with TestNG
    public void test() throws IOException, InterruptedException {

        setup();
        driver.get(propertiesReadingUtil.url);
        HomePage homePage = new HomePage(driver); // initilazite all the web elements from homepage

        if(homePage.getGuru99BankText().equals("Guru99 Bank")){
            System.out.println("Guru99Bank text is present in home page");
        }

        homePage.enterUserName(propertiesReadingUtil.userName);
        homePage.enterPassword(propertiesReadingUtil.password);
        homePage.clickOnLogin();
        Thread.sleep(2000);

        ManagerHomePage managerHomePage = new ManagerHomePage(driver);

        if(managerHomePage.getManagerIdText().equals("Manger Id : mngr417754")){
            System.out.println("Manager Id is displayed");
        }
        managerHomePage.clickOnNewCustomerButton();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        managerHomePage.clickOnNewCustomerButton();
        //driver.switchTo().frame("ad_iframe"); //id="ad_iframe"
        //driver.findElement(By.xpath("//span[text()='Close']")).click();
        Thread.sleep(2000);
       if(driver.getTitle().equals("Guru99 Bank New Customer Entry Page")){
           System.out.println("Verified New Customer Entry Page is Opened");
       }
        NewCustomerEntryPage newCustomerEntryPage = new NewCustomerEntryPage(driver);
       newCustomerEntryPage.newCustomerInfo();
       Thread.sleep(2000);
        System.out.println("Customer Id is : "+ driver.findElement(By.xpath("//td[text()='Customer ID']/../td[2]")).getText());

    }


}
