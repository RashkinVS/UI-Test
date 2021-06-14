package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class GooglePage {
    public WebDriver driver;
    public GooglePage(WebDriver driver) throws IOException {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(name = "q")
    private WebElement findCombobox;

    @FindBy(name = "btnK")
    private WebElement findButtonSearch;

    public void clickAndSetString()  {
        findCombobox.sendKeys("Калькулятор");
        findButtonSearch.click();

    }
}
