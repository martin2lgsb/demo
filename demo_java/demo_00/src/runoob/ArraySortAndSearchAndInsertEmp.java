package runoob;

import java.util.Arrays;

/**
 * Java 数组 - 数组排序, 元素查找, 插入元素
 *
 * Created by m2lgsb on 02/03/2018
 */
public class ArraySortAndSearchAndInsertEmp {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(arr1);
        printArray("sort", arr1);

        int index1 = Arrays.binarySearch(arr1, 2);
        System.out.println("2 at:" + index1);

        int index2 = index1 - 1;
        arr1 = insertElement(arr1, 8, index2);
        printArray("insert", arr1);

        String[][] data = new String[2][5];
        System.out.println("数组长度：" + data.length + "|" + data[0].length);
    }

    public static void printArray(String msg, int[] arr) {
        System.out.println(msg);
        for (int i: arr) {
            System.out.println(i + ",");
        }
    }

    public static int[] insertElement(int[] oldArr, int element, int index) {
        int lenth = oldArr.length;
        int[] ret = new int[lenth + 1];
        System.arraycopy(oldArr, 0, ret, 0 , index);
        ret[index] = element;
        System.arraycopy(oldArr, index, ret, index + 1, lenth - index);

        return ret;
    }

}
