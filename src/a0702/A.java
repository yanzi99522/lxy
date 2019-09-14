package a0702;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lxy
 */
public class A {
    static String date2Format(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy--MM-dd HH:mm:ss");
        String string = simpleDateFormat.format(date);
        return string;
    }
    public static void main(String[] args) {
        Date now=new Date();
        System.out.println(date2Format(now));

    }
}
