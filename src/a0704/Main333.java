package a0704;

import java.util.Scanner;

/**
 * @author lxy
 */
public class Main333 {//double数据四舍五入取整
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double dd=in.nextDouble();
        int t=(int)Math.round(dd);
        System.out.println(t);
    }
}
