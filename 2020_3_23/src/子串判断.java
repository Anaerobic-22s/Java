public class 子串判断 {

    public static void main(String[] args) {
        String str1 = "asdfgv";
        String str2 = "sdf";
        boolean reslaut = str1.contains(str2);
        System.out.println(reslaut);

    }
    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[]hasSub=new boolean[p.length];
        for (int i = 0; i < p.length; i++) {
            hasSub[i]=s.contains(p[i]);
        }
        return hasSub;
    }
}
