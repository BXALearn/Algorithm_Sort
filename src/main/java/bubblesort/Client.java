package bubblesort;

import bubblesort.type2.Sort;

import java.util.Arrays;

/**
 * Create by 摆欣安
 * 2019/8/7 8:17
 * 冒泡排序-数组生成客户端
 */
public class Client {

    public static void main (String[] args){
        int[] array = new int[]{9,8,7,6,5,4,3,2,1,0};
        // type1排序
        // Sort.sort(array);
        // type2排序
        Sort.sort(array,0,array.length - 1);
        System.out.println("排序结果为: " + Arrays.toString(array));
    }
}
