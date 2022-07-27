package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.EnviromentConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static org.apache.commons.io.FileUtils.copyInputStreamToFile;

public class LocalMobileDriver implements WebDriverProvider {

    public static URL getAppiumServerUrl() {
        try {
            return new URL(config2.HostUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    static EnviromentConfig config2 = ConfigFactory
            .create(EnviromentConfig.class, System.getProperties());

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        File app = getApp();

        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setPlatformName("Android");
        options.setDeviceName(config2.DeviceName());
        options.setPlatformVersion(config2.PlatformVersion());
        options.setApp(app.getAbsolutePath());
        options.setAppPackage("com.twentyonevek");
        options.setAppActivity("com.twentyonevek.MainActivity");

        return new AndroidDriver(getAppiumServerUrl(), options);
    }

    private File getApp() {
        String appUrl = "https://cloud.mail.ru/public/3LyY/5mQ9kAB9X";
        String appPath = "src/test/resources/apps/21vek (1.6.9).apk";

        File app = new File(appPath);
        if (!app.exists()) {
            try (InputStream in = new URL(appUrl).openStream()) {
                copyInputStreamToFile(in, app);
            } catch (IOException e) {
                throw new AssertionError("Failed to download application", e);
            }
        }
        return app;
    }
}
