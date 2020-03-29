import java.util.*;

public class 小易的升级之路 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext())
        {
            int n=scanner.nextInt();
            int init=scanner.nextInt();
            int[] monster=new int[n];
            for(int i=0;i<n;i++)
            {
                monster[i]=scanner.nextInt();
                if(init>monster[i])
                {
                    init+=monster[i];
                }
                else
                {
                    init+=GetGYS(init,monster[i]);
                }
            }
            System.out.println(""+init);
        }
        scanner.close();
    }

    public static int GetGYS(int n,int m)
    {
        if(m%n==0)
            return n;
        else
        {
            return GetGYS(m%n,n);
        }
    }
}
