import java.util.Arrays;
/*
给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 */
public class test2 {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = n; i > 0 ; i--) {
            nums1[m] = nums2[n - i];
            m++;
        }
        //System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m;
        int n = nums2.length;
        for(m = 0;;m++){
            if (nums1[m] == 0){
                break;
            }
        }
        merge(nums1,m,nums2,n);
        for (int i = 0; i < m+n; i++) {
            System.out.print(nums1[i]);
        }
    }
}
