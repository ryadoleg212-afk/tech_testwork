package vpn.pages;

import com.codeborne.selenide.SelenideElement;


import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.appium.SelenideAppium.$x;

public class MainVPN {

    private final  SelenideElement accept = $x("//android.widget.Button[@resource-id='android:id/button1']");
    private final  SelenideElement consent = $x("//android.widget.Button[@content-desc='Consent']");
    private final  SelenideElement button = $x("//android.widget.ImageView[@resource-id='com.helalik.italy.vpn:id/lottie']");
    private final  SelenideElement advertising = $x("//android.view.View[@resource-id='dismiss-button']");
    private final  SelenideElement shareApp = $x("//android.widget.ImageView[@resource-id='com.helalik.italy.vpn:id/ImageView1']");
    private final  SelenideElement connected = $x("//android.widget.TextView[@resource-id='com.helalik.italy.vpn:id/TextView4']");

    public void testVpnItaly (){
        sleep(5000);
        if (accept.isDisplayed()) {
            accept.click();
        }
        consent.click();
        button.click();
        sleep(10000);
        try {
            advertising.shouldBe(visible, Duration.ofSeconds(45)).click();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Ошибка загрузки или закрытия рекламы");
        }
        shareApp.click();
        if (connected.isDisplayed()){
            System.out.println("Connected");
        }else System.out.println("Disconnected");


    }


}
