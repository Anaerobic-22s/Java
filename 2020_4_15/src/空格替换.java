public class 空格替换 {
    public static String replaceSpace(String iniString, int length) {
        if (iniString == null || iniString.length() <= 0)
            return iniString;

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            char c = iniString.charAt(i);
            if (c == ' ')
                sb.append("%20");
            else
                sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello world   b  ";
        String newS = replaceSpace(str,13);
        System.out.println(newS);
    }
}
