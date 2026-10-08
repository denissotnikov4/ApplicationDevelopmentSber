package FifthLecture.AI;

import java.util.HashMap;
import java.util.Map;

public class AIDecisionTwoSumTask {
    public int[] twoSumV1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("Решение не найдено");
    }

    public int[] twoSumV2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            Integer previousIndex = map.get(needed);

            if (previousIndex != null) {
                return new int[]{previousIndex, i};
            }

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Решение не найдено");
    }
}
