import java.util.Scanner;

public class 字符串加解密 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String lock = sc.nextLine();
            String unlock = sc.nextLine();
            String locked = toLock(lock);
            String unlocked = toUnlock(unlock);
            System.out.println(locked);
            System.out.println(unlocked);
        }
    }

    private static String toUnlock(String unlock) {
        char[] chars = unlock.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                if (chars[i] == 'a') {
                    chars[i] = 'a' + 26;
                }
                chars[i] = (char) (chars[i] - 33);
            }else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                if (chars[i] == 'A') {
                    chars[i] = 'A' + 25;
                }
                chars[i] = (char) (chars[i] + 31);
            }else if (chars[i] >= '0' && chars[i] <= '9'){
                if (chars[i] == '0') {
                    chars[i] = '0' + 10;
                }
                chars[i] = (char) (chars[i] - 1);
            }
        }
        return String.valueOf(chars);

    }

    private static String toLock(String lock) {
        char[] chars = lock.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                if (chars[i] == 'z') {
                    chars[i] = 'z' - 25;
                }
                chars[i] = (char) (chars[i] - 31);
            }else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                if (chars[i] == 'Z') {
                    chars[i] = 'Z' - 26;
                }
                chars[i] = (char) (chars[i] + 33);
            }else if (chars[i] >= '0' && chars[i] <= '9'){
                if (chars[i] == '9') {
                    chars[i] = '9' - 10;
                }
                chars[i] = (char) (chars[i] + 1);
            }
        }
        return String.valueOf(chars);
    }
}
//链接：https://www.nowcoder.com/questionTerminal/2aa32b378a024755a3f251e75cbf233a
//来源：牛客网
//
