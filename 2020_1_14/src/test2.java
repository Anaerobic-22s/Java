/*
给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
 */
public class test2 {
    static void rotate(int[] nums, int k) {
        int len = nums.length;
        if(k > len){
            k = k % len;
        }
        for (int i = 0; i < k;i++){
            int temp = nums[len - 1];
            for (int j = len - 1; j > 0; j--){
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotate(arr,2);
        for (int i = 0;i<5;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
