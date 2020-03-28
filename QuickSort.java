public class QuickSort {
    public static void sort(int[] array) {
        if (array == null || array.length <= 0) {
            return;
        }
        quickProcess(array, 0, array.length - 1);
    }

    private static void quickProcess(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        //随机选取一个pivot
        swap(array, left, left + (int) (Math.random() * (right - left + 1)));
        int pivot = partition(array, left, right);
        quickProcess(array, left, pivot - 1);
        quickProcess(array, pivot + 1, right);
    }

    private static int partition(int[] array, int left, int right) {
        int key = array[left];
        int pivot = left;
        for (int i = left + 1; i <= right; i++) {
            if (array[i] < key) {
                swap(array, i, ++pivot);
            }
        }
        swap(array, pivot, left);
        return pivot;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}