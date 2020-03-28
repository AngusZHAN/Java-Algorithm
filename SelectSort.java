public class SelectSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i; //记录最小值下标
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}