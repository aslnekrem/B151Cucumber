package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TechproPage {
    public TechproPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='searchHeaderInput']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//span[text()='Mobile Developer']")
    public WebElement mobileDevLink;

    @FindBy(xpath = "(//span[text()='Free Java'])[1]")
    public WebElement freeJavaLink;





}
