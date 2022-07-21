import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    @Test
    @DisplayName("converts 1 to I")
    void convertOne() {
        String result = RomanNumerals.convert(1);

        assertEquals("I", result);
    }

    @Test
    @DisplayName("converts 2 to II")
    void convertTwo() {
        String result = RomanNumerals.convert(2);

        assertEquals("II", result);
    }
    @Test
    @DisplayName("converts 3 to III")
    void convertThree() {
        String result = RomanNumerals.convert(3);

        assertEquals("III", result);
    }

    @Test
    @DisplayName("converts 5 to V")
    void convertFive() {
        String result = RomanNumerals.convert(5);

        assertEquals("V", result);
    }
}