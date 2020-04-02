import java.util.Scanner;

public class 守形数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            int N = (int)Math.pow(n,2);
            int i = 1,tmp = n;
            while (tmp / 10 > 0){
                i++;
                tmp /= 10;
            }
            tmp = 1;
            while (i > 0){
                i--;
                tmp *= 10;
            }
            if (n == N % tmp){
                System.out.println("Yes!");
            }else {
                System.out.println("No!");
            }
        }
    }
}
