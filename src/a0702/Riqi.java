package a0702;

import java.util.Date;

/**
 * @author lxy
 */
public class Riqi {
    static Date getNextDate(Date date){
        long addTime=1;
        addTime*=1;
        addTime*=24;
        addTime*=60;
        addTime*=60;
        addTime*=1000;
        Date date1 = new Date(date.getTime() + addTime);
        return date1;
    }
    public static void main(String[] args) {
        Date now=new Date();
        System.out.println(getNextDate(now));

    }

}
