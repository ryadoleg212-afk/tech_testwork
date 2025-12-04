package vkvideo;

import org.junit.jupiter.api.Test;
import vkvideo.pages.MainVkVideo;

public class VkVideo extends BaseTest {

    MainVkVideo mainPage = new MainVkVideo();

    @Test
    void testItalyVpn() {mainPage.testVkVideo();}

}
