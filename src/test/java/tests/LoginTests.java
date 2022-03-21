package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void preCondition(){

        if (app.getHelperUser().isLogOutPresent()){
            app.getHelperUser().logout();
        }
    }

    @Test
    public void loginSuccess(){
//        WebElement loginItem = wd.findElement(By.cssSelector("[href='/login?url=%2Fsearch']"));
//        loginItem.click();
//
//        WebElement emailInput = wd.findElement(By.xpath("//*[@id='email']"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("nataly@gmail.com");
//
//        WebElement passwordInput = wd.findElement(By.xpath("//*[@id='password']"));
//        passwordInput.click();
//        passwordInput.clear();
//        passwordInput.sendKeys("Nat12345$");
//
//        wd.findElement(By.cssSelector("button[type='submit']")).click();
//        wd.findElement(By.xpath("//*[@class='positive-button ng-star-inserted']")).click();
//
//        Assert.assertTrue(wd.findElements(By.xpath("//*[text()=' Logout ']")).size()>0);

    }

    @Test
    public void loginSuccessNew(){

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("nataly@gmail.com","Nat12345$");
        app.getHelperUser().submitLogin();
        app.getHelperUser().pause(1000);//на сколько замереть, 1 секунда
        Assert.assertEquals(app.getHelperUser().checkMessage(),"Logged in success");//проверка по словосочетанию, что в этом случае прошло, смотрим стр.25 в HelperUser
        //app.getHelperUser().submitPositive(); //так как это действие повторяем после каждого теста, то выносим его в отдельный метод, т.е. в @AfterMethod строка 67

        //Assert.assertTrue(isElementPresent(By.xpath("//*[text()=' Logout ']")));
        //Assert.assertTrue(app.getHelperUser().isLoginSuccess());

    }

    @Test
    public void loginSuccessNewS(){

        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("nataly@gmail.com","Nat12345$");
        app.getHelperUser().submitLogin();
        app.getHelperUser().pause(1000);
        Assert.assertEquals(app.getHelperUser().checkMessage(),"Logged in success");
        //app.getHelperUser().submitPositive(); //так как это действие повторяем после каждого теста, то выносим его в отдельный метод, т.е. в @AfterMethod строка 67

        //Assert.assertTrue(app.getHelperUser().isLoginSuccess());
    }

    @AfterMethod
    public void postCondition(){

        app.getHelperUser().submitPositive();
    }
}
