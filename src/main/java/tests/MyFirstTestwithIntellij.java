package tests;

import core.BaseTest;
import org.junit.Test;
import pages.LoginPage;
import pages.MenuPage;

public class MyFirstTestwithIntellij extends BaseTest {
    MenuPage menuPage = new MenuPage();
    LoginPage menuLogin = new LoginPage();

    @Test
    public void acessarSite(){
        menuLogin.acessarTelaInicial();
    }
}
