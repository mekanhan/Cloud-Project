package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MekanHomePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/form/div[1]/div[1]/input")
    public static WebElement userNameInput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/form/div[1]/div[2]/input")
    public static WebElement passwordInput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div/div/form/div[2]/span[1]/button")
    public static WebElement signInButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/form/input[1]")
    public static WebElement title;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/form/textarea")
    public static WebElement postDescription;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/form/input[2]")
    public static WebElement submitButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/div[4]/span[2]/button[1]")
    public static WebElement deleteButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/div[1]/span[2]/button[2]")
    public static WebElement editButton;



}


