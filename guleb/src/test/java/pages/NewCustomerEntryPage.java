package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerEntryPage {

//    Step 6) Fill the information for new customer
//    Step 7) Verify new customer added sucessfully

    @FindBy(name = "name")
    public WebElement inputCustomerName;

    @FindBy(xpath = "//input[@value='f']") //by default male radiobutton is selected , no need xpath
    public WebElement radioButtonFemale;

    @FindBy(id="dob")
    public WebElement inputDateOfBirth;

    @FindBy(name="addr")
    public WebElement inputAddress;

    @FindBy(name="city")
    public WebElement inputCity;

    @FindBy(name="state")
    public WebElement inputState;

    @FindBy(name="pinno")
    public WebElement inputPin;

    @FindBy(name="telephoneno")
    public WebElement inputMobileNumber;

    @FindBy(name="emailid")
    public WebElement inputEmail;

    @FindBy(name="password")
    public WebElement inputPassword;

    @FindBy(name="sub")
    public WebElement buttonSubmit;

    public NewCustomerEntryPage(WebDriver driver){ // in order bring  driver to this class we need to create constructor
        PageFactory.initElements(driver,this);  // init all the web elements in this page , we dont need to call one by one
        //Constructor should first method in the page
    }

public void newCustomerInfo(){
    inputCustomerName.sendKeys("Guru");
    radioButtonFemale.click();
    inputDateOfBirth.sendKeys("0019870812");
    inputAddress.sendKeys("21 Guru St");
    inputCity.sendKeys("Toronto");
    inputState.sendKeys("Canada");
    inputPin.sendKeys("213421");
    inputMobileNumber.sendKeys("4165464332");
    inputEmail.sendKeys("guru991@gmail.com");
    inputPassword.sendKeys("Selenium");
    buttonSubmit.click();

}

}

