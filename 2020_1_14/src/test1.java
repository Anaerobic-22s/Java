/*
实现函数 ToLowerCase() ，该函数接收一个字符串参数 str ，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串 。
*/
public class test1 {
    static String ToLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] <= 'Z' && chars[i] >= 'A'){
                chars[i] = (char)(chars[i]-'A'+'a');
            }
        }
        return String.valueOf(chars);
    }
    public static void main(String[] args) {
        String str = "Kyire Irving";
        System.out.println(ToLowerCase(str));
    }
}
