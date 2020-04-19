import java.util.Scanner;

public class 计算日期到天数转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int year = sc.nextInt();
            int mouth = sc.nextInt();
            int day = sc.nextInt();
            int Days = outDay(year,mouth,day);
            System.out.println(Days);
        }
    }

    private static int outDay(int year, int month, int day) {
        int [] Day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
        int Days = 0;
        if (year <= 0 || month <= 0 || month > 12 || day <= 0 || day > Day[month - 1])
            return -1;
        int Jun = 28;
        if ((year % 4 == 0) && (year % 100 != 0)){
            Jun = 29;
        }
        switch (month){
            case 12 : Days += 30;
            case 11 : Days += 31;
            case 10 : Days += 30;
            case 9 : Days += 31;
            case 8 : Days += 31;
            case 7 : Days += 30;
            case 6 : Days += 31;
            case 5 : Days += 30;
            case 4 : Days += 31;
            case 3 : Days += Jun;
            case 2 : Days += 31;
                break;
        }
        Days += day;
        return Days;
    }
}
