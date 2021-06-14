package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CalculatePageDivisionByZero {
    public WebDriver driver;
    public CalculatePageDivisionByZero (WebDriver driver) throws IOException {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[3]/div/div")
    private WebElement findButton6;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")
    private WebElement findButtonDivision;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[1]/div/div")
    private WebElement findButton0;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")
    private WebElement findButtonEqual;

    public void clickButtonsDivisionByZero()  {
        findButton6.click();
        findButtonDivision.click();
        findButton0.click();
        findButtonEqual.click();
    }
}
