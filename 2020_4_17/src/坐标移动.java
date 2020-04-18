import java.util.Scanner;
import java.util.regex.Pattern;

public class 坐标移动 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int[] map = new  int[2];
            String str = sc.nextLine();
            String[] arr = str.split(";");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() != 3 && arr[i].length() != 2 ){
                    continue;
                }
                if (arr[i].substring(0,1).equals("A") && isInteger(arr[i].substring(1))){
                    map[0] -= Integer.valueOf(arr[i].substring(1));
                }
                if (arr[i].substring(0,1).equals("D") && isInteger(arr[i].substring(1))){
                    map[0] += Integer.valueOf(arr[i].substring(1));
                }
                if (arr[i].substring(0,1).equals("S") && isInteger(arr[i].substring(1))){
                    map[1] -= Integer.valueOf(arr[i].substring(1));
                }
                if (arr[i].substring(0,1).equals("W") && isInteger(arr[i].substring(1))) {
                    map[1] += Integer.valueOf(arr[i].substring(1));
                }
            }
            System.out.println(map[0] + "," + map[1]);
        }
    }
    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }
}
