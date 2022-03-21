package tests;

import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

    @Test
    public void registrationSuccess(){
        app.getHelperUser().openRegistrationForm();
        app.getHelperUser().fillRegistrationForm("Big","Bum","bigbum@gmail.com","Bb12345$");




    }
}
