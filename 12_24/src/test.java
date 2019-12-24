import java.util.Arrays;

public class test {
    //直接排序
    public static void insort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int tmp = array[i];
            while (j >= 0) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                    j--;
                }else{
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }
    //选择排序
    public static void select(int[] array){
        for (int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++){
                if (array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {56,7,49,2,26,44};
        System.out.println(Arrays.toString(array));
        select(array);
        System.out.println(Arrays.toString(array));
    }
}
