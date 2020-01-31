/*
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
如果目标值不存在于数组中，返回它将会被按顺序插入的位置,你可以假设数组中无重复元素。
 */
public class test2 {
    static int searchInsert(int[] nums, int target) {
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        for (i = 0; i < nums.length - 1; i++) {
            if (target < nums[i]) {
                return 0;
            } else if (target > nums[i] && target < nums[i + 1]) {
                return i + 1;
            }
        }
        if (nums.length == 1){
            if (target < nums[i]) {
                return 0;
            } else{
                return 1;
            }
        }
        return nums.length;
    }
    public int searchInsert2(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        int n = searchInsert(nums,target);
        System.out.println(n);
    }
}
