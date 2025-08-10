import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //target = Cur + x (Cur = nums[i])
            int x = target - nums[i];
            if(map.containsKey(x)) return new int[]{map.get(x), i};
            map.put(nums[i], i);
        }
        return null;
    }
}


public class TwoSum {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String[] numsString = input.substring(1, input.length() - 1).split(",");
        int[] nums = new int[numsString.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numsString[i].trim());
        }
        int target = sc.nextInt();

        Solution sl = new Solution();
        int[] indices = sl.twoSum(nums, target);
        System.out.printf("[%d,%d]", indices[0], indices[1]);
    }
}
