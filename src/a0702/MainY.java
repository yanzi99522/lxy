package a0702;

/**
 * @author lxy
 */
public class MainY {//24小时之中，时针、分针和秒针重合几次？分别是什么时间
    public static void main(String[] args) {
        int i=0;
        for (int h=0;h<24;h++){
            for (int m=0;m<60;m++){
                if (m==(int)((float)m/12.0+(h%12*5))){
                    System.out.println(h + "点" + m + "分" + m + "秒 时分秒三针重合");
                    i=i+1;
                }
            }
        }
        System.out.println("总共重合了"+i+"次");
    }
}
