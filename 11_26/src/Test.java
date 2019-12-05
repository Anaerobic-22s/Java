public class Test {
    public static void main(String[] args) {
        String str = "1a234";
        byte[] data = str.getBytes();
        for(int i = 0; i < data.length; i++){
            if('0' < data[i] && data[i] < 9){
                break;
            }else {
                System.out.println("不是纯数字");
                break;
            }
        }



    }
}
