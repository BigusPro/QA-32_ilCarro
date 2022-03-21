package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase{

    public HelperUser(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {
        click(By.xpath("//a[text()=' Log in ']"));
    }

    public void fillLoginForm(String email, String password){
        type(By.xpath("//*[@id='email']"),email);
        type(By.xpath("//*[@id='password']"),password);
    }

    public void submitLogin() {
        click(By.cssSelector("button[type='submit']"));
    }

    public String checkMessage() {
        return wd.findElement(By.cssSelector(".dialog-container h2")).getText();
    }

    public void submitPositive() {

        click(By.xpath("//*[@class='positive-button ng-star-inserted']"));
    }

    public boolean isLogOutPresent() {

        return isElementPresent(By.xpath("//*[text()=' Logout ']"));
    }

    public void logout() {
        click(By.xpath("//*[text()=' Logout ']"));
    }

    public void openRegistrationForm() {

        click(By.cssSelector("[href='/registration?url=%2Fsearch']"));
    }

    public void fillRegistrationForm(String name, String lastname, String email, String password) {
        type(By.xpath("//*[@id='name']"),name);
        type(By.xpath("//*[@id='lastName']"),lastname);
        type(By.xpath("//*[@id='email']"),email);
        type(By.xpath("//*[@id='password']"),password);
    }



}