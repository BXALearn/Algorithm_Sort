package bubblesort.type1;

/**
 * Create by 摆欣安
 * 2019/8/7 8:22
 */
public class Sort {

    public static void sort(int array[]) {
        int iterations = 0 ;
        for (int i = 0; i < array.length - 1; i++ ) {
            for (int j = 0; j < array.length - i - 1; j++ ) {
                int tmp = 0;
                if (array[j] > array [j+1]) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
                iterations ++;
            }
            iterations ++;
        }
        System.out.println("迭代次数: "+iterations);
    }
}
