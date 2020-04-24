import java.util.Arrays;
import java.util.Scanner;

public class 合唱团 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int count = sc.nextInt();
            int[] array = new int[count];
            for (int i = 0; i < count; i++) {
                array[i] = sc.nextInt();
            }
            int num = sc.nextInt();
            int d = sc.nextInt();
            int temp = 0;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 1; j < array.length; j++) {
                    if (array[i] < array[j]){
                        array[i] = temp;
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            int max = array[0];
            int x = 1;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] - array[i] <= d){
                    max *= array[i];
                    x++;
                    if (x == num){
                        break;
                    }
                }else {
                    max = array[i];
                    x = 0;
                }
            }
            System.out.println(max);
        }
    }

    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            //总人数
            int n = sc.nextInt();
            //学生能力值数组，第i个人直接对应arr[i]
            int[] arr = new int[n + 1];
            //初始化
            for (int i = 1; i <= n; i++) {//人直接对应坐标
                arr[i] = sc.nextInt();
            }
            //选择的学生数
            int kk = sc.nextInt();
            //间距
            int dd = sc.nextInt();

            /**
             * 递推的时候，以f[one][k]的形式表示
             * 其中：one表示最后一个人的位置，k为包括这个人，一共有k个人
             * 原问题和子问题的关系：f[one][k]=max{f[left][k-1]*arr[one],g[left][k-1]*arr[one]}
             */
            //规划数组
            long[][] f = new long[n + 1][kk + 1];//人直接对应坐标,n和kk都要+1
            long[][] g = new long[n + 1][kk + 1];
            //初始化k=1的情况
            for(int one = 1;one<=n;one++){
                f[one][1] = arr[one];
                g[one][1] = arr[one];
            }
            //自底向上递推
            for(int k=2;k<=kk;k++){
                for(int one = k;one<=n;one++){
                    //求解当one和k定的时候，最大的分割点
                    long tempmax = Long.MIN_VALUE;
                    long tempmin = Long.MAX_VALUE;
                    for(int left = Math.max(k-1,one-dd);left<=one-1;left++){
                        if(tempmax<Math.max(f[left][k-1]*arr[one],g[left][k-1]*arr[one])){
                            tempmax=Math.max(f[left][k-1]*arr[one],g[left][k-1]*arr[one]);
                        }
                        if(tempmin>Math.min(f[left][k-1]*arr[one],g[left][k-1]*arr[one])){
                            tempmin=Math.min(f[left][k-1]*arr[one],g[left][k-1]*arr[one]);
                        }
                    }
                    f[one][k] = tempmax;
                    g[one][k] = tempmin;
                }
            }
            //n选k最大的需要从最后一个最大的位置选
            long result = Long.MIN_VALUE;
            for(int one = kk;one<=n;one++){
                if(result<f[one][kk]){
                    result = f[one][kk];
                }
            }
            System.out.println(result);
        }
    }
}
