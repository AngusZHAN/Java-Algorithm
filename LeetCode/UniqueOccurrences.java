package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {
    public static boolean uniqueOccurrences(int[] array) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Set<Integer> set = new HashSet<Integer>();
        
        // 记录出现次数
        for(int data :array) {
            if (map.get(data) == null) { map.put(data, 1); }
            else { map.put(data, map.get(data) + 1); }
        }
        
        // 验证重复值
        for(Integer i : map.values()) {
            if (!set.add(i)) { return false; }
        }
        return true;
    }
}