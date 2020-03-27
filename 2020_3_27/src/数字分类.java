import java.text.DecimalFormat;
import java.util.*;

public class 数字分类 {
    public static void main(String[] args) {
        int i = 0;
        int sum;
        int countA2 = 0;
        int countA4 = 0;
        int countA5 = 0;
        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        double A4 = 0;
        int A5 = 0;
        List<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        sum = input.nextInt();
        int[] array = new int[sum];
        while (i < sum) {
            array[i] = input.nextInt();
            i++;
        }
        // Arrays.sort(array);
        for (int j = 0; j < array.length; j++) {
            int r = array[j] % 5;
            switch (r) {
                case 0: {
                    if (array[j] % 2 == 0) {
                        A1 += array[j];
                    }
                    break;
                }
                case 1: {
                    A2 += (((countA2 % 2 == 0) ? (1) : (-1)) * array[j]);
                    countA2++;
                    break;
                }
                case 2: {
                    A3++;
                    break;
                }
                case 3: {
                    A4 += array[j];
                    countA4++;
                    break;
                }
                case 4: {
                    list.add(array[j]);
                    A5 = list.get(countA5);
                    countA5++;
                    break;
                }
                default:
                    break;
            }
        }
        if (A1 == 0) {
            System.out.print("N" + " ");
        } else {
            System.out.print(A1 + " ");
        }
        if (A2 == 0) {
            System.out.print("N" + " ");
        } else {
            System.out.print(A2 + " ");
        }
        if (A3 == 0) {
            System.out.print("N" + " ");
        } else {
            System.out.print(A3 + " ");
        }
        if (A4 == 0) {
            System.out.print("N" + " ");
        } else {
            DecimalFormat df = new DecimalFormat("#.0");
            System.out.print(df.format(A4 / countA4) + " ");
        }
        if (A5 == 0) {
            System.out.print("N");
        } else {
            A5 = Collections.max(list);
            System.out.print(A5);
        }
    }

    public static void main2(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int temp = 1;
        boolean find2 = false;
        int sum4 = 0;
        int count4 = 0;
        int a5 = 0;
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
            switch (array[i] % 5) {
                case 0:
                    if (array[i] % 2 == 0) {
                        a1 += array[i];
                    }
                    break;
                case 1:
                    find2 = true;
                    a2 += temp * array[i];
                    temp = (-1) * temp;
                    break;
                case 2:
                    a3++;
                    break;
                case 3:
                    sum4 += array[i];
                    count4++;
                    break;
                case 4:
                    if (a5 < array[i]) {
                        a5 = array[i];
                    }
                    break;
                default:
                    break;
            }
        }
        String A4 = "N";
        if (count4 > 0) {
            A4 = new DecimalFormat("0.0").format(sum4 * 1.0 / count4);
        }

        if (a1 == 0) {
            System.out.print("N" + " ");
        } else {
            System.out.print(a1 + " ");
        }
        if (find2) {
            System.out.print(a2 + " ");
        } else {
            System.out.print("N" + " ");
        }
        if (a3 == 0) {
            System.out.print("N" + " ");
        } else {
            System.out.print(a3 + " ");
        }
        System.out.print(A4 + " ");
        if (a5 == 0) {
            System.out.print("N");
        } else {
            System.out.print(a5);
        }

    }

}
