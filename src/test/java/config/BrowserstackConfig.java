package config;

import org.aeonbits.owner.Config;
@Config.Sources ({
      // "system:properties",
        "classpath:browserStackMobileDriver.properties"
})
public interface BrowserstackConfig extends Config {

    @Key("username")
    @DefaultValue("testingtest_C1KlNE")
    String username();

    @Key("key")
    @DefaultValue("sAq7zr5P82sMBqVyxemW")
    String key();

    @Key("appinbrowserstack")
    @DefaultValue("bs://15bddad35bfca1563c8ef20c6e7ce50db858f4cf")
    String appinbrowserstack();

    @Key("projectinbrowserstack")
    @DefaultValue("Congratulation work by AGordey")
    String projectinbrowserstack();

    @Key("buildinbrowserstack")
    @DefaultValue("browserstack-build-1")
    String buildinbrowserstack();

    @Key("nameinbrowserstack")
    @DefaultValue("selenide android test")
    String nameinbrowserstack();
}
