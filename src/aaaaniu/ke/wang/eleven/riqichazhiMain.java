package aaaaniu.ke.wang.eleven;

import java.util.Scanner;

public class riqichazhiMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s1=in.nextLine();
            String s2=in.nextLine();
            String subyear1=s1.substring(0,4);
            int year1=Integer.valueOf(subyear1);

            String subyear2=s2.substring(0,4);
            int year2=Integer.valueOf(subyear2);
            String submonth1=s1.substring(4,6);
            int month1=Integer.valueOf(submonth1);

            String submonth2=s2.substring(4,6);
            int month2=Integer.valueOf(submonth2);
            String sunday1=s1.substring(6);
            int day1=Integer.valueOf(sunday1);

            String sunday2=s2.substring(6);
            int day2=Integer.valueOf(sunday2);
            if (subyear1.equals(subyear2)){
                if (submonth1.equals(submonth2)){
                    System.out.println(Math.abs(day1-day2+1));
                }else {

                }
            }

        }
    }
}
