package LeetCode;

class SortarrayByParity {
    //按奇偶排序数组
    public static int[] sortarrayByParity(int[] array) {
        int[] ans = new int[array.length];
        int t = 0;

        for (int i = 0; i < array.length; ++i)
            if (array[i] % 2 == 0)
                ans[t++] = array[i];

        for (int i = 0; i < array.length; ++i)
            if (array[i] % 2 == 1)
                ans[t++] = array[i];

        return ans;
    }
}