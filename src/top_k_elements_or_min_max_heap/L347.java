package top_k_elements_or_min_max_heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        map.forEach((num, count) -> {
            if (bucket[count] == null)
                bucket[count] = new ArrayList<>();
            bucket[count].add(num);
        });
        List<Integer> result = new ArrayList<>();
        for (int i = bucket.length - 1; i > 0 && result.size() < k; i--) {
            if (bucket[i] != null)
                result.addAll(bucket[i]);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
