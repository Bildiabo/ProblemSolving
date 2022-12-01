public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(roamToInt("MCMXCIV"));
    }

    public static int roamToInt(String s) {
        char[] chars = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] value = {1, 5, 10, 50, 100, 500, 1_000};
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < chars.length; j++) {
                if (s.charAt(i) == chars[j]) {
                    total += value[j];
                }
            }
        }
        if (s.contains("IV"))
            total -= 2;
        if (s.contains("IX"))
            total -= 2;
        if (s.contains("XL"))
            total -= 20;
        if (s.contains("XC"))
            total -= 20;
        if (s.contains("CD"))
            total -= 200;
        if (s.contains("CM"))
            total -= 200;
        return total;
    }}


