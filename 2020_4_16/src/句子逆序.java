import java.util.Scanner;

public class 句子逆序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            String[] array = str.split(" ");
            StringBuffer sb = new StringBuffer();
            for (int i = array.length - 1; i >= 1; i--) {
                sb.append(array[i]);
                sb.append(" ");
            }
            sb.append(array[0]);
            System.out.println(sb.toString());
        }
    }
}
