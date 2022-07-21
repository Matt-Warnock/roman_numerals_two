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
}