public class CountSort {
    public static void countSort(int[] array, int RANGE) { /**数组中最大的元素不能超过 RANGE*/
        int[] count = new int[RANGE + 1];
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++)
            count[array[i]]++;
    
        /**现在的count[i]表示小于i的数有count[i]个，排序后元素i就放在第C[i]个输出位置上*/
        for (int i = 1; i <= RANGE; i++)
            count[i] += count[i - 1];
        /**
             * 从后向前扫描保证计数排序的稳定性(重复元素相对次序不变)
             * 当再遇到重复元素时会被放在当前元素的前一个位置上保证计数排序的稳定性
             */
        for (int i = array.length - 1; i >= 0; i--)
            tmp[--count[array[i]]] = array[i];
    
        //拷贝回原来的数组
        for (int i = 0; i < array.length; i++)
            array[i] = tmp[i];
    }
}