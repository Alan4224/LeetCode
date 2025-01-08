import java.util.HashMap;
import java.util.Map;

public class L13 {
    public static int romanToInt(String s) {
        Map<Character, Integer> symbols = new HashMap<>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);
        int sum = symbols.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (symbols.get(s.charAt(i)) > symbols.get(s.charAt(i - 1))) {
                sum = sum - symbols.get(s.charAt(i - 1)) * 2 + symbols.get(s.charAt(i));
            } else {
                sum = sum + symbols.get(s.charAt(i));
            }
        }
        return sum;
    }
}
