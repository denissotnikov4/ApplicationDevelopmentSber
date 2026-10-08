package FifthLecture.SelfDesicion;

import java.util.HashMap;
import java.util.Map;

public class SelfDecisionTwoSumTask {
    public int[] twoSumV1(int[] nums, int target) {
        for (var i = 0; i < nums.length; i++)
        {
            for (var j = 0; j < nums.length; j++)
            {
                if (i == j)
                    continue;

                if (nums[i] + nums[j] == target)
                    return new int[] { i, j };
            }
        }

        return new int[] {};
    }

    public int[] twoSumV2(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }

            seen.put(nums[i], i);
        }

        return new int[0];
    }
}
