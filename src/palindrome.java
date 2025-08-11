
class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int originalNum = x;
        long reversedNum = 0; // Use long to prevent integer overflow for large numbers

        while (x != 0) {
            reversedNum = reversedNum * 10 + x % 10;
            x /= 10;
        }
        return originalNum == (int) reversedNum;
    }
}

public class palindrome {
    public static void main(String[] args) {
        Solution sl = new Solution();
        System.out.println(sl.isPalindrome(121));
    }
}
