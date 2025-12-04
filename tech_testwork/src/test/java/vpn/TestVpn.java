package vpn;

import org.junit.jupiter.api.Test;
import vpn.pages.MainVPN;

public class TestVpn extends BaseTest {

    MainVPN mainPage = new MainVPN();

    @Test
    void testItalyVpn() {mainPage.testVpnItaly();}

}

