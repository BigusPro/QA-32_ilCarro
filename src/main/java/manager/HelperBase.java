package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void type(By locator, String text) {
        if (text != null) {
            WebElement element = wd.findElement(locator);
            element.click();
            element.clear();
            element.sendKeys(text);
        }
    }
    public void click(By locator){
        wd.findElement(locator).click();
    }

    public boolean isElementPresent(By locator){
        return wd.findElements(locator).size()>0;
    }

    //вызов паузы, как заставляет замереть, милисекунды
    public void pause(int millis){
        try {
            Thread.sleep(millis);   //если sleep красного цвета, то alt+enter->Surround try/catch
        } catch (InterruptedException e) {  //Thread это поток в котором исполняется наша программа
            e.printStackTrace();
        }
    }
}
