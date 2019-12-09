public class test {
    public static void main1(String[] args) {
        String str = "abcdef";//直接赋值
        String str2 = new String("abcdef");
        System.out.println(str == str2);//false
        System.out.println(str.equals(str2));//true
        char[] array = {'a','b','c','d'};
        String str3 = new String(array);
        System.out.println(str == str3);//false
    }
    public static void main2(String[] args) {
        String str1 = "abcdef";
        String str2 = new String("abcdef");
        System.out.println(str1 == str2);//false
        String str3 = "abc"+"def";//拼接
        System.out.println(str1 == str3);// true
        String str4 = "abc"+ new String("def");
        System.out.println(str1 == str4);//false
        String str5 = "abc";
        String str6 = "def";
        String str7 = str5+str6;
        System.out.println(str1 == str7);//false
        String str8 = str5+new String("def");
        System.out.println(str4 == str8);//false
    }
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.charAt(0));
        str = "h" + str.substring(3);
        //str = "hello";
        System.out.println(str);

        //String str1 = "def";
        /*String str2 = "ab"+"cd"+10;//abcd10
        System.out.println(str2);*/
    }
}
