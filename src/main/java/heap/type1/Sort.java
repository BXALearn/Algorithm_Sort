package heap.type1;

import java.util.Arrays;

/**
 * Create by 摆欣安
 * 2019/8/7 15:11
 */
public class Sort {

    public static void downAdjust(int[] array,int parentIndex,int length){

        int temp = array[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex < length){

            if (childIndex +1 < length && array[childIndex + 1] > array[childIndex]){
                childIndex ++;
            }

            if (temp >= array[childIndex]){
                break;
            }
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
            childIndex = 2 * childIndex + 1;
        }
        array[parentIndex] = temp;
    }

    public static void sort(int[] array){

        for (int i = array.length/2; i >= 0; i--){
            downAdjust(array,i,array.length - 1);
        }
        for (int i = array.length - 1; i > 0; i--){
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            downAdjust(array,0,i);
        }
    }
}
