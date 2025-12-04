package vkvideo.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.appium.SelenideAppium.$x;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

public class MainVkVideo {
    private final SelenideElement closevideo = $x("//android.widget.ImageView[@resource-id='com.vk.vkvideo:id/close_btn_left']");
    private final SelenideElement closereg = $x("//android.widget.Button[@resource-id='com.vk.vkvideo:id/fast_login_tertiary_btn']");
    private final SelenideElement video01 = $x("(//android.widget.ImageView[@resource-id='com.vk.vkvideo:id/preview'])[1]");
    private final SelenideElement ok = $x("//android.widget.FrameLayout[@resource-id='com.vk.vkvideo:id/video_subtitles']");

    public void testVkVideo (){
        sleep(10000);
        if (closevideo.isDisplayed()) {
            closevideo.click();
        }
        closereg.shouldBe(visible, Duration.ofSeconds(45)).click();
        video01.shouldBe(visible, Duration.ofSeconds(45)).click();
        try{
            ok.shouldBe(visible, Duration.ofSeconds(45));
            System.out.println("Видео запустилось");
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Ошибка загрузки");
        }




    }



}
