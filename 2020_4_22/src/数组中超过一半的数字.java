import java.util.Arrays;

public class 数组中超过一半的数字 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int max = array[array.length / 2];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max){
                count++;
            }
        }
        if (count >= array.length / 2){
            return max;
        }else {
            return 0;
        }
    }
}
