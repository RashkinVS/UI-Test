package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CalculatePageIntegerOperations {
    public WebDriver driver;
    public CalculatePageIntegerOperations(WebDriver driver) throws IOException {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[1]/div/div")
    private WebElement findButtonOpenBracket;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[1]/div/div")
    private WebElement findButton1;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[4]/div/div")
    private WebElement findButtonPlus;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div")
    private WebElement findButton2;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[2]/div/div")
    private WebElement findButtonCloseBracket;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[4]/div/div")
    private WebElement findButtonMultiplication;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[3]/div/div")
    private WebElement findButton3;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[4]/div/div")
    private WebElement findButtonMinus;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[1]/div/div")
    private WebElement findButton4;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[1]/div/div")
    private WebElement findButton0;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")
    private WebElement findButtonDivision;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[2]/div/div")
    private WebElement findButton5;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")
    private WebElement findButtonEqual;

    public void clickButtonsIntegerOperations()  {
        findButtonOpenBracket.click();
        findButton1.click();
        findButtonPlus.click();
        findButton2.click();
        findButtonCloseBracket.click();
        findButtonMultiplication.click();
        findButton3.click();
        findButtonMinus.click();
        findButton4.click();
        findButton0.click();
        findButtonDivision.click();
        findButton5.click();
        findButtonEqual.click();
    }
}
