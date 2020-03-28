public class InsertSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0 && key < array[j]; j--) {
                //中间的元素往后面移动
                array[j + 1] = array[j];
            } 
            //将key插入到合适的位置
            array[j + 1] = key;
        }
    }
}