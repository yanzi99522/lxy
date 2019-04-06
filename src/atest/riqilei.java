package atest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class riqilei {
    public static void main(String[] args)throws ParseException {
        Calendar calendar=Calendar.getInstance();
        calendar.set(2018, 7, 18);
        Date datex=calendar.getTime();
        System.out.println(datex);
        Date now=new Date();
        System.out.println(now);
//        System.out.println(now.getTime());
     Date date=new Date();
        System.out.println(date);
        DateFormat dateFormat=new SimpleDateFormat();
        System.out.println("格式化后：" + dateFormat.format(date));
        dateFormat=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        System.out.println("格式化后："+dateFormat.format(date));
        String datestring="2018-08-18 08:18:58";
        Date date1=dateFormat.parse(datestring);
        System.out.println("从字符串获得日期对象="+date1);
//        display(now,date);
//        date.setTime(9999999999L);
//        System.out.println("修改之后的date："+date);
//        display(now,date);
//    }

//    public static void display(Date now,Date date){
//        System.out.println("now.after(date)=" + now.after(date));
//        System.out.println("now.before(date)="+now.before(date));
//        System.out.println("now.compareTo(date)="+now.compareTo(date));
//
    }
}
