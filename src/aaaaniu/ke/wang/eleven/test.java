package aaaaniu.ke.wang.eleven;

import java.util.Date;

public class test {
    public static void main(String[] args) {
        Date date=new Date();
        String strDate=String.format("今天是今年的第%tj天"+date);
        System.out.println(strDate);
    }
}
