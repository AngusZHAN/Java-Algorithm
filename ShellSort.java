public class ShellSort {
    public static void sort(int[]array) {
        for (int gap =array.length; gap > 0; gap /= 2) {     //增量序列
            for (int i = gap; i <array.length; i++) {        //从数组第gap个元素开始
                int key =array[i];
                int j;                      //每个元素与自己组内的数据进行直接插入排序
                for (j = i-gap; j >= 0 && key <array[j]; j -= gap) {
                    array[j+gap] =array[j];
                }
                array[j+gap] = key;
            }
        }
    }
}