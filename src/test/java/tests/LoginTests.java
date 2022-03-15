package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginSuccess(){
        WebElement loginItem = wd.findElement(By.cssSelector("[href='/login?url=%2Fsearch']"));
        loginItem.click();

        WebElement emailInput = wd.findElement(By.xpath("//*[@id='email']"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys("nataly@gmail.com");

        WebElement passwordInput = wd.findElement(By.xpath("//*[@id='password']"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("Nat12345$");

        wd.findElement(By.cssSelector("button[type='submit']")).click();
        wd.findElement(By.xpath("//*[@class='positive-button ng-star-inserted']")).click();

        Assert.assertTrue(wd.findElements(By.xpath("//*[text()=' Logout ']")).size()>0);

    }

    @Test
    public void loginSuccessNew(){
        click(By.cssSelector("[href='/login?url=%2Fsearch']"));
        type(By.xpath("//*[@id='email']"),"nataly@gmail.com");
        type(By.xpath("//*[@id='password']"),"Nat12345$");
        click(By.cssSelector("button[type='submit']"));
        click(By.xpath("//*[@class='positive-button ng-star-inserted']"));

        Assert.assertTrue(isElementPresent(By.xpath("//*[text()=' Logout ']")));

    }
}
