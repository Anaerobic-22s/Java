import java.util.Scanner;

/*
public class test {
    public static String reverse(String str){
        char[] value = str.toCharArray();
        String ret = null;

        for (int i = value.length; i > 0; i++){

        }
        return ret;
    }
    public static void main(String[] args) {
        String str = "abcdef";
        String str1 = reverse(str);
        System.out.println(str1);
    }
}
*/
import java.util.*;
public class test{
    public static String reverse(String str,int start,int end){
        char[] value = str.toCharArray();
        for(int i = start; i < end; i++){
            while(start < end){
                char temp = value[start];
                value[start] = value[end];
                value[end] = temp;
                start++;
                end--;
            }
        }
        return String.copyValueOf(value);
    }
    public static String func(String str,int k){

        int len = str.length();
        str = reverse(str,0,k-1);
        str = reverse(str,k,len-1);
        str = reverse(str,0,len-1);
        return str;
    }
    public static void main(String[] args){
        Scanner scan1 = new Scanner(System.in);
        int size = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        String str = scan2.next();
        String ret = func(str,size);
        System.out.println(ret);
    }
}