package utils;

import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

public class Hooks {
    @Before
    public void setUp() {
        DriverFactory.setDriver();
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            byte[] sourcepath =((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcepath, "image/png", scenario.getName());
        }
        DriverFactory.quitDriver();
    }

}
