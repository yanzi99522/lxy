package basicMathProblem;

public class RunNian {
    static int LeapYear(int year){
        if(year%400==0||(year%100!=0)&&(year%4==0)){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int year;
        int count=0;

        System.out.println("2000--3000之间的闰年如下：");

        for (year=2000;year<=3000;year++){
            if (LeapYear(year)==1){
                System.out.print(year+" ");//输出闰年年份
                count++;
                if (count%10==0){
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
