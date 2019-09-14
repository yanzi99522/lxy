package aaaaniu.ke.wang.eleven;

import java.io.BufferedInputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class YearMonthDayMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(new BufferedInputStream(System.in));
        while (in.hasNext()){
//            String str1=in.nextLine();
            LocalDate localDate1=LocalDate.parse(in.next(), DateTimeFormatter.ofPattern("yyyymmdd"));
//            String str2=in.nextLine();
            LocalDate localDate2=LocalDate.parse(in.next(), DateTimeFormatter.ofPattern("yyyymmdd"));
            System.out.println(localDate1.until(localDate2, ChronoUnit.DAYS)+1);
        }
    }
}
