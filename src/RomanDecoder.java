
import java.util.HashMap;

class Solution {

    int total;
    HashMap<Character, Integer> roInt = new HashMap<>();

    public Solution() {
        this.total = 0;
        roInt.put('I', 1);
        roInt.put('V', 5);
        roInt.put('X', 10);
        roInt.put('L', 50);
        roInt.put('C', 100);
        roInt.put('D', 500);
        roInt.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = roInt.get(s.charAt(s.length() - 1)); // Start with the last character's value
        
        for (int i = s.length() - 2; i >= 0; i--) {
            int current = roInt.get(s.charAt(i));
            int prev = roInt.get(s.charAt(i + 1));
            
            if (current < prev) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }
}

public class RomanDecoder {

    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.romanToInt("VIII"));
    }
}
