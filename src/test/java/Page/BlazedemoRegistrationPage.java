package Page;

import org.openqa.selenium.WebDriver;

public class BlazedemoRegistrationPage {
    public BlazedemoRegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    BasePage basePage;

    public void registration(String userName, String password){
        basePage  = new BasePage(driver);
        driver.get("https://www.demoblaze.com/");
        basePage.checkPageTitle("STORE");
        basePage.clickOnElement("id","signin2");
        basePage.insertInto("id", "sign-username", userName);
        basePage.insertInto("id", "sign-password", password);
        basePage.clickOnElement("css", "[onclick = 'register()']");

    }

}
