import java.util.*;
public class maxsubprod {
    public static int maxProduct(List<Integer> nums) {
        if (nums.isEmpty())
            return 0;
        int maxSoFar = nums.get(0);
        int minSoFar = nums.get(0);
        int result = maxSoFar;
        for (int i = 1; i < nums.size(); i++) {
            int curr = nums.get(i);
            int tempMax = Math.max(curr, Math.max(maxSoFar * curr, minSoFar * curr));
            minSoFar = Math.min(curr, Math.min(maxSoFar * curr, minSoFar * curr));
            maxSoFar = tempMax;
            result = Math.max(maxSoFar, result);
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, -2,3,4);
        int maxProduct = maxProduct(nums);
        System.out.println("Max Product: " + maxProduct);
    }
}
