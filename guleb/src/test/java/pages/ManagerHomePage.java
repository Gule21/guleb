package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerHomePage {
//Step 4) Verify that the Home page contains text as "Manger Id: mngr368294"
// Step 5) Click on new customer button


    @FindBy(xpath = "//tr[@class='heading3']/td")
    public WebElement managerIdText;

    @FindBy(xpath = "//a[@href='addcustomerpage.php']")
    public WebElement newCustomerButton;

    public String getManagerIdText(){

        return managerIdText.getText();
    }

    public void clickOnNewCustomerButton(){
        newCustomerButton.click();
    }

    public ManagerHomePage(WebDriver driver){ // in order bring  driver to this class we need to create constructor
        PageFactory.initElements(driver,this);  // init all the web elements in this page , we dont need to call one by one
    }
}
