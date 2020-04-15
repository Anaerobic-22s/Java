public class 最近公共祖先 {
    public static int getLCA(int a, int b) {
       while (a != b){
            if (a > b/2){
                a /= 2;
            }else if (b > a/2){
                b /= 2;
            }else {
                a /= 2;
                b /= 2;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getLCA(2,3));
    }
}
