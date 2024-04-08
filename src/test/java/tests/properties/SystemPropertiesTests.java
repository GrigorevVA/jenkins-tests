package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SystemPropertiesTests {
    @Test
    void someTest() {
        String someValue = System.getProperty("key"); //system - некое системное хранилище в нашем проекте
        System.out.println(someValue);

        System.setProperty("key", "red value");
        someValue = System.getProperty("key");
        System.out.println(someValue);
    }

    @Test
    void someTest2() {
        step("Create default value", () -> {

            String someValue = System.getProperty("Some key", "blue value");

            System.out.printf(someValue);
        });
    }

    @Test
    void someTest3() {
        Boolean someValue = Boolean.parseBoolean(
                System.getProperty("SomeKey", "true"));
        assertTrue(someValue);
        System.out.println(someValue);
    }

    @Test
    @Tag("properties")
    void someTest4() {
        String browser = System.getProperty("browser");
        System.out.println(browser);

    }
    @Test
    void someTest5() {
        step("Create default value", () -> {

            String browser = System.getProperty("browser", "chrome");
            String version = System.getProperty("version","91");
            String browserSize = System.getProperty("browserSize","300x300");

            System.out.println(browser);
            System.out.println(version);
            System.out.println(browserSize);


        });
}
}
