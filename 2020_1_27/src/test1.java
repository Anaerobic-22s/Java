/*
给定一个数组nums和一个值val，你需要原地移除所有数值等于val的元素返回移除后数组的新长度。
要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
*/
public class test1 {
    static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int n = 0;
        for (int i = 0; i < len;i++){
            if (nums[i] != val) {
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3,5};
        int val = 3;
        int k = removeElement(nums,val);
        System.out.println(k);
    }
}
