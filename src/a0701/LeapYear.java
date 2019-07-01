package a0701;

import java.util.Scanner;

/**
 * @author lxy
 */
public class LeapYear {
    static int LeapYear(int year){
        if (year%400==0||(year%100!=0&&year%4==0)){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("求2000到2000之间所有的闰年：");
        int count=0;
        for (int i=2000;i<3001;i++){
            if (LeapYear(i)==1){
                System.out.print(i+" ");
                count++;
            }else {

            }
            if (count%10==0){
                System.out.println();
            }
        }
    }
}
