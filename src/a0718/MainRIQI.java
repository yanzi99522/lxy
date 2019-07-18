package a0718;

import java.util.Scanner;

/**
 * @author lxy
 */
public class MainRIQI {
    static int runnian(int n){
        if (n%400==0||(n%100!=0&&n%4==0)){
            return 1;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int year=in.nextInt();
            int month=in.nextInt();
            int day=in.nextInt();
            int days=0;
                    switch (month){
                        case 1:days=day;break;
                        case 2:days=31+day;break;
                        case 3: days=60+day;break;
                        case 4: days=91+day;break;
                        case 5:days=121+day;break;
                        case 6: days=152+day;break;
                        case 7: days=182+day;break;
                        case 8:days=213+day;break;
                        case 9: days=244+day;break;
                        case 10: days=274+day;break;
                        case 11:days=305+day;break;
                        case 12:days=335+day;break;


                    }
            if(month>2){
                if (runnian(year)==0){
                    days=days-1;
                }}
            System.out.println(days);

            }
        }

}
