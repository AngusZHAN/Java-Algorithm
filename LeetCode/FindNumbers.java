package LeetCode;

public class FindNumbers {
    //统计位数为偶数的数
    public static int findNumbers(int[] array) {
        int count = 0;
        for (int i : array) {
            if (String.valueOf(i).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}