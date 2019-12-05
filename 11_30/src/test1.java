class bbb{
    String str = null;
    bbb a = null;
}

public class test1 {
    public static void main(String[] args) {
        int a = 20;
        try{
            if (a == 20){
                throw new Exception("20");
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println();
        }finally {
            System.out.println("finally");
        }
    }

    public static void main2(String[] args) {
        try {
            bbb b = new bbb();
            String str2 = b.str;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }
}
