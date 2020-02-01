/*
给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
如果可以构成，返回 true ；否则返回 false。
题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。
 */
public class test1 {
    static boolean canConstruct(String ransomNote, String magazine) {
        /*
                char[] ransom = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        if(magazine.length() == 0 && ransomNote.length() != 0){
            return false;
        }
        for (int i = 0; i < ransomNote.length();i++){
            for (int j = 0;j < magazine.length();j++){
                if(ransom[i] == mag[j]){
                    mag[j] = ' ';
                    break;
                }
                if (j == magazine.length() -1){
                    return false;
                }
            }
        }
        return true;
         */
        char[] chars = ransomNote.toCharArray();
        char[] chars1 = magazine.toCharArray();
        int i = 0;
        while(i < chars.length) {
            for (int j = 0; j < chars1.length; j++) {
                if (chars.length <= chars1.length) {
                    if (chars[i] == chars1[j]) {
                        chars1[j] = ' ';
                        break;
                    }
                    if (j == chars1.length - 1) {
                        return false;
                    }
                }
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        String ransom = "aa";
        String magezine = "aab";
        boolean k = canConstruct(ransom,magezine);
        System.out.println(k);
    }
}
