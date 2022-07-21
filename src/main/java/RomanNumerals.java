public class RomanNumerals {
    public static String convert(int number) {
        String result = new String();

        if (number >= 5) {
            result = "V";
            number -= 5;
        }
        result +=  "I".repeat(number);
        return result;
    }
}
