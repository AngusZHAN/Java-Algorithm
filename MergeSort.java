public class MergeSort {
    public static void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        mergeProcess(array, 0, array.length - 1);
    }

    private static void mergeProcess(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (left + right) / 2;
        mergeProcess(array, left, mid);
        mergeProcess(array, mid + 1, right);
        //这个是一个优化，防止一开始数组有序.
        if (array[mid] > array[mid + 1]) {
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] help = new int[right - left + 1];
        int k = 0;
        int p1 = left, p2 = mid + 1;
        //while(p1 <= mid && p2 <= R)
        //   help[k++] = array[p1] < array[p2]  ? array[p1++] : array[p2++];
        while (p1 <= mid && p2 <= right) {
            //左右两边相等的话，就先拷贝左边的(实现稳定性)
            help[k++] = array[p1] <= array[p2] ? array[p1++] : array[p2++];
        }
        while (p1 <= mid) {
            //左边剩余的部分
            help[k++] = array[p1++];
        }
        while (p2 <= right) {
            //右边剩余的部分
            help[k++] = array[p2++];
        }
        for (int i = 0; i < k; i++) {
            //拷贝回原来的数组
            array[i + left] = help[i];
        }
    }
}