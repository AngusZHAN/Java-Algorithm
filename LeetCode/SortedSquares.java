package LeetCode;

import java.util.Arrays;

public class SortedSquares {
    public static int[] sortedSquares(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * array[i];
        }
        Arrays.sort(result);
        return result;
    }
}