package aaaaniu.ke.wang.main;

import java.util.Scanner;

public class jinniandedijitian {
    static int runnian(int n){
        if ((n%100!=0)&&(n%4==0)){
            return 1;
        }else if (n%400==0){
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
            int run=runnian(year);
            if (run>0){
                switch (month){
                    case 1:
                        System.out.println(day);
                        break;
                    case 2:
                        System.out.println(31+day);
                        break;
                    case 3:
                        System.out.println(60+day );
                        break;
                    case 4:
                        System.out.println(91+day);
                        break;
                    case 5:
                        System.out.println(121 + day);
                        break;
                    case 6:
                        System.out.println(152 + day);
                        break;
                    case 7:
                        System.out.println(182 + day);
                    case 8:
                        System.out.println(213 + day);
                        break;
                    case 9:
                        System.out.println(244 + day);
                        break;
                    case 10:
                        System.out.println(274 + day);
                        break;
                    case 11:
                        System.out.println(305 + day);
                        break;
                    case 12:
                        System.out.println(335+day);
                        break;
                }
            }else {
                switch (month){
                    case 1:
                        System.out.println(day);
                        break;
                    case 2:
                        System.out.println(31+day);
                        break;
                    case 3:
                        System.out.println(60+day-1 );
                        break;
                    case 4:
                        System.out.println(91+day-1);
                        break;
                    case 5:
                        System.out.println(121 + day-1);
                        break;
                    case 6:
                        System.out.println(152 + day-1);
                        break;
                    case 7:
                        System.out.println(182 + day-1);
                    case 8:
                        System.out.println(213 + day-1);
                        break;
                    case 9:
                        System.out.println(244 + day-1);
                        break;
                    case 10:
                        System.out.println(274 + day-1);
                        break;
                    case 11:
                        System.out.println(305 + day-1);
                        break;
                    case 12:
                        System.out.println(335+day-1);
                        break;
                }
            }
        }
    }
}
