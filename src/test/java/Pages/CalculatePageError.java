package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CalculatePageError {
    public WebDriver driver;
    public CalculatePageError (WebDriver driver) throws IOException {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[1]/tbody/tr[2]/td[2]/div/div[1]")
    private WebElement findButtonSin;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")
    private WebElement findButtonEqual;

    public void clickButtonsError()  {
        findButtonSin.click();
        findButtonEqual.click();
    }
}
