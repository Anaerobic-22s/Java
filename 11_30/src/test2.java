//合并两个有序的数组 如int[] array1 = {1,3,6,9}  int[] array2 = {2,4,6,8}
import java.util.Arrays;

public class test2 {
    public static int[] func(int[] arr1, int[] arr2){
        int len = arr1.length + arr2.length;
        int[] arr = new int[len];
        int m = 0;
        int n = 0;
        for (int i = 0; i < len; i++){
            if(m >= arr1.length){
                arr[i] = arr2[n];
                n++;
                if(n == arr2.length){
                    return arr;
                }
            }
            if(n >= arr2.length){
                arr[i] = arr1[m];
                m++;
                if(m == arr1.length){
                    return arr;
                }
            }
            if (arr1[m] <= arr2[n]) {
                arr[i] = arr1[m];
                m++;
            }else{
                arr[i] = arr2[n];
                n++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,6,9};
        int[] arr2 = {2,3,4,8};
        int[] arr = func(arr1,arr2);
        System.out.println(Arrays.toString(arr));
    }
}
