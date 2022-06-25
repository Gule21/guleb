package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//Step 1) Go to Guru99 Demo Site http://demo.guru99.com/V4/
//Step 2) In Login page check text "Guru99 Bank" is present
//Step 3) Login into application with given credentials(you need to enter your email in order to get credentials in advance)
//User ID :	mngr417754
//Password :mezUqes

    @FindBy(xpath = "//h2[@class='barone']")
    public WebElement guru99BankText;

    @FindBy(name ="uid")
    public WebElement inputUserId;

    @FindBy(name ="password")
    public WebElement inputPassword;

    @FindBy(name ="btnLogin")
    public WebElement buttonLogin;

    public HomePage(WebDriver driver){ // in order bring  driver to this class we need to create constructor
        PageFactory.initElements(driver,this);  // init all the web elements in this page , we dont need to call one by one
    }

    public String getGuru99BankText(){

        return guru99BankText.getText();  // will give us a text that present in guru99BankText web element

    }
   public void enterUserName(String userName){ // parameter is to read the username from properties reading util
       inputUserId.sendKeys(userName);
    }
    public void enterPassword(String password){
        inputPassword.sendKeys(password);
    }
    public void clickOnLogin(){
        buttonLogin.click();
    }



}
