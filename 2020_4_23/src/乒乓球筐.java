import java.util.Scanner;

public class 乒乓球筐 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String strA = sc.next();
            String strB = sc.next();
            char[] charsA = strA.toCharArray();
            char[] charsB = strB.toCharArray();
            for (int i = 0; i < charsB.length;i++) {
                for (int j = 0; j < charsA.length; j++) {
                    if (charsB[i] == charsA[j]){
                        charsA[j] = ' ';
                        charsB[i] = ' ';
                        break;
                    }
                }
            }
            for (int i = 0; i < charsB.length; i++) {
                if (charsB[i] != ' '){
                    System.out.println("No");
                    break;
                }else if (i == charsB.length -1){
                    System.out.println("Yes");
                }
            }
        }
    }
}
