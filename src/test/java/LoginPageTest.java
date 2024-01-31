import lt.techin.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class LoginPageTest extends BasePageTest{

    @Test
    void testUsernamePasswordAndLoginButton(){
        HomePage homePage = new HomePage(driver);
        homePage.enterUsername("Admin");
        palaukti();

        homePage.enterPassword("admin123");
        palaukti();
        homePage.clickButtonLogin();
        palaukti();

        String actualTitle = homePage.getTitle();
        String expectedTitle = "Dashboard";
        Assertions.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    void testIncorrectUsernameAndPassword(){
        HomePage homePage = new HomePage(driver);
        homePage.enterUsername("Adminas");
        palaukti();

        homePage.enterPassword("admin12345");
        palaukti();
        homePage.clickButtonLogin();
        palaukti();
    }
}
