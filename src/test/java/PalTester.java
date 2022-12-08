import org.junit.jupiter.api.*;

import static com.forthreal.PalChecker.palCheckSmpl;
import static com.forthreal.PalChecker.hasPal;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PalTester {
    @Test
    @Order(0)
    @DisplayName("Check if \"weew\" is a palindrome")
    void palindromeCheck1() {
        Assertions.assertTrue(palCheckSmpl("weew"));
    }

    @Test
    @Order(1)
    @DisplayName("Check if \"w1eew\" is not a palindrome")
    void palindromeCheck2() {
        Assertions.assertFalse(palCheckSmpl("w1eew"));
    }

    @Test
    @Order(2)
    @DisplayName("Check if \"X234ferref34562\" contains a palindrome")
    void palindromeCheck3() {
        Assertions.assertTrue(hasPal("X234ferref34562"));
    }

    @Test
    @Order(3)
    @DisplayName("Check if \"X234fexrfref34562\" does not contain a palindrome")
    void palindromeCheck4() {
        Assertions.assertTrue(hasPal("X234fexrfref34562"));
    }
}
