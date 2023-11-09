package utils;

import pages.InvalidLoginPage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static InvalidLoginPage invalidLoginPage;


    public static void initializePageObjects(){
        loginPage = new LoginPage();
    }
}
