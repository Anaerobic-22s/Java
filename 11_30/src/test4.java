public class test4 {
    public static void reverse(char[] array,int left,int right) {
        while (left < right) {
            char tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
    public static String reverseSentence(String str) {
        char[] array = str.toCharArray();
        reverse(array,0,array.length-1);
        int i = 0;
        int j = 0;
        //单词逆置
        while (i < array.length) {
            if (array[i] == ' '){
                i++;
                j++;
            }else {
                reverse(array,i,i+1);
            }
        }
        return array.toString();
    }
    public static void main(String[] args) {
        String ret = reverseSentence("i am student");
        System.out.println(ret);
    }

}
