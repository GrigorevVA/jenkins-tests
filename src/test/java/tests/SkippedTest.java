package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkippedTest {
    @Test
    @Disabled
    void test00() {
        assertTrue(false);

    }

    @Test
    @Disabled("I can't start")
    void test01() {
        assertTrue(false);


}
}
