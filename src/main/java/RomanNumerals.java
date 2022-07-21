public class RomanNumerals {
    public static String convert(int number) {
        if (number == 5) { return "V"; }

        return "I".repeat(number);
    }
}
