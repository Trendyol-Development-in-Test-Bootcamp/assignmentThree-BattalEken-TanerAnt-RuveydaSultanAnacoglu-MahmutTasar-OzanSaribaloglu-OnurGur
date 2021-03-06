package pageModel;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {
    public BasePage(){
        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;
        //Configuration.headless = true;
        Configuration.timeout = 20000;
    }

    SelenideElement findById(String id){ return $(By.id(id)); }
    SelenideElement findByClassName(String className){ return $(By.className(className)); }
    SelenideElement findByCss(String css){ return $(By.cssSelector(css)); }
    SelenideElement findByXpath(String xpath){ return $(By.xpath(xpath)); }

    public void clickElement(SelenideElement element){
        element.click();
    }

    public void setText(SelenideElement element,String text){
        element.sendKeys(text);
    }

    public void sendKeyboardKey(SelenideElement element){
        element.sendKeys();
    }

    public String getText(SelenideElement element){
        return element.getText();
    }

    public void hoverElement(SelenideElement element){
        element.hover();
    }


}


