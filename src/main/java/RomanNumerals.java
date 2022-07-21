public class RomanNumerals {
    public static String convert(int number) {
        String result = new String();


        while (number >= 10) {
            result += "X";
            number -= 10;
        }

        if (number >= 5) {
            result += "V";
            number -= 5;
        }

        result +=  "I".repeat(number);
        return result;
    }
}
