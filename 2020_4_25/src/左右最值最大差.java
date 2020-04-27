import java.util.*;

public class 左右最值最大差 {
    public int findMaxGap(int[] A, int n) {
        int max1=A[0]; //定义一个最区间最大值初始为A[0]
        int max=Math.abs(A[0]-A[A.length-1]);
        for(int i=0;i<A.length;i++){
            if(A[i]>max1){
                max1=A[i];
            }
            int max2=A[A.length-1]; //每次从n-1开始在右区间找最大值
            for(int j=A.length-1;j>i;j--){
                if(A[j]>max2){
                    max2=A[j];
                }
                if(Math.abs(max1-max2)>max){
                    max=Math.abs(max1-max2);
                }
            }
        }
        return max;
    }
}