
public class HeapSort {
    public static void sort(int[] array) {
        if (array == null || array.length <= 1) return;
        for (int i = 0; i < array.length; i++) {
            siftUp(array, i);
        }
        int size = array.length - 1;
        swap(array, 0, size);
        while (size > 0) {
            siftDown(array, 0, size);
            swap(array, 0, --size);
        }
    }
    
    //上浮的过程 
    private static void siftUp(int[] array, int i) {
        while (array[i] > array[(i - 1) / 2]) {
            swap(array, i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }
    
    //下沉的过程 
    private static void siftDown(int[] array, int i, int heapSize) {
        int L = 2 * i + 1;
        while (L < heapSize) {
            int maxIndex = L + 1 < heapSize && array[L + 1] > array[L] ? L + 1 : L;
            maxIndex = array[i] > array[maxIndex] ? i : maxIndex;
            if (maxIndex == i) break; //自己就是最大的， 不用忘下沉
            //否则就要一直往下沉
            swap(array, i, maxIndex);
            i = maxIndex;
            L = 2 * i + 1; //继续往下
        }
    }

    private static void swap(int[] arrayay, int i, int j) {
        int temp = arrayay[i];
        arrayay[i] = arrayay[j];
        arrayay[j] = temp;
    }
}