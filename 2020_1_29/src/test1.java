/*
给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
如果不存在最后一个单词，请返回 0 。
 */
public class test1 {
    static int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if(chars[i] != ' '){
                len++;
            }else {
                len = 0;
            }
        }
        if(s.length() == 1 && chars[0] != ' '){
            return 1;
        }
        return len;
    }

    public static void main(String[] args) {
        String str = "a";
        int l = lengthOfLastWord(str);
        System.out.println(l);
    }
}
