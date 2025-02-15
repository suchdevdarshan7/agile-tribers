mport java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution4 {
    public static List<int[]> findPairs(int[] nums, int target) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                result.add(new int[]{map.get(value), i});
            }
            map.put(nums[i], i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 7, 8, 5, 4, 1, 3};
        int target = 9;
        
        List<int[]> pairs = findPairs(nums, target);
        for (int[] pair : pairs) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]");
        }
    }
}
