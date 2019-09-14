package a0728;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main2 {
    static int leapyear(int year){
        if (year%400==0||(year%100!=0&&(year%4==0))){
            return 1;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int b=leapyear(n);
            if (b==1){
                System.out.println(n+"是闰年");
            }else {
                System.out.println(n+"不是闰年");
            }
        }
    }
    
}
