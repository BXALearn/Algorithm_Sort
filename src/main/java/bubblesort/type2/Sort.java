package bubblesort.type2;

/**
 * Create by 摆欣安
 * 2019/8/7 8:54
 * 类型2-使用While循环
 * 从右向左冒泡
 */
public class Sort {

    public static void sort(int array[],int startIndex,int endIndex) {
        int iterations = 0 ;
        int nextElement = startIndex ;
        int temp = 0 ;
        while (nextElement < endIndex){
            int index = endIndex;
            while (index > nextElement){
                if (array[index] < array[index - 1]){
                    temp = array[index];
                    array[index] =array[index - 1];
                    array[index - 1] = temp;
                }
                index --;
                iterations ++;
            }
            nextElement ++;
            iterations ++;
        }
        System.out.println("迭代次数: "+iterations);
    }

}
