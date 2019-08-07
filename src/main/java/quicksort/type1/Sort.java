package quicksort.type1;

/**
 * Create by 摆欣安
 * 2019/8/7 9:18
 * 类型1-快速排序
 */
public class Sort {

    public static void sort(int[] array,int startIndex,int endIndex){

        if (startIndex >= endIndex){
            return;
        }

        int pivotIndex = partition(array,startIndex,endIndex);
        sort(array,startIndex,pivotIndex - 1);
        sort(array,pivotIndex + 1,endIndex);
    }

    private static int partition(int[] array, int startIndex,int endIndex){
        int piovt = array[startIndex];
        int mark = startIndex;

        for (int i=startIndex+1; i<=endIndex; i++){
            if (array[i]<piovt){
                mark ++;
                int temp =array[mark];
                array[mark] = array[i];
                array[i] = temp;
            }
        }

        array[startIndex] = array[mark];
        array[mark] = piovt;
        return mark;
    }
}
