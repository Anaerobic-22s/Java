import java.util.Scanner;

public class 木棒拼图 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];
        while (count > 0){
            int cp = sc.nextInt();
            int length = sc.nextInt();
            if(cp == 1){
                array[count - 1] = length;
            }
            if (cp == 2){
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == length){
                        array[i] = 0;
                        break;
                    }
                }
            }
            judge(array);
            count--;
        }
    }

    private static void judge(int[] array) {
        int max = 0;
        int len = 0;
        for (int i = 0; i < array.length; i++) {
            len += array[i];
            if(array[i] > max){
                max = array[i];
            }
        }
        if (len - max > max){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
