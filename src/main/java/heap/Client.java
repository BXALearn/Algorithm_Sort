package heap;

import heap.type1.Sort;

import java.util.Arrays;

/**
 * Create by 摆欣安
 * 2019/8/7 15:09
 * 堆排序-数组生成客户端
 */
public class Client {

    public static void main (String[] args){
        int[] array = new int[]{9,8,7,6,5,4,3,2,1,0};
        Sort.sort(array);
        System.out.println("排序结果为: " + Arrays.toString(array));
    }
}
