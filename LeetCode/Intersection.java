package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {
    //两个数组的交集
    public static int[] intersection(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : array2) {
            if (set.contains(num)) {
                arr.add(num);
                set.remove(num);
            }
        }
        int[] res = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }
}
